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
 *         &lt;element ref="{cisco_cme_xml_namespace}dn-plar"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}barge-in"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}label"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}no-mute"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}ptt"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}no-auto-answer"/>
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
    "dnPlar",
    "bargeIn",
    "label",
    "noMute",
    "ptt",
    "noAutoAnswer"
})
@XmlRootElement(name = "intercom")
public class Intercom {

    @XmlElement(name = "dn-plar", required = true)
    protected String dnPlar;
    @XmlElement(name = "barge-in", required = true)
    protected String bargeIn;
    @XmlElement(required = true)
    protected String label;
    @XmlElement(name = "no-mute", required = true)
    protected String noMute;
    @XmlElement(required = true)
    protected String ptt;
    @XmlElement(name = "no-auto-answer", required = true)
    protected String noAutoAnswer;

    /**
     * Gets the value of the dnPlar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDnPlar() {
        return dnPlar;
    }

    /**
     * Sets the value of the dnPlar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDnPlar(String value) {
        this.dnPlar = value;
    }

    /**
     * Gets the value of the bargeIn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBargeIn() {
        return bargeIn;
    }

    /**
     * Sets the value of the bargeIn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBargeIn(String value) {
        this.bargeIn = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the noMute property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoMute() {
        return noMute;
    }

    /**
     * Sets the value of the noMute property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoMute(String value) {
        this.noMute = value;
    }

    /**
     * Gets the value of the ptt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPtt() {
        return ptt;
    }

    /**
     * Sets the value of the ptt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPtt(String value) {
        this.ptt = value;
    }

    /**
     * Gets the value of the noAutoAnswer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoAutoAnswer() {
        return noAutoAnswer;
    }

    /**
     * Sets the value of the noAutoAnswer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoAutoAnswer(String value) {
        this.noAutoAnswer = value;
    }

}
