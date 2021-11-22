package cse.team8.userwork;

import cse.team8.user.Subject;
import cse.team8.user.Professor;
import java.util.Scanner;

//public class Register extends userWork {
//
//    public Register() {
//    }
//
//    @Override
//    public void signUp() throws InterruptedException { //회원가입
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("[회원 가입]");
//        System.out.println("1. 학생 가입");
//        System.out.println("2. 교수 가입");
//        System.out.println("3. 학사 담당자 가입");
//        System.out.println("4. 수업 담당자 가입");
//
//        System.out.print("[숫자를 입력해 주세요] : ");
//        int selectNum = input.nextInt();
//
//        Subject[] subject = new Subject[5];
//
//        subject[0] = new Subject("전산학과");
//        subject[1] = new Subject("전자공학과");
//        subject[2] = new Subject("화학공학과");
//        subject[3] = new Subject("기계공학과");
//        subject[4] = new Subject("항공우주공학과");
//
//        if (selectNum == 1) { //학생 가입
//            System.out.println("[학생 회원가입]");
//            System.out.print("이름 : ");
//            String name = input.nextLine();
//            System.out.print("ID : "); //ID 입력
//            String inputID = input.nextLine();
//            System.out.print("PW : "); //PW 입력
//            String inputPW = input.nextLine();
//            System.out.print("주민번호 : "); //주민번호 입력
//            String RRN = input.nextLine();
//            System.out.println("학과 [0. 전산학과 1. 전자공학과 2.화학공학과 3.기계공학과 4.항공우주공학과]");
//            System.out.print("학과 번호를 입력해 주세요 : "); //주민번호 입력
//            int subjectNum = input.nextInt();
//            String mySubject = subject.get(subjectNum);
//        } else if (selectNum == 2) { //교수 가입
//            System.out.println("[교수 회원가입]");
//
//            input.nextLine();
//            System.out.print("이름 : "); //ID 입력
//            String inputName = input.nextLine();
//
//            System.out.print("ID : "); //ID 입력
//            String inputID = input.nextLine();
//            System.out.print("PW : "); //PW 입력
//            String inputPW = input.nextLine();
//            System.out.print("교수 번호 : "); //PW 입력
//            String inputMyNum = input.nextLine();
//            System.out.print("주민번호 : "); //주민번호 입력
//            String inputRRN = input.nextLine();
//            System.out.println("학과 [0. 전산학과 1. 전자공학과 2.화학공학과 3.기계공학과 4.항공우주공학과]");
//            System.out.print("학과 번호를 입력해 주세요 : "); //주민번호 입력
//            int inputSubjectNum = input.nextInt();
//
//            String inputSubject = subject[inputSubjectNum].getSubject();
//
//            Professor a = new Professor(inputID, inputName, inputPW, inputMyNum, inputSubject, inputRRN);
//
//            a.info();
//            //TODO 교수 번호가 자동으로 등록
//            //TODO inputID등 변수 앞에서 미리 선언 (학생, 직원도 사용 가능하게)
//            //TODO User 동적 생성
//        } else if (selectNum == 3) { //학사 담당자 가입
//        } else if (selectNum == 4) { //수업 담당자 가입
//        } else {
//            System.out.println("[정확한 값을 입력해주세요]");
//            Thread.sleep(1500);
//            signUp();
//        }
//    }
