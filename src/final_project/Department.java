package final_project;
import java.util.*;


public class Department {
    private String departmentName;
    private List<String> majors;
    private List<Student> students;
    private List<String> news; // To store news articles
    private List<String> faculty; // To store faculty names

    public Department(String departmentName, List<String> majors, List<Student> students) {
        this.departmentName = departmentName;
        this.majors = majors;
        this.students = students;
        this.news = new ArrayList<>();
        this.faculty = new ArrayList<>();
    }

    // Create a news item
    public void createNews(String newsItem) {
        news.add(newsItem);
        System.out.println("News created: " + newsItem);
    }

    // Edit a news item by index
    public void editNews(int index, String updatedNewsItem) {
        if (index >= 0 && index < news.size()) {
            news.set(index, updatedNewsItem);
            System.out.println("News updated at index " + index + ": " + updatedNewsItem);
        } else {
            System.out.println("Invalid index. Cannot edit news.");
        }
    }

    // Delete a news item by index
    public void deleteNews(int index) {
        if (index >= 0 && index < news.size()) {
            String removedNews = news.remove(index);
            System.out.println("News deleted: " + removedNews);
        } else {
            System.out.println("Invalid index. Cannot delete news.");
        }
    }

    // Get a list of faculty
    public List<String> getFaculty() {
        return faculty;
    }

    // Set a list of faculty
    public void setFaculty(List<String> faculty) {
        this.faculty = faculty;
        System.out.println("Faculty list updated.");
    }

    // Get students in the department
    public List<Student> getFacultyStudents() {
        return students;
    }

    // Show all news
    public void showNews() {
        if (news.isEmpty()) {
            System.out.println("No news available.");
        } else {
            System.out.println("News in " + departmentName + ":");
            for (int i = 0; i < news.size(); i++) {
                System.out.println((i + 1) + ". " + news.get(i));
            }
        }
    }
}

