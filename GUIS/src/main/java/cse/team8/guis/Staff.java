//직원 데이터 객체
package cse.team8.guis;

import java.util.ArrayList;

public class Staff extends Person {
    boolean staffType; //true = 학사 담당자, false = 수업 담당자

    public Staff() {
    }

    public Staff(boolean staffType) {
        this.staffType = staffType;
    }

    public Staff(String ID, String name, String PW, String myNum, String myClass, boolean staffType) {
        super(ID, name, PW, myNum, myClass);
        this.staffType = staffType;
    }

    public boolean isStaffType() {
        return staffType;
    }
    
}
