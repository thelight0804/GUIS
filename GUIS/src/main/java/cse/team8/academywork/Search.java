package cse.team8.academywork;

import cse.team8.guis.FileIO;
import cse.team8.user.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Search implements AcademyWork {

    FileIO fileIO = new FileIO();
    ArrayList<Student> student = new ArrayList<>();
    ArrayList<Professor> Professor = new ArrayList<>();

    public String[] stuSearch(String base, String word) {
        //학생 검색
        //base = 검색 분류, word = 검색어
        int count = 0; //검색 수
        try {
            student = fileIO.getStudent();
        } catch (IOException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<String> result = new ArrayList<>(); //배열은 크기가 고정이기 때문에 임시로 arraylist에 저장
        System.out.println("가나다");
        System.out.println(student.get(10).getName());

        if (base == "이름") { //이름으로 검색
            for (int i = 0; i < student.size(); i++) {
                if (student.get(i).getName().contains(word)) { //검색 결과가 동일하다면
                    result.add("이름 : " + student.get(i).getName() + " / 학번 : " + student.get(i).getMyNum() + " / 학과 : " + student.get(i).getMySubject() + " / 생년월일 : " + student.get(i).getFrontRRN());
                }
            }
        }
        if (base == "학번") { //학번으로 검색
            for (int i = 0; i < student.size(); i++) {
                if (student.get(i).getMyNum().contains(word)) { //검색 결과가 동일하다면
                    result.add("이름 : " + student.get(i).getName() + " / 학번 : " + student.get(i).getMyNum() + " / 학과 : " + student.get(i).getMySubject() + " / 생년월일 : " + student.get(i).getFrontRRN());
                }
            }
        }
        if (base == "학과") { //학번으로 검색
            for (int i = 0; i < student.size(); i++) {
                if (student.get(i).getMySubject().contains(word)) { //검색 결과가 동일하다면
                    result.add("이름 : " + student.get(i).getName() + " / 학번 : " + student.get(i).getMyNum() + " / 학과 : " + student.get(i).getMySubject() + " / 생년월일 : " + student.get(i).getFrontRRN());
                }
            }
        }
        
        String returnResult[] = new String[result.size()]; //임의로 저장해 둔 크기 만큼 배열 크기 지정
        for (int i = 0; i < returnResult.length; i++) {
            returnResult[i] = result.get(i);
        }
        return returnResult;
    }
}
