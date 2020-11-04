package by.com.epam.specification;

import by.com.epam.model.BookModel;

public class TitleSpecification extends Specification {
    @Override
    boolean specified(BookModel bookModel, String value) {
        return bookModel.getBookTitle().equals(value);
    }
}
