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
 *         &lt;element ref="{cisco_cme_xml_namespace}ISSessionServerID"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISSessionServerName"/>
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
    "isSessionServerID",
    "isSessionServerName"
})
@XmlRootElement(name = "ISgetSessionServer")
public class ISgetSessionServer {

    @XmlElement(name = "ISKeyword")
    protected String isKeyword;
    @XmlElement(name = "ISSessionServerID")
    protected String isSessionServerID;
    @XmlElement(name = "ISSessionServerName")
    protected String isSessionServerName;

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
     * Gets the value of the isSessionServerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSessionServerID() {
        return isSessionServerID;
    }

    /**
     * Sets the value of the isSessionServerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSessionServerID(String value) {
        this.isSessionServerID = value;
    }

    /**
     * Gets the value of the isSessionServerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSessionServerName() {
        return isSessionServerName;
    }

    /**
     * Sets the value of the isSessionServerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSessionServerName(String value) {
        this.isSessionServerName = value;
    }

}