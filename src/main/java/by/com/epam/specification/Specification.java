package by.com.epam.specification;

import by.com.epam.repository.RepositoryException;
import by.com.epam.model.BookModel;

import java.util.ArrayList;
import java.util.List;

public abstract class Specification  {

    abstract boolean specified(BookModel bookModel, String value);

    public List<BookModel> find(List<BookModel> bookModels, String value) throws RepositoryException {
        List<BookModel> result = new ArrayList<>();
        for (BookModel bookModel : bookModels) {
            if (specified(bookModel, value)) {
                result.add(bookModel);
            }
        }
        if (result.size() > 0) {
            return result;
        } else throw new RepositoryException("Book does not exist");
    }
}


