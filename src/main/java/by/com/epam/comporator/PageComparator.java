package by.com.epam.comporator;

import by.com.epam.model.BookModel;

import java.util.Comparator;

public class PageComparator implements Comparator<BookModel> {


    @Override
    public int compare(BookModel firstBookModel, BookModel secondBookModel) {
        return Integer.compare(firstBookModel.getBookPages(), secondBookModel.getBookPages());
    }
}
