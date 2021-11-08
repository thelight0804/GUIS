//강의 데이터 객체
package cse.team8.guis;

import java.util.ArrayList;

public class Lesson {
    private String name; //이름
    private String num; //강의 번호

    private String myClass; //학과
    private int credit; //학점 수
    private String explain; //설명

    private int studentNum; //인원 수
    private ArrayList<String> studentName; //학생 명단 (ArrayList)
    private long money; //수강료

    public String getName() {
        return name;
    }

    public String getNum() {
        return num;
    }

    public String getMyClass() {
        return myClass;
    }

    public int getCredit() {
        return credit;
    }

    public String getExplain() {
        return explain;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public ArrayList<String> getStudentName() {
        return studentName;
    }

    public long getMoney() {
        return money;
    }
    
    
}
