//학생 데이터 객체
package cse.team8.guis;
import java.util.ArrayList;

public class Student extends Person {
    private String RRN; //주민번호
    private String myNum; //학번
    private String grade; //성적
    private String credit; //학점
    private ArrayList<String> subject; //수강 과목 (ArrayList)
    private long money; //수강료

    public Student() { }

    public Student(String RRN, String myNum, String grade, String credit, ArrayList<String> subject, long money) {
        this.RRN = RRN;
        this.myNum = myNum;
        this.grade = grade;
        this.credit = credit;
        this.subject = subject;
        this.money = money;
    }

    public String getRRN() {
        return RRN;
    }

    public String getMyNum() {
        return myNum;
    }

    public String getGrade() {
        return grade;
    }

    public String getCredit() {
        return credit;
    }

    public ArrayList<String> getSubject() {
        return subject;
    }

    public long getMoney() {
        return money;
    }
}