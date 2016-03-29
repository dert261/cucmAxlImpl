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
 *         &lt;element ref="{cisco_cme_xml_namespace}url_info"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}delay"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}duration"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}internal"/>
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
    "urlInfo",
    "delay",
    "duration",
    "internal"
})
@XmlRootElement(name = "report")
public class Report {

    @XmlElement(name = "url_info", required = true)
    protected UrlInfo urlInfo;
    @XmlElement(required = true)
    protected String delay;
    @XmlElement(required = true)
    protected String duration;
    @XmlElement(required = true)
    protected Internal internal;

    /**
     * Gets the value of the urlInfo property.
     * 
     * @return
     *     possible object is
     *     {@link UrlInfo }
     *     
     */
    public UrlInfo getUrlInfo() {
        return urlInfo;
    }

    /**
     * Sets the value of the urlInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link UrlInfo }
     *     
     */
    public void setUrlInfo(UrlInfo value) {
        this.urlInfo = value;
    }

    /**
     * Gets the value of the delay property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelay() {
        return delay;
    }

    /**
     * Sets the value of the delay property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelay(String value) {
        this.delay = value;
    }

    /**
     * Gets the value of the duration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDuration(String value) {
        this.duration = value;
    }

    /**
     * Gets the value of the internal property.
     * 
     * @return
     *     possible object is
     *     {@link Internal }
     *     
     */
    public Internal getInternal() {
        return internal;
    }

    /**
     * Sets the value of the internal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Internal }
     *     
     */
    public void setInternal(Internal value) {
        this.internal = value;
    }

}
