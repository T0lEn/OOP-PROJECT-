package final_project;

import java.util.*;

public class Course implements Comparable<Course> {
    private String courseCode;
    private String courseName;
    private int creditNumbers;
    private List<Teacher> instructors;
    private List<Course> prerequisites;
    private int maxStudentNumber;
    private CourseType courseType;
    private List<Student> students; // List of students enrolled in the course
    private Map<Student, Mark> studentMarks; // Map to store marks assigned to students

    public Course(String courseCode, String courseName, int creditNumbers, int maxStudentNumber, CourseType courseType) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.creditNumbers = creditNumbers;
        this.instructors = new ArrayList<>();
        this.prerequisites = new ArrayList<>();
        this.maxStudentNumber = maxStudentNumber;
        this.courseType = courseType;
        this.students = new ArrayList<>(); // Initialize students list
        this.studentMarks = new HashMap<>(); // Initialize studentMarks map
    }

    // Getters
    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public CourseType getCourseType() {
        return courseType;
    }

    // Setters
    public void setCourseType(CourseType courseType) {
        this.courseType = courseType;
    }

    // Methods to manage instructors
    public void addInstructor(Teacher teacher) {
        instructors.add(teacher);
    }

    public void removeInstructor(Teacher teacher) {
        instructors.remove(teacher);
    }

    public List<Teacher> viewInstructors() {
        return instructors;
    }

    // Methods to manage students
    public void addStudent(Student student) {
        if (students.size() < maxStudentNumber) {
            students.add(student);
        } else {
            System.out.println("Course is full. Cannot add student.");
        }
    }

    public boolean isFull() {
        return students.size() >= maxStudentNumber;
    }

    // Method to assign a mark to a student
    public void assignMark(Student student, Mark mark) {
        if (students.contains(student)) {
            studentMarks.put(student, mark); // Assign the mark to the student
            System.out.println("Mark assigned to student: " + student);
        } else {
            System.out.println("Student is not enrolled in this course.");
        }
    }

    // Method to view a student's mark
    public Mark getMark(Student student) {
        return studentMarks.getOrDefault(student, null);
    }

    // Comparable implementation for sorting
    @Override
    public int compareTo(Course other) {
        return this.courseName.compareTo(other.courseName);
    }

    // toString Method
    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseName='" + courseName + '\'' +
                ", creditNumbers=" + creditNumbers +
                ", maxStudentNumber=" + maxStudentNumber +
                ", courseType=" + courseType +
                '}';
    }
}
