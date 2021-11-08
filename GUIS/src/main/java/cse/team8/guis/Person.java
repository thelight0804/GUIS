package cse.team8.guis;
import java.util.ArrayList;

public class Person {
    public String ID; //ID
    private String name;
    private String PW; //비밀번호

    private String myClass; //학과
    private ArrayList<String> subject; //수강 과목 (ArrayList)

    public Person() {  }

    public Person(String ID, String name, String PW, String myClass, ArrayList<String> subject) {
        this.ID = ID;
        this.name = name;
        this.PW = PW;
        this.myClass = myClass;
        this.subject = subject;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPW() {
        return PW;
    }

    public String getMyClass() {
        return myClass;
    }

    public ArrayList<String> getSubject() {
        return subject;
    }
    
    
}
