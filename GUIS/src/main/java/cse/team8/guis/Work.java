package cse.team8.guis;

import cse.team8.userwork.Register;
import java.util.Scanner;

public class Work {
    public Work() {  }

    public void run() throws InterruptedException {
        firstInterface();
    }

    void firstInterface() throws InterruptedException { //첫 실행 인터페이스
        System.out.println("-----GUIS에 오신걸 환영합니다.-----");
        System.out.println("1. 로그인");
        System.out.println("2. 회원가입");
        System.out.println("3. 나가기");
        System.out.print("[숫자를 입력해 주세요] : ");

        Scanner input = new Scanner(System.in);
        int selectNum = input.nextInt();

        if(selectNum == 1){ //로그인
        }
        else if (selectNum == 2){ //회원가입
            Register r = new Register();
            r.signUp(); //Register.signUp()
        }
        else if (selectNum == 3){ //나가기
            System.exit(0); //프로그램 종료
        }
        else{
            System.out.println("[정확한 값을 입력해주세요]");
            Thread.sleep(1500);
            //TODO 화면 지우기
            firstInterface();
        }
    }
} //class Work 끝
