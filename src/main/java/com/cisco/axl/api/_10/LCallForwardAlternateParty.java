
package com.cisco.axl.api._10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LCallForwardAlternateParty complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LCallForwardAlternateParty">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="forwardToVoiceMail" type="{http://www.cisco.com/AXL/API/10.0}boolean" minOccurs="0"/>
 *         &lt;element name="callingSearchSpaceName" type="{http://www.cisco.com/AXL/API/10.0}XFkType" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://www.cisco.com/AXL/API/10.0}String50" minOccurs="0"/>
 *         &lt;element name="duration" type="{http://www.cisco.com/AXL/API/10.0}XInteger" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LCallForwardAlternateParty", propOrder = {
    "forwardToVoiceMail",
    "callingSearchSpaceName",
    "destination",
    "duration"
})
public class LCallForwardAlternateParty {

    protected String forwardToVoiceMail;
    protected XFkType callingSearchSpaceName;
    protected String destination;
    @XmlSchemaType(name = "anySimpleType")
    protected String duration;

    /**
     * Gets the value of the forwardToVoiceMail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getForwardToVoiceMail() {
        return forwardToVoiceMail;
    }

    /**
     * Sets the value of the forwardToVoiceMail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setForwardToVoiceMail(String value) {
        this.forwardToVoiceMail = value;
    }

    /**
     * Gets the value of the callingSearchSpaceName property.
     * 
     * @return
     *     possible object is
     *     {@link XFkType }
     *     
     */
    public XFkType getCallingSearchSpaceName() {
        return callingSearchSpaceName;
    }

    /**
     * Sets the value of the callingSearchSpaceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link XFkType }
     *     
     */
    public void setCallingSearchSpaceName(XFkType value) {
        this.callingSearchSpaceName = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

}