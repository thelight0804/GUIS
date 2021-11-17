/*
ID와 P/W를 비교할 시스템 로그인 class(객체 형식)
 */
package cse.team8.guis;

import java.util.ArrayList;
import java.util.Scanner; //Scanner 사용


public class SystemLogin {
    String PW; //암호
    boolean pass; //로그인 성공 여부
    public String ID; //아이디
    private ArrayList<String> subject = new ArrayList<String> (); //수강 과목 (ArrayList)

    public SystemLogin() { }

    public SystemLogin(String PW, boolean pass, String ID) {
        this.PW = PW;
        this.pass = false;
        this.ID = ID;
    }

    
    void run() throws InterruptedException { //메인 화면
        //객체 ArrayList 생성
        ArrayList<Student> student = new ArrayList<>(); //같은 프로젝트라 import 필요 X
        ArrayList<Professor> professor = new ArrayList<>();
        ArrayList<lessonStaff> staff = new ArrayList<>();

        //과목 ArrayList 초기화
        subject.add("전산학과");
        subject.add("전자공학과");
        subject.add("화학공학과");
        subject.add("기계공학과");
        subject.add("항공우주공학과");

        firstInterface(); //첫 실행 인터페이스
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
            loginPage();
        }
        else if (selectNum == 2){ //회원가입
            signUp();
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
    void loginPage(){ //로그인 페이지
        Scanner input = new Scanner(System.in);
        System.out.println("[로그인]");

        System.out.print("ID : "); //ID 입력
        String inputID = input.nextLine();
        System.out.print("PW : "); //PW 입력
        String inputPW = input.nextLine();

        setID(inputID);
        setPW(inputPW);
        //TODO loginConform()
    }

    void signUp() throws InterruptedException { //회원가입
        System.out.println("[회원 가입]");
        System.out.println("1. 학생 가입");
        System.out.println("2. 교수 가입");
        System.out.println("3. 학사 담당자 가입");
        System.out.println("4. 수업 담당자 가입");

        System.out.print("[숫자를 입력해 주세요] : ");
        Scanner input = new Scanner(System.in);
        int selectNum = input.nextInt();

        if(selectNum==1){ //학생 가입
            System.out.println("[학생 회원가입]");
            System.out.print("이름 : ");
            String name = input.nextLine();
            System.out.print("ID : "); //ID 입력
            String inputID = input.nextLine();
            System.out.print("PW : "); //PW 입력
            String inputPW = input.nextLine();
            System.out.print("주민번호 : "); //주민번호 입력
            String RRN = input.nextLine();
            System.out.println("학과 [0. 전산학과 1. 전자공학과 2.화학공학과 3.기계공학과 4.항공우주공학과]");
            System.out.print("학과 번호를 입력해 주세요 : "); //주민번호 입력
            int subjectNum = input.nextInt();
            String mySubject = subject.get(subjectNum);
        }
        else if (selectNum==2) { //교수 가입
        }
        else if (selectNum==3) { //학사 담당자 가입
        }
        else if (selectNum==4) { //수업 담당자 가입
        }
        else{
            System.out.println("[정확한 값을 입력해주세요]");
            Thread.sleep(1500);
            signUp();
        }

    }

    public void setPW(String PW) {
        this.PW = PW;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

} //class SystemLogin 끝

/*
            System.out.print("ID : "); //ID 입력
            String InputID = input.nextLine();
            System.out.print("PW : "); //PW 입력
            String InputPW = input.nextLine();
            System.out.printf("InputID : %s, InputPW : %s%n", InputID, InputPW);

            ID = InputID;
            PW = InputPW;*/
