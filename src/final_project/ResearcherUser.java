package final_project;

import java.text.Format;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ResearcherUser extends User implements Researcher {
    private ResearchField researchField;
    private List<ResearchPaper> publishedPapers;

    public ResearcherUser(String userName, String password, int id, String email, boolean isActive, UserRole role, ResearchField researchField) {
        super(userName, password, id, email, isActive, role);
        this.researchField = researchField;
        this.publishedPapers = new ArrayList<>();
    }

    @Override
    public void conductResearch() {
        System.out.println("Conducting research in the field of " + researchField + "...");
    }

    @Override
    public ResearchField getResearchField() {
        return researchField;
    }

    @Override
    public void publishResearchPaper(ResearchPaper paper) {
        if (paper != null) {
            publishedPapers.add(paper);
            System.out.println("Research paper published: " + paper.getTitle());
        } else {
            System.out.println("Cannot publish a null paper.");
        }
    }

    @Override
    public void printPapers(Comparator<ResearchPaper> comparator) {
        if (publishedPapers.isEmpty()) {
            System.out.println("No papers published yet.");
        } else {
            publishedPapers.stream().sorted(comparator).forEach(System.out::println);
        }
    }

    @Override
    public Integer calculateHIndex() {
        // Placeholder for H-index calculation logic
        System.out.println("Calculating H-index...");
        return publishedPapers.size();
    }

    @Override
    public String getCitation(Format format) {
        return "";
    }

    @Override
    public String toString() {
        return "ResearcherUser{" +
                "userName='" + getUserName() + '\'' +
                ", researchField=" + researchField +
                ", publishedPapers=" + publishedPapers.size() +
                '}';
    }
}
