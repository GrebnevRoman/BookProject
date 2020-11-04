package by.com.epam.comporator;

import by.com.epam.model.BookModel;

import java.util.Comparator;

public class AuthorComparator implements Comparator<BookModel> {
    @Override
    public int compare(BookModel firstBookModel, BookModel secondBookModel) {
        return firstBookModel.getBookAuthor().compareTo(secondBookModel.getBookAuthor());
    }
}
