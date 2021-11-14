//학생 데이터 객체
package cse.team8.guis;
import java.util.ArrayList;

public class Student extends Person {
    private String RRN; //주민번호
    private String grade; //성적
    private String credit; //학점
    private ArrayList<String> subject; //수강 과목 (ArrayList)
    private long money; //수강료

    public Student() { }

    public Student(String ID, String name, String PW, String myNum, String myClass, String RRN, String grade, String credit, ArrayList<String> subject1, long money) {
        super(ID, name, PW, myNum, myClass);
        this.RRN = RRN;
        this.grade = grade;
        this.credit = credit;
        this.subject = subject1;
        this.money = money;
    }

    public String getRRN() {
        return RRN;
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