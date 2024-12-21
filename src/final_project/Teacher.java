package final_project;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends User {
    private String faculty;
    private List<Course> assignedCourses;
    private double ratingSum;
    private int ratingCount;

    // Constructor
    public Teacher(String teacherID, String name, String faculty) {
        super(name, "defaultPassword", Integer.parseInt(teacherID), "defaultEmail@example.com", true, UserRole.TEACHER);
        this.faculty = faculty;
        this.assignedCourses = new ArrayList<>();
        this.ratingSum = 0.0;
        this.ratingCount = 0;
    }

    // Getters and Setters
    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    // Add a course
    public void addCourse(Course course) {
        if (course == null) {
            System.out.println("Ошибка: Неверный курс.");
            return;
        }

        if (!assignedCourses.contains(course)) {
            assignedCourses.add(course);
            System.out.println("Курс \"" + course.getCourseName() + "\" успешно добавлен преподавателю " + getUserName() + ".");
        } else {
            System.out.println("Курс \"" + course.getCourseName() + "\" уже назначен преподавателю " + getUserName() + ".");
        }
    }

    // Remove a course
    public void removeCourse(Course course) {
        if (assignedCourses.remove(course)) {
            System.out.println("Курс \"" + course.getCourseName() + "\" успешно удалён у преподавателя " + getUserName() + ".");
        } else {
            System.out.println("Курс \"" + course.getCourseName() + "\" не найден у преподавателя " + getUserName() + ".");
        }
    }

    // Add a rating
    public void addRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Рейтинг должен быть в диапазоне от 0 до 10.");
        }
        ratingSum += rating;
        ratingCount++;
        System.out.println("Рейтинг добавлен. Текущий средний рейтинг преподавателя " + getUserName() + ": " + getAverageRating());
    }

    // Get average rating
    public double getAverageRating() {
        return ratingCount > 0 ? ratingSum / ratingCount : 0.0;
    }

    // Print all assigned courses
    public void printAssignedCourses() {
        if (assignedCourses.isEmpty()) {
            System.out.println("Преподаватель " + getUserName() + " не назначен на курсы.");
        } else {
            System.out.println("Список курсов, назначенных преподавателю " + getUserName() + ":");
            for (Course course : assignedCourses) {
                System.out.println(course);
            }
        }
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + getUserName() + '\'' +
                ", faculty='" + faculty + '\'' +
                ", assignedCourses=" + assignedCourses +
                ", averageRating=" + getAverageRating() +
                '}';
    }

    public String getName() {
        return super.getUserName();
    }
}
