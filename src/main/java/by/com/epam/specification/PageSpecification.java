package by.com.epam.specification;

import by.com.epam.model.BookModel;

public class PageSpecification extends Specification{

    @Override
    boolean specified(BookModel bookModel, String value) {
        return bookModel.getBookPages() == Integer.parseInt(value);
    }
}
