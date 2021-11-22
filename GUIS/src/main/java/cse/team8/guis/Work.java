package cse.team8.guis;

import cse.team8.gui.LoginGUI;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Work {

    public Work() {
    }

    public void run() throws IOException {
        newFile();
        //로그인 창 출력
        LoginGUI login = new LoginGUI();
        login.setVisible(true);

        //파일 생성
    }

    public void newFile() throws IOException {
        File newDir = new File("C:\\Temp\\GUIS"); //파일 읽기
        if (!newDir.exists()) {  //만약 해당 경로에 파일이 없는 경우
            newDir.mkdirs(); //폴더 생성
        }
        File studentData = new File("C:\\Temp\\GUIS\\StudentData.txt"); //파일 읽기
        if (!studentData.exists()) {  //만약 해당 경로에 파일이 없는 경우
            studentData.createNewFile(); //파일 생성
            BufferedWriter bw = new BufferedWriter(new FileWriter(studentData));
            bw.write("강준희!S001!전산학과!11111111!00000000!E!0.0!0!4");
            bw.newLine();
            bw.write("박상현!S002!전자공학과!11111111!00000001!E!0.0!0!4");
            bw.newLine();
            bw.write("손성배!S003!화학공학과!11111111!00000002!E!0.0!0!3");
            bw.newLine();
            bw.write("신종훈!S004!기계공학과!11111111!00000003!E!0.0!0!2");
            bw.newLine();
            bw.write("이영훈!S005!항공우주공학과!11111111!00000004!E!0.0!0!1");
            bw.newLine();
            bw.close(); //파일을 닫아주어야 갱신이 된다
        }
        else{ //파일이 있다면 = 프로그램을 한 번 이상 실행했다면
            
        }
    }
} //class Work 끝
