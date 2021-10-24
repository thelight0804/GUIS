//학생 데이터 객체
package cse.team8.guis;
import java.util.ArrayList;

public class Student {
    public String ID; //ID
    private String name;
    private String PW; //비밀번호
    private String RRN; //주민번호

    private String myClass; //학과
    private String myNum; //학번
    private String grade; //성적
    private String credit; //학점
    private ArrayList<String> subject; //수강 과목 (ArrayList)
    private long money; //수강료

    //getter, setter
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPW() {
        return PW;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }

    public String getRRN() {
        return RRN;
    }

    public void setRRN(String RRN) {
        this.RRN = RRN;
    }

    public String getMyClass() {
        return myClass;
    }

    public void setMyClass(String myClass) {
        this.myClass = myClass;
    }

    public String getMyNum() {
        return myNum;
    }

    public void setMyNum(String myNum) {
        this.myNum = myNum;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }

    public ArrayList<String> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<String> subject) {
        this.subject = subject;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
