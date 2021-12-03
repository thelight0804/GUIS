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

    @Override
    public void delStudent(String name) { //학생 삭제
        try {
            student = fileIO.getStudent();
        } catch (IOException ex) {
            Logger.getLogger(StudentWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getName().equals(name)) {
                student.remove(i);
            }
        }
        try {
            fileIO.updateStudent(); //객체를 파일에 저장
        } catch (IOException ex) {
            Logger.getLogger(StudentWork.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inputStudent(String editName, String myNum, String mySubject, String frontRRN, String backRRN) { //학생 추가
        try {
            student = fileIO.getStudent();
        } catch (IOException ex) {
            Logger.getLogger(StudentWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        //String grade, Float credit, long bill, String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW
        //이름2! S002! 전산학과! 111111! 00000002! E! 0.0! 0! 00000002
        student.add(new Student("E", 0.0f, 0, editName, frontRRN, backRRN, myNum, mySubject, false, backRRN)); //강좌 객체 추가
        //객체 생성에서는 'S'tudent 대문자 주의! / float 지정에는 0.0'f' 끝에 f를 붙어주어야 한다

        try {
            fileIO.updateStudent(); //객체를 파일에 저장
        } catch (IOException ex) {
            Logger.getLogger(StudentWork.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
} //class 끝
