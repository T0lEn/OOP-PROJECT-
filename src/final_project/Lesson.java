package final_project;

import java.util.ArrayList;
import java.util.List;

public class Lesson {
    private LessonType lessonType;
    private String day;
    private List<Teacher> instructors;

    public Lesson(LessonType lessonType, String day) {
        this.lessonType = lessonType;
        this.day = day;
        this.instructors = new ArrayList<>();
    }

    public LessonType getLessonType() {
        return lessonType;
    }

    public void setLessonType(LessonType lessonType) {
        this.lessonType = lessonType;
    }

    public void addInstructor(Teacher teacher) {
        instructors.add(teacher);
    }

    public void removeInstructor(Teacher teacher) {
        instructors.remove(teacher);
    }

    public List<Teacher> getInstructors() {
        return instructors;
    }

    public void cancelLesson() {
        instructors.clear();
    }

    public void assignInstructor(Teacher teacher) {
        if (!instructors.contains(teacher)) {
            instructors.add(teacher);
            System.out.println("Instructor assigned: " + teacher);
        } else {
            System.out.println("This instructor is already assigned to the lesson.");
        }
    }
}

