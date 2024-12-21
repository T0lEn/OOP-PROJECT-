package final_project;


import java.util.List;

public class ResearchPaper {
    private String title;
    private List<String> authors;
    private Integer year;
    private String journal;
    private String annotation;
    private Integer pages;
    private String doi;


    public ResearchPaper(String title, List<String> authors, Integer year, String journal,
                         String annotation, Integer pages, String doi) {
        this.title = title;
        this.authors = authors;
        this.year = year;
        this.journal = journal;
        this.annotation = annotation;
        this.pages = pages;
        this.doi = doi;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getAnnotation() {
        return annotation;
    }

    public void setAnnotation(String annotation) {
        this.annotation = annotation;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getDoi() {
        return doi;
    }

    public void setDoi(String doi) {
        this.doi = doi;
    }

    @Override
    public String toString() {
        return "ResearchPaper:" +
                "title:" + title +
                "authors:" + authors +
                "year:" + year +
                "journal:" + journal +
                "annotation:" + annotation +
                "pages:" + pages +
                "doi:" + doi;
    }
}