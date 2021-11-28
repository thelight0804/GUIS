package cse.team8.gui;

import cse.team8.academywork.Search;
import java.util.ArrayList;
import cse.team8.user.Student;

public class StuEditUI extends javax.swing.JFrame {
    
    ArrayList<Student> studentResult = new ArrayList<>();
    ArrayList<String> Result = new ArrayList<>();

    public StuEditUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jTextFieldSub = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldRRN = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListResult = new javax.swing.JList<>();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldNum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonExit = new javax.swing.JButton();
        jComboBoxBase = new javax.swing.JComboBox<>();
        jTextFieldWord = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonSearch = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("이름");

        jLabel1.setText("학번");

        jLabel7.setText("검색 결과");

        jTextFieldRRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRRNActionPerformed(evt);
            }
        });

        jListResult.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "검색 버튼을 클릭하세요" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListResultMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListResult);

        jLabel6.setText("검색 분류");

        jButtonExit.setText("취소");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jComboBoxBase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "이름", "학번", "학과" }));
        jComboBoxBase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxBaseActionPerformed(evt);
            }
        });

        jLabel5.setText("검색어");

        jButtonSearch.setText("검색");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabel4.setText("주민등록번호");

        jLabel3.setText("학과");

        jLabel8.setText("수정할 내용을 입력해주세요");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel7)
                        .addContainerGap(275, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jComboBoxBase, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jTextFieldWord)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButtonSearch))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldRRN))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldSub, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 20, Short.MAX_VALUE)))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonExit))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, 0)
                        .addComponent(jLabel8)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxBase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSearch)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldWord, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(12, 12, 12)
                        .addComponent(jButtonExit))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldRRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRRNActionPerformed

    }//GEN-LAST:event_jTextFieldRRNActionPerformed

    private void jListResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListResultMouseClicked
        //List 클릭 이벤트
        int select = jListResult.getSelectedIndex();
        String name;
        String myNum;
        String mySubject;
        String frontRRN;
        String backRRN;
        if (select == 0) {
            name = Result.get(0);
            myNum = Result.get(1);
            mySubject = Result.get(2);
            frontRRN = Result.get(3);
            backRRN = Result.get(4);
        }
        else{
            name = Result.get(select*6);
            myNum = Result.get((select*6) + 1);
            mySubject = Result.get((select*6) + 2);
            frontRRN = Result.get((select*6) + 3);
            backRRN = Result.get((select*6) + 4);
        }

        //Text Field 갱신
        jTextFieldName.setText(name);
        jTextFieldNum.setText(myNum);
        jTextFieldSub.setText(mySubject);
        jTextFieldRRN.setText(frontRRN + "-" + backRRN);
    }//GEN-LAST:event_jListResultMouseClicked

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        //취소 버튼
        dispose(); //창 닫기
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jComboBoxBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBaseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxBaseActionPerformed

    private void jButtonSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSearchActionPerformed
        //검색 버튼
        String base = jComboBoxBase.getSelectedItem().toString(); //검색 분류 추출
        String word = jTextFieldWord.getText(); //검색어 추출

        Search search = new Search();

        Result = search.stuSearch(base, word); //검색 메소드
        String listData[] = new String[Result.size()];

        if (base == "이름") {
            for (int i = 0; i < Result.size(); i++) { //이름만 추출
                if (i == 0) {
                    listData[0] = Result.get(0) + " / " + Result.get(1) + " / " + Result.get(2);
                } else if (i * 6 < Result.size()) {
                    listData[i] = Result.get(i * 6) + " / " + Result.get((i * 6)+1) + " / " + Result.get((i * 6)+2);
                }
            }
        }
        if (base == "학번") {
            for (int i = 0; i < Result.size(); i++) { //학번만 추출
                if (i == 0) {
                    listData[0] = Result.get(0) + " / " + Result.get(1) + " / " + Result.get(2);
                }
                else if ((i*6)+1 < Result.size()) {
                    //listData[i] = Result.get((i*5)+1) + " / " + Result.get((i * 5)+2) + " / " + Result.get((i * 5)+3);
                    listData[i] = Result.get(i * 6) + " / " + Result.get((i * 6)+1) + " / " + Result.get((i * 6)+2);
                }
            }
        }
        if (base == "학과") {
            for (int i = 0; i < Result.size(); i++) { //학과만 추출
                if (i == 0) {
                    listData[0] = Result.get(0) + " / " + Result.get(1) + " / " + Result.get(2);
                }
                else if ((i*6)+1 < Result.size()) {
                    //listData[i] = Result.get((i*5)+1) + " / " + Result.get((i * 5)+2) + " / " + Result.get((i * 5)+3);
                    listData[i] = Result.get(i * 6) + " / " + Result.get((i * 6)+1) + " / " + Result.get((i * 6)+2);
                }
            }
        }

        jListResult.setListData(listData); //List 갱신
    }//GEN-LAST:event_jButtonSearchActionPerformed

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
            java.util.logging.Logger.getLogger(StuEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StuEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StuEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StuEditUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new StuEditUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxBase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jListResult;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextField jTextFieldRRN;
    private javax.swing.JTextField jTextFieldSub;
    private javax.swing.JTextField jTextFieldWord;
    // End of variables declaration//GEN-END:variables
}
