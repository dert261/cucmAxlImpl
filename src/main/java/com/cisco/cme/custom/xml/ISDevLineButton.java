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
 *         &lt;element ref="{cisco_cme_xml_namespace}ISDevLineButtonID"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISDevLineButtonMode"/>
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
    "isDevLineButtonID",
    "isDevLineButtonMode"
})
@XmlRootElement(name = "ISDevLineButton")
public class ISDevLineButton {

    @XmlElement(name = "ISDevLineButtonID", required = true)
    protected String isDevLineButtonID;
    @XmlElement(name = "ISDevLineButtonMode", required = true)
    protected String isDevLineButtonMode;

    /**
     * Gets the value of the isDevLineButtonID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDevLineButtonID() {
        return isDevLineButtonID;
    }

    /**
     * Sets the value of the isDevLineButtonID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDevLineButtonID(String value) {
        this.isDevLineButtonID = value;
    }

    /**
     * Gets the value of the isDevLineButtonMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISDevLineButtonMode() {
        return isDevLineButtonMode;
    }

    /**
     * Sets the value of the isDevLineButtonMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISDevLineButtonMode(String value) {
        this.isDevLineButtonMode = value;
    }

}
