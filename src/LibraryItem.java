public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
    }

    // Геттеры
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // Сеттеры
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int year) {
        this.publicationYear = year;
    }


    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + publicationYear;
    }

    // Абстрактный метод для получения типа предмета
    public abstract String getItemType();
}
