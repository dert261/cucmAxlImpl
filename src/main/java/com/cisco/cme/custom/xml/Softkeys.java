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
 *         &lt;element ref="{cisco_cme_xml_namespace}alerting_keys"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}connected_keys"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}hold_keys"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}idle_keys"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}remote-in-use_keys"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ringing_keys"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}seized_keys"/>
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
    "alertingKeys",
    "connectedKeys",
    "holdKeys",
    "idleKeys",
    "remoteInUseKeys",
    "ringingKeys",
    "seizedKeys"
})
@XmlRootElement(name = "softkeys")
public class Softkeys {

    @XmlElement(name = "alerting_keys", required = true)
    protected String alertingKeys;
    @XmlElement(name = "connected_keys", required = true)
    protected String connectedKeys;
    @XmlElement(name = "hold_keys", required = true)
    protected String holdKeys;
    @XmlElement(name = "idle_keys", required = true)
    protected String idleKeys;
    @XmlElement(name = "remote-in-use_keys", required = true)
    protected String remoteInUseKeys;
    @XmlElement(name = "ringing_keys", required = true)
    protected String ringingKeys;
    @XmlElement(name = "seized_keys", required = true)
    protected String seizedKeys;

    /**
     * Gets the value of the alertingKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlertingKeys() {
        return alertingKeys;
    }

    /**
     * Sets the value of the alertingKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlertingKeys(String value) {
        this.alertingKeys = value;
    }

    /**
     * Gets the value of the connectedKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConnectedKeys() {
        return connectedKeys;
    }

    /**
     * Sets the value of the connectedKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConnectedKeys(String value) {
        this.connectedKeys = value;
    }

    /**
     * Gets the value of the holdKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHoldKeys() {
        return holdKeys;
    }

    /**
     * Sets the value of the holdKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoldKeys(String value) {
        this.holdKeys = value;
    }

    /**
     * Gets the value of the idleKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdleKeys() {
        return idleKeys;
    }

    /**
     * Sets the value of the idleKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdleKeys(String value) {
        this.idleKeys = value;
    }

    /**
     * Gets the value of the remoteInUseKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemoteInUseKeys() {
        return remoteInUseKeys;
    }

    /**
     * Sets the value of the remoteInUseKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemoteInUseKeys(String value) {
        this.remoteInUseKeys = value;
    }

    /**
     * Gets the value of the ringingKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRingingKeys() {
        return ringingKeys;
    }

    /**
     * Sets the value of the ringingKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRingingKeys(String value) {
        this.ringingKeys = value;
    }

    /**
     * Gets the value of the seizedKeys property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeizedKeys() {
        return seizedKeys;
    }

    /**
     * Sets the value of the seizedKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeizedKeys(String value) {
        this.seizedKeys = value;
    }

}