/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.team8.gui;

import cse.team8.guis.FileIO;
import cse.team8.user.*;
import cse.team8.userwork.SystemLogin;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ChangePW extends javax.swing.JFrame {

    SystemLogin login = new SystemLogin();
    public ArrayList<Student> student = new ArrayList<>();
    public ArrayList<Professor> professor = new ArrayList<>();
    public ArrayList<AcademyStaff> academyStaff = new ArrayList<>();
    public ArrayList<LessonStaff> lessonStaff = new ArrayList<>();
    FileIO fileIO = new FileIO();

    public ChangePW() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextFieldInputPW = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("변경할 암호");

        jButton1.setText("확인");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButtonExit.setText("취소");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(jTextFieldInputPW, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jButtonExit)))
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldInputPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExit)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //확인 버튼
        try {
            student = fileIO.getStudent(); //Arraylist student 복사
        } catch (IOException ex) {
            Logger.getLogger(ChangePW.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("fileIO.getStudent() 예외 발생");
        }
        try {
            professor = fileIO.getProfessor();
        } catch (IOException ex) {
            Logger.getLogger(ChangePW.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            academyStaff = fileIO.getAcademyStaff();
        } catch (IOException ex) {
            Logger.getLogger(ChangePW.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            lessonStaff = fileIO.getLessonStaff();
        } catch (IOException ex) {
            Logger.getLogger(ChangePW.class.getName()).log(Level.SEVERE, null, ex);
        }
        //학생 암호 변경
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).isNowLogin()) { //로그인 되어 있는 계정 확인
                String inputPW = jTextFieldInputPW.getText();
                try {
                    login.changeStudentPW(inputPW, student, i); //changeStudentPW 함수 호출
                } catch (IOException ex) {
                    Logger.getLogger(ChangePW.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "암호 변경 완료");
                dispose(); //창 닫기
            }
        }
        //교수 암호 변경
        for (int i = 0; i < professor.size(); i++) {
            if (professor.get(i).isNowLogin()) { //로그인 되어 있는 계정 확인
                String inputPW = jTextFieldInputPW.getText();
                try {
                    login.changeProfessorPW(inputPW, professor, i); //changeStudentPW 함수 호출
                } catch (IOException ex) {
                    Logger.getLogger(ChangePW.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "암호 변경 완료");
                dispose(); //창 닫기
            }
        }
        for (int i = 0; i < academyStaff.size(); i++) {
            if (academyStaff.get(i).isNowLogin()) { //로그인 되어 있는 계정 확인
                String inputPW = jTextFieldInputPW.getText();
                try {
                    login.changeAcademyStaffPW(inputPW, academyStaff, i); //changeStudentPW 함수 호출
                } catch (IOException ex) {
                    Logger.getLogger(ChangePW.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "암호 변경 완료");
                dispose(); //창 닫기
            }
        }
        for (int i = 0; i < lessonStaff.size(); i++) {
            if (lessonStaff.get(i).isNowLogin()) { //로그인 되어 있는 계정 확인
                String inputPW = jTextFieldInputPW.getText();
                try {
                    login.changeLessonStaffPW(inputPW, lessonStaff, i); //changeStudentPW 함수 호출
                } catch (IOException ex) {
                    Logger.getLogger(ChangePW.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(null, "암호 변경 완료");
                dispose(); //창 닫기
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        //취소 버튼
        dispose(); //창 닫기
    }//GEN-LAST:event_jButtonExitActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePW().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextFieldInputPW;
    // End of variables declaration//GEN-END:variables
}
