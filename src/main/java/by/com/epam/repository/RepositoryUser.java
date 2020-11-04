package by.com.epam.repository;


import by.com.epam.comporator.ComparatorFactory;
import by.com.epam.model.BookModel;
import by.com.epam.model.BookTagType;
import by.com.epam.specification.Specification;
import by.com.epam.specification.SpecificationFactory;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RepositoryUser implements BookRepository {
    private final List<BookModel> bookModels;

    public RepositoryUser() {
        bookModels = new ArrayList<BookModel>();
    }

    @Override
    public void addBook(BookModel bookModel) {
     bookModels.add(bookModel);
    }

    @Override
    public void removeBook(BookModel bookModel) throws RepositoryException {
        boolean result = bookModels.remove(bookModel);
        if(!result){
            throw new RepositoryException("Book does not exist");
        }
    }

    @Override
    public List<BookModel> searchBook(BookTagType tagType, String value) throws RepositoryException {
        SpecificationFactory factory = new SpecificationFactory();
        Specification specification = factory.createSpec(tagType);
        return specification.find(bookModels,value);
    }

    @Override
    public void sortBook(BookTagType tagType) {
        ComparatorFactory factory = new ComparatorFactory();
        Comparator comparator = factory.createSpec(tagType);
        bookModels.sort(comparator);
    }
}
