package final_project;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UniversityRecord implements Serializable {
    private static final long serialVersionUID = 1L;

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

    // Метод для сохранения данных в файл
    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(this);
            System.out.println("Данные успешно сохранены в файл: " + filename);
        } catch (IOException e) {
            System.err.println("Ошибка при сохранении данных: " + e.getMessage());
        }
    }

    // Метод для загрузки данных из файла
    public static UniversityRecord loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (UniversityRecord) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Ошибка при загрузке данных: " + e.getMessage());
            return null;
        }
    }
}
