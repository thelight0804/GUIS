//학생 데이터 객체
package cse.team8.user;

public class Student extends User {

    private String grade; //성적
    private Float credit; //학점
    private long bill; //수강료

    public Student() {
    }

    public Student(String grade, Float credit, long bill, String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW) {
        super(name, frontRRN, backRRN, myNum, mySubject, nowLogin, PW);
        this.grade = grade;
        this.credit = credit;
        this.bill = bill;
    }

    public String getGrade() {
        return grade;
    }

    public Float getCredit() {
        return credit;
    }

    public long getBill() {
        return bill;
    }

    public String getName() {
        return name;
    }

    public String getMyNum() {
        return myNum;
    }

    public String getMySubject() {
        return mySubject;
    }

    public void setCredit(Float credit) {
        this.credit = credit;
    }

    public boolean isNowLogin() {
        return nowLogin;
    }

    public void setBill(long bill) {
        this.bill = bill;
    }
}
