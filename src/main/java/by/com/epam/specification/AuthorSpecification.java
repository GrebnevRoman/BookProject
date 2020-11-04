package by.com.epam.specification;

import by.com.epam.model.BookModel;

public class AuthorSpecification extends Specification {
    @Override
    boolean specified(BookModel bookModel, String value) {
        return bookModel.getBookAuthor().equals(value);
    }
}
