//학생 데이터 객체
package cse.team8.guis;

import java.util.ArrayList;

public class Professor {
    public String ID; //ID
    private String name;
    private String PW; //비밀번호
    private String RRN; //주민번호

    private String myClass; //학과
    private ArrayList<String> subject; //담당 과목 (ArrayList)

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

    public ArrayList<String> getSubject() {
        return subject;
    }

    public void setSubject(ArrayList<String> subject) {
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
