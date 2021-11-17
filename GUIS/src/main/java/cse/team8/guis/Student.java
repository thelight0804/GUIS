//학생 데이터 객체
package cse.team8.guis;

public class Student extends User {
    private String RRN; //주민번호
    private String grade; //성적
    private String credit; //학점
    private long bill; //수강료
    private int year;

    public Student(String ID, String name, String PW, String myNum, String mySubject, String RRN, String grade, String credit, long bill, int year) {
        super(ID, name, PW, myNum, mySubject);
        this.RRN = RRN;
        this.grade = grade;
        this.credit = credit;
        this.bill = bill;
        this.year = year;
    }
}