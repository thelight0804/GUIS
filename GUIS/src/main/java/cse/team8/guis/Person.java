package cse.team8.guis;
import java.util.ArrayList;

public class Person {
    public String ID; //ID
    private String name; //이름
    private String PW; //비밀번호

    private String myNum;
    /*
    * 학생 학번 : 'S'로  시작하고  이어서  3자리  숫자 : S000, S001 ...
    * 교수 번호 : 'P'로 시작하고  이어서  3자리  숫자 : P000, P001 ...
    * 직원 번호 : 학사 담당자 - 'H'로 시작하고  이어서  3자리  숫자 : H000, H001 ...
    *                 수업 담당자 - 'G'로 시작하고  이어서  3자리  숫자 : G000, G001 ...
    * */
    private String myClass; //학과
    private String mySubject; //자신의 수강 과목

    public Person() {  }

    public Person(String ID, String name, String PW, String myNum, String myClass) {
        this.ID = ID;
        this.name = name;
        this.PW = PW;
        this.myNum = myNum;
        this.myClass = myClass;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPW() {
        return PW;
    }

    public String getMyClass() {
        return myClass;
    }

    public String getMyNum() {
        return myNum;
    }
}
