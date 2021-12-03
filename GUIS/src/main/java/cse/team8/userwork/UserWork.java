package cse.team8.userwork;

import cse.team8.user.*;

import java.io.IOException;
import java.util.ArrayList;

public abstract class UserWork { //추상 클래스

    public abstract boolean loginStudentDistinguish(String inputID, String inputPW, ArrayList<Student> student); //학생 로그인 성공 여부 확인 (추상 메소드)

    public abstract boolean loginProfessorDistinguish(String inputID, String inputPW, ArrayList<Professor> professor); //교수 로그인 성공 여부 확인

    public abstract boolean loginAcademyStaffDistinguish(String inputID, String inputPW, ArrayList<AcademyStaff> academyStaff); //학사담당자 로그인 성공 여부 확인

    public abstract void loginStudentPass(); //학생 로그인 성공

    public abstract void loginProfessorPass(); //교수 로그인 성공

    public abstract void loginAcademyStaffPass(); //교수 로그인 성공

    public abstract void changeStudentPW(String inputPW, ArrayList<Student> student, int count) throws IOException; //학생 비밀번호 변경
}
