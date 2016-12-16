/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.library;

import ee.ttu.idu0075._2015.ws.library.AddBookRequest;
import ee.ttu.idu0075._2015.ws.library.AddBookToLibraryRequest;
import ee.ttu.idu0075._2015.ws.library.AddLibraryRequest;
import ee.ttu.idu0075._2015.ws.library.BookType;
import ee.ttu.idu0075._2015.ws.library.GetBookListRequest;
import ee.ttu.idu0075._2015.ws.library.GetBookListResponse;
import ee.ttu.idu0075._2015.ws.library.GetBookRequest;
import ee.ttu.idu0075._2015.ws.library.GetLibraryBooksListRequest;
import ee.ttu.idu0075._2015.ws.library.GetLibraryRequest;
import ee.ttu.idu0075._2015.ws.library.GetListOfLibrariesRequest;
import ee.ttu.idu0075._2015.ws.library.GetListOfLibrariesResponse;
import ee.ttu.idu0075._2015.ws.library.LibraryBookType;
import ee.ttu.idu0075._2015.ws.library.LibraryType;
import ee.ttu.idu0075._2015.ws.library.ListOfLibraryBooksType;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.jws.WebService;

/**
 * Veebiteenus, millega saab parida raamatukogust raamatuid. Saab lisada
 * raamatuid ja lisada raamatukogusid.
 *
 * @author Merli
 */
@WebService(serviceName = "LibraryService", portName = "LibraryPort", endpointInterface = "ee.ttu.idu0075._2015.ws.library.LibraryPortType", targetNamespace = "http://www.ttu.ee/idu0075/2015/ws/library", wsdlLocation = "WEB-INF/wsdl/LibraryWebService/LibraryService.wsdl")
public class LibraryWebService {

    static List<BookType> bookList = new ArrayList<>();
    static List<LibraryType> libraryList = new ArrayList<>();
    HashMap<Integer, Integer> addBookRequestHMap = new HashMap();
    HashMap<Integer, Integer> addLRequestHMap = new HashMap();

    static int nextBookId = 1;
    static int nextLibraryId = 1;
    //static int nextrequestId = 1;

    public BookType getBook(GetBookRequest parameter) {
        BookType book = null;
        if (parameter.getToken().equalsIgnoreCase("sal")) {
            for (int i = 0; i < bookList.size(); i++) {
                if (bookList.get(i).getId().equals(parameter.getId())) {
                    book = bookList.get(i);
                }
            }
        }
        return book;
    }

    public BookType addBook(AddBookRequest parameter) {
        BookType book = new BookType();
        if (parameter.getToken().equalsIgnoreCase("sal")) {
            book.setId(BigInteger.valueOf(nextBookId));
            int requestNumber = parameter.getRequestId().intValue();
            
            if ((!addBookRequestHMap.containsKey(nextBookId))
                    || (addBookRequestHMap.containsKey(nextBookId)
                    && addBookRequestHMap.get(nextBookId) != requestNumber)) {
                
                addBookRequestHMap.put(nextBookId++, requestNumber);
                book.setBookName(parameter.getName());
                book.setAuthor(parameter.getAuthor());
                book.setYear(parameter.getYear());
                bookList.add(book);
            }
        }
        return book;
    }

    public GetBookListResponse getBookList(GetBookListRequest parameter) {
        GetBookListResponse response = new GetBookListResponse();
        if (parameter.getToken().equalsIgnoreCase("sal")) {
            for (BookType book : bookList) {
                response.getBook().add(book);
            }
        }
        return response;
    }

    public LibraryType getLibrary(GetLibraryRequest parameter) {
        LibraryType requestedLibrary = null;
        if (parameter.getToken().equalsIgnoreCase("sal")) {
            for (int i = 0; i < libraryList.size(); i++) {
                if (libraryList.get(i).getLibraryId().equals(parameter.getLibraryId())) {
                    requestedLibrary = libraryList.get(i);
                }
            }
        }
        return requestedLibrary;
    }

    public LibraryType addLibrary(AddLibraryRequest parameter) {
        LibraryType library = new LibraryType();
        if (parameter.getToken().equalsIgnoreCase("sal")) {
            library.setLibraryId(BigInteger.valueOf(nextLibraryId++));
            library.setLibraryName(parameter.getLibraryName());
            library.setLibraryAddress(parameter.getLibraryAddress());
            library.setListOfLibraryBooks(new ListOfLibraryBooksType());
            libraryList.add(library);
        }
        return library;
    }

    public GetListOfLibrariesResponse getListOfLibraries(GetListOfLibrariesRequest parameter) {
        GetListOfLibrariesResponse libraries = new GetListOfLibrariesResponse();
        if (parameter.getToken().equalsIgnoreCase("sal")) {
            for (LibraryType library : libraryList) {
                //kas siia vaja if libraryList not null? 
                libraries.getLibrary().add(library);
            }
        }
        return libraries;
    }

    public ListOfLibraryBooksType getLibraryBooksList(GetLibraryBooksListRequest parameter) {
        ListOfLibraryBooksType librariesBooks = null;
        if (parameter.getToken().equalsIgnoreCase("sal")) {
            for (int i = 0; i < libraryList.size(); i++) {
                if (libraryList.get(i).getLibraryId().equals(parameter.getLibraryId())) {
                    librariesBooks = libraryList.get(i).getListOfLibraryBooks();
                }

            }
        }
        return librariesBooks;
    }

    public LibraryBookType addBookToLibrary(AddBookToLibraryRequest parameter) {
        LibraryBookType invoiceProduct = new LibraryBookType();
        if (parameter.getToken().equalsIgnoreCase("sal")) {
            GetBookRequest productRequest = new GetBookRequest();
            productRequest.setId(parameter.getBookId());
            productRequest.setToken(parameter.getToken());
            invoiceProduct.setBook(getBook(productRequest));

            for (int i = 0; i < libraryList.size(); i++) {
                if (libraryList.get(i).getLibraryId().equals(parameter.getLibraryId())) {
                    libraryList.get(i).getListOfLibraryBooks().getLibraryBooks().add(invoiceProduct);
                    invoiceProduct.setLibraryName(libraryList.get(i).getLibraryName());
                    return invoiceProduct;
                }
            }
        }
       
        return null;
    }
}
