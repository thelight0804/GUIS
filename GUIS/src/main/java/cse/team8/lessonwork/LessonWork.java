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

    public ArrayList<Lesson> chooseLesson(String subject) {//학과에 맞는 강좌 처리 
        ArrayList<Lesson> chooseLesson = new ArrayList<>();
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            System.out.println("fileIO.getLesson() 예외");
        }

        for (int i = 0; i < lesson.size(); i++) {
            if (subject.equals(lesson.get(i).getMySubject())) {
                chooseLesson.add(lesson.get(i));
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
    
    public void inputClass(int count, int classNum, ArrayList<Lesson> chooseLesson ,String name){ //수강 신청 반영
        try {
            lesson = fileIO.getLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
        //System.out.println(chooseLesson.get(classNum).getName());
        for(int i=0;i<lesson.size();i++){
                    if(chooseLesson.get(classNum).getName().equals(lesson.get(i).getName())){ //선택한 강의만 변경
                        lesson.get(i).updateNowPeople(); //현재 인원수 +1
                        lesson.get(i).setStuName(name);
                    }
        }
        //강좌 파일 적용
        try {
            fileIO.updateLesson();
        } catch (IOException ex) {
            Logger.getLogger(LessonWork.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}