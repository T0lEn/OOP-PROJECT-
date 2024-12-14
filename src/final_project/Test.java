package final_project;
import java.util.*;
public class Test {
    public static void main(String[] args) {
        TechSupport techSupport = new TechSupport(1, "John Doe", "johndoe", "password", 1001, "john@example.com", true, UserRole.TECHSUPPORT);

        // Создание заказов
        Order order1 = new Order(1, OrderStatus.NEW, "Fix computer issue");
        Order order2 = new Order(2, OrderStatus.NEW, "Install software");

        // Добавление заказов в список новых
        techSupport.getNewOrders().add(order1);
        techSupport.getNewOrders().add(order2);

        // Создание команд
        OrderCommand acceptOrderCommand = new AcceptOrderCommand(order1, techSupport.getNewOrders(), techSupport.getAcceptedOrders());
        OrderCommand rejectOrderCommand = new RejectOrderCommand(order2, techSupport.getNewOrders());
        OrderCommand completeOrderCommand = new CompleteOrderCommand(order1, techSupport.getAcceptedOrders());

        // Выполнение команд
        techSupport.executeCommand(acceptOrderCommand); // Принять заказ
        techSupport.executeCommand(rejectOrderCommand); // Отклонить заказ
        techSupport.executeCommand(completeOrderCommand); // Завершить заказ


        Admin admin1 = Admin.getInstance();
        Admin admin2 = Admin.getInstance();

        // Проверяем, что admin1 и admin2 ссылаются на один и тот же объект
        System.out.println(admin1 == admin2); // true

        // Работа с администратором
        User user1 = new User("Alice", "alice", 312, "alice@example.com", true, UserRole.STUDENT);
        User user2 = new User("Bob", "bobik", 313, "bob@example.com", true, UserRole.STUDENT);

        List<User> usersToAdd = new ArrayList<>();
        usersToAdd.add(user1);
        usersToAdd.add(user2);

        admin1.addUser(usersToAdd); // Добавляем пользователей через admin1
        admin2.displayUsers();


        Course mathCourse = new Course("MATH101", "Calculus I", 3, 30, CourseType.MAJOR);
        Course physicsCourse = new Course("PHYS101", "Physics I", 4, 25, CourseType.MINOR);

        // Создание преподавателей
        Teacher teacher1 = new Teacher("T001", "Alice Johnson", "Mathematics");
        Teacher teacher2 = new Teacher("T002", "Bob Smith", "Physics");

        // Преподаватели назначаются на курсы
        teacher1.addCourse(mathCourse);
        teacher2.addCourse(physicsCourse);

        // Вывод курсов, на которые назначены преподаватели
        System.out.println("Курсы, на которые назначены преподаватели:");
        System.out.println(teacher1.getName() + ": " + getCourseNames(teacher1.getAssignedCourses()));
        System.out.println(teacher2.getName() + ": " + getCourseNames(teacher2.getAssignedCourses()));

        // Создание студентов
        Student student1 = new Student("S001", StudentType.BACHELOR, "Mathematics");
        Student student2 = new Student("S002", StudentType.PHD, "Physics");
        student1.setName("John Doe");
        student2.setName("Jane Smith");

        // Регистрация студентов на курсы
        student1.addCourse(mathCourse);
        student2.addCourse(physicsCourse);
        mathCourse.addStudent(student1);
        physicsCourse.addStudent(student2);

        // Просмотр курсов, на которые зарегистрирован студент
        System.out.println("\nКурсы студента " + student1.getName() + ":");
        printCourses(student1.viewCourses());



        // Вывод среднего рейтинга преподавателей
        System.out.println("\nСредний рейтинг преподавателей:");
        System.out.println(teacher1.getName() + ": " + teacher1.getAverageRating());
        System.out.println(teacher2.getName() + ": " + teacher2.getAverageRating());

        // Создание расписания
        List<Course> scheduleCourses = new ArrayList<>();
        scheduleCourses.add(mathCourse);
        scheduleCourses.add(physicsCourse);
        Schedule schedule = new Schedule("SCH001", new Date(), scheduleCourses);

        // Вывод расписания
        System.out.println("\nРасписание:");
        System.out.println(schedule);

        // Назначение оценок студентам
        Mark mark1 = new Mark("A", 95.0, 4.0, mathCourse); // Указываем курс mathCourse
        Mark mark2 = new Mark("B+", 88.0, 3.0, physicsCourse); // Указываем курс physicsCourse
        mathCourse.assignMark(student1, mark1);
        physicsCourse.assignMark(student2, mark2);

        // Просмотр оценок студентов
        System.out.println("\nОценки студентов:");
        System.out.println(student1.getName() + ": " + mathCourse.getMark(student1));
        System.out.println(student2.getName() + ": " + physicsCourse.getMark(student2));
    }

    // Вспомогательный метод для получения названий курсов
    private static String getCourseNames(List<Course> courses) {
        StringBuilder result = new StringBuilder();
        for (Course course : courses) {
            result.append(course.getCourseName()).append(", ");
        }
        return result.length() > 0 ? result.substring(0, result.length() - 2) : "Нет курсов";
    }

    // Вспомогательный метод для вывода курсов
    private static void printCourses(List<Course> courses) {
        if (courses.isEmpty()) {
            System.out.println("Нет зарегистрированных курсов.");
        } else {
            for (Course course : courses) {
                System.out.println(course.getCourseName());
            }
        }
    }
    }

