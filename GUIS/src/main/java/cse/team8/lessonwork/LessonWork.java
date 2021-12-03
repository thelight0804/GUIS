package cse.team8.lessonwork;

import cse.team8.guis.FileIO;
import cse.team8.user.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LessonWork {

    FileIO fileIO = new FileIO();

    public ArrayList<Lesson> chooseDelLesson(String subject) {//삭제가 가능한 강좌 처리
        //String subject : 선택한 과목 (매개변수)
        ArrayList<Lesson> chooseLesson = new ArrayList<>();
        ArrayList<Lesson> lesson = new ArrayList<>();
        try {
            lesson = fileIO.getLesson(); //Lesson 객체 불러오기
        } catch (IOException ex) {
            System.out.println("fileIO.getLesson() 예외");
        }

        for (int i = 0; i < lesson.size(); i++) { //Lesson 객체의 크기까지 반복
            if (subject.equals(lesson.get(i).getMySubject())) { //매개변수로 넘어온 과목과 Lesson 객체에 있는 과목의 이름이 같으면서
                if (lesson.get(i).isCreate() == false && lesson.get(i).isPastCreate() == false) { //Lesson의 Create 변수(개설 여부)와 PastCreate(과거 개설 여부)가 없다면(false)
                    chooseLesson.add(lesson.get(i)); //chooseLesson객체에 해당되는 Lesson 객체를 추가
                }
            }
        }
        return chooseLesson; //골라진 Lesson만 담긴 chooseLesson을 반환
    }

    public ArrayList<Lesson> chooseDisLesson(String subject) {//학과에 맞는 폐지된 강좌 처리 
        //(LessonClassUI 에서 사용)
        ArrayList<Lesson> chooseLesson = new ArrayList<>();
        ArrayList<Lesson> lesson = new ArrayList<>();
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            System.out.println("fileIO.getLesson() 예외");
        }

        for (int i = 0; i < lesson.size(); i++) {
            if (subject.equals(lesson.get(i).getMySubject())) {
                if (!lesson.get(i).isCreate()) //폐지된 강의만 저장
                {
                    chooseLesson.add(lesson.get(i));
                }
            }
        }
        return chooseLesson;
    }

    public ArrayList<Lesson> chooseEnLesson(String subject) {//학과에 맞는 개설된 강좌 처리
        //(ClassRequestUI, DisableLessonUI 에서 사용)
        ArrayList<Lesson> chooseLesson = new ArrayList<>();
        ArrayList<Lesson> lesson = new ArrayList<>();
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            System.out.println("fileIO.getLesson() 예외");
        }

        for (int i = 0; i < lesson.size(); i++) {
            if (subject.equals(lesson.get(i).getMySubject())) {
                if (lesson.get(i).isCreate()) //개설된 강의만 저장
                {
                    chooseLesson.add(lesson.get(i));
                }
            }
        }
        return chooseLesson;
    }

    public int chooseLessonCount(String subject) { //해당되는 강좌 수
        int count = 0;
        ArrayList<Lesson> lesson = new ArrayList<>();
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            System.out.println("fileIO.getLesson() 예외");
        }
        for (int i = 0; i < lesson.size(); i++) {
            if (subject.equals(lesson.get(i).getMySubject())) {
                count++;
            }
        }
        return count;
    }

    public int inputClass(int count, int classNum, ArrayList<Lesson> chooseLesson, String name) { //수강 신청 반영
        int nowStu = 0;
        ArrayList<Lesson> lesson = new ArrayList<>();
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(chooseLesson.get(classNum).getName());
        for (int i = 0; i < lesson.size(); i++) {
            if (chooseLesson.get(classNum).getName().equals(lesson.get(i).getName())) { //선택한 강의만 변경
                lesson.get(i).updateNowPeople(); //현재 인원수 +1
                lesson.get(i).setStuName(name);
                nowStu = lesson.get(i).getNowPeople();
            }
        }
        //강좌 파일 적용
        try {
            fileIO.updateLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nowStu;
    }

    public void inputLesson(String myNum, String name, String mySubject, float credit, long bill, String explain, String proName, int minPeople, int maxPeople) { //강좌 추가
        ArrayList<Lesson> lesson = new ArrayList<>();
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        ArrayList<String> students = new ArrayList<String>();
        students.add("학생X");
        lesson.add(new Lesson(name, myNum, mySubject, credit, maxPeople, minPeople, 0, bill, explain, false, false, proName, students)); //강좌 객체 추가

        try { //강좌 객체 저장
            fileIO.updateLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void lessonClass(int count, int classNum, ArrayList<Lesson> chooseLesson) { //강좌 개설
        ArrayList<Lesson> lesson = new ArrayList<>();
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < lesson.size(); i++) {
            if (chooseLesson.get(classNum).getName().equals(lesson.get(i).getName())) { //선택한 강의만 변경
                lesson.get(i).setCreate(true);
                lesson.get(i).setPastCreate(true);
            }
        }
        try {
            fileIO.updateLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disableClass(int count, int classNum, ArrayList<Lesson> chooseLesson) { //강의 폐지
        ArrayList<Lesson> lesson = new ArrayList<>();
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < lesson.size(); i++) {
            if (chooseLesson.get(classNum).getName().equals(lesson.get(i).getName())) { //선택한 강의만 변경
                lesson.get(i).setCreate(false);
                //lesson.get(i).setPastCreate(true);
                //PastCreate : 강의를 한번 활성화 하면 변경 X
            }
        }
        try {
            fileIO.updateLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delClass(int count, int classNum, ArrayList<Lesson> chooseLesson) { //강의 삭제
        ArrayList<Lesson> lesson = new ArrayList<>();
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < lesson.size(); i++) {
            if (chooseLesson.get(classNum).getName().equals(lesson.get(i).getName())) { //선택한 강의만 삭제
                lesson.remove(i);
            }
        }
        try {
            fileIO.updateLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Lesson> myClass(String name) { //자신이 수강한 강의 리턴
        ArrayList<Lesson> resultLesson = new ArrayList<>();
        ArrayList<Lesson> lesson = new ArrayList<>();
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        for (int i = 0; i < lesson.size(); i++) { //lesson 중에서
            for (int j = 0; j < lesson.get(i).getStuName().size(); j++) {
                if (lesson.get(i).getStuName().get(j).equals(name)) { //lesson에 등록된 학생 이름과 로그인 된 이름이 같으면
                    resultLesson.add(lesson.get(i)); //해당 lesson을 반환할 resultLesson에 저장
                }
            }
        }
        return resultLesson;
    }

    public void billSend(String name, long bill) { //수업담당자가 학생에게 수강료 청구
        ArrayList<Lesson> lesson = new ArrayList<>();
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }

        ArrayList<Student> student = new ArrayList<>();
        try {
            student = fileIO.getStudent();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < lesson.size(); i++) { //lesson 중에서
            for (int j = 0; j < lesson.get(i).getStuName().size(); j++) {
                if (lesson.get(i).getStuName().get(j).equals(name)) { //lesson에 등록된 학생 이름과 로그인 된 이름이 같으면
                    student.get(i).setBill(bill);
                }
            }
        }
        try { //변경 내용 파일에 저장
            fileIO.updateStudent();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Lesson> proLesson() {
        String proName = "교수X";

        ArrayList<Professor> professor = new ArrayList<Professor>();
        ArrayList<Lesson> lesson = new ArrayList<>();
        ArrayList<Lesson> resultLesson = new ArrayList<>();

        try {
            professor = fileIO.getProfessor();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < professor.size(); i++) { //현재 로그인 된 교수 검색
            if (professor.get(i).isNowLogin()) {
                proName = professor.get(i).getName();
            }
        }
        for (int i = 0; i < lesson.size(); i++) {
            if (lesson.get(i).getProName().equals(proName)) { //선택된 교수 중 강좌 이름과 같은 것 검색
                resultLesson.add(lesson.get(i));
            }
        }
        return resultLesson;
    }
}
