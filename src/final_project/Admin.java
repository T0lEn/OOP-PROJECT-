package final_project;

import java.util.List;
import java.util.ArrayList;

public class Admin {
    // Единственный экземпляр класса Admin
    private static Admin instance;

    // Список пользователей
    private List<User> users;

    // Приватный конструктор для предотвращения создания объектов извне
    private Admin() {
        this.users = new ArrayList<>();
    }

    // Метод для получения единственного экземпляра класса
    public static Admin getInstance() {
        if (instance == null) {
            synchronized (Admin.class) {
                if (instance == null) {
                    instance = new Admin();
                }
            }
        }
        return instance;
    }

    public void addUser(List<User> newUsers) {
        users.addAll(newUsers);
        System.out.println(newUsers.size() + " users added.");
    }

    public void removeUser(User user) {
        if (users.contains(user)) {
            users.remove(user);
            System.out.println("User " + user.getUserName() + " removed.");
        } else {
            System.out.println("User " + user.getUserName() + " not found.");
        }
    }

    public void approveRegistration() {
        System.out.println("Registration approved.");
    }

    public List<User> getUsers() {
        return users;
    }

    public void displayUsers() {
        System.out.println("List of users:");
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}
