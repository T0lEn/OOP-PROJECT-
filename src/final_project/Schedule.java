package final_project;


import java.util.Date;
import java.util.List;

public class Schedule {
    private String id;
    private Date time;
    private List<Course> subjects;

    public Schedule(String id, Date time, List<Course> subjects) {
        this.id = id;
        this.time = time;
        this.subjects = subjects;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public List<Course> getSubjects() {
        return subjects;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "id='" + id + '\'' +
                ", time=" + time +
                ", subjects=" + subjects +
                '}';
    }
}

