//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.28 at 01:39:09 PM MSK 
//


package com.cisco.cme.custom.xml;

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
 *         &lt;element ref="{cisco_cme_xml_namespace}all"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}busy"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}max-length"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}night-service-activated"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}noan"/>
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
    "all",
    "busy",
    "maxLength",
    "nightServiceActivated",
    "noan"
})
@XmlRootElement(name = "call-forward")
public class CallForward {

    @XmlElement(required = true)
    protected All all;
    @XmlElement(required = true)
    protected Busy busy;
    @XmlElement(name = "max-length", required = true)
    protected MaxLength maxLength;
    @XmlElement(name = "night-service-activated", required = true)
    protected NightServiceActivated nightServiceActivated;
    @XmlElement(required = true)
    protected Noan noan;

    /**
     * Gets the value of the all property.
     * 
     * @return
     *     possible object is
     *     {@link All }
     *     
     */
    public All getAll() {
        return all;
    }

    /**
     * Sets the value of the all property.
     * 
     * @param value
     *     allowed object is
     *     {@link All }
     *     
     */
    public void setAll(All value) {
        this.all = value;
    }

    /**
     * Gets the value of the busy property.
     * 
     * @return
     *     possible object is
     *     {@link Busy }
     *     
     */
    public Busy getBusy() {
        return busy;
    }

    /**
     * Sets the value of the busy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Busy }
     *     
     */
    public void setBusy(Busy value) {
        this.busy = value;
    }

    /**
     * Gets the value of the maxLength property.
     * 
     * @return
     *     possible object is
     *     {@link MaxLength }
     *     
     */
    public MaxLength getMaxLength() {
        return maxLength;
    }

    /**
     * Sets the value of the maxLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaxLength }
     *     
     */
    public void setMaxLength(MaxLength value) {
        this.maxLength = value;
    }

    /**
     * Gets the value of the nightServiceActivated property.
     * 
     * @return
     *     possible object is
     *     {@link NightServiceActivated }
     *     
     */
    public NightServiceActivated getNightServiceActivated() {
        return nightServiceActivated;
    }

    /**
     * Sets the value of the nightServiceActivated property.
     * 
     * @param value
     *     allowed object is
     *     {@link NightServiceActivated }
     *     
     */
    public void setNightServiceActivated(NightServiceActivated value) {
        this.nightServiceActivated = value;
    }

    /**
     * Gets the value of the noan property.
     * 
     * @return
     *     possible object is
     *     {@link Noan }
     *     
     */
    public Noan getNoan() {
        return noan;
    }

    /**
     * Sets the value of the noan property.
     * 
     * @param value
     *     allowed object is
     *     {@link Noan }
     *     
     */
    public void setNoan(Noan value) {
        this.noan = value;
    }

}
