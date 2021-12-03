package cse.team8.guis;

import java.io.FileNotFoundException;
import java.io.IOException;
import cse.team8.user.*;
import java.util.ArrayList;

public interface Work {
<<<<<<< HEAD
   // public void run()  throws IOException;
    public void fileWork()  throws IOException;
    public void newFile() throws IOException ;
    public ArrayList<Student> inputStudent() throws FileNotFoundException, IOException ;
    public ArrayList<Professor> inputProfessor() throws FileNotFoundException, IOException ;
    public ArrayList<academyStaff> inputAcademyStaff() throws FileNotFoundException, IOException ;
    public ArrayList<lessonStaff> inputLessonStaff() throws FileNotFoundException, IOException ;
} //class Work 끝
=======
    // public void run()  throws IOException;

    public void fileWork() throws IOException;

    public void newFile() throws IOException;

    public ArrayList<Student> inputStudent() throws FileNotFoundException, IOException;

    public ArrayList<Professor> inputProfessor() throws FileNotFoundException, IOException;

    public ArrayList<AcademyStaff> inputAcademyStaff() throws FileNotFoundException, IOException;

    public ArrayList<LessonStaff> inputLessonStaff() throws FileNotFoundException, IOException;
} //class Work 끝
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
