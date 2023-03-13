public class Book {
    private final String nameBook;
    private final Author nameAuthor;
    private int publishingYear;

    public Book(String nameBook, Author nameAuthor, int publishingYear) {
        this.nameBook = nameBook;
        this.nameAuthor = nameAuthor;
        this.publishingYear = publishingYear;
    }

    public String getNameBook() {
        return this.nameBook;
    }

    public Author getNameAuthor() {
        return this.nameAuthor;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }
}
