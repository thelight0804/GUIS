package cse.team8.lessonwork;

import cse.team8.guis.FileIO;
import cse.team8.user.Lesson;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LessonWork {

    FileIO fileIO = new FileIO();
    ArrayList<Lesson> lesson = new ArrayList<>();

    public ArrayList<Lesson> chooseDelLesson(String subject) {//삭제가 가능한 강좌 처리
        //
        ArrayList<Lesson> chooseLesson = new ArrayList<>();
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            System.out.println("fileIO.getLesson() 예외");
        }

        for (int i = 0; i < lesson.size(); i++) {
            if (subject.equals(lesson.get(i).getMySubject())) {
                if(lesson.get(i).isCreate() == false && lesson.get(i).isPastCreate() == false){
                     chooseLesson.add(lesson.get(i));
                }
            }
        }
        return chooseLesson;
    }

    public ArrayList<Lesson> chooseDisLesson(String subject) {//학과에 맞는 폐지된 강좌 처리 
                //(LessonClassUI 에서 사용)
        ArrayList<Lesson> chooseLesson = new ArrayList<>();
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
    public ArrayList<Lesson> myClass(String name) {
        ArrayList<Lesson> resultLesson = new ArrayList<>();
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
}
