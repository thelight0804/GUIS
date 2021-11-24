package cse.team8.guis;

import java.io.FileNotFoundException;
import java.io.IOException;
import cse.team8.user.*;
import java.util.ArrayList;

public interface Work {
   // public void run()  throws IOException;
    public void fileWork()  throws IOException;
    public void newFile() throws IOException ;
    public ArrayList<Student> inputStudent() throws FileNotFoundException, IOException ;
    public ArrayList<Professor> inputProfessor() throws FileNotFoundException, IOException ;
    public ArrayList<academyStaff> inputAcademyStaff() throws FileNotFoundException, IOException ;
    public ArrayList<lessonStaff> inputLessonStaff() throws FileNotFoundException, IOException ;
} //class Work 끝