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
 *         &lt;element ref="{cisco_cme_xml_namespace}ISExtNumber"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISExtMode"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISExtOverlayGroup"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISExtCombo"/>
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
    "isExtNumber",
    "isExtMode",
    "isExtOverlayGroup",
    "isExtCombo"
})
@XmlRootElement(name = "UserNumber")
public class UserNumber {

    @XmlElement(name = "ISExtNumber", required = true)
    protected String isExtNumber;
    @XmlElement(name = "ISExtMode", required = true)
    protected String isExtMode;
    @XmlElement(name = "ISExtOverlayGroup", required = true)
    protected String isExtOverlayGroup;
    @XmlElement(name = "ISExtCombo", required = true)
    protected String isExtCombo;

    /**
     * Gets the value of the isExtNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISExtNumber() {
        return isExtNumber;
    }

    /**
     * Sets the value of the isExtNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISExtNumber(String value) {
        this.isExtNumber = value;
    }

    /**
     * Gets the value of the isExtMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISExtMode() {
        return isExtMode;
    }

    /**
     * Sets the value of the isExtMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISExtMode(String value) {
        this.isExtMode = value;
    }

    /**
     * Gets the value of the isExtOverlayGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISExtOverlayGroup() {
        return isExtOverlayGroup;
    }

    /**
     * Sets the value of the isExtOverlayGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISExtOverlayGroup(String value) {
        this.isExtOverlayGroup = value;
    }

    /**
     * Gets the value of the isExtCombo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISExtCombo() {
        return isExtCombo;
    }

    /**
     * Sets the value of the isExtCombo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISExtCombo(String value) {
        this.isExtCombo = value;
    }

}
