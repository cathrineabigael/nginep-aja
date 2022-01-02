
package com.nginepaja.peter;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.nginepaja.peter package. 
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

    private final static QName _ShowHouses_QNAME = new QName("http://peter.nginepaja.com/", "showHouses");
    private final static QName _ShowBooking_QNAME = new QName("http://peter.nginepaja.com/", "showBooking");
    private final static QName _Book_QNAME = new QName("http://peter.nginepaja.com/", "book");
    private final static QName _BookResponse_QNAME = new QName("http://peter.nginepaja.com/", "bookResponse");
    private final static QName _ShowHouse_QNAME = new QName("http://peter.nginepaja.com/", "showHouse");
    private final static QName _ShowHouseResponse_QNAME = new QName("http://peter.nginepaja.com/", "showHouseResponse");
    private final static QName _InsertChatResponse_QNAME = new QName("http://peter.nginepaja.com/", "insertChatResponse");
    private final static QName _ShowBookingResponse_QNAME = new QName("http://peter.nginepaja.com/", "showBookingResponse");
    private final static QName _InsertChat_QNAME = new QName("http://peter.nginepaja.com/", "insertChat");
    private final static QName _ShowHousesResponse_QNAME = new QName("http://peter.nginepaja.com/", "showHousesResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.nginepaja.peter
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShowBooking }
     * 
     */
    public ShowBooking createShowBooking() {
        return new ShowBooking();
    }

    /**
     * Create an instance of {@link ShowHouses }
     * 
     */
    public ShowHouses createShowHouses() {
        return new ShowHouses();
    }

    /**
     * Create an instance of {@link BookResponse }
     * 
     */
    public BookResponse createBookResponse() {
        return new BookResponse();
    }

    /**
     * Create an instance of {@link ShowHouse }
     * 
     */
    public ShowHouse createShowHouse() {
        return new ShowHouse();
    }

    /**
     * Create an instance of {@link ShowHouseResponse }
     * 
     */
    public ShowHouseResponse createShowHouseResponse() {
        return new ShowHouseResponse();
    }

    /**
     * Create an instance of {@link Book }
     * 
     */
    public Book createBook() {
        return new Book();
    }

    /**
     * Create an instance of {@link InsertChatResponse }
     * 
     */
    public InsertChatResponse createInsertChatResponse() {
        return new InsertChatResponse();
    }

    /**
     * Create an instance of {@link ShowBookingResponse }
     * 
     */
    public ShowBookingResponse createShowBookingResponse() {
        return new ShowBookingResponse();
    }

    /**
     * Create an instance of {@link InsertChat }
     * 
     */
    public InsertChat createInsertChat() {
        return new InsertChat();
    }

    /**
     * Create an instance of {@link ShowHousesResponse }
     * 
     */
    public ShowHousesResponse createShowHousesResponse() {
        return new ShowHousesResponse();
    }

    /**
     * Create an instance of {@link Users }
     * 
     */
    public Users createUsers() {
        return new Users();
    }

    /**
     * Create an instance of {@link Houses }
     * 
     */
    public Houses createHouses() {
        return new Houses();
    }

    /**
     * Create an instance of {@link MyConnection }
     * 
     */
    public MyConnection createMyConnection() {
        return new MyConnection();
    }

    /**
     * Create an instance of {@link Bookings }
     * 
     */
    public Bookings createBookings() {
        return new Bookings();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowHouses }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "showHouses")
    public JAXBElement<ShowHouses> createShowHouses(ShowHouses value) {
        return new JAXBElement<ShowHouses>(_ShowHouses_QNAME, ShowHouses.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowBooking }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "showBooking")
    public JAXBElement<ShowBooking> createShowBooking(ShowBooking value) {
        return new JAXBElement<ShowBooking>(_ShowBooking_QNAME, ShowBooking.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Book }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "book")
    public JAXBElement<Book> createBook(Book value) {
        return new JAXBElement<Book>(_Book_QNAME, Book.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BookResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "bookResponse")
    public JAXBElement<BookResponse> createBookResponse(BookResponse value) {
        return new JAXBElement<BookResponse>(_BookResponse_QNAME, BookResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowHouse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "showHouse")
    public JAXBElement<ShowHouse> createShowHouse(ShowHouse value) {
        return new JAXBElement<ShowHouse>(_ShowHouse_QNAME, ShowHouse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowHouseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "showHouseResponse")
    public JAXBElement<ShowHouseResponse> createShowHouseResponse(ShowHouseResponse value) {
        return new JAXBElement<ShowHouseResponse>(_ShowHouseResponse_QNAME, ShowHouseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertChatResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "insertChatResponse")
    public JAXBElement<InsertChatResponse> createInsertChatResponse(InsertChatResponse value) {
        return new JAXBElement<InsertChatResponse>(_InsertChatResponse_QNAME, InsertChatResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowBookingResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "showBookingResponse")
    public JAXBElement<ShowBookingResponse> createShowBookingResponse(ShowBookingResponse value) {
        return new JAXBElement<ShowBookingResponse>(_ShowBookingResponse_QNAME, ShowBookingResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertChat }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "insertChat")
    public JAXBElement<InsertChat> createInsertChat(InsertChat value) {
        return new JAXBElement<InsertChat>(_InsertChat_QNAME, InsertChat.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ShowHousesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://peter.nginepaja.com/", name = "showHousesResponse")
    public JAXBElement<ShowHousesResponse> createShowHousesResponse(ShowHousesResponse value) {
        return new JAXBElement<ShowHousesResponse>(_ShowHousesResponse_QNAME, ShowHousesResponse.class, null, value);
    }

}
