package by.com.epam.specification;

import by.com.epam.model.BookModel;

public class YearSpecification extends Specification {


    @Override
    boolean specified(BookModel bookModel, String value) {
        return bookModel.getBookYear() == Integer.parseInt(value) ;
    }
}
