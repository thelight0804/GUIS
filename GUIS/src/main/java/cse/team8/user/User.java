package cse.team8.user;

public class User {

    protected String name; //이름
    private String PW; //비밀번호
    private String frontRRN; //앞 주민번호
    private String backRRN; //뒷 주민번호 & PW
    protected String myNum; //학번, 교수번호, 직원번호 & ID
    boolean nowLogin;
    /*
    * 학생 학번 : 'S'로  시작하고  이어서  3자리  숫자 : S000, S001 ...
    * 교수 번호 : 'P'로 시작하고  이어서  3자리  숫자 : P000, P001 ...
    * 직원 번호 : 학사 담당자 - 'H'로 시작하고  이어서  3자리  숫자 : H000, H001 ...
    *                 수업 담당자 - 'G'로 시작하고  이어서  3자리  숫자 : G000, G001 ...
    * */
    protected String mySubject; //자신의 수강 과목

    public User() {
    }

    public User(String name, String frontRRN, String backRRN, String myNum, String mySubject, boolean nowLogin, String PW) {
        this.name = name;
        this.frontRRN = frontRRN;
        this.backRRN = backRRN;
        this.myNum = myNum;
        this.mySubject = mySubject;
        this.nowLogin = false;
        this.PW = PW;
    }

    public String getName() {
        return name;
    }

    public String getFrontRRN() {
        return frontRRN;
    }

    public String getBackRRN() {
        return backRRN;
    }

    public String getMyNum() {
        return myNum;
    }

    public String getMySubject() {
        return mySubject;
    }

    public void setNowLogin(boolean nowLogin) {
        this.nowLogin = nowLogin;
    }

    public boolean isNowLogin() {
        return nowLogin;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }

    public String getPW() {
        return PW;
    }

}
