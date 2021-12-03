package cse.team8.gui;

import cse.team8.academywork.Search;
import cse.team8.user.Student;
import cse.team8.classwork.ProfessorWork;
import java.util.ArrayList;
import javax.swing.JOptionPane;
<<<<<<< HEAD
public class GradeInputUI extends javax.swing.JFrame {
    ArrayList<Student> studentResult = new ArrayList<>();
    ArrayList<String> Result = new ArrayList<>();
    
    public GradeInputUI() {
        initComponents();
    }
    
=======

public class GradeInputUI extends javax.swing.JFrame {

    ArrayList<Student> studentResult = new ArrayList<>();
    ArrayList<String> Result = new ArrayList<>();

    public GradeInputUI() {
        initComponents();
    }

>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSearch = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldWord = new javax.swing.JTextField();
        jComboBoxBase = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListResult = new javax.swing.JList<>();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldSub = new javax.swing.JTextField();
        jButtonExit = new javax.swing.JButton();
        jTextFieldNum = new javax.swing.JTextField();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldGrade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonChange = new javax.swing.JButton();
<<<<<<< HEAD
=======
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSearch.setText("검색");
        jButtonSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSearchActionPerformed(evt);
            }
        });

        jLabel5.setText("검색어");

        jComboBoxBase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "이름", "학번", "학과" }));

        jLabel6.setText("검색 분류");

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

        jLabel7.setText("검색 결과");

        jTextFieldSub.setEnabled(false);

        jButtonExit.setText("취소");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jTextFieldNum.setEnabled(false);

        jTextFieldName.setEnabled(false);

        jTextFieldGrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldGradeActionPerformed(evt);
            }
        });

        jLabel1.setText("학번");

        jLabel2.setText("이름");

        jLabel3.setText("학과");

        jLabel4.setText("성적");

        jButtonChange.setText("변경");
        jButtonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator13, javax.swing.GroupLayout.Alignment.TRAILING)
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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
<<<<<<< HEAD
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
=======
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(jLabel7))
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
<<<<<<< HEAD
                                        .addComponent(jTextFieldGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonChange)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonExit))
=======
                                        .addComponent(jTextFieldGrade, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldSub))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))))
<<<<<<< HEAD
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
=======
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonChange)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExit))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator14))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator15)))
                .addContainerGap())
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldGrade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                    .addComponent(jLabel4)
=======
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
                    .addComponent(jButtonChange)
                    .addComponent(jButtonExit))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
<<<<<<< HEAD
                    listData[i] = Result.get(i * 6) + " / " + Result.get((i * 6)+1) + " / " + Result.get((i * 6)+2);
=======
                    listData[i] = Result.get(i * 6) + " / " + Result.get((i * 6) + 1) + " / " + Result.get((i * 6) + 2);
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
                }
            }
        }
        if (base == "학번") {
            for (int i = 0; i < Result.size(); i++) { //학번만 추출
                if (i == 0) {
                    listData[0] = Result.get(0) + " / " + Result.get(1) + " / " + Result.get(2);
<<<<<<< HEAD
                }
                else if ((i*6)+1 < Result.size()) {
                    //listData[i] = Result.get((i*5)+1) + " / " + Result.get((i * 5)+2) + " / " + Result.get((i * 5)+3);
                    listData[i] = Result.get(i * 6) + " / " + Result.get((i * 6)+1) + " / " + Result.get((i * 6)+2);
=======
                } else if ((i * 6) + 1 < Result.size()) {
                    //listData[i] = Result.get((i*5)+1) + " / " + Result.get((i * 5)+2) + " / " + Result.get((i * 5)+3);
                    listData[i] = Result.get(i * 6) + " / " + Result.get((i * 6) + 1) + " / " + Result.get((i * 6) + 2);
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
                }
            }
        }
        if (base == "학과") {
            for (int i = 0; i < Result.size(); i++) { //학과만 추출
                if (i == 0) {
                    listData[0] = Result.get(0) + " / " + Result.get(1) + " / " + Result.get(2);
<<<<<<< HEAD
                }
                else if ((i*6)+1 < Result.size()) {
                    //listData[i] = Result.get((i*5)+1) + " / " + Result.get((i * 5)+2) + " / " + Result.get((i * 5)+3);
                    listData[i] = Result.get(i * 6) + " / " + Result.get((i * 6)+1) + " / " + Result.get((i * 6)+2);
=======
                } else if ((i * 6) + 1 < Result.size()) {
                    //listData[i] = Result.get((i*5)+1) + " / " + Result.get((i * 5)+2) + " / " + Result.get((i * 5)+3);
                    listData[i] = Result.get(i * 6) + " / " + Result.get((i * 6) + 1) + " / " + Result.get((i * 6) + 2);
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
                }
            }
        }

        jListResult.setListData(listData); //List 갱신
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jListResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListResultMouseClicked
        //List 클릭 이벤트
        int select = jListResult.getSelectedIndex();
        String name;
        String myNum;
        String mySubject;
        String grade;
        if (select == 0) {
            name = Result.get(0);
            myNum = Result.get(1);
            mySubject = Result.get(2);
            grade = Result.get(5);
<<<<<<< HEAD
                    //5~11~17
        }
        else{
            name = Result.get(select*6);
            myNum = Result.get((select*6) + 1);
            mySubject = Result.get((select*6) + 2);
            grade = Result.get((select*6) + 5);
=======
            //5~11~17
        } else {
            name = Result.get(select * 6);
            myNum = Result.get((select * 6) + 1);
            mySubject = Result.get((select * 6) + 2);
            grade = Result.get((select * 6) + 5);
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
        }

        //Text Field 갱신
        jTextFieldName.setText(name);
        jTextFieldNum.setText(myNum);
        jTextFieldSub.setText(mySubject);
        jTextFieldGrade.setText(grade);
    }//GEN-LAST:event_jListResultMouseClicked

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        //취소 버튼
        dispose(); //창 닫기
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jTextFieldGradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldGradeActionPerformed
<<<<<<< HEAD
        
