package cse.team8.classwork;

import javax.swing.JOptionPane;
import cse.team8.guis.FileIO;
import cse.team8.user.Student;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentWork implements ClassWork {

    FileIO fileIO = new FileIO();
    public ArrayList<Student> student = new ArrayList<>();

    @Override
    public void gradeInfo() {
        try {
            //학생 성적 확인
            student = fileIO.getStudent();
        } catch (IOException ex) {
            Logger.getLogger(StudentWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).isNowLogin()) {
                JOptionPane.showMessageDialog(null, student.get(i).getName() + "의 학점 : " + student.get(i).getCredit() + "(" + student.get(i).getGrade() + ")");
            }
        }
    }

    @Override
    public void billInfo() { //학생 수강료 확인
        try {
            //학생 성적 확인
            student = fileIO.getStudent();
        } catch (IOException ex) {
            Logger.getLogger(StudentWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).isNowLogin()) {
                JOptionPane.showMessageDialog(null, student.get(i).getName() + "의 수강료 : " + student.get(i).getBill() + "원");
            }
        }
    }
} //class 끝
