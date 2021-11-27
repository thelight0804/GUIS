//강좌 객체
package cse.team8.user;

import java.util.ArrayList;

public class Lesson {
    private String name; //이름
    private String myNum; //번호
    private String mySubject; //학과
    private float credit; //학점
    private int maxPeople; //최대 학생 수
    private int minPeople; //최소 학생 수
    private int nowPeople; //현재 인원 수
    private String explain; //설명
    
    private boolean Create; //개설 여부
    private boolean pastCreate; //과거 개설 여부
    /*
    한 번이라도 강의가 개설되어 개설 여부(lesoonCreate)가 true가 된다면
    과거 개설 여부 (pastCreate)도 true가 되며 강좌 정보, 변경, 삭제가 불가하게 된다
    */
    private String proName; //담당 교수
    public ArrayList<String> stuName; //수강 신청한 학생 이름


    public Lesson(String name, String myNum, String mySubject, float credit, int maxPeople, int minPeople, int nowPeople, String explain, boolean Create, boolean pastCreate, String proName, ArrayList<String> stuName) {
        this.name = name;
        this.myNum = myNum;
        this.mySubject = mySubject;
        this.credit = credit;
        this.maxPeople = maxPeople;
        this.minPeople = minPeople;
        this.nowPeople = nowPeople;
        this.explain = explain;
        this.Create = Create;
        this.pastCreate = pastCreate;
        this.proName = proName;
        this.stuName = stuName;
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

    public Float getCredit() {
        return credit;
    }

    public int getMaxPeople() {
        return maxPeople;
    }

    public int getMinPeople() {
        return minPeople;
    }

    public String getExplain() {
        return explain;
    }

    public boolean isCreate() {
        return Create;
    }

    public boolean isPastCreate() {
        return pastCreate;
    }

    public int getNowPeople() {
        return nowPeople;
    }

    public String getProName() {
        return proName;
    }

    public ArrayList<String> getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName.add(stuName);
    }

    public void setNowPeople(int nowPeople) {
        this.nowPeople = nowPeople;
    }

    public void updateNowPeople(){
        this.nowPeople = nowPeople +1;
    }
}
