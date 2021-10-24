//직원 데이터 객체
package cse.team8.guis;

import java.util.ArrayList;

public class Staff {
    public String ID; //ID
    private String name;
    private String PW; //비밀번호

    private String myClass; //학과

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPW() {
        return PW;
    }

    public void setPW(String PW) {
        this.PW = PW;
    }

    public String getMyClass() {
        return myClass;
    }

    public void setMyClass(String myClass) {
        this.myClass = myClass;
    }
}
