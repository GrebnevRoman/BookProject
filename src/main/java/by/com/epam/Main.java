package by.com.epam;

import by.com.epam.model.*;
import by.com.epam.comporator.*;

import by.com.epam.repository.RepositoryException;
import by.com.epam.repository.RepositoryUser;
import org.apache.log4j.Logger;
import by.com.epam.model.BookModel;

import java.awt.print.Book;
import java.util.List;


public class Main {
    private final static Logger LOGGER = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            process();
        } catch (RepositoryException e) {
            LOGGER.error(e.getMessage(), e);
        }

    }

    private static void process() throws RepositoryException {
        LOGGER.info("Start process");
        String authorForSearch = "Blinov";
        BookModel firstBook = new BookModel("Ruka","Telo",2991,900);
        BookModel secondBook = new BookModel("Java", "Blinov", 2007, 700);
        BookModel thirdBook = new BookModel("LearnJava", "HeadFirst", 2012, 800);
        RepositoryUser repositoryUser = new RepositoryUser();
        LOGGER.info("Books adding");
        repositoryUser.addBook(firstBook);
        repositoryUser.addBook(secondBook);
        repositoryUser.addBook(thirdBook);
        LOGGER.info("Books removing");
        repositoryUser.removeBook(firstBook);
        repositoryUser.sortBook(BookTagType.PAGE);
        List<BookModel> searchedBooks =  repositoryUser.searchBook(BookTagType.AUTHOR,"Blinov");
    }

}
