package cse.team8.gui;

import cse.team8.lessonwork.LessonWork;
import cse.team8.user.Lesson;
import java.util.ArrayList;

public class RollUI extends javax.swing.JFrame {
<<<<<<< HEAD
    LessonWork lessonWork = new LessonWork();
    ArrayList<Lesson> lesson = new ArrayList<>(); //교수가 선택되어 있는 강의
    ArrayList<Lesson> thisLesson = new ArrayList<>(); //교수가 선택되어 있는 강의    
    
=======

    LessonWork lessonWork = new LessonWork();
    ArrayList<Lesson> lesson = new ArrayList<>(); //교수가 선택되어 있는 강의
    ArrayList<Lesson> thisLesson = new ArrayList<>(); //교수가 선택되어 있는 강의    

>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
    public RollUI() {
        initComponents();
        //강의 초기값
        lesson = lessonWork.proLesson();
        for (int i = 0; i < lesson.size(); i++) {
            jComboBoxLesson.addItem(lesson.get(i).getName());
        }
    }
<<<<<<< HEAD
=======

>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jListClassStuList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButtExit = new javax.swing.JButton();
        jComboBoxLesson = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
<<<<<<< HEAD
=======
        jSeparator2 = new javax.swing.JSeparator();
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(400, 300));

        jListClassStuList.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jListClassStuList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "강의를 선택해주세요" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jListClassStuList);

        jLabel1.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jLabel1.setText("학생 명단");

        jButtExit.setFont(new java.awt.Font("맑은 고딕 Semilight", 0, 12)); // NOI18N
        jButtExit.setText("확인");
        jButtExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtExitActionPerformed(evt);
            }
        });

        jComboBoxLesson.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxLessonMouseClicked(evt);
            }
        });
        jComboBoxLesson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxLessonActionPerformed(evt);
            }
        });

        jLabel2.setText("강의");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
<<<<<<< HEAD
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 146, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(84, 84, 84)
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtExit)))
                .addContainerGap())
=======
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtExit))
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxLesson, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addContainerGap(30, Short.MAX_VALUE))))
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxLesson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
=======
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
                .addComponent(jButtExit)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtExitActionPerformed
        dispose();
    }//GEN-LAST:event_jButtExitActionPerformed

    private void jComboBoxLessonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxLessonActionPerformed
<<<<<<< HEAD
                        //강의 선택 시
        String selLesson = jComboBoxLesson.getSelectedItem().toString();
        for (int i = 0; i < lesson.size(); i++) {
            if(lesson.get(i).getName().equals(selLesson))
                thisLesson.add(0, lesson.get(i));
        }
        int count = thisLesson.get(0).getStuName().size();
        String[] selStu = new String [count];
=======
        //강의 선택 시
        String selLesson = jComboBoxLesson.getSelectedItem().toString();
        for (int i = 0; i < lesson.size(); i++) {
            if (lesson.get(i).getName().equals(selLesson)) {
                thisLesson.add(0, lesson.get(i));
            }
        }
        int count = thisLesson.get(0).getStuName().size();
        String[] selStu = new String[count];
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9

        for (int i = 0; i < thisLesson.get(0).getStuName().size(); i++) {
            selStu[i] = thisLesson.get(0).getStuName().get(i);
        }
        jListClassStuList.setListData(selStu); //List 갱신
    }//GEN-LAST:event_jComboBoxLessonActionPerformed

    private void jComboBoxLessonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxLessonMouseClicked

    }//GEN-LAST:event_jComboBoxLessonMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RollUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtExit;
    private javax.swing.JComboBox<String> jComboBoxLesson;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jListClassStuList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
<<<<<<< HEAD
=======
    private javax.swing.JSeparator jSeparator2;
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
    // End of variables declaration//GEN-END:variables
}
