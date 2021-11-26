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

    public ArrayList<String> stuSearch(String base, String word) {
        //학생 검색
        //base = 검색 분류, word = 검색어
        try {
            student = fileIO.getStudent();
        } catch (IOException ex) {
            Logger.getLogger(Search.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<String> result = new ArrayList<>();

        if (base == "이름") { //이름으로 검색
            for (int i = 0; i < student.size(); i++) {
                if (student.get(i).getName().contains(word)) { //검색 결과가 동일하다면
                    result.add(student.get(i).getName());
                    result.add(student.get(i).getMyNum());
                    result.add(student.get(i).getMySubject());
                    result.add(student.get(i).getFrontRRN());
                    result.add(student.get(i).getBackRRN());
                    result.add(Float.toString(student.get(i).getCredit())); //Float to String
                }
            }
        }
        if (base == "학번") { //학번으로 검색
            for (int i = 0; i < student.size(); i++) {
                if (student.get(i).getMyNum().contains(word)) {
                    result.add(student.get(i).getName());
                    result.add(student.get(i).getMyNum());
                    result.add(student.get(i).getMySubject());
                    result.add(student.get(i).getFrontRRN());
                    result.add(student.get(i).getBackRRN());
                    result.add(Float.toString(student.get(i).getCredit()));
                }
            }
        }
        if (base == "학과") { //학번으로 검색
            for (int i = 0; i < student.size(); i++) {
                if (student.get(i).getMySubject().contains(word)) {
                    result.add(student.get(i).getName());
                    result.add(student.get(i).getMyNum());
                    result.add(student.get(i).getMySubject());
                    result.add(student.get(i).getFrontRRN());
                    result.add(student.get(i).getBackRRN());
                    result.add(Float.toString(student.get(i).getCredit()));
                }
            }
        }
        return result;
    }
    //TODO 교수 검색
}
