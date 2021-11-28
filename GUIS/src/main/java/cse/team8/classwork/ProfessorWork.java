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
}
