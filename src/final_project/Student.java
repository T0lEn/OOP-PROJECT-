package final_project;

import java.util.*;

public class Student {
    private String name;
    private String studentID;
    private StudentType studentType;
    private List<Course> enrolledCourses;
    private double gpa;
    private Schedule schedule;
    private String faculty;
    private List<StudentOrganization> enrolledOrganization;
    private Mark marks;
    private Transcript transcript;
    private int attendance;

    public Student(String studentID, StudentType studentType, String faculty) {
        this.studentID = studentID;
        this.studentType = studentType;
        this.faculty = faculty;
        this.enrolledCourses = new ArrayList<>();
        this.enrolledOrganization = new ArrayList<>();
        this.transcript = new Transcript();
        this.name = null; // Initialize name to null
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void registerCourse(Course course) {
        if (!enrolledCourses.contains(course)) {
            enrolledCourses.add(course);
        }
    }

    // Add Course method
    public void addCourse(Course course) {
        if (course == null) {
            System.out.println("Ошибка: Неверный курс.");
            return;
        }

        if (enrolledCourses.contains(course)) {
            System.out.println("Курс " + course.getCourseName() + " уже добавлен.");
        } else {
            enrolledCourses.add(course);
            System.out.println("Курс " + course.getCourseName() + " успешно добавлен.");
        }
    }

    public double getGpa() {
        return gpa;
    }

    public List<Course> viewCourses() {
        return enrolledCourses;
    }

    public Schedule viewSchedule() {
        return schedule;
    }

    public void dropCourse(Course course) {
        if (enrolledCourses.remove(course)) {
            System.out.println("Курс " + course.getCourseName() + " успешно удалён.");
        } else {
            System.out.println("Курс " + course.getCourseName() + " не найден.");
        }
    }

    public void rateTeacher(Teacher teacher, double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Рейтинг должен быть от 0 до 10.");
        }
        teacher.addRating(rating);
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<StudentOrganization> getEnrolledOrganization() {
        return enrolledOrganization;
    }

    public Mark viewMarks() {
        return marks;
    }

    public Transcript viewTranscript() {
        return transcript;
    }

    public int getAttendance() {
        return attendance;
    }

    public void conductResearch() {
        System.out.println("Студент " + name + " проводит исследование.");
    }

    public ResearchField getResearchField() {
        return null;
    }

    public void publishResearchPaper(ResearchPaper paper) {
        System.out.println("Студент " + name + " публикует исследовательскую статью.");
    }

    public void assignMark() {
        System.out.println("Оценка назначена.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID='" + studentID + '\'' +
                ", studentType=" + studentType +
                ", faculty='" + faculty + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(studentID, student.studentID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentID);
    }

    class Teacher {
        public void addRating(double rating) {
            System.out.println("Рейтинг " + rating + " добавлен преподавателю.");
        }
    }
}
