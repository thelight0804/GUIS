/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cse.team8.gui;

import cse.team8.guis.FileIO;
import cse.team8.lessonwork.LessonWork;
import cse.team8.user.Lesson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 박상현
 */
public class DisableLessonUI extends javax.swing.JFrame {
    ArrayList<Lesson> chooseLesson = new ArrayList<>();
    ArrayList<Lesson> lesson = new ArrayList<>();
    LessonWork lessonWork = new LessonWork();
    FileIO fileIO = new FileIO();
    int count;
    int classNum = 0;
    
    public DisableLessonUI() {
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

        jLabel1 = new javax.swing.JLabel();
        jButtonDisable = new javax.swing.JButton();
        jButtExit = new javax.swing.JButton();
        jComboBoxSubject = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxClassList = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("이번 학기 폐지할 강의를 선택해주세요");

        jButtonDisable.setText("폐지");
        jButtonDisable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDisableActionPerformed(evt);
            }
        });

        jButtExit.setText("취소");
        jButtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtExitActionPerformed(evt);
            }
        });

        jComboBoxSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "전산학과", "전자공학과", "화학공학과", "기계공학과", "항공우주공학과" }));
        jComboBoxSubject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSubjectActionPerformed(evt);
            }
        });

        jLabel3.setText("학과");

        jComboBoxClassList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "학과를 선택해 주세요" }));
        jComboBoxClassList.setEnabled(false);
        jComboBoxClassList.setName(""); // NOI18N
        jComboBoxClassList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxClassListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxSubject, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jComboBoxClassList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonDisable)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtExit)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBoxSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBoxClassList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonDisable)
                    .addComponent(jButtExit))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonDisableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDisableActionPerformed
        //폐지 버튼
        int select = JOptionPane.showConfirmDialog(null, "강좌를 폐지 하시겠습니까?\n강의는 폐지되지만 삭제되지 않습니다", "Confirm", JOptionPane.OK_CANCEL_OPTION); //확인, 취소 버튼 출력
        if (select == 0) { //확인 버튼 클릭 시
            //lessonWork.lessonClass(count, classNum, chooseLesson);
            lessonWork.disableClass(count, classNum, chooseLesson);
            JOptionPane.showMessageDialog(null, "강좌를 폐지했습니다");
        }
    }//GEN-LAST:event_jButtonDisableActionPerformed

    private void jButtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtExitActionPerformed
        dispose(); //창 닫기
    }//GEN-LAST:event_jButtExitActionPerformed

    private void jComboBoxSubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSubjectActionPerformed
        //학과 선택 시
        jComboBoxClassList.setEnabled(true);
        jComboBoxClassList.removeAllItems();
        String subject = jComboBoxSubject.getSelectedItem().toString();

        chooseLesson = lessonWork.chooseEnLesson(subject); //학과에 맞는 강좌 처리
        count = lessonWork.chooseLessonCount(subject); //해당되는 강좌 수

        for (int i = 0; i < chooseLesson.size(); i++) {
            jComboBoxClassList.addItem(chooseLesson.get(i).getName()); //ComboBox에 적용
        }        //TODO comboBox 오름차순 정렬
    }//GEN-LAST:event_jComboBoxSubjectActionPerformed

    private void jComboBoxClassListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxClassListActionPerformed
        //정보 표시
        classNum = jComboBoxClassList.getSelectedIndex();
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            Logger.getLogger(DisableLessonUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jComboBoxClassListActionPerformed

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
            java.util.logging.Logger.getLogger(DisableLessonUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DisableLessonUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DisableLessonUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DisableLessonUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisableLessonUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtExit;
    private javax.swing.JButton jButtonDisable;
    private javax.swing.JComboBox<String> jComboBoxClassList;
    private javax.swing.JComboBox<String> jComboBoxSubject;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
