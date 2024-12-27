public class Book {

    private String bookTitle;
    private int publicationYear;
    private Author author;

    public Book() {

    }

    public Book(String bookTitle, int publicationYear, Author author) {
        this.bookTitle = bookTitle;
        this.publicationYear = publicationYear;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Название книги: " + bookTitle + ", год издания " + publicationYear + ", " + author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}

