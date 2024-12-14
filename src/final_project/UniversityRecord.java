package final_project;


import java.util.ArrayList;
import java.util.List;

public class UniversityRecord {
    private List<Student> students;
    private List<Teacher> teachers;

    private List<Manager> managers;
    private List<Course> courses;

    public UniversityRecord() {
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
        this.managers = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public List<Student> viewStudents() {
        return students;
    }

    public List<Teacher> viewTeachers() {
        return teachers;
    }

    public List<Manager> viewManagers() {
        return managers;
    }

    public List<Course> viewCourses() {
        return courses;
    }
}

