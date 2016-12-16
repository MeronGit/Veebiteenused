/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.library;

import ee.ttu.idu0075._2015.ws.library.AddBookRequest;
import ee.ttu.idu0075._2015.ws.library.BookType;
import ee.ttu.idu0075._2015.ws.library.GetBookListRequest;
import ee.ttu.idu0075._2015.ws.library.GetBookListResponse;
import ee.ttu.idu0075._2015.ws.library.GetBookRequest;
import java.math.BigInteger;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

/**
 * REST Web Service
 *
 * @author Merli
 */
@Path("books")
public class BooksResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of BooksResource
     */
    @GET
    @Produces("application/json")
    public GetBookListResponse getBookList(@QueryParam("token") String token) {
        LibraryWebService ws = new LibraryWebService();
        GetBookListRequest request = new GetBookListRequest();
        request.setToken(token);
        return ws.getBookList(request);
    }

    /**
     * Retrieves representation of an instance of ee.ttu.idu0075.library.BooksResource
     * @return an instance of ee.ttu.idu0075._2015.ws.library.BookType
     */
   @GET
    @Path("{id : \\d+}") //supports digits only
    @Produces("application/json")
    public BookType getBook(@PathParam("id") String id,
            @QueryParam("token") String token) {
        LibraryWebService ws = new LibraryWebService();
        GetBookRequest request = new GetBookRequest();
        request.setId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getBook(request);
    }

    /**
     * PUT method for updating or creating an instance of BooksResource
     * @param content representation for the resource
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public BookType addBook(BookType content, 
                                @QueryParam("token") String token) {
        LibraryWebService ws = new LibraryWebService();
        AddBookRequest request = new AddBookRequest();
        request.setAuthor(content.getAuthor());
        request.setName(content.getBookName());
        request.setToken(token);
        request.setYear(content.getYear());
        return ws.addBook(request);
    }
}
