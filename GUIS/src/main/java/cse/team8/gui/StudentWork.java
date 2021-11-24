package cse.team8.gui;
public class StudentWork extends javax.swing.JFrame {
    public StudentWork() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtClassRequest = new javax.swing.JButton();
        jButtGradeCheck = new javax.swing.JButton();
        jButtBillget = new javax.swing.JButton();
        jButtonPWChange = new javax.swing.JButton();
        jButtExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtClassRequest.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtClassRequest.setText("수강신청");

        jButtGradeCheck.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtGradeCheck.setText("성적확인");

        jButtBillget.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtBillget.setText("수강료 청구서 발급 받기");

        jButtonPWChange.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtonPWChange.setText("암호 변경");
        jButtonPWChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPWChangeActionPerformed(evt);
            }
        });

        jButtExit.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtExit.setText("종료");
        jButtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtExitActionPerformed(evt);
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
                    .addComponent(jButtBillget)
                    .addComponent(jButtonPWChange))
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
                .addComponent(jButtBillget)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtExit)
                    .addComponent(jButtonPWChange))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtExitActionPerformed
        //종료 버튼
        System.exit(0);
    }//GEN-LAST:event_jButtExitActionPerformed

    private void jButtonPWChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPWChangeActionPerformed
        //암호 변경 버튼
        changePW ch = new changePW();
        ch.setDefaultCloseOperation(changePW.EXIT_ON_CLOSE);
        ch.setVisible(true);
    }//GEN-LAST:event_jButtonPWChangeActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentWork().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtBillget;
    private javax.swing.JButton jButtClassRequest;
    private javax.swing.JButton jButtExit;
    private javax.swing.JButton jButtGradeCheck;
    private javax.swing.JButton jButtonPWChange;
    // End of variables declaration//GEN-END:variables
}
