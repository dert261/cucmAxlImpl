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
 *         &lt;element ref="{cisco_cme_xml_namespace}LineId"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ExtId"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ExtNumber"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ExtStatus" minOccurs="0"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}LineState"/>
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
    "lineId",
    "extId",
    "extNumber",
    "extStatus",
    "lineState"
})
@XmlRootElement(name = "ExtMapStatus")
public class ExtMapStatus {

    @XmlElement(name = "LineId", required = true)
    protected String lineId;
    @XmlElement(name = "ExtId", required = true)
    protected String extId;
    @XmlElement(name = "ExtNumber", required = true)
    protected String extNumber;
    @XmlElement(name = "ExtStatus")
    protected String extStatus;
    @XmlElement(name = "LineState", required = true)
    protected String lineState;

    /**
     * Gets the value of the lineId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineId() {
        return lineId;
    }

    /**
     * Sets the value of the lineId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineId(String value) {
        this.lineId = value;
    }

    /**
     * Gets the value of the extId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtId() {
        return extId;
    }

    /**
     * Sets the value of the extId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtId(String value) {
        this.extId = value;
    }

    /**
     * Gets the value of the extNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtNumber() {
        return extNumber;
    }

    /**
     * Sets the value of the extNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtNumber(String value) {
        this.extNumber = value;
    }

    /**
     * Gets the value of the extStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtStatus() {
        return extStatus;
    }

    /**
     * Sets the value of the extStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtStatus(String value) {
        this.extStatus = value;
    }

    /**
     * Gets the value of the lineState property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLineState() {
        return lineState;
    }

    /**
     * Sets the value of the lineState property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLineState(String value) {
        this.lineState = value;
    }

}
