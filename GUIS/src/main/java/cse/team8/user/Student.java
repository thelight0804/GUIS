//학생 데이터 객체
package cse.team8.user;

public class Student extends User {
    private String grade; //성적
    private Float credit; //학점
    private long bill; //수강료
    private int year;

    public Student() {   }
    public Student(String grade, float credit, long bill, int year, String name, String frontRRN, String backRRN, String myNum, String mySubject) {
        super(name, frontRRN, backRRN, myNum, mySubject);
        this.grade = grade;
        this.credit = credit;
        this.bill = bill;
        this.year = year;
        
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

    public int getYear() {
        return year;
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
    
}