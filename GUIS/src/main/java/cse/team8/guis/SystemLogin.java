/*
ID와 P/W를 비교할 시스템 로그인 class(객체 형식)
 */
package cse.team8.guis;

import java.util.Scanner; //Scanner 사용

public class SystemLogin {
    String PW; //암호
    boolean pass; //로그인 성공 여부
    public String ID; //아이디

    public SystemLogin() { }

    public SystemLogin(String PW, boolean pass, String ID) {
        this.PW = PW;
        this.pass = false;
        this.ID = ID;
    }

    
    void LoginPage(){ //로그인 화면
        if(pass == false){
            System.out.println("-----GUIS에 오신걸 환영합니다.-----");
            Scanner input = new Scanner(System.in);
                    
            System.out.print("ID : "); //ID 입력
            String InputID = input.nextLine();
            System.out.print("PW : "); //PW 입력
            String InputPW = input.nextLine();
            System.out.printf("InputID : %s, InputPW : %s%n", InputID, InputPW);
            
            ID = InputID;
            PW = InputPW;
        } //if(pass == false) 끝
        
    }

    public void setPW(String PW) {
        this.PW = PW;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    void print(){
          System.out.printf("ID : %s, PW : %s%n", ID, PW);
    }
    
}
