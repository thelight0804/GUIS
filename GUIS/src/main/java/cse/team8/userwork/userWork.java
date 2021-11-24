package cse.team8.userwork;

import cse.team8.user.Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class userWork { //추상 클래스
    public abstract boolean loginStudentDistinguish(String inputID, String inputPW, ArrayList <Student> student); //로그인 성공 여부 확인 (추상 메소드)
    public abstract void loginStudentPass(); //학생 로그인 성공
    public void changeStudentPW(String inputPW, ArrayList <Student> student, int count) throws IOException { //학생 비밀번호 변경
        //count : 해당 번호의 arraylist 데이터
        student.get(count).setPW(inputPW); //객체 PW 변경
        
        //TODO PW 변경 보류..
        /*
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\StudentData.txt")); //파일 읽기 용
        File studentData = new File("C:\\Temp\\GUIS\\StudentData.txt"); //파일 쓰기 용
        BufferedWriter bw = new BufferedWriter(new FileWriter(studentData)); //파일 쓰기 용
        FileWriter fw = new FileWriter("C:\\Temp\\GUIS\\StudentData.txt", false);
        String input_data = null; //덮어 쓸 데이터 
        
        String line ="";
        int i = 0;
        while((line = fr.readLine()) != null){
            i++;
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분
            
            input_data = array[0] + "!" + array[1] + "!" + array[2] + "!" + array[3] + "!" +array[4] + "!" + array[5] + "!" + array[6] + "!" + array[7];
        }
        fw.write(input_data);
        fw.close();
*/
    }
}
