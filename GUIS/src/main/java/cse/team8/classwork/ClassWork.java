package cse.team8.classwork;
<<<<<<< HEAD
public interface ClassWork {
    public void gradeInfo(); //학생 성적 확인
    public void billInfo(); //학생 수강료 확인
    
=======

import cse.team8.user.Student;
import java.util.ArrayList;

public interface ClassWork {

    public void gradeInfo(); //학생 성적 확인

    public void billInfo(); //학생 수강료 확인

    public void delStudent(String name);

    public void inputStudent(String editName, String myNum, String mySubject, String frontRRN, String backRRN);
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
}
