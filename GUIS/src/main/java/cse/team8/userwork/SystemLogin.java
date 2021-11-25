/*
ID와 P/W를 비교할 시스템 로그인 class(객체 형식)
 */
package cse.team8.userwork;

import cse.team8.gui.*;
import cse.team8.user.*;
import cse.team8.userwork.userWork;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SystemLogin extends userWork {

    public SystemLogin() {
    }

    @Override
    public boolean loginStudentDistinguish(String inputID, String inputPW, ArrayList<Student> student) { //학생 로그인 성공 여부 확인
        boolean pass = false; //로그인 성공 여부
        for (int i = 0; i < student.size(); i++) {
            if (inputID.equals(student.get(i).getMyNum()) && inputPW.equals(student.get(i).getBackRRN())) { //교수 로그인 성공 여부 확인
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

    @Override
    public boolean loginProfessorDistinguish(String inputID, String inputPW, ArrayList<Professor> professor) { //교수 로그인 성공 여부 확인
        boolean pass = false; //로그인 성공 여부
        for (int i = 0; i < professor.size(); i++) {
            if (inputID.equals(professor.get(i).getMyNum()) && inputPW.equals(professor.get(i).getBackRRN())) { //교수 로그인 성공 여부 확인
                JOptionPane.showMessageDialog(null, professor.get(i).getName() + " 로그인 성공");
                pass = true;
                professor.get(i).setNowLogin(true); //로그인 한 계정 분류
                break;
            }
        }
        if (pass) { //로그인 성공 시
            loginProfessorPass();
        } else {
            JOptionPane.showMessageDialog(null, "ID 및 P/W를 다시 한번 확인해 주세요");
        }
        return pass;
    }
    
    public boolean loginAcademyStaffDistinguish (String inputID, String inputPW, ArrayList<academyStaff> academyStaff){ //학사 담당자 로그인 성공 여부 확인
        boolean pass = false; //로그인 성공 여부
        for (int i = 0; i < academyStaff.size(); i++) {
            if (inputID.equals(academyStaff.get(i).getMyNum()) && inputPW.equals(academyStaff.get(i).getBackRRN())) { //교수 로그인 성공 여부 확인
                JOptionPane.showMessageDialog(null, academyStaff.get(i).getName() + " 로그인 성공");
                pass = true;
                academyStaff.get(i).setNowLogin(true); //로그인 한 계정 분류
                break;
            }
        }
        if (pass) { //로그인 성공 시
            loginAcademyStaffPass();
        } else {
            JOptionPane.showMessageDialog(null, "ID 및 P/W를 다시 한번 확인해 주세요");
        }
        return pass;
    }
    
    public void loginAcademyStaffPass(){ //학사담당자 로그인 성공
        AcademyUI AcademyWork = new AcademyUI();
        AcademyWork.setDefaultCloseOperation(AcademyWork.EXIT_ON_CLOSE);
        AcademyWork.pack();
        AcademyWork.setLocationRelativeTo(null);
        AcademyWork.setVisible(true);
    }

    @Override
    public void loginStudentPass() { //학생 로그인 성공
        StudentUI StudentWork = new StudentUI();
        StudentWork.setDefaultCloseOperation(StudentWork.EXIT_ON_CLOSE);
        StudentWork.pack();
        StudentWork.setLocationRelativeTo(null);
        StudentWork.setVisible(true);
    }

    public void loginProfessorPass() { //교수 로그인 성공
        ProfessorUI professorWork = new ProfessorUI();
        professorWork.setDefaultCloseOperation(professorWork.EXIT_ON_CLOSE);
        professorWork.pack();
        professorWork.setLocationRelativeTo(null);        
        professorWork.setVisible(true);
    }

    @Override
    public void changeStudentPW(String inputPW, ArrayList<Student> student, int count) throws IOException {
        //count : 해당 번호의 arraylist 데이터
        /*
        student.get(count).setPW(inputPW); //객체 PW 변경
        
        //TODO PW 변경 보류..
        BufferedReader fr = new BufferedReader(new FileReader("C:\\Temp\\GUIS\\StudentData.txt")); //파일 읽기 용
        File studentData = new File("C:\\Temp\\GUIS\\StudentData.txt"); //파일 쓰기 용
        BufferedWriter bw = new BufferedWriter(new FileWriter(studentData)); //파일 쓰기 용
        FileWriter fw = new FileWriter("C:\\Temp\\GUIS\\StudentData.txt", false);
        String input_data = null; //덮어 쓸 데이터 
        
        String line ="";
        int i = 0;
        while((line = fr.readLine()) != null){
            i++;
            String data = line;
            String[] array = data.split("!"); //split : 문자열 구분
            
            input_data = array[0] + "!" + array[1] + "!" + array[2] + "!" + array[3] + "!" +array[4] + "!" + array[5] + "!" + array[6] + "!" + array[7];
        }
        fw.write(input_data);
        fw.close();
         */
    }

} //class SystemLogin 끝
