package final_project;
import java.util.*;
public class User {
    private String userName;
    private String password;
    private int id;
    private String email;
    private boolean isActive;
    private UserRole role;
    public User(String userName, String password, int id, String email, boolean isActive, UserRole role) {
        this.userName = userName;
        this.password = password;
        this.id = id;
        this.email = email;
        this.isActive = isActive;
        this.role = role;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public boolean isActive() {
        return isActive;
    }
    public void setActive(boolean active) {
        isActive = active;
    }
    public UserRole getRole() {
        return role;
    }
    public void setRole(UserRole role) {
        this.role = role;
    }
    public void logIn(String userName, String password) {
        if (!isActive){
            System.out.println("Ошибка, Аккаунт неактивен");
        }
        if (this.userName.equals(userName) && this.password.equals(password)) {
            System.out.println("Вы вошли успешно");
        }

        else {
            System.out.println("Ошибка: Неверное имя пользователя или пароль.");
        }

    }
    public void logOut() {
        if (!isActive) {
            System.out.println("Вы уже вышли");
        }
        else {
            isActive = false;
            System.out.println("Вы успешно вышли из системы");
        }
    }

    public void updateProfile(){
        if (!isActive) {
            System.out.println("Ошибка: Аккаунт неактивен. Вы не можете обновить профиль.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Обновление профиля");
        System.out.println("1. Изменить имя пользователя");
        System.out.println("2. Изменить пароль");
        System.out.println("3. Изменить электронную почту");
        System.out.println("4. Выход");
        System.out.print("Выберите опцию: ");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                System.out.print("Введите новое имя пользователя: ");
                String newUserName = scanner.nextLine();
                setUserName(newUserName);
                System.out.println("Имя пользователя успешно обновлено.");
                break;

            case 2:
                System.out.print("Введите новый пароль: ");
                String newPassword = scanner.nextLine();
                setPassword(newPassword);
                System.out.println("Пароль успешно обновлен.");
                break;

            case 3:
                System.out.print("Введите новую электронную почту: ");
                String newEmail = scanner.nextLine();
                setEmail(newEmail);
                System.out.println("Электронная почта успешно обновлена.");
                break;

            case 4:
                System.out.println("Выход из обновления профиля.");
                break;

            default:
                System.out.println("Ошибка: Неверный выбор.");
                break;
        }
    }
    public boolean verifyPassword(String password) {
        return this.password.equals(password);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public void viewProfile() {
        if (!isActive) {
            System.out.println("Ошибка: Аккаунт неактивен.");
            return;
        }

        System.out.println("Информация о профиле:");
        System.out.println("Имя пользователя: " + userName);
        System.out.println("Электронная почта: " + email);
        System.out.println("ID: " + id);
        System.out.println("Роль: " + role);
        System.out.println("Активен: " + (isActive ? "Да" : "Нет"));
    }

    public void viewMenu() {
        if (!isActive) {
            System.out.println("Ошибка: Аккаунт неактивен. Вы не можете использовать меню.");
            return;
        }

        System.out.println("Меню пользователя:");
        System.out.println("1. Посмотреть профиль");
        System.out.println("2. Обновить профиль");
        System.out.println("3. Выйти из аккаунта");
        System.out.println("4. Выйти из программы");
        System.out.print("Выберите опцию: ");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        switch (choice) {
            case 1:
                viewProfile();
                break;
            case 2:
                updateProfile();
                break;
            case 3:
                logOut();
                break;
            case 4:
                System.out.println("Выход из программы.");
                System.exit(0);
                break;
            default:
                System.out.println("Ошибка: Неверный выбор. Попробуйте ещё раз.");
                viewMenu();
                break;
        }
    }


}

