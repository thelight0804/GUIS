/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse.team8.gui;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AcademyUI extends javax.swing.JFrame {
    public AcademyUI() {
        initComponents();
        jRadioButtStudent.setSelected(true); //학생을 기본 선택으로
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButtCreate = new javax.swing.JButton();
        jButtEdit = new javax.swing.JButton();
        jButtSearch = new javax.swing.JButton();
        jButtDel = new javax.swing.JButton();
        jButtPWchange = new javax.swing.JButton();
        jButtExit = new javax.swing.JButton();
        jRadioButtStudent = new javax.swing.JRadioButton();
        jRadioButtProfessor = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtCreate.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtCreate.setText("등록");
        jButtCreate.setToolTipText("");

        jButtEdit.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtEdit.setText("수정");

        jButtSearch.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtSearch.setText("검색");
        jButtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtSearchActionPerformed(evt);
            }
        });

        jButtDel.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtDel.setText("삭제");

        jButtPWchange.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtPWchange.setText("암호 변경");

        jButtExit.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtExit.setText("종료");
        jButtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtExitActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtStudent);
        jRadioButtStudent.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jRadioButtStudent.setText("학생");

        buttonGroup1.add(jRadioButtProfessor);
        jRadioButtProfessor.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jRadioButtProfessor.setText("교수");
        jRadioButtProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtProfessorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButtStudent)
                    .addComponent(jButtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtDel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtEdit)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButtProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(50, 50, 50))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButtPWchange)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtExit)
                .addGap(9, 9, 9))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jRadioButtProfessor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtPWchange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtProfessorActionPerformed

    }//GEN-LAST:event_jRadioButtProfessorActionPerformed

    private void jButtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtExitActionPerformed

        System.exit(0); //프로그램 종료
    }//GEN-LAST:event_jButtExitActionPerformed

    private void jButtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtSearchActionPerformed
        //조회 버튼
        if (jRadioButtStudent.isSelected()) { //학생 선택 시
        StuSearchUI StuSearchUIWork = new StuSearchUI();
        StuSearchUIWork.setDefaultCloseOperation(StuSearchUIWork.EXIT_ON_CLOSE);
        StuSearchUIWork.pack();
        StuSearchUIWork.setLocationRelativeTo(null);
        StuSearchUIWork.setVisible(true);
        }
       if (jRadioButtProfessor.isSelected()) { //학생 선택 시
            JOptionPane.showMessageDialog(null, "교수 선택");
        }
    }//GEN-LAST:event_jButtSearchActionPerformed

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
            java.util.logging.Logger.getLogger(AcademyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AcademyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AcademyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AcademyUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new AcademyUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtCreate;
    private javax.swing.JButton jButtDel;
    private javax.swing.JButton jButtEdit;
    private javax.swing.JButton jButtExit;
    private javax.swing.JButton jButtPWchange;
    private javax.swing.JButton jButtSearch;
    private javax.swing.JRadioButton jRadioButtProfessor;
    private javax.swing.JRadioButton jRadioButtStudent;
    // End of variables declaration//GEN-END:variables
}
