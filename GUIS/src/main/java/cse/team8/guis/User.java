package cse.team8.guis;
import java.util.ArrayList;

public class User {
    public String ID; //ID
    protected String name; //이름
    protected String PW; //비밀번호

    protected String myNum; //학번, 교수번호, 직원번호
    /*
    * 학생 학번 : 'S'로  시작하고  이어서  3자리  숫자 : S000, S001 ...
    * 교수 번호 : 'P'로 시작하고  이어서  3자리  숫자 : P000, P001 ...
    * 직원 번호 : 학사 담당자 - 'H'로 시작하고  이어서  3자리  숫자 : H000, H001 ...
    *                 수업 담당자 - 'G'로 시작하고  이어서  3자리  숫자 : G000, G001 ...
    * */
    protected String mySubject; //자신의 수강 과목

    public User() {  }

    public User(String ID, String name, String PW, String myNum, String mySubject) {
        this.ID = ID;
        this.name = name;
        this.PW = PW;
        this.myNum = myNum;
        this.mySubject = mySubject;
    }
}
