/**
 * Date : 21.10.06~
 * Title : 대학정보시스템
 * Project : GUIS (가자미 University Information System)
 * @author joonhee2 - 강준희 (20183203)
 * @author thelight0804 - 박상현 (20183145)
 * @author ssb3204 - 손성배 (20193116)
 * @author SH1NJH - 신종훈 (20183197)
 * @author dudgns0421 - 이영훈 (20173149)
 */
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

import cse.team8.guis.Work;
import cse.team8.user.*;
import javax.swing.JOptionPane;


public class LoginGUI extends javax.swing.JFrame {
    Work work = new Work();
    public ArrayList<Student> student = new ArrayList<>();
    
    
    public LoginGUI() {
        initComponents();
        jRadioButtonStudent.setSelected(true);
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
        //Login 버튼
        try {
            work.run();
        } catch (IOException ex) {
            Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (jRadioButtonStudent.isSelected()){ //학생 선택 시
            try {
                student = work.getStudent(); //Work에서 생성한 student의 값을 LoginGUI의 student에 복사
            } catch (IOException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            ////로그인 확인
            //ID, PW 입력 받음
            String inputID = jTextFieldID.getText();
            String inputPW = jTextFieldPW.getText();

            loginDistinguish(inputID, inputPW);
            
           // JOptionPane.showMessageDialog(null,STR); //값 정확히 나오는지 확인 용            
        } //if (jRadioButtonStudent) 끝
        
        if (jRadioButtonProfessor.isSelected()){ //교수 선택 시
            File professorData = new File("C:\\Temp\\GUIS\\ProfessorData.txt");
            try {
                BufferedReader readID = new BufferedReader(new FileReader(professorData));
                String str = null;
                String ID = null; 
                //JOptionPane.showMessageDialog(null,str);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (jRadioButtonAcademyStaff.isSelected()){ // 학사 담장자 선택 시
            File academyStaffData = new File("C:\\Temp\\GUIS\\academyStaffData.txt");
            try {
                BufferedReader readID = new BufferedReader(new FileReader(academyStaffData));
                String str = null;
                String ID = null; 
                //JOptionPane.showMessageDialog(null,str);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if (jRadioButtonLessonStaff.isSelected()){ //수업 담당자 선택 시
            File lessonStaffData = new File("C:\\Temp\\GUIS\\lessonStaffData.txt");
            try {
                BufferedReader readID = new BufferedReader(new FileReader(lessonStaffData));
                String str = null;
                String ID = null; 
                //JOptionPane.showMessageDialog(null,str);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(LoginGUI.class.getName()).log(Level.SEVERE, null, ex);
            }
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

    private void loginDistinguish(String inputID, String inputPW) { //로그인 성공 여부 확인
        boolean pass = false; //로그인 성공 여부
        for(int i=0;i<student.size();i++){
            if(inputID.equals(student.get(i).getMyNum()) && inputPW.equals(student.get(i).getBackRRN())){
                JOptionPane.showMessageDialog(null,student.get(i).getName()+" 로그인 성공");
                pass = true;
                break; //로그인 성공하면 for문을 빠져 나간다
            } 
        } //for문 종료
        if(pass){ //로그인 성공 시
            loginPass();
        }
        else{
            JOptionPane.showMessageDialog(null,"ID 및 P/W를 다시 한번 확인해 주세요");
        }
    }
    private void loginPass() { //로그인 성공 함수
        //TODO 다음 창 출력
    }
}
