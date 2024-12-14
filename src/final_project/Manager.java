package final_project;

import java.util.List;

public class Manager {

    private ManagerType managerType;

    public Manager(ManagerType managerType) {
        this.managerType = managerType;
    }

    // Getter and Setter
    public ManagerType getManagerType() {
        return managerType;
    }

    public void setManagerType(ManagerType managerType) {
        this.managerType = managerType;
    }

    // Method to approve student or teacher registration
    public boolean approveRegistration(Request request) {
        if (request != null && !request.isCanceled()) {
            System.out.println("Регистрация одобрена для запроса: " + request.getRequest());
            return true;
        } else {
            System.out.println("Регистрация отклонена: Запрос недействителен или отменен.");
            return false;
        }
    }

    // Method to assign a course to a teacher
    public void assignCourse(Teacher teacher, Course course) {
        if (teacher != null && course != null) {
            teacher.addCourse(course);
            System.out.println("Курс \"" + course.getCourseName() + "\" успешно назначен преподавателю: " + teacher.getName());
        } else {
            System.out.println("Ошибка: Некорректный преподаватель или курс.");
        }
    }

    // Method to create a report
    public void createReport(List<Student> students, List<Student.Teacher> teachers) {
        System.out.println("Создание отчета...");
        System.out.println("Студенты:");
        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("\nПреподаватели:");
        for (Student.Teacher teacher : teachers) {
            System.out.println(teacher);
        }
        System.out.println("\nОтчет успешно создан.");
    }

    // Method to manage news
    public void manageNews(String newsContent) {
        if (newsContent != null && !newsContent.isEmpty()) {
            System.out.println("Новость опубликована: " + newsContent);
        } else {
            System.out.println("Ошибка: Содержимое новости пустое.");
        }
    }

    // Method to view students
    public void viewStudents(List<Student> students) {
        if (students.isEmpty()) {
            System.out.println("Нет студентов для отображения.");
        } else {
            System.out.println("Список студентов:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    // Method to view teachers
    public void viewTeachers(List<Student.Teacher> teachers) {
        if (teachers.isEmpty()) {
            System.out.println("Нет преподавателей для отображения.");
        } else {
            System.out.println("Список преподавателей:");
            for (Student.Teacher teacher : teachers) {
                System.out.println(teacher);
            }
        }
    }

    // Method to view registration requests
    public void viewRequests(List<Request> requests) {
        if (requests.isEmpty()) {
            System.out.println("Нет запросов на регистрацию.");
        } else {
            System.out.println("Запросы на регистрацию:");
            for (Request request : requests) {
                System.out.println(request);
            }
        }
    }

    // Override toString
    @Override
    public String toString() {
        return "Manager{" +
                "managerType=" + managerType +
                '}';
    }
}
