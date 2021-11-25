/**
 * Date : 21.10.06~
 * Title : 대학정보시스템
 * Project : GUIS (가자미 University Information System)
 *
 * @author joonhee2 - 강준희 (20183203)
 * @author thelight0804 - 박상현 (20183145)
 * @author ssb3204 - 손성배 (20193116)
 * @author SH1NJH - 신종훈 (20183197)
 * @author dudgns0421 - 이영훈 (20173149)
 */
// JOptionPane.showMessageDialog(null,STR); //값 정확히 나오는지 확인 용 
package cse.team8.gui;

import cse.team8.user.Student;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import cse.team8.guis.FileIO;
import cse.team8.user.*;
import cse.team8.userwork.*;

public class LoginGUI extends javax.swing.JFrame {

    SystemLogin login = new SystemLogin(); //SystemLogin 클래스 사용
    FileIO fileIO = new FileIO();
    public ArrayList<Student> student = new ArrayList<>();
    public ArrayList<Professor> professor;
    public ArrayList<academyStaff> academyStaff;
    public ArrayList<lessonStaff> lessonStaff;
    boolean pass = false; //로그인 성공 여부

    public LoginGUI() {
        initComponents();
        jRadioButtonStudent.setSelected(true); //학생을 기본 선택으로
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginWindow = new javax.swing.ButtonGroup();
        jRadioButtonStudent = new javax.swing.JRadioButton();
        jRadioButtonProfessor = new javax.swing.JRadioButton();
        jRadioButtonAcademyStaff = new javax.swing.JRadioButton();
        jRadioButtonLessonStaff = new javax.swing.JRadioButton();
        jTextFieldID = new javax.swing.JTextField();
        jTextFieldPW = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUIS");

        LoginWindow.add(jRadioButtonStudent);
        jRadioButtonStudent.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 14)); // NOI18N
        jRadioButtonStudent.setText("학생");

        LoginWindow.add(jRadioButtonProfessor);
        jRadioButtonProfessor.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 14)); // NOI18N
        jRadioButtonProfessor.setText("교수");

        LoginWindow.add(jRadioButtonAcademyStaff);
        jRadioButtonAcademyStaff.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 14)); // NOI18N
        jRadioButtonAcademyStaff.setText("학사 담당자");

        LoginWindow.add(jRadioButtonLessonStaff);
        jRadioButtonLessonStaff.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 14)); // NOI18N
        jRadioButtonLessonStaff.setText("수업 담당자");

        jLabel1.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 14)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 14)); // NOI18N
        jLabel2.setText("P/W");

        loginButton.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 14)); // NOI18N
        loginButton.setText("로그인");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 14)); // NOI18N
        jButton2.setText("종료");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jRadioButtonStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jRadioButtonProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButtonLessonStaff, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jRadioButtonAcademyStaff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldPW, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 34, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(loginButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButtonStudent)
                            .addComponent(jRadioButtonProfessor)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtonAcademyStaff)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonLessonStaff)))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPW, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(loginButton)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if (jRadioButtonStudent.isSelected()) { //학생 선택 시
            fileIO.fileWork();
            try {
                //Login 버튼
                student = fileIO.getStudent();
            } catch (IOException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            ////로그인 확인
            //ID, PW 입력 받음
            String inputID = jTextFieldID.getText();
            String inputPW = jTextFieldPW.getText();

            pass = login.loginStudentDistinguish(inputID, inputPW, student); //SystemLogin.loginDistinguish 함수 호출

            if (pass) //로그인 성공 시
            {
                dispose(); //LoginGUI 창 닫음
            } else {
                jTextFieldID.setText(""); //칸 지움
                jTextFieldPW.setText("");
            }
        } //if (jRadioButtonStudent) 끝

        if (jRadioButtonProfessor.isSelected()) { //교수 선택 시
            fileIO.fileWork();
            try {
                //Login 버튼
                professor = fileIO.getProfessor();
            } catch (IOException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            ////로그인 확인
            //ID, PW 입력 받음
            String inputID = jTextFieldID.getText();
            String inputPW = jTextFieldPW.getText();

            pass = login.loginProfessorDistinguish(inputID, inputPW, professor); //SystemLogin.loginDistinguish 함수 호출

            if (pass) //로그인 성공 시
            {
                dispose(); //LoginGUI 창 닫음
            } else {
                jTextFieldID.setText(""); //칸 지움
                jTextFieldPW.setText("");
            }
        }//if (jRadioButtonProfessor.isSelected()) 끝

        if (jRadioButtonAcademyStaff.isSelected()) { // 학사 담장자 선택 시
            fileIO.fileWork();
            try {
                //Login 버튼
                academyStaff = fileIO.getAcademyStaff();
            } catch (IOException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }

            ////로그인 확인
            //ID, PW 입력 받음
            String inputID = jTextFieldID.getText();
            String inputPW = jTextFieldPW.getText();

            pass = login.loginAcademyStaffDistinguish(inputID, inputPW, academyStaff); //SystemLogin.loginDistinguish 함수 호출

            if (pass) //로그인 성공 시
            {
                dispose(); //LoginGUI 창 닫음
            } else {
                jTextFieldID.setText(""); //칸 지움
                jTextFieldPW.setText("");
            }
        } //if (jRadioButtonAcademyStaff.isSelected()) 끝

        if (jRadioButtonLessonStaff.isSelected()) { //수업 담당자 선택 시
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Exit 버튼
        System.exit(0); //프로그램 종료
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup LoginWindow;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton jRadioButtonAcademyStaff;
    private javax.swing.JRadioButton jRadioButtonLessonStaff;
    private javax.swing.JRadioButton jRadioButtonProfessor;
    private javax.swing.JRadioButton jRadioButtonStudent;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldPW;
    private javax.swing.JButton loginButton;
    // End of variables declaration//GEN-END:variables

}
