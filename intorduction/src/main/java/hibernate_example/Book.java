package hibernate_example;

import java.text.MessageFormat;

/**
 * POJO to contain information of books.
 *
 * It follows the JavaBeans convention with the private fields and getters and setters for those fields.
 *
 * The no-argument constructor is a JavaBean convention too -- however it is a requirement for persistent classes because Hibernate uses the
 * Java Reflection API to construct the objects.
 *
 * @author GHajba
 *
 */
public class Book {

    private String isbn;
    private String title;
    private String author;

    private Book() {
    }

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    @Override
    public String toString() {
        return MessageFormat.format("{0} by {1} (ISBN: {2})", this.title, this.author, this.isbn);
    }
}
