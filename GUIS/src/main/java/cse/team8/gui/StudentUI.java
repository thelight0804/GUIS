package cse.team8.gui;

import cse.team8.classwork.*;
public class StudentUI extends javax.swing.JFrame {
     StudentWork studentWork = new StudentWork(); //학생 관리

    /**
     * Creates new form StuLogin
     */
    public StudentUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtClassRequest = new javax.swing.JButton();
        jButtGradeCheck = new javax.swing.JButton();
        jButtBillGet = new javax.swing.JButton();
        jButtExit = new javax.swing.JButton();
        jButtonChangePW = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtClassRequest.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtClassRequest.setText("수강신청");

        jButtGradeCheck.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtGradeCheck.setText("성적확인");
        jButtGradeCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtGradeCheckActionPerformed(evt);
            }
        });

        jButtBillGet.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtBillGet.setText("수강료 청구서 확인");
        jButtBillGet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtBillGetActionPerformed(evt);
            }
        });

        jButtExit.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtExit.setText("종료");
        jButtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtExitActionPerformed(evt);
            }
        });

        jButtonChangePW.setText("암호변경");
        jButtonChangePW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangePWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButtClassRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtGradeCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtBillGet)
                    .addComponent(jButtonChangePW))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButtExit)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jButtClassRequest)
                .addGap(34, 34, 34)
                .addComponent(jButtGradeCheck)
                .addGap(34, 34, 34)
                .addComponent(jButtBillGet)
                .addContainerGap(95, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtExit)
                    .addComponent(jButtonChangePW))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtExitActionPerformed
        //종료 버튼
        System.exit(0); //프로그램 종료
    }//GEN-LAST:event_jButtExitActionPerformed

    private void jButtonChangePWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangePWActionPerformed
        //암호 변경 버튼
        changePW a = new changePW(); //changePW 창 호출
        a.setDefaultCloseOperation(changePW.EXIT_ON_CLOSE);
        a.setVisible(true);
    }//GEN-LAST:event_jButtonChangePWActionPerformed

    private void jButtGradeCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtGradeCheckActionPerformed
        //성적 확인 버튼
        studentWork.gradeInfo();
    }//GEN-LAST:event_jButtGradeCheckActionPerformed

    private void jButtBillGetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtBillGetActionPerformed
        //수강료 청구서 확인 버튼
        studentWork.billInfo();
    }//GEN-LAST:event_jButtBillGetActionPerformed

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
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtBillGet;
    private javax.swing.JButton jButtClassRequest;
    private javax.swing.JButton jButtExit;
    private javax.swing.JButton jButtGradeCheck;
    private javax.swing.JButton jButtonChangePW;
    // End of variables declaration//GEN-END:variables
}