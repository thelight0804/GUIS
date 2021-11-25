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

    public void gradeInput(String name, float Grade) {
        try {
            //교수 성적 입력
            student = fileIO.getStudent();
        } catch (IOException ex) {
            Logger.getLogger(ProfessorWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<student.size();i++){
            if (student.get(i).getName().equals(name)) {
                //System.out.println(student.get(i).getCredit());
                student.get(i).setCredit(Grade);
                System.out.println(student.get(i).getCredit());
            }
        }
    }
}
