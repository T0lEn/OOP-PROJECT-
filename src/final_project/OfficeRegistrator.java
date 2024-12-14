package final_project;

import java.util.*;

public class OfficeRegistrator {
    private List<Request> requests; // List to store registration requests
    private List<String> courses;   // List to store courses
    private String schedule;        // Schedule for courses

    // Constructor
    public OfficeRegistrator() {
        this.requests = new ArrayList<>();
        this.courses = new ArrayList<>();
        this.schedule = "";
    }

    // Getter for requests
    public List<Request> getRequests() {
        return requests;
    }

    // Setter for requests
    public void setRequests(List<Request> requests) {
        this.requests = requests;
    }

    // Method to add a course
    public void addCourse(String course) {
        if (course != null && !course.isEmpty()) {
            courses.add(course);
            System.out.println("Курс \"" + course + "\" успешно добавлен.");
        } else {
            System.out.println("Ошибка: Название курса некорректное.");
        }
    }

    // Method to manage (update) a course
    public void manageCourse(String oldCourse, String newCourse) {
        if (courses.contains(oldCourse) && newCourse != null && !newCourse.isEmpty()) {
            courses.set(courses.indexOf(oldCourse), newCourse);
            System.out.println("Курс \"" + oldCourse + "\" успешно обновлен на \"" + newCourse + "\".");
        } else {
            System.out.println("Ошибка: Курс для обновления не найден или новое название некорректное.");
        }
    }

    // Method to remove a course
    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println("Курс \"" + course + "\" успешно удален.");
        } else {
            System.out.println("Ошибка: Курс \"" + course + "\" не найден.");
        }
    }

    // Method to send a message to a user
    public void sendMessage(String message, String recipient) {
        if (message != null && !message.isEmpty() && recipient != null && !recipient.isEmpty()) {
            System.out.println("Сообщение \"" + message + "\" отправлено получателю: " + recipient);
        } else {
            System.out.println("Ошибка: Сообщение или получатель некорректны.");
        }
    }

    // Method to edit the schedule
    public void editSchedule(String newSchedule) {
        if (newSchedule != null && !newSchedule.isEmpty()) {
            this.schedule = newSchedule;
            System.out.println("Расписание успешно обновлено.");
        } else {
            System.out.println("Ошибка: Новое расписание некорректное.");
        }
    }

    // Method to confirm the schedule
    public void confirmSchedule() {
        if (schedule != null && !schedule.isEmpty()) {
            System.out.println("Расписание подтверждено: " + schedule);
        } else {
            System.out.println("Ошибка: Расписание не установлено.");
        }
    }

    // Override toString
    @Override
    public String toString() {
        return "OfficeRegistrator{" +
                "requests=" + requests +
                ", courses=" + courses +
                ", schedule='" + schedule + '\'' +
                '}';
    }
}
