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
 *         &lt;element ref="{cisco_cme_xml_namespace}hook-flash"/>
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
    "hookFlash"
})
@XmlRootElement(name = "fxo")
public class Fxo {

    @XmlElement(name = "hook-flash", required = true)
    protected String hookFlash;

    /**
     * Gets the value of the hookFlash property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHookFlash() {
        return hookFlash;
    }

    /**
     * Sets the value of the hookFlash property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHookFlash(String value) {
        this.hookFlash = value;
    }

}
