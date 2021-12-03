package cse.team8.classwork;

import cse.team8.guis.FileIO;
import cse.team8.user.Professor;
import cse.team8.user.Student;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProfessorWork {

    FileIO fileIO = new FileIO();
    ArrayList<Student> student = new ArrayList<>();
    ArrayList<Professor> professor = new ArrayList<>();

    public void gradeInput(String name, float Grade) {
        try {
            //교수 성적 입력
            student = fileIO.getStudent();
        } catch (IOException ex) {
            Logger.getLogger(ProfessorWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getName().equals(name)) {
                //System.out.println(student.get(i).getCredit());
                student.get(i).setCredit(Grade);
            }
        }
        try { //파일 업데이트
            fileIO.updateStudent();
        } catch (IOException ex) {
            System.out.println("fileIO.updateStudent() 오류");
        }
    }

    public String[] allStudent() { //학생 명단 출력
        ArrayList<String> name = new ArrayList<>();
        try {
            student = fileIO.getStudent();
        } catch (IOException ex) {
            Logger.getLogger(ProfessorWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            professor = fileIO.getProfessor();
        } catch (IOException ex) {
            Logger.getLogger(ProfessorWork.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < professor.size(); i++) {
            if (professor.get(i).isNowLogin()) {
                for (int j = 0; j < student.size(); j++) {
                    if (professor.get(i).getMySubject().equals(student.get(j).getMySubject())) {
                        name.add(student.get(j).getName());
                    }
                }
            }
        }
        String[] result = new String[name.size()]; //arraylist to array size
        for (int i = 0; i < name.size(); i++) { //arraylist put array
            result[i] = name.get(i);
        }
        return result;
    }

    public void delProfessor(String name) { //교수 삭제
        try {
            professor = fileIO.getProfessor();
        } catch (IOException ex) {
            Logger.getLogger(ProfessorWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < professor.size(); i++) {
            if (professor.get(i).getName().equals(name)) {
                professor.remove(i);
            }
        }
        try {
            fileIO.updateProfessor(); //객체를 파일에 저장
        } catch (IOException ex) {
            Logger.getLogger(ProfessorWork.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void inputProfessor(String editName, String myNum, String mySubject, String frontRRN, String backRRN) { //교수 추가
        try {
            professor = fileIO.getProfessor();
        } catch (IOException ex) {
            Logger.getLogger(ProfessorWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        //String grade, Float credit, long bill, String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW
        //이름2! S002! 전산학과! 111111! 00000002! E! 0.0! 0! 00000002
        professor.add(new Professor(editName, frontRRN, backRRN, myNum, mySubject, false, backRRN)); //강좌 객체 추가
        //객체 생성에서는 'S'tudent 대문자 주의! / float 지정에는 0.0'f' 끝에 f를 붙어주어야 한다

        try {
            fileIO.updateProfessor(); //객체를 파일에 저장
        } catch (IOException ex) {
            Logger.getLogger(ProfessorWork.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
