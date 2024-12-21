package final_project;

import java.util.*;

public class MainApplication {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UserManager userManager = new UserManager();

        // Adding sample users
        userManager.addUser(new User("admin", "adminpass", 1, "admin@example.com", false, UserRole.ADMIN));
        userManager.addUser(new User("student", "studentpass", 2, "student@example.com", false, UserRole.STUDENT));
        userManager.addUser(new Teacher("T1", "teacher", "Science"));
        userManager.addUser(new User("tech", "techpass", 4, "tech@example.com", false, UserRole.TECHSUPPORT));
        userManager.addUser(new ResearcherUser("researcher", "researchpass", 5, "researcher@example.com", false, UserRole.RESEARCHER, ResearchField.COMPUTER_SCIENCE));

        while (true) {
            System.out.println("Welcome to the University System");
            System.out.print("Enter username: ");
            String username = scanner.nextLine();
            System.out.print("Enter password: ");
            String password = scanner.nextLine();

            User currentUser = userManager.authenticate(username, password);
            if (currentUser == null) {
                System.out.println("Invalid username or password. Try again.");
                continue;
            }

            System.out.println("Welcome, " + currentUser.getUserName() + "! Role: " + currentUser.getRole());
            mainMenu(currentUser, userManager);
        }
    }

    private static void mainMenu(User user, UserManager userManager) {
        while (user.isActive()) {
            switch (user.getRole()) {
                case ADMIN:
                    adminMenu(userManager);
                    break;
                case STUDENT:
                    studentMenu((Student) user);
                    break;
                case TEACHER:
                    teacherMenu((Teacher) user);
                    break;
                case TECHSUPPORT:
                    techSupportMenu(user);
                    break;
                case RESEARCHER:
                    researcherMenu((ResearcherUser) user);
                    break;
                default:
                    System.out.println("Role not supported yet.");
                    return;
            }
        }
    }

    private static void adminMenu(UserManager userManager) {
        while (true) {
            System.out.println("Admin Menu:");
            System.out.println("1. Display Users");
            System.out.println("2. Add User");
            System.out.println("3. Remove User");
            System.out.println("4. Back");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    userManager.getUsers().forEach(System.out::println);
                    break;
                case 2:
                    System.out.print("Enter username: ");
                    String username = scanner.nextLine();
                    System.out.print("Enter password: ");
                    String password = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter role (ADMIN, STUDENT, TEACHER, TECHSUPPORT, RESEARCHER): ");
                    String role = scanner.nextLine();
                    UserRole userRole = UserRole.valueOf(role.toUpperCase());

                    if (userRole == UserRole.RESEARCHER) {
                        System.out.print("Enter research field (COMPUTER_SCIENCE, PHYSICS, etc.): ");
                        ResearchField field = ResearchField.valueOf(scanner.nextLine().toUpperCase());
                        userManager.addUser(new ResearcherUser(username, password, userManager.getUsers().size() + 1, email, false, userRole, field));
                    } else {
                        userManager.addUser(new User(username, password, userManager.getUsers().size() + 1, email, false, userRole));
                    }
                    System.out.println("User added.");
                    break;
                case 3:
                    System.out.print("Enter username to remove: ");
                    String userToRemove = scanner.nextLine();
                    User user = userManager.getUsers().stream()
                            .filter(u -> u.getUserName().equals(userToRemove))
                            .findFirst()
                            .orElse(null);
                    if (user != null) {
                        userManager.getUsers().remove(user);
                        System.out.println("User removed.");
                    } else {
                        System.out.println("User not found.");
                    }
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void studentMenu(Student student) {
        while (true) {
            System.out.println("Student Menu:");
            System.out.println("1. View Courses");
            System.out.println("2. Add Course");
            System.out.println("3. Drop Course");
            System.out.println("4. View Schedule");
            System.out.println("5. Rate Teacher");
            System.out.println("6. View Transcript");
            System.out.println("7. Conduct Research");
            System.out.println("8. Back");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enrolled Courses: " + student.viewCourses());
                    break;
                case 2:
                    System.out.print("Enter course name: ");
                    String courseName = scanner.nextLine();
                    Course course = new Course("C" + (int) (Math.random() * 100), courseName, 3, 30, CourseType.MAJOR);
                    student.addCourse(course);
                    break;
                case 3:
                    System.out.print("Enter course name to drop: ");
                    String dropCourseName = scanner.nextLine();
                    Course dropCourse = student.viewCourses().stream()
                            .filter(c -> c.getCourseName().equals(dropCourseName))
                            .findFirst()
                            .orElse(null);
                    if (dropCourse != null) {
                        student.dropCourse(dropCourse);
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case 4:
                    Schedule schedule = student.viewSchedule();
                    System.out.println("Schedule: " + (schedule != null ? schedule : "No schedule available."));
                    break;
                case 5:
                    System.out.print("Enter teacher name: ");
                    String teacherName = scanner.nextLine();
                    Teacher teacher = new Teacher("T" + (int) (Math.random() * 100), teacherName, "Faculty");
                    System.out.print("Enter rating (0-10): ");
                    double rating = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    try {
                        student.rateTeacher(teacher, rating);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Transcript: " + student.viewTranscript().getTranscript());
                    break;
                case 7:
                    student.conductResearch();
                    break;
                case 8:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void teacherMenu(Teacher teacher) {
        while (true) {
            System.out.println("Teacher Menu:");
            System.out.println("1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. View Assigned Courses");
            System.out.println("4. View Average Rating");
            System.out.println("5. Back");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter course name: ");
                    String courseName = scanner.nextLine();
                    Course newCourse = new Course("C" + (int) (Math.random() * 100), courseName, 3, 30, CourseType.MAJOR);
                    teacher.addCourse(newCourse);
                    break;
                case 2:
                    System.out.print("Enter course name to remove: ");
                    String removeCourseName = scanner.nextLine();
                    Course removeCourse = teacher.getAssignedCourses().stream()
                            .filter(c -> c.getCourseName().equals(removeCourseName))
                            .findFirst()
                            .orElse(null);
                    if (removeCourse != null) {
                        teacher.removeCourse(removeCourse);
                    } else {
                        System.out.println("Course not found.");
                    }
                    break;
                case 3:
                    System.out.println("Assigned Courses: " + teacher.getAssignedCourses());
                    break;
                case 4:
                    System.out.println("Average Rating: " + teacher.getAverageRating());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void techSupportMenu(User user) {
        while (true) {
            System.out.println("Tech Support Menu:");
            System.out.println("1. View New Orders");
            System.out.println("2. Accept Order");
            System.out.println("3. Complete Order");
            System.out.println("4. Back");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("View New Orders - Feature not implemented yet.");
                    break;
                case 2:
                    System.out.println("Accept Order - Feature not implemented yet.");
                    break;
                case 3:
                    System.out.println("Complete Order - Feature not implemented yet.");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void researcherMenu(ResearcherUser user) {
        while (true) {
            System.out.println("Researcher Menu:");
            System.out.println("1. Conduct Research");
            System.out.println("2. Publish Paper");
            System.out.println("3. View Published Papers");
            System.out.println("4. Calculate H-Index");
            System.out.println("5. Back");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    user.conductResearch();
                    break;
                case 2:
                    System.out.print("Enter paper title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter journal name: ");
                    String journal = scanner.nextLine();
                    ResearchPaper paper = new ResearchPaper(
                            title,
                            List.of(user.getUserName()),
                            Calendar.getInstance().get(Calendar.YEAR),
                            journal,
                            "Abstract for " + title,
                            10,
                            "10.1000/" + UUID.randomUUID()
                    );
                    user.publishResearchPaper(paper);
                    break;
                case 3:
                    user.printPapers(Comparator.comparing(ResearchPaper::getYear));
                    break;
                case 4:
                    System.out.println("H-Index: " + user.calculateHIndex());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }


}
