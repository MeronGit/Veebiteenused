
package ee.ttu.idu0075._2015.ws.library;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0075._2015.ws.library package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetBookResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/library", "getBookResponse");
    private final static QName _AddBookResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/library", "addBookResponse");
    private final static QName _GetLibraryResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/library", "getLibraryResponse");
    private final static QName _AddLibraryResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/library", "addLibraryResponse");
    private final static QName _GetLibraryBooksListResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/library", "getLibraryBooksListResponse");
    private final static QName _AddBookToLibraryResponse_QNAME = new QName("http://www.ttu.ee/idu0075/2015/ws/library", "addBookToLibraryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0075._2015.ws.library
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBookRequest }
     * 
     */
    public GetBookRequest createGetBookRequest() {
        return new GetBookRequest();
    }

    /**
     * Create an instance of {@link BookType }
     * 
     */
    public BookType createBookType() {
        return new BookType();
    }

    /**
     * Create an instance of {@link AddBookRequest }
     * 
     */
    public AddBookRequest createAddBookRequest() {
        return new AddBookRequest();
    }

    /**
     * Create an instance of {@link GetBookListRequest }
     * 
     */
    public GetBookListRequest createGetBookListRequest() {
        return new GetBookListRequest();
    }

    /**
     * Create an instance of {@link GetBookListResponse }
     * 
     */
    public GetBookListResponse createGetBookListResponse() {
        return new GetBookListResponse();
    }

    /**
     * Create an instance of {@link GetLibraryRequest }
     * 
     */
    public GetLibraryRequest createGetLibraryRequest() {
        return new GetLibraryRequest();
    }

    /**
     * Create an instance of {@link LibraryType }
     * 
     */
    public LibraryType createLibraryType() {
        return new LibraryType();
    }

    /**
     * Create an instance of {@link AddLibraryRequest }
     * 
     */
    public AddLibraryRequest createAddLibraryRequest() {
        return new AddLibraryRequest();
    }

    /**
     * Create an instance of {@link ListOfLibraryBooksType }
     * 
     */
    public ListOfLibraryBooksType createListOfLibraryBooksType() {
        return new ListOfLibraryBooksType();
    }

    /**
     * Create an instance of {@link GetListOfLibrariesRequest }
     * 
     */
    public GetListOfLibrariesRequest createGetListOfLibrariesRequest() {
        return new GetListOfLibrariesRequest();
    }

    /**
     * Create an instance of {@link GetListOfLibrariesResponse }
     * 
     */
    public GetListOfLibrariesResponse createGetListOfLibrariesResponse() {
        return new GetListOfLibrariesResponse();
    }

    /**
     * Create an instance of {@link GetLibraryBooksListRequest }
     * 
     */
    public GetLibraryBooksListRequest createGetLibraryBooksListRequest() {
        return new GetLibraryBooksListRequest();
    }

    /**
     * Create an instance of {@link AddBookToLibraryRequest }
     * 
     */
    public AddBookToLibraryRequest createAddBookToLibraryRequest() {
        return new AddBookToLibraryRequest();
    }

    /**
     * Create an instance of {@link LibraryBookType }
     * 
     */
    public LibraryBookType createLibraryBookType() {
        return new LibraryBookType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/library", name = "getBookResponse")
    public JAXBElement<BookType> createGetBookResponse(BookType value) {
        return new JAXBElement<BookType>(_GetBookResponse_QNAME, BookType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/library", name = "addBookResponse")
    public JAXBElement<BookType> createAddBookResponse(BookType value) {
        return new JAXBElement<BookType>(_AddBookResponse_QNAME, BookType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/library", name = "getLibraryResponse")
    public JAXBElement<LibraryType> createGetLibraryResponse(LibraryType value) {
        return new JAXBElement<LibraryType>(_GetLibraryResponse_QNAME, LibraryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/library", name = "addLibraryResponse")
    public JAXBElement<LibraryType> createAddLibraryResponse(LibraryType value) {
        return new JAXBElement<LibraryType>(_AddLibraryResponse_QNAME, LibraryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfLibraryBooksType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/library", name = "getLibraryBooksListResponse")
    public JAXBElement<ListOfLibraryBooksType> createGetLibraryBooksListResponse(ListOfLibraryBooksType value) {
        return new JAXBElement<ListOfLibraryBooksType>(_GetLibraryBooksListResponse_QNAME, ListOfLibraryBooksType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LibraryBookType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0075/2015/ws/library", name = "addBookToLibraryResponse")
    public JAXBElement<LibraryBookType> createAddBookToLibraryResponse(LibraryBookType value) {
        return new JAXBElement<LibraryBookType>(_AddBookToLibraryResponse_QNAME, LibraryBookType.class, null, value);
    }

}
