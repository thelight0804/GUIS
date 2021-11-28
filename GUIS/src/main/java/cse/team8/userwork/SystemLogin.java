/*
ID와 P/W를 비교할 시스템 로그인 class(객체 형식)
 */
package cse.team8.userwork;

import cse.team8.gui.*;
import cse.team8.user.*;
import cse.team8.guis.FileIO;
import cse.team8.userwork.userWork;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SystemLogin extends userWork {

    public SystemLogin() {
    }

    @Override
    public boolean loginStudentDistinguish(String inputID, String inputPW, ArrayList<Student> student) { //학생 로그인 성공 여부 확인
        boolean pass = false; //로그인 성공 여부
        for (int i = 0; i < student.size(); i++) {
            if (inputID.equals(student.get(i).getMyNum()) && inputPW.equals(student.get(i).getPW())) { //교수 로그인 성공 여부 확인
                JOptionPane.showMessageDialog(null, student.get(i).getName() + " 로그인 성공");
                pass = true;
                student.get(i).setNowLogin(true); //로그인 한 계정 분류
                break;
            }
        }
        if (pass) { //로그인 성공 시
            loginStudentPass();
        } else {
            JOptionPane.showMessageDialog(null, "ID 및 P/W를 다시 한번 확인해 주세요");
        }
        return pass;
    }

    @Override
    public boolean loginProfessorDistinguish(String inputID, String inputPW, ArrayList<Professor> professor) { //교수 로그인 성공 여부 확인
        boolean pass = false; //로그인 성공 여부
        for (int i = 0; i < professor.size(); i++) {
            if (inputID.equals(professor.get(i).getMyNum()) && inputPW.equals(professor.get(i).getPW())) { //교수 로그인 성공 여부 확인
                JOptionPane.showMessageDialog(null, professor.get(i).getName() + " 로그인 성공");
                pass = true;
                professor.get(i).setNowLogin(true); //로그인 한 계정 분류
                break;
            }
        }
        if (pass) { //로그인 성공 시
            loginProfessorPass();
        } else {
            JOptionPane.showMessageDialog(null, "ID 및 P/W를 다시 한번 확인해 주세요");
        }
        return pass;
    }
    
    public boolean loginAcademyStaffDistinguish (String inputID, String inputPW, ArrayList<academyStaff> academyStaff){ //학사 담당자 로그인 성공 여부 확인
        boolean pass = false; //로그인 성공 여부
        for (int i = 0; i < academyStaff.size(); i++) {
            if (inputID.equals(academyStaff.get(i).getMyNum()) && inputPW.equals(academyStaff.get(i).getPW())) { //교수 로그인 성공 여부 확인
                JOptionPane.showMessageDialog(null, academyStaff.get(i).getName() + " 로그인 성공");
                pass = true;
                academyStaff.get(i).setNowLogin(true); //로그인 한 계정 분류
                break;
            }
        }
        if (pass) { //로그인 성공 시
            loginAcademyStaffPass();
        } else {
            JOptionPane.showMessageDialog(null, "ID 및 P/W를 다시 한번 확인해 주세요");
        }
        return pass;
    }
    
    public boolean loginLessonStaffDistinguish (String inputID, String inputPW, ArrayList<lessonStaff> lessonStaff){ //수업 담당자 로그인 성공 여부 확인
        boolean pass = false; //로그인 성공 여부
        for (int i = 0; i < lessonStaff.size(); i++) {
            if (inputID.equals(lessonStaff.get(i).getMyNum()) && inputPW.equals(lessonStaff.get(i).getPW())) { //교수 로그인 성공 여부 확인
                JOptionPane.showMessageDialog(null, lessonStaff.get(i).getName() + " 로그인 성공");
                pass = true;
                lessonStaff.get(i).setNowLogin(true); //로그인 한 계정 분류
                break;
            }
        }
        if (pass) { //로그인 성공 시
            loginLessonStaffPass();
        } else {
            JOptionPane.showMessageDialog(null, "ID 및 P/W를 다시 한번 확인해 주세요");
        }
        return pass;
    }
    
    public void loginAcademyStaffPass(){ //학사담당자 로그인 성공
        AcademyUI AcademyWork = new AcademyUI();
        AcademyWork.setDefaultCloseOperation(AcademyUI.EXIT_ON_CLOSE);
        AcademyWork.pack();
        AcademyWork.setLocationRelativeTo(null);
        AcademyWork.setVisible(true);
    }
    
     public void loginLessonStaffPass(){ //수업담당자 로그인 성공
        LessonUI LessonWork = new LessonUI();
        LessonWork.setDefaultCloseOperation(LessonUI.EXIT_ON_CLOSE);
        LessonWork.pack();
        LessonWork.setLocationRelativeTo(null);
        LessonWork.setVisible(true);
    }

    @Override
    public void loginStudentPass() { //학생 로그인 성공
        StudentUI call = new StudentUI();
        call.setDefaultCloseOperation(StudentUI.EXIT_ON_CLOSE);
        call.pack();
        call.setLocationRelativeTo(null);
        call.setVisible(true);
    }

    public void loginProfessorPass() { //교수 로그인 성공
        ProfessorUI professorWork = new ProfessorUI();
        professorWork.setDefaultCloseOperation(ProfessorUI.EXIT_ON_CLOSE);
        professorWork.pack();
        professorWork.setLocationRelativeTo(null);        
        professorWork.setVisible(true);
    }

    @Override
    public void changeStudentPW(String inputPW, ArrayList<Student> student, int count) throws IOException { //학생 암호 변경
        //count : 해당 번호의 arraylist 데이터
        student.get(count).setPW(inputPW); //객체 PW 변경
        FileIO a = new FileIO();
        a.updateStudent(); //변경된 객체를 파일에 저장
    }
        public void changeProfessorPW(String inputPW, ArrayList<Professor> professor, int count) throws IOException { //교수 암호 변경
        //count : 해당 번호의 arraylist 데이터
        professor.get(count).setPW(inputPW); //객체 PW 변경
        FileIO a = new FileIO();
        a.updateProfessor();//변경된 객체를 파일에 저장
    }
        public void changeAcademyStaffPW(String inputPW, ArrayList<academyStaff> academyStaff, int count) throws IOException { //학사담당자 암호 변경
        //count : 해당 번호의 arraylist 데이터
        academyStaff.get(count).setPW(inputPW); //객체 PW 변경
        FileIO a = new FileIO();
        a.updateAcademyStaff();//변경된 객체를 파일에 저장
    }
        public void changeLessonStaffPW(String inputPW, ArrayList<lessonStaff> lessonStaff, int count) throws IOException { //수업담당자 암호 변경
        //count : 해당 번호의 arraylist 데이터
        lessonStaff.get(count).setPW(inputPW); //객체 PW 변경
        FileIO a = new FileIO();
        a.updateLessonStaff();//변경된 객체를 파일에 저장
    }

} //class SystemLogin 끝
