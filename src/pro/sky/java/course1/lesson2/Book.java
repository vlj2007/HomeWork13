package pro.sky.java.course1.lesson2;
import java.util.Objects;
public class Book {
    private String bookTitle;
    private Author bookAuthor;
    private int bookPublicationYear;

    public Book(String bookTitle, Author bookAuthor, int bookPublicationYear) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookPublicationYear = bookPublicationYear;
    }

    public String getBookTitle() {
        return this.bookTitle;
    }

    public Author getBookAuthor() {
        return this.bookAuthor;
    }

    public void getBookAuthor(Author bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getBookPublicationYear() {
        return this.bookPublicationYear;
    }

    public void setBookPublicationYear(int bookPublicationYear) {
        this.bookPublicationYear = bookPublicationYear;
    }

    public String toString() {
        return "\tНазвание книги \"" + this.bookTitle + "\"\n\tавтор книги \"" + bookAuthor + "\"\n\tдата публикации " + this.bookPublicationYear;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookPublicationYear == book.bookPublicationYear && Objects.equals(bookTitle, book.bookTitle) && Objects.equals(bookAuthor, book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookAuthor, bookPublicationYear);
    }
}
