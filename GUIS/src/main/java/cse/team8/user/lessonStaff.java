//수업 담당자 객체
package cse.team8.user;

public class lessonStaff extends User {

    public lessonStaff(String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW) {
        super(name, frontRRN, backRRN, myNum, mySubject, nowLogin, PW);
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
