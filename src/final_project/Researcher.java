package final_project;

import java.text.Format;
import java.util.Comparator;

public interface Researcher {

    void conductResearch();
    // Метод для получения области исследования
    ResearchField getResearchField();


    void publishResearchPaper(ResearchPaper paper);

    void printPapers(Comparator<ResearchPaper> comparator);

    Integer calculateHIndex();


    String getCitation(Format format);
}


