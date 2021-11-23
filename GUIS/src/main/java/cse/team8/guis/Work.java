package cse.team8.guis;

import cse.team8.gui.LoginGUI;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import cse.team8.user.*;
import java.util.ArrayList;

public class Work {
    public ArrayList<Student> student;
    public ArrayList<Professor> professor;
    public ArrayList<academyStaff> academystaff;
    public ArrayList<lessonStaff> lessonstaff;
    

    public Work() {   }

    public void run() throws IOException  {
        newFile(); //파일 생성
        student = inputStudent();
        professor = inputProfessor();
        academystaff = inputacademyStaff();
        lessonstaff = inputlessonStaff();
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
            bw.write("강준희!S001!전산학과!111111!0000000!E!0.0!0!4");
            bw.newLine();
            bw.write("박상현!S002!전자공학과!111111!0000001!E!0.0!0!4");
            bw.newLine();
            bw.write("손성배!S003!화학공학과!111111!0000002!E!0.0!0!3");
            bw.newLine();
            bw.write("신종훈!S004!기계공학과!111111!0000003!E!0.0!0!2");
            bw.newLine();
            bw.write("이영훈!S005!항공우주공학과!111111!0000004!E!0.0!0!1");
            bw.newLine();
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
    public ArrayList<Student> inputStudent() throws FileNotFoundException, IOException{ //학생 객체 생성
        FileReader studentData = new FileReader("C:\\Temp\\GUIS\\StudentData.txt");
        BufferedReader fr = new BufferedReader(studentData);
        String line ="";
        ArrayList<Student> student = new ArrayList<Student>();
       
        while((line = fr.readLine()) != null){
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분
            //String 형식의 bill, year, credit 형 변환
            float temp_credit = Float.parseFloat(array[6]);
            long temp_bill = Long.parseLong(array[7]);
            int temp_year = Integer.parseInt(array[8]);
            
            //ArrayList 객체 생성
            //Student(String grade, float credit, long bill, int year, String name, String frontRRN, String backRRN, String myNum, String mySubject)
            student.add(new Student(array[5], temp_credit, temp_bill, temp_year, array[0], array[3], array[4], array[1], array[2]));
        }
        return student;
    }
    public ArrayList<Professor> inputProfessor() throws FileNotFoundException, IOException{ //교수 객체 생성
        FileReader professorData = new FileReader("C:\\Temp\\GUIS\\ProfessorData.txt");
        BufferedReader fr = new BufferedReader(professorData);
        String line ="";
        ArrayList<Professor> professor = new ArrayList<Professor>();
       
        while((line = fr.readLine()) != null){
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분
            //String 형식의 bill, year, credit 형 변환
            
            //ArrayList 객체 생성
            //Professor(String name, String frontRRN, String backRRN, String myNum, String mySubject)
            professor.add(new Professor(array[0], array[3], array[4], array[1], array[2]));
        }
        return professor;
    }
    public ArrayList<academyStaff> inputacademyStaff() throws FileNotFoundException, IOException{ //학사담당자 객체 생성
        FileReader academystaffData = new FileReader("C:\\Temp\\GUIS\\academyStaffData.txt");
        BufferedReader fr = new BufferedReader(academystaffData);
        String line ="";
        ArrayList<academyStaff> academystaff = new ArrayList<academyStaff>();
       
        while((line = fr.readLine()) != null){
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분
            //String 형식의 bill, year, credit 형 변환
            
            //ArrayList 객체 생성
            //academyStaff(String name, String frontRRN, String backRRN, String myNum, String mySubject)
            academystaff.add(new academyStaff( array[0], array[3], array[4], array[1], array[2]));
        }
        return academystaff;
    }
    public ArrayList<lessonStaff> inputlessonStaff() throws FileNotFoundException, IOException{ //수업담당자 객체 생성
        FileReader lessonstaffData = new FileReader("C:\\Temp\\GUIS\\lessonStaffData.txt");
        BufferedReader fr = new BufferedReader(lessonstaffData);
        String line ="";
        ArrayList<lessonStaff> lessonstaff = new ArrayList<lessonStaff>();
       
        while((line = fr.readLine()) != null){
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분
            //String 형식의 bill, year, credit 형 변환
            
            //ArrayList 객체 생성
            //lessonStaff(String name, String frontRRN, String backRRN, String myNum, String mySubject)
            lessonstaff.add(new lessonStaff(array[0], array[3], array[4], array[1], array[2]));
        }
        return lessonstaff;
    }

    public ArrayList<Student> getStudent() throws IOException {
        return student;
    }

    public ArrayList<Professor> getProfessor() {
        return professor;
    }

    public ArrayList<academyStaff> getAcademystaff() {
        return academystaff;
    }

    public ArrayList<lessonStaff> getLessonstaff() {
        return lessonstaff;
    }

} //class Work 끝