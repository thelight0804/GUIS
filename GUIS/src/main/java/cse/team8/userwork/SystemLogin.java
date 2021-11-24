/*
ID와 P/W를 비교할 시스템 로그인 class(객체 형식)
 */
package cse.team8.userwork;
import cse.team8.gui.LoginGUI;
import cse.team8.gui.StudentUI;
import cse.team8.user.Student;
import cse.team8.userwork.userWork;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SystemLogin extends userWork{

    public SystemLogin() {  }
    
    @Override
    public boolean loginStudentDistinguish(String inputID, String inputPW, ArrayList<Student> student) { //학생 로그인 성공 여부 확인
        boolean pass = false; //로그인 성공 여부
        for (int i = 0; i < student.size(); i++) {
            if (inputID.equals(student.get(i).getMyNum()) && inputPW.equals(student.get(i).getBackRRN())) {
                JOptionPane.showMessageDialog(null, student.get(i).getName() + " 로그인 성공");
                pass = true;
                student.get(i).setNowLogin(true); //로그인 한 계정 분류
                break;
            }
        }
        if (pass) { //로그인 성공 시
            loginStudentPass();
        } else {
            JOptionPane.showMessageDialog(null, "ID 및 P/W를 다시 한번 확인해 주세요");
        }
        return pass;
    }
    public void loginStudentPass(){ //학생 로그인 성공
        StudentUI StudentWork = new StudentUI();
        StudentWork.setDefaultCloseOperation(StudentWork.EXIT_ON_CLOSE);
        StudentWork.setVisible(true);
    }
    public void changeStudentPW(ArrayList <Student> student){
        
    }
} //class SystemLogin 끝
