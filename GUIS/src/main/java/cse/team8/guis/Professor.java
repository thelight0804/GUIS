//학생 데이터 객체
package cse.team8.guis;

import java.util.ArrayList;

public class Professor extends Person {
    private String RRN; //주민번호

    public Professor() { }

    public Professor(String ID, String name, String PW, String myNum, String myClass, String RRN) {
        super(ID, name, PW, myNum, myClass);
        this.RRN = RRN;
    }

    public String getRRN() {
        return RRN;
    }
}
