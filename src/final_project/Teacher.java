package final_project;

import java.util.ArrayList;
import java.util.List;

public class Teacher {
    private String teacherID;
    private String name;
    private String faculty;
    private List<Course> assignedCourses;
    private double ratingSum;
    private int ratingCount;

    // Constructor
    public Teacher(String teacherID, String name, String faculty) {
        this.teacherID = teacherID;
        this.name = name;
        this.faculty = faculty;
        this.assignedCourses = new ArrayList<>();
        this.ratingSum = 0;
        this.ratingCount = 0;
    }

    // Getters and Setters
    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public List<Course> getAssignedCourses() {
        return assignedCourses;
    }

    // Method to add a course
    public void addCourse(Course course) {
        if (course == null) {
            System.out.println("Ошибка: Курс некорректный.");
            return;
        }

        if (!assignedCourses.contains(course)) {
            assignedCourses.add(course);
            System.out.println("Курс \"" + course.getCourseName() + "\" успешно добавлен преподавателю " + name + ".");
        } else {
            System.out.println("Курс \"" + course.getCourseName() + "\" уже добавлен преподавателю " + name + ".");
        }
    }

    // Method to remove a course
    public void removeCourse(Course course) {
        if (assignedCourses.remove(course)) {
            System.out.println("Курс \"" + course.getCourseName() + "\" успешно удалён у преподавателя " + name + ".");
        } else {
            System.out.println("Курс \"" + course.getCourseName() + "\" не найден у преподавателя " + name + ".");
        }
    }

    // Method to add a rating
    public void addRating(double rating) {
        if (rating < 0 || rating > 10) {
            throw new IllegalArgumentException("Рейтинг должен быть от 0 до 10.");
        }
        ratingSum += rating;
        ratingCount++;
        System.out.println("Рейтинг добавлен. Средний рейтинг преподавателя " + name + ": " + getAverageRating());
    }

    // Method to get the average rating
    public double getAverageRating() {
        return ratingCount > 0 ? ratingSum / ratingCount : 0.0;
    }

    // Override toString
    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID='" + teacherID + '\'' +
                ", name='" + name + '\'' +
                ", faculty='" + faculty + '\'' +
                ", assignedCourses=" + assignedCourses +
                ", averageRating=" + getAverageRating() +
                '}';
    }
}
