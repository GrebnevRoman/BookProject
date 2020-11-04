package by.com.epam.specification;
import by.com.epam.model.BookTagType;

public class SpecificationFactory {
    public Specification createSpec(BookTagType param) {
        switch (param) {
            case PAGE -> {
                return new PageSpecification();
            }
            case YEAR -> {
                return new YearSpecification();
            }
            case TITLE -> {
                return new TitleSpecification();
            }
            case AUTHOR -> {
                return new AuthorSpecification();
            }
            default -> throw new IllegalArgumentException("Enter correct param" + param);
        }
    }
}
