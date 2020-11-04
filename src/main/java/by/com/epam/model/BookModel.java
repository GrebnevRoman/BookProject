package by.com.epam.model;

import java.util.Objects;

public class BookModel {
    private final String bookTitle;
    private final int bookYear;
    private final int bookPages;
    private final String bookAuthor;

    public BookModel(String bookTitle, String bookAuthor, int bookYear, int bookPages) {
        this.bookAuthor = bookAuthor;
        this.bookPages = bookPages;
        this.bookTitle = bookTitle;
        this.bookYear = bookYear;
    }

    public int getBookPages() { return bookPages; }

    public int getBookYear() {
        return bookYear;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getBookTitle() { return bookTitle; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookModel bookModel = (BookModel) o;
        return bookYear == bookModel.bookYear &&
                bookPages == bookModel.bookPages &&
                Objects.equals(bookTitle, bookModel.bookTitle) &&
                Objects.equals(bookAuthor, bookModel.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTitle, bookYear, bookPages, bookAuthor);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTitle='" + bookTitle + '\'' +
                ", bookYear=" + bookYear +
                ", bookPages=" + bookPages +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}

