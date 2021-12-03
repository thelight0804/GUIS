package cse.team8.gui;

import cse.team8.guis.FileIO;
import cse.team8.lessonwork.LessonWork;
import cse.team8.user.Lesson;
import cse.team8.user.Student;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BillGetUI extends javax.swing.JFrame {

    ArrayList<Student> student = new ArrayList<>();
    ArrayList<Lesson> resultLesson = new ArrayList<>();
    FileIO fileIO = new FileIO();
    LessonWork lessonWork = new LessonWork();

    public BillGetUI() { //창 초기화
        DecimalFormat formatter = new DecimalFormat("###,###"); //금액 콤마(,) 표시
        initComponents();
        try {
            student = fileIO.getStudent();
        } catch (IOException ex) {
            Logger.getLogger(BillGetUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).isNowLogin()) //로그인 되어 있는 계정 확인
            {
                resultLesson = lessonWork.myClass(student.get(i).getName()); //학생이 등록한 Lesson

                jTextFieldStuName.setText(student.get(i).getName());
                jTextFieldStuSubject.setText(student.get(i).getMySubject());
                jTextFieldStuNum.setText(student.get(i).getMyNum());
                jTextFieldStuRRN.setText(student.get(i).getFrontRRN() + " *******");
                jTextFieldCost.setText(Long.toString(student.get(i).getBill()));
                if (student.get(i).getBill() == 0) { //실제 지불할 수강료가 0이면
                    jTextFieldRealCost.setText(Long.toString(student.get(i).getBill()) + "원" + " (" + "청구서 발급이 확인되지 않았습니다" + ")");
                } else {
                    jTextFieldRealCost.setText(formatter.format(student.get(i).getBill()) + "원");
                }

            }
            //수강 신청 정보 출력

            String[] lessonName = new String[resultLesson.size()]; //array와 arraylist
            long resultBill = 0; //최종 수강료

            for (int j = 0; j < resultLesson.size(); j++) {
                //formatter.format : DecimalFormat에서 금액 콤마(,) 표시 [String형]
                lessonName[j] = resultLesson.get(j).getName() + " / " + formatter.format(resultLesson.get(j).getBill()) + "원";
                resultBill = resultBill + resultLesson.get(j).getBill();
            }
            jListClassInfo.setListData(lessonName);
            jTextFieldCost.setText(formatter.format(resultBill) + "원");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldStuNum = new javax.swing.JTextField();
        jTextFieldStuName = new javax.swing.JTextField();
        jTextFieldStuSubject = new javax.swing.JTextField();
        jTextFieldStuRRN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListClassInfo = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCost = new javax.swing.JTextField();
        jButtExit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRealCost = new javax.swing.JTextField();
        jSeparator17 = new javax.swing.JSeparator();
        jSeparator18 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextFieldStuNum.setEnabled(false);
        jTextFieldStuNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStuNumActionPerformed(evt);
            }
        });

        jTextFieldStuName.setEnabled(false);

        jTextFieldStuSubject.setEnabled(false);
        jTextFieldStuSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldStuSubjectActionPerformed(evt);
            }
        });

        jTextFieldStuRRN.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jLabel1.setText("학번");

        jLabel2.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jLabel2.setText("이름");

        jLabel3.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jLabel3.setText("학과");

        jLabel4.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jLabel4.setText("주민등록번호");

        jListClassInfo.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jListClassInfo.setEnabled(false);
        jScrollPane1.setViewportView(jListClassInfo);

        jLabel5.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jLabel5.setText("수강 신청 정보");

        jLabel6.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jLabel6.setText("예상 수강료");

        jTextFieldCost.setEnabled(false);

        jButtExit.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtExit.setText("확인");
        jButtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtExitActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jLabel7.setText("납입 수강료");

        jTextFieldRealCost.setDragEnabled(true);
        jTextFieldRealCost.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldStuName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldStuSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jTextFieldStuNum, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 69, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButtExit)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                            .addComponent(jTextFieldStuRRN)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldRealCost))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextFieldCost, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator18, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator17))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStuSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldStuNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldStuRRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldRealCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButtExit)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldStuNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStuNumActionPerformed

    }//GEN-LAST:event_jTextFieldStuNumActionPerformed

    private void jTextFieldStuSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldStuSubjectActionPerformed

    }//GEN-LAST:event_jTextFieldStuSubjectActionPerformed

    private void jButtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtExitActionPerformed
        // 확인 버튼
        dispose();
    }//GEN-LAST:event_jButtExitActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BillGetUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BillGetUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BillGetUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BillGetUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BillGetUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jListClassInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JTextField jTextFieldCost;
    private javax.swing.JTextField jTextFieldRealCost;
    private javax.swing.JTextField jTextFieldStuName;
    private javax.swing.JTextField jTextFieldStuNum;
    private javax.swing.JTextField jTextFieldStuRRN;
    private javax.swing.JTextField jTextFieldStuSubject;
    // End of variables declaration//GEN-END:variables
}
