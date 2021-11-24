package cse.team8.guis;

import cse.team8.user.Professor;
import cse.team8.user.Student;
import cse.team8.user.academyStaff;
import cse.team8.user.lessonStaff;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileIO implements Work{
    static public ArrayList<Student> student;
    static public ArrayList<Professor> professor;
    static public ArrayList<academyStaff> academyStaff;
    static public ArrayList<lessonStaff> lessonStaff;
    
    public void fileWork() {
        try {
            newFile();
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            student = inputStudent();
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            professor = inputProfessor();
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            academyStaff = inputAcademyStaff();
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            lessonStaff = inputLessonStaff();
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void newFile() throws IOException { //파일 생성
        File newDir = new File("C:\\Temp\\GUIS"); //파일 읽기
        if (!newDir.exists()) {  //만약 해당 경로에 파일이 없는 경우
            newDir.mkdirs(); //폴더 생성
        }
        File studentData = new File("C:\\Temp\\GUIS\\StudentData.txt"); //파일 읽기
        File professorData = new File("C:\\Temp\\GUIS\\ProfessorData.txt");
        File academystaffData = new File("C:\\Temp\\GUIS\\academyStaffData.txt");
        File lessonstaffData = new File("C:\\Temp\\GUIS\\lessonStaffData.txt");

        if (!studentData.exists()) {  //만약 해당 경로에 파일이 없는 경우
            studentData.createNewFile(); //파일 생성
            BufferedWriter bw = new BufferedWriter(new FileWriter(studentData));
            bw.write("TestName!1!전산학과!111111!1!E!0.0!0"); //테스트용 학생
            bw.newLine();
            for(int i=1;i<10;i++){
                String name = "이름" + i ;
                String myNum = "!S00" + i;
                String mySubject = "!전산학과";
                String frontRRN = "!111111";
                String backRRN = "!0000000" + i;
                String grade = "!E";
                String credit = "!0.0";
                String bill = "!0";
                bw.write(name + myNum + mySubject + frontRRN + backRRN + grade + credit + bill);
                bw.newLine();
            }
            for(int i=10;i<20;i++){
                String name = "이름" + i ;
                String myNum = "!S0" + i;
                String mySubject = "!전자공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                String grade = "!E";
                String credit = "!0.0";
                String bill = "!0";
                bw.write(name + myNum + mySubject + frontRRN + backRRN + grade + credit + bill);
                bw.newLine();
            }
            for(int i=20;i<30;i++){
                String name = "이름" + i ;
                String myNum = "!S0" + i;
                String mySubject = "!화학공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                String grade = "!E";
                String credit = "!0.0";
                String bill = "!0";
                bw.write(name + myNum + mySubject + frontRRN + backRRN + grade + credit + bill);
                bw.newLine();
            }
            for(int i=30;i<40;i++){
                String name = "이름" + i ;
                String myNum = "!S0" + i;
                String mySubject = "!기계공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                String grade = "!E";
                String credit = "!0.0";
                String bill = "!0";
                bw.write(name + myNum + mySubject + frontRRN + backRRN + grade + credit + bill);
                bw.newLine();
            }
            for(int i=40;i<50;i++){
                String name = "이름" + i ;
                String myNum = "!S0" + i;
                String mySubject = "!항공우주공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                String grade = "!E";
                String credit = "!0.0";
                String bill = "!0";
                bw.write(name + myNum + mySubject + frontRRN + backRRN + grade + credit + bill);
                bw.newLine();
            }
            bw.close(); //파일을 닫아주어야 갱신이 된다
        }
        if (!professorData.exists()) {  //만약 해당 경로에 파일이 없는 경우
            professorData.createNewFile(); //파일 생성
            BufferedWriter bw = new BufferedWriter(new FileWriter(professorData));
            bw.write("풍성현!P001!전산학과!111111!0000005");
            bw.newLine();
            bw.write("설지수!P002!전자공학과!111111!0000006");
            bw.newLine();
            bw.write("서효기!P003!화학공학과!111111!0000007");
            bw.newLine();
            bw.write("송선옥!P004!기계공학과!111111!0000008");
            bw.newLine();
            bw.write("오재우!P005!항공우주공학과!111111!0000009");
            bw.newLine();
            bw.close(); //파일을 닫아주어야 갱신이 된다
        }
        if (!academystaffData.exists()) {  //만약 해당 경로에 파일이 없는 경우
            academystaffData.createNewFile(); //파일 생성
            BufferedWriter bw = new BufferedWriter(new FileWriter(academystaffData));
            bw.write("이범준!H001!전산학과!111111!0000010");
            bw.newLine();
            bw.write("한준수!H002!전자공학과!111111!0000011");
            bw.newLine();
            bw.write("설수빈!H003!화학공학과!111111!0000012");
            bw.newLine();
            bw.write("허재현!H004!기계공학과!111111!0000013");
            bw.newLine();
            bw.write("풍태은!H005!항공우주공학과!111111!0000014");
            bw.newLine();
            bw.close(); //파일을 닫아주어야 갱신이 된다
        }
        if (!lessonstaffData.exists()) {  //만약 해당 경로에 파일이 없는 경우
            lessonstaffData.createNewFile(); //파일 생성
            BufferedWriter bw = new BufferedWriter(new FileWriter(lessonstaffData));
            bw.write("노성숙!G001!전산학과!111111!0000015");
            bw.newLine();
            bw.write("복원웅!G002!전자공학과!111111!0000016");
            bw.newLine();
            bw.write("예채영!G003!화학공학과!111111!0000017");
            bw.newLine();
            bw.write("고경옥!G004!기계공학과!111111!0000018");
            bw.newLine();
            bw.write("서상학!G005!항공우주공학과!111111!0000019");
            bw.newLine();
            bw.close(); //파일을 닫아주어야 갱신이 된다
        }
        else{ //파일이 있다면 = 프로그램을 한 번 이상 실행했다면

        }

    }
    public ArrayList<Student> inputStudent() throws  IOException{ //학생 객체 생성
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\StudentData.txt"));
        String line ="";
        ArrayList<Student> student = new ArrayList<Student>();

        while((line = fr.readLine()) != null){
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분
            //String 형식의 bill, year, credit 형 변환
            float temp_credit = Float.parseFloat(array[6]);
            long temp_bill = Long.parseLong(array[7]);

            //ArrayList 객체 생성
            //Student(String grade, Float credit, long bill, String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW) {
            student.add(new Student(array[5], temp_credit, temp_bill, array[0], array[3], array[4], array[1], array[2], false, array[4]));
        }
        return student;
    }
    public ArrayList<Professor> inputProfessor() throws  IOException{ //교수 객체 생성
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\ProfessorData.txt"));
        String line ="";
        ArrayList<Professor> professor = new ArrayList<Professor>();

        while((line = fr.readLine()) != null){
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분
            //String 형식의 bill, year, credit 형 변환

            //ArrayList 객체 생성
            //Professor(String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW) {
            professor.add(new Professor(array[0], array[3], array[4], array[1], array[2], false, array[4]));
        }
        return professor;
    }
    public ArrayList<academyStaff> inputAcademyStaff() throws  IOException{ //학사담당자 객체 생성
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\academyStaffData.txt"));
        String line ="";
        ArrayList<academyStaff> academystaff = new ArrayList<academyStaff>();

        while((line = fr.readLine()) != null){
            String data = line;
            String[] array = data.split("!");

            //ArrayList 객체 생성
            //academyStaff(String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW) {
            academystaff.add(new academyStaff(array[0], array[3], array[4], array[1], array[2], false, array[4]));
        }
        return academystaff;
    }
    public ArrayList<lessonStaff> inputLessonStaff() throws  IOException{ //수업담당자 객체 생성
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\lessonStaffData.txt"));
        String line ="";
        ArrayList<lessonStaff> lessonstaff = new ArrayList<lessonStaff>();

        while((line = fr.readLine()) != null){
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분

            //lessonStaff(String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW)
            lessonstaff.add(new lessonStaff(array[0], array[3], array[4], array[1], array[2], false, array[4]));
        }
        return lessonstaff;
    }

    public ArrayList<Student> getStudent() throws IOException {
        return student;
    }

    public ArrayList<Professor> getProfessor() throws IOException {
        return professor;
    }

    public ArrayList<cse.team8.user.academyStaff> getAcademyStaff() throws IOException {
        return academyStaff;
    }

    public ArrayList<cse.team8.user.lessonStaff> getLessonStaff() throws IOException {
        return lessonStaff;
    }
}
