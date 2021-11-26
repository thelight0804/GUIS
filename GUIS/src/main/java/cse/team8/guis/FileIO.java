package cse.team8.guis;

import cse.team8.user.*;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileIO implements Work {

    static public ArrayList<Student> student;
    static public ArrayList<Professor> professor;
    static public ArrayList<academyStaff> academyStaff;
    static public ArrayList<lessonStaff> lessonStaff;
    static public ArrayList<Lesson> lesson;

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
        try {
            lesson = inputLesson();
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
        File academystaffData = new File("C:\\Temp\\GUIS\\AcadeMyStaffData.txt");
        File lessonstaffData = new File("C:\\Temp\\GUIS\\LessonStaffData.txt");
        File lessonData = new File("C:\\Temp\\GUIS\\LessonData.txt");

        if (!studentData.exists()) {  //만약 해당 경로에 파일이 없는 경우
            studentData.createNewFile(); //파일 생성
            BufferedWriter bw = new BufferedWriter(new FileWriter(studentData));
            bw.write("TestStudent!1!전산학과!111111!1!E!0.0!0!1"); //테스트용 학생 ID 1, PW 1
            bw.newLine();
            for (int i = 1; i < 10; i++) {
                String name = "이름" + i;
                String myNum = "!S00" + i;
                String mySubject = "!전산학과";
                String frontRRN = "!111111";
                String backRRN = "!0000000" + i;
                String grade = "!E";
                String credit = "!0.0";
                String bill = "!0";
                bw.write(name + myNum + mySubject + frontRRN + backRRN + grade + credit + bill + backRRN);
                bw.newLine();
            }
            for (int i = 10; i < 20; i++) {
                String name = "이름" + i;
                String myNum = "!S0" + i;
                String mySubject = "!전자공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                String grade = "!E";
                String credit = "!0.0";
                String bill = "!0";
                bw.write(name + myNum + mySubject + frontRRN + backRRN + grade + credit + bill + backRRN);
                bw.newLine();
            }
            for (int i = 20; i < 30; i++) {
                String name = "이름" + i;
                String myNum = "!S0" + i;
                String mySubject = "!화학공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                String grade = "!E";
                String credit = "!0.0";
                String bill = "!0";
                bw.write(name + myNum + mySubject + frontRRN + backRRN + grade + credit + bill + backRRN);
                bw.newLine();
            }
            for (int i = 30; i < 40; i++) {
                String name = "이름" + i;
                String myNum = "!S0" + i;
                String mySubject = "!기계공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                String grade = "!E";
                String credit = "!0.0";
                String bill = "!0";
                bw.write(name + myNum + mySubject + frontRRN + backRRN + grade + credit + bill + backRRN);
                bw.newLine();
            }
            for (int i = 40; i < 50; i++) {
                String name = "이름" + i;
                String myNum = "!S0" + i;
                String mySubject = "!항공우주공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                String grade = "!E";
                String credit = "!0.0";
                String bill = "!0";
                bw.write(name + myNum + mySubject + frontRRN + backRRN + grade + credit + bill + backRRN);
                bw.newLine();
            }
            bw.close(); //파일을 닫아주어야 갱신이 된다
        }
        if (!professorData.exists()) {  //만약 해당 경로에 파일이 없는 경우
            professorData.createNewFile(); //파일 생성
            BufferedWriter bw = new BufferedWriter(new FileWriter(professorData));
            bw.write("TestProfessor!2!전자공학과!111111!2!2"); //테스트용 교수 ID 2, PW 2
            bw.newLine();
            for (int i = 1; i < 10; i++) {
                String name = "이름" + i;
                String myNum = "!P00" + i;
                String mySubject = "!전산학과";
                String frontRRN = "!111111";
                String backRRN = "!0000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            for (int i = 10; i < 20; i++) {
                String name = "이름" + i;
                String myNum = "!P0" + i;
                String mySubject = "!전자공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            for (int i = 20; i < 30; i++) {
                String name = "이름" + i;
                String myNum = "!P0" + i;
                String mySubject = "!화학공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            for (int i = 30; i < 40; i++) {
                String name = "이름" + i;
                String myNum = "!P0" + i;
                String mySubject = "!기계공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            for (int i = 40; i < 50; i++) {
                String name = "이름" + i;
                String myNum = "!P0" + i;
                String mySubject = "!항공우주공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            bw.close(); //파일을 닫아주어야 갱신이 된다
        }
        if (!academystaffData.exists()) {  //만약 해당 경로에 파일이 없는 경우
            academystaffData.createNewFile(); //파일 생성
            BufferedWriter bw = new BufferedWriter(new FileWriter(academystaffData));
            bw.write("TestAcademyStaff!3!화학공학과!111111!3!3"); //학사담당자용 교수 ID 3, PW 3
            bw.newLine();
            for (int i = 1; i < 10; i++) {
                String name = "이름" + i;
                String myNum = "!H00" + i;
                String mySubject = "!전산학과";
                String frontRRN = "!111111";
                String backRRN = "!0000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            for (int i = 10; i < 20; i++) {
                String name = "이름" + i;
                String myNum = "!H0" + i;
                String mySubject = "!전자공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            for (int i = 20; i < 30; i++) {
                String name = "이름" + i;
                String myNum = "!H0" + i;
                String mySubject = "!화학공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            for (int i = 30; i < 40; i++) {
                String name = "이름" + i;
                String myNum = "!H0" + i;
                String mySubject = "!기계공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            for (int i = 40; i < 50; i++) {
                String name = "이름" + i;
                String myNum = "!H0" + i;
                String mySubject = "!항공우주공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            bw.close(); //파일을 닫아주어야 갱신이 된다
        }
        if (!lessonstaffData.exists()) {  //만약 해당 경로에 파일이 없는 경우
            lessonstaffData.createNewFile(); //파일 생성
            BufferedWriter bw = new BufferedWriter(new FileWriter(lessonstaffData));
            bw.write("TestlessonStaff!4!기계공학과!111111!4!4"); //수업담당자용 교수 ID 3, PW 3
            bw.newLine();
            for (int i = 1; i < 10; i++) {
                String name = "이름" + i;
                String myNum = "!G00" + i;
                String mySubject = "!전산학과";
                String frontRRN = "!111111";
                String backRRN = "!0000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            for (int i = 10; i < 20; i++) {
                String name = "이름" + i;
                String myNum = "!G0" + i;
                String mySubject = "!전자공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            for (int i = 20; i < 30; i++) {
                String name = "이름" + i;
                String myNum = "!G0" + i;
                String mySubject = "!화학공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            for (int i = 30; i < 40; i++) {
                String name = "이름" + i;
                String myNum = "!G0" + i;
                String mySubject = "!기계공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            for (int i = 40; i < 50; i++) {
                String name = "이름" + i;
                String myNum = "!G0" + i;
                String mySubject = "!항공우주공학과";
                String frontRRN = "!111111";
                String backRRN = "!000000" + i;
                bw.write(name + myNum + mySubject + frontRRN + backRRN + backRRN);
                bw.newLine();
            }
            bw.close(); //파일을 닫아주어야 갱신이 된다
        }
        if (!lessonData.exists()) {
            lessonData.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(lessonData));
            String mySubject = "";
            for (int i = 0; i < 26; i++) {
                String name = "강좌" + i;
                String myNum = "!L0" + i; //Lesson의 L
                if(i < 5)
                    mySubject = "!전산학과";
                else if (i < 10)
                    mySubject = "!전자공학과";
                else if (i < 15)
                    mySubject = "!화학공학과";
                else if (i < 20)
                    mySubject = "!기계공학과";
                else if (i < 26)
                    mySubject = "!항공우주공학과";
                String credit = "!0";
                String nowPeople = "!0";
                String maxPeople = "!100";
                String minPeople = "!5";
                String explain = "![강좌설명]";
                String create = "!false";
                String pastCreate = "!false";
                bw.write(name + myNum + mySubject + credit + nowPeople + maxPeople + minPeople + explain + create + pastCreate);
                bw.newLine();
            }
            bw.close();
        }
        else {   } //파일이 있다면 = 프로그램을 한 번 이상 실행했다면
    }

    public ArrayList<Student> inputStudent() throws IOException { //학생 객체 생성
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\StudentData.txt"));
        String line = "";
        ArrayList<Student> student = new ArrayList<Student>();

        while ((line = fr.readLine()) != null) {
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분
            //String 형식의 bill, year, credit 형 변환
            float temp_credit = Float.parseFloat(array[6]);
            long temp_bill = Long.parseLong(array[7]);

            //ArrayList 객체 생성
            //Student(String grade, Float credit, long bill, String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW) {
            student.add(new Student(array[5], temp_credit, temp_bill, array[0], array[3], array[4], array[1], array[2], false, array[8]));
        }
        return student;
    }
    public ArrayList<Professor> inputProfessor() throws IOException { //교수 객체 생성
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\ProfessorData.txt"));
        String line = "";
        ArrayList<Professor> professor = new ArrayList<Professor>();

        while ((line = fr.readLine()) != null) {
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분
            //String 형식의 bill, year, credit 형 변환

            //ArrayList 객체 생성
            //Professor(String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW) {
            professor.add(new Professor(array[0], array[3], array[4], array[1], array[2], false, array[5]));
        }
        return professor;
    }
    public ArrayList<academyStaff> inputAcademyStaff() throws IOException { //학사담당자 객체 생성
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\AcadeMyStaffData.txt"));
        String line = "";
        ArrayList<academyStaff> academystaff = new ArrayList<academyStaff>();

        while ((line = fr.readLine()) != null) {
            String data = line;
            String[] array = data.split("!");

            //ArrayList 객체 생성
            //academyStaff(String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW) {
            academystaff.add(new academyStaff(array[0], array[3], array[4], array[1], array[2], false, array[5]));
        }
        return academystaff;
    }
    public ArrayList<lessonStaff> inputLessonStaff() throws IOException { //수업담당자 객체 생성
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\LessonStaffData.txt"));
        String line = "";
        ArrayList<lessonStaff> lessonstaff = new ArrayList<lessonStaff>();

        while ((line = fr.readLine()) != null) {
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분

            //lessonStaff(String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW)
            lessonstaff.add(new lessonStaff(array[0], array[3], array[4], array[1], array[2], false, array[5]));
        }
        return lessonstaff;
    }
    public ArrayList<Lesson> inputLesson() throws IOException { //수업 객체 생성
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\LessonData.txt"));
        String line = "";
        ArrayList<Lesson> lesson = new ArrayList<Lesson>();

        while ((line = fr.readLine()) != null) {
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분
            //boolean 7, boolean 8
            float temp_credit = Float.parseFloat(array[3]);
            int temp_nowPeople = Integer.parseInt(array[4]);
            int temp_maxPeople = Integer.parseInt(array[5]);
            int temp_minPeople = Integer.parseInt(array[6]);
            boolean temp_create = Boolean.parseBoolean(array[8]);
            boolean temp_pastCreate = Boolean.parseBoolean(array[9]);
            //Lesson(String name, String myNum, String mySubject, float credit, int maxPeople, int minPeople, int nowPeople, String explain, boolean Create, boolean pastCreate) {
            lesson.add(new Lesson(array[0], array[1], array[2], temp_credit, temp_nowPeople, temp_maxPeople, temp_minPeople, array[7], temp_create, temp_pastCreate));
        }
        return lesson;
    }
    
    public void updateStudent() throws IOException{ //학생 객체 업데이트
        File studentData = new File("C:\\Temp\\GUIS\\StudentData.txt"); //파일 읽기
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(studentData));

        for(int i = 0;i<student.size();i++){
            String grade = student.get(i).getGrade();
            String credit = Float.toString(student.get(i).getCredit()); //Float to String
            String bill = Long.toString(student.get(i).getBill()); //long to string
            String name = student.get(i).getName();
            String frontRRN = student.get(i).getFrontRRN();
            String backRRN = student.get(i).getBackRRN();
            String myNum = student.get(i).getMyNum();
            String mySubject = student.get(i).getMySubject();
            String nowLogin = String.valueOf(student.get(i).isNowLogin()); //bool to string
            String PW = student.get(i).getPW();
        bw.write(name + "!" + myNum + "!" + mySubject + "!" + frontRRN + "!" + backRRN + "!" + grade + "!" + credit + "!" + bill + "!" + PW);
        bw.newLine();
        }
        bw.close();
        
        //갱신된 파일 다시 읽기
        try {
            student = inputStudent();
        } catch (IOException ex) {
            Logger.getLogger(FileIO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void updateProfessor() throws IOException{ //교수 객체 업데이트
        File ProfessorData = new File("C:\\Temp\\GUIS\\ProfessorData.txt"); //파일 읽기
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(ProfessorData));

        for(int i = 0;i<professor.size();i++){
            String name = professor.get(i).getName();
            String frontRRN = professor.get(i).getFrontRRN();
            String backRRN = professor.get(i).getBackRRN();
            String myNum = professor.get(i).getMyNum();
            String mySubject = professor.get(i).getMySubject();
            String PW = professor.get(i).getPW();
        bw.write(name + "!" + myNum + "!" + mySubject + "!" + frontRRN + "!" + backRRN + "!" + PW);
        bw.newLine();
        }
        bw.close();
        
        //갱신된 파일 다시 읽기
        try {
            professor = inputProfessor();
        } catch (IOException ex) {
            System.out.println("updateProfessor().professor = inputProfessor()오류");
        }
    }
    public void updateAcademyStaff() throws IOException{ //학과담당자 객체 업데이트
        File AcadeMyStaffData = new File("C:\\Temp\\GUIS\\AcadeMyStaffData.txt"); //파일 읽기
        
        BufferedWriter bw = new BufferedWriter(new FileWriter(AcadeMyStaffData));

        for(int i = 0;i<academyStaff.size();i++){
            String name = academyStaff.get(i).getName();
            String frontRRN = academyStaff.get(i).getFrontRRN();
            String backRRN = academyStaff.get(i).getBackRRN();
            String myNum = academyStaff.get(i).getMyNum();
            String mySubject = academyStaff.get(i).getMySubject();
            String PW = academyStaff.get(i).getPW();
            bw.write(name + "!" + myNum + "!" + mySubject + "!" + frontRRN + "!" + backRRN + "!" + PW);
        bw.newLine();
        }
        bw.close();
        
        //갱신된 파일 다시 읽기
        try {
            academyStaff = inputAcademyStaff();
        } catch (IOException ex) {
            System.out.println("updateAcademyStaff()오류");
        }
    }
    public void updateLessonStaff() throws IOException { //수업담당자 객체 업데이트
        File LessonStaffData = new File("C:\\Temp\\GUIS\\LessonStaffData.txt"); //파일 읽기

        BufferedWriter bw = new BufferedWriter(new FileWriter(LessonStaffData));

        for (int i = 0; i < lessonStaff.size(); i++) {
            String name = lessonStaff.get(i).getName();
            String frontRRN = lessonStaff.get(i).getFrontRRN();
            String backRRN = lessonStaff.get(i).getBackRRN();
            String myNum = lessonStaff.get(i).getMyNum();
            String mySubject = lessonStaff.get(i).getMySubject();
            String PW = lessonStaff.get(i).getPW();
            bw.write(name + "!" + myNum + "!" + mySubject + "!" + frontRRN + "!" + backRRN + "!" + PW);
            bw.newLine();
        }
        bw.close();

        //갱신된 파일 다시 읽기
        try {
            lessonStaff = inputLessonStaff();
        } catch (IOException ex) {
            System.out.println("updateLessonStaff()오류");
        }
    }
    public void updateLesson() throws IOException { //강좌 객체 업데이트
        File LessonData = new File("C:\\Temp\\GUIS\\LessonData.txt"); //파일 읽기

        BufferedWriter bw = new BufferedWriter(new FileWriter(LessonData));

        //Lesson(String name, String myNum, String mySubject, float credit, int nowPeople, int maxPeople, int minPeople, 
        //String explain, boolean Create, boolean pastCreate) {
        //lesson.add(new Lesson(array[0], array[1], array[2], temp_credit, temp_nowPeople, temp_maxPeople, temp_minPeople, array[7], temp_create, temp_pastCreate));
        for (int i = 0; i < lesson.size(); i++) {
            String name = lesson.get(i).getName();
            String myNum = lesson.get(i).getMyNum();
            String mySubject = lesson.get(i).getMySubject();
            String credit = Float.toString(lesson.get(i).getCredit());
            String nowPeople = Integer.toString(lesson.get(i).getNowPeople()); //int to string
            String maxPeople = Integer.toString(lesson.get(i).getMaxPeople());
            String minPeople = Integer.toString(lesson.get(i).getMinPeople());
            String explain = lesson.get(i).getExplain();
            String Create = String.valueOf(lesson.get(i).isCreate());
            String pastCreate = String.valueOf(lesson.get(i).isPastCreate());
            bw.write(name + "!" + myNum + "!" + mySubject + "!" + credit + "!" + nowPeople + "!" + maxPeople + "!" + minPeople + "!" + explain + "!" + Create + "!" + pastCreate);
            bw.newLine();
        }
        bw.close();

        //갱신된 파일 다시 읽기
        try {
            lesson = inputLesson();
        } catch (IOException ex) {
            System.out.println("updateLesson() 오류");
        }
        System.out.println(lesson.get(1).getMaxPeople());
    }

    public ArrayList<Student> getStudent() throws IOException {
        return student;
    }

    public ArrayList<Professor> getProfessor() throws IOException {
        return professor;
    }
    public ArrayList<academyStaff> getAcademyStaff() throws IOException {
        return academyStaff;
    }

    public ArrayList<lessonStaff> getLessonStaff() throws IOException {
        return lessonStaff;
    }

    public static ArrayList<Lesson> getLesson() throws IOException {
        return lesson;
    }
}
