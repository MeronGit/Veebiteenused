
package ee.ttu.idu0075._2015.ws.library;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for libraryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="libraryType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="libraryId" type="{http://www.w3.org/2001/XMLSchema}integer"/&gt;
 *         &lt;element name="libraryName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="libraryAddress" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="listOfLibraryBooks" type="{http://www.ttu.ee/idu0075/2015/ws/library}listOfLibraryBooksType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "libraryType", propOrder = {
    "libraryId",
    "libraryName",
    "libraryAddress",
    "listOfLibraryBooks"
})
public class LibraryType {

    @XmlElement(required = true)
    protected BigInteger libraryId;
    @XmlElement(required = true)
    protected String libraryName;
    @XmlElement(required = true)
    protected String libraryAddress;
    @XmlElement(required = true)
    protected ListOfLibraryBooksType listOfLibraryBooks;

    /**
     * Gets the value of the libraryId property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLibraryId() {
        return libraryId;
    }

    /**
     * Sets the value of the libraryId property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLibraryId(BigInteger value) {
        this.libraryId = value;
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
