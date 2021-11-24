package cse.team8.userwork;

import cse.team8.user.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public abstract class userWork { //추상 클래스
    public abstract boolean loginStudentDistinguish(String inputID, String inputPW, ArrayList <Student> student); //로그인 성공 여부 확인 (추상 메소드)
    public abstract void loginStudentPass(); //학생 로그인 성공
    public void changeStudentPW(String inputPW, ArrayList <Student> student, int count){ //학생 비밀번호 변경
        //count : 해당 번호의 arraylist 데이터
        student.get(count).setPW(inputPW); //객체 PW 변경
        //System.out.println(student.get(count).getName());
    }
}
