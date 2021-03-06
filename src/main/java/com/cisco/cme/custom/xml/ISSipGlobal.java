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
 *         &lt;element ref="{cisco_cme_xml_namespace}ISAddress"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISMode"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISVersion"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISAuthModes"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISPortNumber"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISMaxPool"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISMaxDN"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ISMaxRedirect"/>
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
    "isAddress",
    "isMode",
    "isVersion",
    "isAuthModes",
    "isPortNumber",
    "isMaxPool",
    "isMaxDN",
    "isMaxRedirect"
})
@XmlRootElement(name = "ISSipGlobal")
public class ISSipGlobal {

    @XmlElement(name = "ISAddress", required = true)
    protected String isAddress;
    @XmlElement(name = "ISMode", required = true)
    protected String isMode;
    @XmlElement(name = "ISVersion", required = true)
    protected String isVersion;
    @XmlElement(name = "ISAuthModes", required = true)
    protected ISAuthModes isAuthModes;
    @XmlElement(name = "ISPortNumber", required = true)
    protected String isPortNumber;
    @XmlElement(name = "ISMaxPool", required = true)
    protected String isMaxPool;
    @XmlElement(name = "ISMaxDN", required = true)
    protected String isMaxDN;
    @XmlElement(name = "ISMaxRedirect", required = true)
    protected String isMaxRedirect;

    /**
     * Gets the value of the isAddress property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISAddress() {
        return isAddress;
    }

    /**
     * Sets the value of the isAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISAddress(String value) {
        this.isAddress = value;
    }

    /**
     * Gets the value of the isMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISMode() {
        return isMode;
    }

    /**
     * Sets the value of the isMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISMode(String value) {
        this.isMode = value;
    }

    /**
     * Gets the value of the isVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISVersion() {
        return isVersion;
    }

    /**
     * Sets the value of the isVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISVersion(String value) {
        this.isVersion = value;
    }

    /**
     * Gets the value of the isAuthModes property.
     * 
     * @return
     *     possible object is
     *     {@link ISAuthModes }
     *     
     */
    public ISAuthModes getISAuthModes() {
        return isAuthModes;
    }

    /**
     * Sets the value of the isAuthModes property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISAuthModes }
     *     
     */
    public void setISAuthModes(ISAuthModes value) {
        this.isAuthModes = value;
    }

    /**
     * Gets the value of the isPortNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISPortNumber() {
        return isPortNumber;
    }

    /**
     * Sets the value of the isPortNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISPortNumber(String value) {
        this.isPortNumber = value;
    }

    /**
     * Gets the value of the isMaxPool property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISMaxPool() {
        return isMaxPool;
    }

    /**
     * Sets the value of the isMaxPool property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISMaxPool(String value) {
        this.isMaxPool = value;
    }

    /**
     * Gets the value of the isMaxDN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISMaxDN() {
        return isMaxDN;
    }

    /**
     * Sets the value of the isMaxDN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISMaxDN(String value) {
        this.isMaxDN = value;
    }

    /**
     * Gets the value of the isMaxRedirect property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISMaxRedirect() {
        return isMaxRedirect;
    }

    /**
     * Sets the value of the isMaxRedirect property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISMaxRedirect(String value) {
        this.isMaxRedirect = value;
    }

}
