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
 *         &lt;element ref="{cisco_cme_xml_namespace}codec_name"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}dspfarm-assist"/>
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
    "codecName",
    "dspfarmAssist"
})
@XmlRootElement(name = "codec")
public class Codec {

    @XmlElement(name = "codec_name", required = true)
    protected String codecName;
    @XmlElement(name = "dspfarm-assist", required = true)
    protected String dspfarmAssist;

    /**
     * Gets the value of the codecName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodecName() {
        return codecName;
    }

    /**
     * Sets the value of the codecName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodecName(String value) {
        this.codecName = value;
    }

    /**
     * Gets the value of the dspfarmAssist property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDspfarmAssist() {
        return dspfarmAssist;
    }

    /**
     * Sets the value of the dspfarmAssist property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDspfarmAssist(String value) {
        this.dspfarmAssist = value;
    }

}
