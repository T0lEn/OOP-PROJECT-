package final_project;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users;

    public UserManager() {
        this.users = new ArrayList<>();
    }

    // Add a new user
    public void addUser(User user) {
        users.add(user);
    }

    // Authenticate user by username and password
    public User authenticate(String username, String password) {
        for (User user : users) {
            if (user.getUserName().equals(username) && user.getPassword().equals(password)) {
                user.setActive(true);
                return user;
            }
        }
        return null;
    }

    // Get all users
    public List<User> getUsers() {
        return users;
    }
}
