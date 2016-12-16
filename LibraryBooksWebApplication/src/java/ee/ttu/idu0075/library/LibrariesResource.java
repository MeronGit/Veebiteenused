/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ee.ttu.idu0075.library;

import ee.ttu.idu0075._2015.ws.library.AddBookToLibraryRequest;
import ee.ttu.idu0075._2015.ws.library.AddLibraryRequest;
import ee.ttu.idu0075._2015.ws.library.GetLibraryBooksListRequest;
import ee.ttu.idu0075._2015.ws.library.GetLibraryRequest;
import ee.ttu.idu0075._2015.ws.library.GetListOfLibrariesRequest;
import ee.ttu.idu0075._2015.ws.library.GetListOfLibrariesResponse;
import ee.ttu.idu0075._2015.ws.library.LibraryBookType;
import ee.ttu.idu0075._2015.ws.library.LibraryType;
import ee.ttu.idu0075._2015.ws.library.ListOfLibraryBooksType;
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
@Path("libraries")
public class LibrariesResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LibrariesResource
     */
    public LibrariesResource() {
    }

    /**
     * Retrieves representation of an instance of
     * ee.ttu.idu0075.library.LibrariesResource
     *
     * @return an instance of ee.ttu.idu0075._2015.ws.library.LibraryType
     */
    @GET
    @Produces("application/json")
    public GetListOfLibrariesResponse getListOfLibraries(@QueryParam("token") String token,
            @QueryParam("books") String hasRelatedProducts) {
        LibraryWebService ws = new LibraryWebService();
        GetListOfLibrariesRequest request = new GetListOfLibrariesRequest();
        request.setToken(token);
        return ws.getListOfLibraries(request);
    }

    @GET
    @Path("{id : \\d+}") //support digit only
    @Produces("application/json")
    public LibraryType getLibrary(@PathParam("id") String id,
            @QueryParam("token") String token) {
        LibraryWebService ws = new LibraryWebService();
        GetLibraryRequest request = new GetLibraryRequest();
        request.setLibraryId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getLibrary(request);
    }

    /**
     *
     * @param content
     * @param token
     * @return
     */
    @POST
    @Consumes("application/json")
    @Produces("application/json")
    public LibraryType addLibrary(LibraryType content,
            @QueryParam("token") String token) {
        LibraryWebService ws = new LibraryWebService();
        AddLibraryRequest request = new AddLibraryRequest();
        request.setToken(token);
        request.setLibraryName(content.getLibraryName());
        request.setLibraryAddress(content.getLibraryAddress());
        //request.setListOfLibraryBooks(content.getListOfLibraryBooks());
        return ws.addLibrary(request);
    }

    @GET
    @Path("{id : \\d+}/books") //support digit only ///...
    @Produces("application/json")
    public ListOfLibraryBooksType getLibraryBooksList(@PathParam("id") String id,
            @QueryParam("token") String token) {
        LibraryWebService ws = new LibraryWebService();
        GetLibraryBooksListRequest request = new GetLibraryBooksListRequest();
        request.setLibraryId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setToken(token);
        return ws.getLibraryBooksList(request);
    }

    @POST
    @Path("{id : \\d+}/products") //support digit only
    @Consumes("application/json")
    @Produces("application/json")
    public LibraryBookType addBookToLibrary(AddBookToLibraryRequest content,
            @QueryParam("token") String token,
            @PathParam("id") String id) {
        LibraryWebService ws = new LibraryWebService();
        AddBookToLibraryRequest request = new AddBookToLibraryRequest();
        request.setToken(token);
        request.setLibraryId(BigInteger.valueOf(Integer.parseInt(id)));
        request.setBookId(content.getBookId());
        return ws.addBookToLibrary(request);
    }
}
