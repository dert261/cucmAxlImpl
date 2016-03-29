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
 *         &lt;element ref="{cisco_cme_xml_namespace}ISVoiceRegDNID"/>
 *         &lt;sequence minOccurs="0">
 *           &lt;element ref="{cisco_cme_xml_namespace}ISExtNumber"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}ISSessionServerIDs"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}ISAllowWatch"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}firstName"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}lastName"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}ISSipDevList"/>
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
    "isVoiceRegDNID",
    "isExtNumber",
    "isSessionServerIDs",
    "isAllowWatch",
    "firstName",
    "lastName",
    "isSipDevList"
})
@XmlRootElement(name = "ISSipExtension")
public class ISSipExtension {

    @XmlElement(name = "ISVoiceRegDNID", required = true)
    protected String isVoiceRegDNID;
    @XmlElement(name = "ISExtNumber")
    protected String isExtNumber;
    @XmlElement(name = "ISSessionServerIDs")
    protected ISSessionServerIDs isSessionServerIDs;
    @XmlElement(name = "ISAllowWatch")
    protected String isAllowWatch;
    protected String firstName;
    protected String lastName;
    @XmlElement(name = "ISSipDevList")
    protected ISSipDevList isSipDevList;

    /**
     * Gets the value of the isVoiceRegDNID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISVoiceRegDNID() {
        return isVoiceRegDNID;
    }

    /**
     * Sets the value of the isVoiceRegDNID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISVoiceRegDNID(String value) {
        this.isVoiceRegDNID = value;
    }

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
     * Gets the value of the isSessionServerIDs property.
     * 
     * @return
     *     possible object is
     *     {@link ISSessionServerIDs }
     *     
     */
    public ISSessionServerIDs getISSessionServerIDs() {
        return isSessionServerIDs;
    }

    /**
     * Sets the value of the isSessionServerIDs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISSessionServerIDs }
     *     
     */
    public void setISSessionServerIDs(ISSessionServerIDs value) {
        this.isSessionServerIDs = value;
    }

    /**
     * Gets the value of the isAllowWatch property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISAllowWatch() {
        return isAllowWatch;
    }

    /**
     * Sets the value of the isAllowWatch property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISAllowWatch(String value) {
        this.isAllowWatch = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the isSipDevList property.
     * 
     * @return
     *     possible object is
     *     {@link ISSipDevList }
     *     
     */
    public ISSipDevList getISSipDevList() {
        return isSipDevList;
    }

    /**
     * Sets the value of the isSipDevList property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISSipDevList }
     *     
     */
    public void setISSipDevList(ISSipDevList value) {
        this.isSipDevList = value;
    }

}
