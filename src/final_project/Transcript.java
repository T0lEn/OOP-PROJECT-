package final_project;

import java.util.HashMap;
import java.util.Map;

class Transcript {
    private Map<Course, Mark> transcript;

    public Transcript() {
        this.transcript = new HashMap<>();
    }

    public Map<Course, Mark> getTranscript() {
        return transcript;
    }

    public void addMark(Course course, Mark mark) {
        transcript.put(course, mark);
    }
}
