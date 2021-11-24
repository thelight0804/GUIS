package cse.team8.guis;

import java.io.FileNotFoundException;
import java.io.IOException;
import cse.team8.user.*;
import java.util.ArrayList;

public abstract class Work {
    public abstract void run()  throws IOException;
    public abstract void newFile() throws IOException ;
    public abstract ArrayList<Student> inputStudent() throws FileNotFoundException, IOException ;
    public abstract ArrayList<Professor> inputProfessor() throws FileNotFoundException, IOException ;
    public abstract ArrayList<academyStaff> inputAcademyStaff() throws FileNotFoundException, IOException ;
    public abstract ArrayList<lessonStaff> inputLessonStaff() throws FileNotFoundException, IOException ;
} //class Work 끝