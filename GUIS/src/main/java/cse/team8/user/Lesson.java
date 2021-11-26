//강좌 객체
package cse.team8.user;

public class Lesson {
    private String name; //이름
    private String myNum; //번호
    private String mySubject; //과목
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

    public Lesson(String name, String myNum, String mySubject, float credit, int nowPeople, int maxPeople, int minPeople, String explain, boolean Create, boolean pastCreate) {
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
    
}
