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
 *         &lt;element ref="{cisco_cme_xml_namespace}ISSessionServerID"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{cisco_cme_xml_namespace}ISSessionRegisterID"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}ISSessionKeepAlives"/>
 *         &lt;/sequence>
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
    "isSessionServerID",
    "isSessionRegisterID",
    "isSessionKeepAlives"
})
@XmlRootElement(name = "ISSessionServer")
public class ISSessionServer {

    @XmlElement(name = "ISSessionServerID", required = true)
    protected String isSessionServerID;
    @XmlElement(name = "ISSessionRegisterID")
    protected String isSessionRegisterID;
    @XmlElement(name = "ISSessionKeepAlives")
    protected String isSessionKeepAlives;

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
     * Gets the value of the isSessionRegisterID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSessionRegisterID() {
        return isSessionRegisterID;
    }

    /**
     * Sets the value of the isSessionRegisterID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSessionRegisterID(String value) {
        this.isSessionRegisterID = value;
    }

    /**
     * Gets the value of the isSessionKeepAlives property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISSessionKeepAlives() {
        return isSessionKeepAlives;
    }

    /**
     * Sets the value of the isSessionKeepAlives property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISSessionKeepAlives(String value) {
        this.isSessionKeepAlives = value;
    }

}
