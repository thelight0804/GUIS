package cse.team8.guis;

import cse.team8.user.*;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileIO implements Work {

    static public ArrayList<Student> student;
    static public ArrayList<Professor> professor;
<<<<<<< HEAD
    static public ArrayList<academyStaff> academyStaff;
    static public ArrayList<lessonStaff> lessonStaff;
=======
    static public ArrayList<AcademyStaff> academyStaff;
    static public ArrayList<LessonStaff> lessonStaff;
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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
<<<<<<< HEAD
            bw.write("TestStudent!1!전산학과!111111!1!E!0.0!0!1"); //테스트용 학생 ID 1, PW 1
            bw.newLine();
            for (int i = 1; i < 10; i++) {
=======
            bw.write("학생Admin!admin!전산학과!990421!1927385!E!0.0!0!admin"); //테스트용 학생 ID 1, PW 1
            bw.newLine();
            /*for (int i = 1; i < 10; i++) {
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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
<<<<<<< HEAD
            }
=======
            }*/
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
            bw.close(); //파일을 닫아주어야 갱신이 된다
        }
        if (!professorData.exists()) {  //만약 해당 경로에 파일이 없는 경우
            professorData.createNewFile(); //파일 생성
            BufferedWriter bw = new BufferedWriter(new FileWriter(professorData));
<<<<<<< HEAD
            bw.write("TestProfessor!2!전자공학과!111111!2!2"); //테스트용 교수 ID 2, PW 2
            bw.newLine();
            for (int i = 1; i < 10; i++) {
=======
            bw.write("교수Admin!admin!전자공학과!961020!2784283!admin"); //테스트용 교수 ID 2, PW 2
            bw.newLine();
            /*for (int i = 1; i < 10; i++) {
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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
<<<<<<< HEAD
            }
=======
            }*/
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
            bw.close(); //파일을 닫아주어야 갱신이 된다
        }
        if (!academystaffData.exists()) {  //만약 해당 경로에 파일이 없는 경우
            academystaffData.createNewFile(); //파일 생성
            BufferedWriter bw = new BufferedWriter(new FileWriter(academystaffData));
<<<<<<< HEAD
            bw.write("TestAcademyStaff!3!화학공학과!111111!3!3"); //학사담당자용 교수 ID 3, PW 3
            bw.newLine();
            for (int i = 1; i < 10; i++) {
=======
            bw.write("학사담당자Admin!admin!화학공학과!940422!1283749!admin"); //학사담당자용 교수 ID 3, PW 3
            bw.newLine();
            /*for (int i = 1; i < 10; i++) {
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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
<<<<<<< HEAD
            }
=======
            }*/
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
            bw.close(); //파일을 닫아주어야 갱신이 된다
        }
        if (!lessonstaffData.exists()) {  //만약 해당 경로에 파일이 없는 경우
            lessonstaffData.createNewFile(); //파일 생성
            BufferedWriter bw = new BufferedWriter(new FileWriter(lessonstaffData));
<<<<<<< HEAD
            bw.write("TestlessonStaff!4!기계공학과!111111!4!4"); //수업담당자용 교수 ID 3, PW 3
            bw.newLine();
            for (int i = 1; i < 10; i++) {
=======
            bw.write("수업담당자Admin!admin!기계공학과!900621!2947385!admin"); //수업담당자용 교수 ID 3, PW 3
            bw.newLine();
            /*for (int i = 1; i < 10; i++) {
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
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
<<<<<<< HEAD
            }
=======
            }*/
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
            bw.close(); //파일을 닫아주어야 갱신이 된다
        }
        //Lesson(String name, String myNum, String mySubject, float credit, int maxPeople, int minPeople, int nowPeople, 
        //String explain, boolean Create, boolean pastCreate, String proName, ArrayList<String> stuName)
        if (!lessonData.exists()) {
            lessonData.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(lessonData));
<<<<<<< HEAD
            String mySubject = "";
            ArrayList<String> stuName = new ArrayList<String>();
            for (int i = 0; i < 26; i++) {
=======
            //String mySubject = "";
            ArrayList<String> stuName = new ArrayList<String>();
            /*for (int i = 0; i < 26; i++) {
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
                String name = "강좌" + i;
                String myNum = "!L0" + i; //Lesson의 L
                if (i < 5) {
                    mySubject = "!전산학과";
                } else if (i < 10) {
                    mySubject = "!전자공학과";
                } else if (i < 15) {
                    mySubject = "!화학공학과";
                } else if (i < 20) {
                    mySubject = "!기계공학과";
                } else if (i < 26) {
                    mySubject = "!항공우주공학과";
                }
                String credit = "!0";
                String nowPeople = "!0";
                String maxPeople = "!100";
                String minPeople = "!5";
                String bill = "!10000";
                String explain = "![강좌설명]";
                String create = "!false";
                String pastCreate = "!false";
                String proName = "!교수X";
                stuName.add("!학생X");
                bw.write(name + myNum + mySubject + credit + maxPeople + minPeople  + nowPeople + bill + explain + create + pastCreate + proName + stuName.get(0));
                bw.newLine();
<<<<<<< HEAD
            }
=======
            }*/
            stuName.add("! ");
            bw.write("객체지향 프로그래밍Ⅱ Test" + "!L001" + "!전산학과" + "!3.0" + "!50" + "!10" + "!0" + "!200000" + "!JAVA 프로그래밍 언어의 기본적인 요소와 함께 아키텍처 모델링에 사용되는 클래스 다이어그램 활용법을 소개한다." + "!false" + "!false" + "!홍길동" + stuName.get(0));
            bw.newLine();
            bw.write("파일처리론 Test" + "!L001" + "!전자공학과" + "!2.0" + "!60" + "!5" + "!0" + "!300000" + "!데이터의 처리와 응용을 위한 파일의 기본 개념, 파일 저장 장치, 파일의 입출력 제어방법, 파일 구성 방법 등에 대해 알아본다." + "!true" + "!true" + "!고길동" + stuName.get(0));
            bw.newLine();
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
            bw.close();
        } else {
        } //파일이 있다면 = 프로그램을 한 번 이상 실행했다면
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

<<<<<<< HEAD
    public ArrayList<academyStaff> inputAcademyStaff() throws IOException { //학사담당자 객체 생성
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\AcadeMyStaffData.txt"));
        String line = "";
        ArrayList<academyStaff> academystaff = new ArrayList<academyStaff>();
=======
    public ArrayList<AcademyStaff> inputAcademyStaff() throws IOException { //학사담당자 객체 생성
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\AcadeMyStaffData.txt"));
        String line = "";
        ArrayList<AcademyStaff> academystaff = new ArrayList<AcademyStaff>();
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9

        while ((line = fr.readLine()) != null) {
            String data = line;
            String[] array = data.split("!");

            //ArrayList 객체 생성
            //academyStaff(String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW) {
<<<<<<< HEAD
            academystaff.add(new academyStaff(array[0], array[3], array[4], array[1], array[2], false, array[5]));
=======
            academystaff.add(new AcademyStaff(array[0], array[3], array[4], array[1], array[2], false, array[5]));
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
        }
        return academystaff;
    }

<<<<<<< HEAD
    public ArrayList<lessonStaff> inputLessonStaff() throws IOException { //수업담당자 객체 생성
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\LessonStaffData.txt"));
        String line = "";
        ArrayList<lessonStaff> lessonstaff = new ArrayList<lessonStaff>();
=======
    public ArrayList<LessonStaff> inputLessonStaff() throws IOException { //수업담당자 객체 생성
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\LessonStaffData.txt"));
        String line = "";
        ArrayList<LessonStaff> lessonstaff = new ArrayList<LessonStaff>();
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9

        while ((line = fr.readLine()) != null) {
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분

            //lessonStaff(String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW)
<<<<<<< HEAD
            lessonstaff.add(new lessonStaff(array[0], array[3], array[4], array[1], array[2], false, array[5]));
=======
            lessonstaff.add(new LessonStaff(array[0], array[3], array[4], array[1], array[2], false, array[5]));
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
        }
        return lessonstaff;
    }

    public ArrayList<Lesson> inputLesson() throws IOException { //수업 객체 생성
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\LessonData.txt"));
        String line = "";
        ArrayList<Lesson> lesson = new ArrayList<Lesson>();

        while ((line = fr.readLine()) != null) {
            ArrayList<String> students = new ArrayList<String>();
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분
            //boolean 7, boolean 8
            float temp_credit = Float.parseFloat(array[3]);
            int temp_maxPeople = Integer.parseInt(array[4]);
            int temp_minPeople = Integer.parseInt(array[5]);
            int temp_nowPeople = Integer.parseInt(array[6]);
            long temp_bill = Long.parseLong(array[7]); //string to long
            boolean temp_create = Boolean.parseBoolean(array[9]);
            boolean temp_pastCreate = Boolean.parseBoolean(array[10]);
<<<<<<< HEAD
            if(array.length > 12){
                for(int i=12; i<array.length;i++){
                    students.add(array[i]);
                }
            }
            else
                students.add(array[12]); //초기값 학생 이름 추가

=======
            if (array.length > 12) {
                for (int i = 12; i < array.length; i++) {
                    students.add(array[i]);
                }
            } else {
                students.add(array[12]); //초기값 학생 이름 추가
            }
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
            lesson.add(new Lesson(array[0], array[1], array[2], temp_credit, temp_maxPeople, temp_minPeople, temp_nowPeople, temp_bill, array[8], temp_create, temp_pastCreate, array[11], students));
        }
        return lesson;
    }

    public void updateStudent() throws IOException { //학생 객체 업데이트
        File studentData = new File("C:\\Temp\\GUIS\\StudentData.txt"); //파일 읽기

        BufferedWriter bw = new BufferedWriter(new FileWriter(studentData));

        for (int i = 0; i < student.size(); i++) {
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

    public void updateProfessor() throws IOException { //교수 객체 업데이트
        File ProfessorData = new File("C:\\Temp\\GUIS\\ProfessorData.txt"); //파일 읽기

        BufferedWriter bw = new BufferedWriter(new FileWriter(ProfessorData));

        for (int i = 0; i < professor.size(); i++) {
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

    public void updateAcademyStaff() throws IOException { //학과담당자 객체 업데이트
        File AcadeMyStaffData = new File("C:\\Temp\\GUIS\\AcadeMyStaffData.txt"); //파일 읽기

        BufferedWriter bw = new BufferedWriter(new FileWriter(AcadeMyStaffData));

        for (int i = 0; i < academyStaff.size(); i++) {
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

//Lesson(String name, String myNum, String mySubject, float credit, int maxPeople, int minPeople, int nowPeople, String explain, boolean Create, 
//boolean pastCreate, String proName, ArrayList<String> stuName) {
        for (int i = 0; i < lesson.size(); i++) {
            String name = lesson.get(i).getName();
            String myNum = lesson.get(i).getMyNum();
            String mySubject = lesson.get(i).getMySubject();
            String credit = Float.toString(lesson.get(i).getCredit());
            String nowPeople = Integer.toString(lesson.get(i).getNowPeople()); //int to string
            String maxPeople = Integer.toString(lesson.get(i).getMaxPeople());
            String minPeople = Integer.toString(lesson.get(i).getMinPeople());
            String bill = Long.toString(lesson.get(i).getBill()); //long to string
            String explain = lesson.get(i).getExplain();
            String Create = String.valueOf(lesson.get(i).isCreate());
            String pastCreate = String.valueOf(lesson.get(i).isPastCreate());
            String proName = lesson.get(i).getProName();
            String stuName = String.join("!", lesson.get(i).getStuName());
<<<<<<< HEAD
            bw.write(name + "!" + myNum + "!" + mySubject + "!" + credit + "!" +  maxPeople + "!" + minPeople  + "!" + nowPeople + "!" + bill + "!" + explain + "!" + Create + "!" + pastCreate + "!" + proName + "!" + stuName);
=======
            bw.write(name + "!" + myNum + "!" + mySubject + "!" + credit + "!" + maxPeople + "!" + minPeople + "!" + nowPeople + "!" + bill + "!" + explain + "!" + Create + "!" + pastCreate + "!" + proName + "!" + stuName);
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
            bw.newLine();
        }
        bw.close();

        //갱신된 파일 다시 읽기
        try {
            lesson = inputLesson();
        } catch (IOException ex) {
            System.out.println("updateLesson() 오류");
        }
    }

    public ArrayList<Student> getStudent() throws IOException {
        return student;
    }

    public ArrayList<Professor> getProfessor() throws IOException {
        return professor;
    }

<<<<<<< HEAD
    public ArrayList<academyStaff> getAcademyStaff() throws IOException {
        return academyStaff;
    }

    public ArrayList<lessonStaff> getLessonStaff() throws IOException {
=======
    public ArrayList<AcademyStaff> getAcademyStaff() throws IOException {
        return academyStaff;
    }

    public ArrayList<LessonStaff> getLessonStaff() throws IOException {
>>>>>>> 973819ee6e6c4532a12a2cf02bb3527f415334b9
        return lessonStaff;
    }

    public static ArrayList<Lesson> getLesson() throws IOException {
        return lesson;
    }
}
