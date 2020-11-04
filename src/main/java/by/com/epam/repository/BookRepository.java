package by.com.epam.repository;

import by.com.epam.model.BookModel;
import by.com.epam.model.BookTagType;

import java.util.List;

public interface BookRepository {
    void addBook(BookModel bookModel);

    void removeBook(BookModel bookModel) throws RepositoryException;

    List<BookModel> searchBook(BookTagType param, String value) throws RepositoryException;

    void sortBook(BookTagType tagType);

}

