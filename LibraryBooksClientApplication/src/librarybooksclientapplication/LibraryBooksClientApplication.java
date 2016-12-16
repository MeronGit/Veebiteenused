/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarybooksclientapplication;

import ee.ttu.idu0075._2015.ws.library.AddBookRequest;
import ee.ttu.idu0075._2015.ws.library.BookType;
import ee.ttu.idu0075._2015.ws.library.GetBookRequest;
import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author Merli
 */
public class LibraryBooksClientApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        AddBookRequest parameter = new AddBookRequest();
        GetBookRequest productQuery = new GetBookRequest();
        System.out.println("--------Add book>");
        System.out.println("What is your token? ");
        String token = input.next();
        System.out.println("RequestID? ");
        BigInteger requestId = input.nextBigInteger();
        System.out.println("Author of book: ");
        String author = input.next();
        System.out.println("Name of book: ");
        String name = input.next();
        System.out.println("Year of book: ");
        String year = input.next();

        parameter.setRequestId(requestId);
        parameter.setAuthor(author);
        parameter.setToken(token);
        parameter.setYear(Integer.parseInt(year));
        parameter.setName(name);
        addBook(parameter);

        System.out.println("Book added!");
        System.out.println("------Get book>");
        System.out.println("What is your token?");
        String token2 = input.next();
        System.out.println("What is the book ID?");
        BigInteger id = input.nextBigInteger();
        productQuery.setToken(token2);
        productQuery.setId(id);
        System.out.println("Results>");
        System.out.println("ID is> " + getBook(productQuery).getId());
        System.out.println("Name is> " + getBook(productQuery).getBookName());
    }

    private static BookType addBook(AddBookRequest parameter) {
        ee.ttu.idu0075._2015.ws.library.LibraryService service = new ee.ttu.idu0075._2015.ws.library.LibraryService();
        ee.ttu.idu0075._2015.ws.library.LibraryPortType port = service.getLibraryPort();
        return port.addBook(parameter);
    }

    private static BookType getBook(GetBookRequest parameter) {
        ee.ttu.idu0075._2015.ws.library.LibraryService service = new ee.ttu.idu0075._2015.ws.library.LibraryService();
        ee.ttu.idu0075._2015.ws.library.LibraryPortType port = service.getLibraryPort();
        return port.getBook(parameter);
    }

}
