package cse.team8.lessonwork;

import cse.team8.guis.FileIO;
import cse.team8.user.Lesson;
import java.io.IOException;
import java.util.ArrayList;

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
}
