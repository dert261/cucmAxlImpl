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
 *         &lt;element ref="{cisco_cme_xml_namespace}mute-on"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}mute-off"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}hardware"/>
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
    "muteOn",
    "muteOff",
    "hardware"
})
@XmlRootElement(name = "conference_options")
public class ConferenceOptions {

    @XmlElement(name = "mute-on", required = true)
    protected String muteOn;
    @XmlElement(name = "mute-off", required = true)
    protected String muteOff;
    @XmlElement(required = true)
    protected String hardware;

    /**
     * Gets the value of the muteOn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuteOn() {
        return muteOn;
    }

    /**
     * Sets the value of the muteOn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuteOn(String value) {
        this.muteOn = value;
    }

    /**
     * Gets the value of the muteOff property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMuteOff() {
        return muteOff;
    }

    /**
     * Sets the value of the muteOff property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMuteOff(String value) {
        this.muteOff = value;
    }

    /**
     * Gets the value of the hardware property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardware() {
        return hardware;
    }

    /**
     * Sets the value of the hardware property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardware(String value) {
        this.hardware = value;
    }

}