=======

>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
    }//GEN-LAST:event_jTextFieldGradeActionPerformed

    private void jButtonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeActionPerformed
        //변경 버튼
        ProfessorWork input = new ProfessorWork();
<<<<<<< HEAD
        
        //List에서 선택한 이름만 골라서 메소드 호출
        if (Float.parseFloat(jTextFieldGrade.getText()) >= 0.0 && Float.parseFloat(jTextFieldGrade.getText()) <= 4.0) {
            if (jTextFieldGrade.getText() == "0") {
                input.gradeInput(Result.get(0), Float.parseFloat(jTextFieldGrade.getText()));
            } else {
                input.gradeInput(Result.get(jListResult.getSelectedIndex() * 6), Float.parseFloat(jTextFieldGrade.getText()));
            }
            jButtonSearchActionPerformed(evt); //List 갱신
            JOptionPane.showMessageDialog(null, "변경이 완료되었습니다");
        }
        else{
            JOptionPane.showMessageDialog(null, "성적은 0.0~4.0 까지만 입력이 가능합니다");
        }
        //파일처리..!
=======
        int select = JOptionPane.showConfirmDialog(null, "변경 하시겠습니까?", "Confirm", JOptionPane.OK_CANCEL_OPTION); //확인, 취소 버튼 출력
        if (select == 0) { //확인 버튼 클릭 시
            //List에서 선택한 이름만 골라서 메소드 호출
            if (Float.parseFloat(jTextFieldGrade.getText()) >= 0.0 && Float.parseFloat(jTextFieldGrade.getText()) <= 4.0) {
                if (jTextFieldGrade.getText() == "0") {
                    input.gradeInput(Result.get(0), Float.parseFloat(jTextFieldGrade.getText()));
                } else {
                    input.gradeInput(Result.get(jListResult.getSelectedIndex() * 6), Float.parseFloat(jTextFieldGrade.getText()));
                }
                jButtonSearchActionPerformed(evt); //List 갱신
                JOptionPane.showMessageDialog(null, "변경이 완료되었습니다");
            } else {
                JOptionPane.showMessageDialog(null, "성적은 0.0~4.0 까지만 입력이 가능합니다");
            }
        }
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
    }//GEN-LAST:event_jButtonChangeActionPerformed

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
            java.util.logging.Logger.getLogger(GradeInputUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GradeInputUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GradeInputUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GradeInputUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new GradeInputUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChange;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonSearch;
    private javax.swing.JComboBox<String> jComboBoxBase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jListResult;
    private javax.swing.JScrollPane jScrollPane1;
<<<<<<< HEAD
=======
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
    private javax.swing.JTextField jTextFieldGrade;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextField jTextFieldSub;
    private javax.swing.JTextField jTextFieldWord;
    // End of variables declaration//GEN-END:variables
}
