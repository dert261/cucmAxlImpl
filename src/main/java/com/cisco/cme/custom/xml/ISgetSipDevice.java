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
 *       &lt;choice>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISKeyword"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISPoolID"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISPoolName"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isKeyword",
    "isPoolID",
    "isPoolName"
})
@XmlRootElement(name = "ISgetSipDevice")
public class ISgetSipDevice {

    @XmlElement(name = "ISKeyword")
    protected String isKeyword;
    @XmlElement(name = "ISPoolID")
    protected String isPoolID;
    @XmlElement(name = "ISPoolName")
    protected String isPoolName;

    /**
     * Gets the value of the isKeyword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISKeyword() {
        return isKeyword;
    }

    /**
     * Sets the value of the isKeyword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISKeyword(String value) {
        this.isKeyword = value;
    }

    /**
     * Gets the value of the isPoolID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISPoolID() {
        return isPoolID;
    }

    /**
     * Sets the value of the isPoolID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISPoolID(String value) {
        this.isPoolID = value;
    }

    /**
     * Gets the value of the isPoolName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISPoolName() {
        return isPoolName;
    }

    /**
     * Sets the value of the isPoolName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISPoolName(String value) {
        this.isPoolName = value;
    }

}
