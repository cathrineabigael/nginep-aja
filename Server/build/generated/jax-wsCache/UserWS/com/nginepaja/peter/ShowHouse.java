
package com.nginepaja.peter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for showHouse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="showHouse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="houseId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "showHouse", propOrder = {
    "houseId"
})
public class ShowHouse {

    protected int houseId;

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

}
