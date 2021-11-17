//학생 데이터 객체
package cse.team8.guis;

public class Professor extends User {
    private String RRN; //주민번호

    public Professor(String ID, String name, String PW, String myNum, String mySubject, String RRN) {
        super(ID, name, PW, myNum, mySubject);
        this.RRN = RRN;
    }
}
