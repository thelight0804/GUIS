package cse.team8.gui;

import cse.team8.academywork.Search;
<<<<<<< HEAD
import java.util.ArrayList;
import cse.team8.user.Student;

public class StuEditUI extends javax.swing.JFrame {
    
    ArrayList<Student> studentResult = new ArrayList<>();
    ArrayList<String> Result = new ArrayList<>();
=======
import cse.team8.classwork.StudentWork;
import java.util.ArrayList;
import cse.team8.user.Student;
import javax.swing.JOptionPane;

public class StuEditUI extends javax.swing.JFrame {

    ArrayList<Student> studentResult = new ArrayList<>();
    ArrayList<String> Result = new ArrayList<>();
    StudentWork studentWork = new StudentWork();
    String name;
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9

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
<<<<<<< HEAD
        jTextFieldRRN = new javax.swing.JTextField();
=======
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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
<<<<<<< HEAD
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
=======
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButtonEdit = new javax.swing.JButton();
        jTextFieldBackRRN = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldFrontRRN = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("이름");

<<<<<<< HEAD
=======
        jTextFieldSub.setEnabled(false);

>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
        jLabel1.setText("학번");

        jLabel7.setText("검색 결과");

<<<<<<< HEAD
        jTextFieldRRN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRRNActionPerformed(evt);
            }
        });

=======
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
        jListResult.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "검색 버튼을 클릭하세요" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
<<<<<<< HEAD
=======
        jListResult.setEnabled(false);
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
        jListResult.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListResultMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jListResult);

<<<<<<< HEAD
=======
        jTextFieldName.setEnabled(false);

        jTextFieldNum.setEnabled(false);
        jTextFieldNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNumActionPerformed(evt);
            }
        });

>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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

<<<<<<< HEAD
        jLabel4.setText("주민등록번호");

=======
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
        jLabel3.setText("학과");

        jLabel8.setText("수정할 내용을 입력해주세요");

<<<<<<< HEAD
=======
        jButtonEdit.setText("수정");
        jButtonEdit.setEnabled(false);
        jButtonEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditActionPerformed(evt);
            }
        });

        jTextFieldBackRRN.setEnabled(false);

        jLabel9.setText("-");

        jLabel4.setText("주민등록번호");

        jTextFieldFrontRRN.setEnabled(false);

>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel10))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel5))
                                    .addGap(6, 6, 6)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jComboBoxBase, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jTextFieldWord, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButtonSearch)))))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonEdit)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExit))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel4)
                                                .addGap(18, 18, 18)
                                                .addComponent(jTextFieldFrontRRN, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jTextFieldBackRRN, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextFieldName))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextFieldNum))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                    .addComponent(jLabel3)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jTextFieldSub, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jLabel8)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(125, 125, 125)
                                        .addComponent(jLabel7)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(27, 27, 27))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(8, 8, 8)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jLabel10)
=======
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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
<<<<<<< HEAD
                            .addComponent(jTextFieldSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldRRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(12, 12, 12)
                        .addComponent(jButtonExit))
                    .addComponent(jLabel8))
                .addGap(18, 18, 18))
=======
                            .addComponent(jTextFieldSub, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldFrontRRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldBackRRN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExit)
                    .addComponent(jButtonEdit))
                .addGap(0, 13, Short.MAX_VALUE))
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< HEAD
    private void jTextFieldRRNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRRNActionPerformed

    }//GEN-LAST:event_jTextFieldRRNActionPerformed

    private void jListResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListResultMouseClicked
        //List 클릭 이벤트
        int select = jListResult.getSelectedIndex();
        String name;
=======
    private void jListResultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListResultMouseClicked
        //List 클릭 이벤트
        int select = jListResult.getSelectedIndex();
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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
<<<<<<< HEAD
        }
        else{
            name = Result.get(select*6);
            myNum = Result.get((select*6) + 1);
            mySubject = Result.get((select*6) + 2);
            frontRRN = Result.get((select*6) + 3);
            backRRN = Result.get((select*6) + 4);
=======
        } else {
            name = Result.get(select * 6);
            myNum = Result.get((select * 6) + 1);
            mySubject = Result.get((select * 6) + 2);
            frontRRN = Result.get((select * 6) + 3);
            backRRN = Result.get((select * 6) + 4);
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
        }

        //Text Field 갱신
        jTextFieldName.setText(name);
        jTextFieldNum.setText(myNum);
        jTextFieldSub.setText(mySubject);
<<<<<<< HEAD
        jTextFieldRRN.setText(frontRRN + "-" + backRRN);
=======
        jTextFieldFrontRRN.setText(frontRRN);
        jTextFieldBackRRN.setText(backRRN);
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
    }//GEN-LAST:event_jListResultMouseClicked

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        //취소 버튼
        dispose(); //창 닫기
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jComboBoxBaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxBaseActionPerformed
<<<<<<< HEAD
        // TODO add your handling code here:
=======

>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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
<<<<<<< HEAD
    }//GEN-LAST:event_jButtonSearchActionPerformed

=======

        jListResult.setEnabled(true); //ComboBox
        jTextFieldName.setEnabled(true);
        jTextFieldNum.setEnabled(true); //Button
        jTextFieldSub.setEnabled(true);//TextField
        jTextFieldFrontRRN.setEnabled(true);
        jTextFieldBackRRN.setEnabled(true);
        jButtonEdit.setEnabled(true);
    }//GEN-LAST:event_jButtonSearchActionPerformed

    private void jButtonEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditActionPerformed
        //변경 버튼
        String editName = jTextFieldName.getText(); //이름으로 학생을 구분하기 위해 editName 변수를 따로 씀
        String myNum = jTextFieldNum.getText();
        String mySubject = jTextFieldSub.getText();
        String frontRRN = jTextFieldFrontRRN.getText();
        String backRRN = jTextFieldBackRRN.getText();

        int select = JOptionPane.showConfirmDialog(null, "변경 하시겠습니까?", "Confirm", JOptionPane.OK_CANCEL_OPTION); //확인, 취소 버튼 출력
        if (select == 0) { //확인 버튼 클릭 시
            studentWork.delStudent(name); //학생 객체 및 데이터 제거
            studentWork.inputStudent(editName, myNum, mySubject, frontRRN, backRRN); //변경된 내용으로 학생 객체 및 데이터 추가 (제거 후 추가 = 변경)
            JOptionPane.showMessageDialog(null, "변경이 완료되었습니다"); //팝업 메시지 창
        }
    }//GEN-LAST:event_jButtonEditActionPerformed

    private void jTextFieldNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNumActionPerformed

    }//GEN-LAST:event_jTextFieldNumActionPerformed

>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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
<<<<<<< HEAD
=======
    private javax.swing.JButton jButtonEdit;
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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
<<<<<<< HEAD
    private javax.swing.JList<String> jListResult;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextField jTextFieldRRN;
=======
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListResult;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextFieldBackRRN;
    private javax.swing.JTextField jTextFieldFrontRRN;
    private javax.swing.JTextField jTextFieldName;
    private javax.swing.JTextField jTextFieldNum;
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
    private javax.swing.JTextField jTextFieldSub;
    private javax.swing.JTextField jTextFieldWord;
    // End of variables declaration//GEN-END:variables
}
