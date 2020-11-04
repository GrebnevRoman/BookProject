package by.com.epam.comporator;

import by.com.epam.model.BookModel;

import java.util.Comparator;

public class TitleComparator implements Comparator<BookModel> {
    @Override
    public int compare(BookModel firstBookModel, BookModel secondBookModel) {
        return firstBookModel.getBookTitle().compareTo(secondBookModel.getBookTitle());
    }
}
