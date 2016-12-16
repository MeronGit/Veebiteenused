
package ee.ttu.idu0075._2015.ws.library;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="token" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="requestId" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="libraryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="libraryAddress" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="listOfLibraryBooks" type="{http://www.ttu.ee/idu0075/2015/ws/library}listOfLibraryBooksType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "token",
    "requestId",
    "libraryName",
    "libraryAddress",
    "listOfLibraryBooks"
})
@XmlRootElement(name = "addLibraryRequest")
public class AddLibraryRequest {

    @XmlElement(required = true)
    protected String token;
    @XmlElement(required = true)
    protected BigInteger requestId;
    @XmlElement(required = true)
    protected String libraryName;
    @XmlElement(required = true)
    protected String libraryAddress;
    @XmlElement(required = true)
    protected ListOfLibraryBooksType listOfLibraryBooks;

    /**
     * Gets the value of the token property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToken() {
        return token;
    }

    /**
     * Sets the value of the token property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToken(String value) {
        this.token = value;
    }

    /**
     * Gets the value of the requestId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRequestId() {
        return requestId;
    }

    /**
     * Sets the value of the requestId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRequestId(BigInteger value) {
        this.requestId = value;
    }

    /**
     * Gets the value of the libraryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryName() {
        return libraryName;
    }

    /**
     * Sets the value of the libraryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryName(String value) {
        this.libraryName = value;
    }

    /**
     * Gets the value of the libraryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLibraryAddress() {
        return libraryAddress;
    }

    /**
     * Sets the value of the libraryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLibraryAddress(String value) {
        this.libraryAddress = value;
    }

    /**
     * Gets the value of the listOfLibraryBooks property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfLibraryBooksType }
     *     
     */
    public ListOfLibraryBooksType getListOfLibraryBooks() {
        return listOfLibraryBooks;
    }

    /**
     * Sets the value of the listOfLibraryBooks property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfLibraryBooksType }
     *     
     */
    public void setListOfLibraryBooks(ListOfLibraryBooksType value) {
        this.listOfLibraryBooks = value;
    }

}
