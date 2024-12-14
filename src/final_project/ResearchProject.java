package final_project;


import java.util.ArrayList;
import java.util.List;

public class ResearchProject {

    private String topic;
    private List<ResearchPaper> publishedPapers;
    private List<Researcher> participants;


    public ResearchProject(String topic) {
        this.topic = topic;
        this.publishedPapers = new ArrayList<>();
        this.participants = new ArrayList<>();
    }


    public String getTopic() {
        return topic;
    }


    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void addParticipant(Researcher researcher) {
        if (!participants.contains(researcher)) {
            participants.add(researcher);
            System.out.println(researcher.getResearchField());
        } else {
            System.out.println("Researcher is already a participant.");
        }
    }


    public void removeParticipant(Researcher researcher) {
        if (participants.contains(researcher)) {
            participants.remove(researcher);
            System.out.println(researcher.getResearchField());
        } else {
            System.out.println("Researcher is not a participant.");
        }
    }

    public void publishPapers() {
        System.out.println("Publishing papers for project: " + topic);
        for (Researcher researcher : participants) {
            ResearchPaper newPaper = new ResearchPaper(
                    "Research on " + topic,
                    List.of("Author: " + researcher.getResearchField()),
                    2024,
                    "Journal of Science",
                    "Results of research on " + topic,
                    10,
                    "10.1234/doi" + Math.random(),
                    0
            );
            publishedPapers.add(newPaper);
            System.out.println("Paper published: " + newPaper.getTitle());
        }
    }


    public void printPublishedPapers() {
        System.out.println("Published Papers for Project: " + topic);
        for (ResearchPaper paper : publishedPapers) {
            System.out.println(paper);
        }
    }
}


