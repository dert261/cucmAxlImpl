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
 *         &lt;element ref="{cisco_cme_xml_namespace}overlay"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}dir-lookup"/>
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
    "overlay",
    "dirLookup"
})
@XmlRootElement(name = "dnis")
public class Dnis {

    @XmlElement(required = true)
    protected String overlay;
    @XmlElement(name = "dir-lookup", required = true)
    protected String dirLookup;

    /**
     * Gets the value of the overlay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOverlay() {
        return overlay;
    }

    /**
     * Sets the value of the overlay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOverlay(String value) {
        this.overlay = value;
    }

    /**
     * Gets the value of the dirLookup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDirLookup() {
        return dirLookup;
    }

    /**
     * Sets the value of the dirLookup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDirLookup(String value) {
        this.dirLookup = value;
    }

}
