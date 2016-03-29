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
 *         &lt;element ref="{cisco_cme_xml_namespace}index"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}pattern"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}extension-length"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}extension-pattern"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}demote"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}no-reg"/>
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
    "index",
    "pattern",
    "extensionLength",
    "extensionPattern",
    "demote",
    "noReg"
})
@XmlRootElement(name = "dialplan-pattern_item")
public class DialplanPatternItem {

    @XmlElement(required = true)
    protected String index;
    @XmlElement(required = true)
    protected String pattern;
    @XmlElement(name = "extension-length", required = true)
    protected String extensionLength;
    @XmlElement(name = "extension-pattern", required = true)
    protected String extensionPattern;
    @XmlElement(required = true)
    protected String demote;
    @XmlElement(name = "no-reg", required = true)
    protected String noReg;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the extensionLength property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionLength() {
        return extensionLength;
    }

    /**
     * Sets the value of the extensionLength property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionLength(String value) {
        this.extensionLength = value;
    }

    /**
     * Gets the value of the extensionPattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExtensionPattern() {
        return extensionPattern;
    }

    /**
     * Sets the value of the extensionPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExtensionPattern(String value) {
        this.extensionPattern = value;
    }

    /**
     * Gets the value of the demote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDemote() {
        return demote;
    }

    /**
     * Sets the value of the demote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDemote(String value) {
        this.demote = value;
    }

    /**
     * Gets the value of the noReg property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNoReg() {
        return noReg;
    }

    /**
     * Sets the value of the noReg property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNoReg(String value) {
        this.noReg = value;
    }

}
