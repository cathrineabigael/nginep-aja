
package com.nginepaja.peter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for houses complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="houses">
 *   &lt;complexContent>
 *     &lt;extension base="{http://peter.nginepaja.com/}myConnection">
 *       &lt;sequence>
 *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bathroom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="bedroom" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="electricalPower" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="houseId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="pricePerYear" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "houses", propOrder = {
    "address",
    "bathroom",
    "bedroom",
    "electricalPower",
    "houseId",
    "pricePerYear"
})
public class Houses
    extends MyConnection
{

    protected String address;
    protected int bathroom;
    protected int bedroom;
    protected int electricalPower;
    protected int houseId;
    protected int pricePerYear;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the bathroom property.
     * 
     */
    public int getBathroom() {
        return bathroom;
    }

    /**
     * Sets the value of the bathroom property.
     * 
     */
    public void setBathroom(int value) {
        this.bathroom = value;
    }

    /**
     * Gets the value of the bedroom property.
     * 
     */
    public int getBedroom() {
        return bedroom;
    }

    /**
     * Sets the value of the bedroom property.
     * 
     */
    public void setBedroom(int value) {
        this.bedroom = value;
    }

    /**
     * Gets the value of the electricalPower property.
     * 
     */
    public int getElectricalPower() {
        return electricalPower;
    }

    /**
     * Sets the value of the electricalPower property.
     * 
     */
    public void setElectricalPower(int value) {
        this.electricalPower = value;
    }

    /**
     * Gets the value of the houseId property.
     * 
     */
    public int getHouseId() {
        return houseId;
    }

    /**
     * Sets the value of the houseId property.
     * 
     */
    public void setHouseId(int value) {
        this.houseId = value;
    }

    /**
     * Gets the value of the pricePerYear property.
     * 
     */
    public int getPricePerYear() {
        return pricePerYear;
    }

    /**
     * Sets the value of the pricePerYear property.
     * 
     */
    public void setPricePerYear(int value) {
        this.pricePerYear = value;
    }

}
