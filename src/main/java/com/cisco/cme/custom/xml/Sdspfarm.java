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
 *         &lt;element ref="{cisco_cme_xml_namespace}conference_options"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}units"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}tag_list"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}transcode"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}unregister"/>
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
    "conferenceOptions",
    "units",
    "tagList",
    "transcode",
    "unregister"
})
@XmlRootElement(name = "sdspfarm")
public class Sdspfarm {

    @XmlElement(name = "conference_options", required = true)
    protected ConferenceOptions conferenceOptions;
    @XmlElement(required = true)
    protected String units;
    @XmlElement(name = "tag_list", required = true)
    protected TagList tagList;
    @XmlElement(required = true)
    protected Transcode transcode;
    @XmlElement(required = true)
    protected Unregister unregister;

    /**
     * Gets the value of the conferenceOptions property.
     * 
     * @return
     *     possible object is
     *     {@link ConferenceOptions }
     *     
     */
    public ConferenceOptions getConferenceOptions() {
        return conferenceOptions;
    }

    /**
     * Sets the value of the conferenceOptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConferenceOptions }
     *     
     */
    public void setConferenceOptions(ConferenceOptions value) {
        this.conferenceOptions = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnits(String value) {
        this.units = value;
    }

    /**
     * Gets the value of the tagList property.
     * 
     * @return
     *     possible object is
     *     {@link TagList }
     *     
     */
    public TagList getTagList() {
        return tagList;
    }

    /**
     * Sets the value of the tagList property.
     * 
     * @param value
     *     allowed object is
     *     {@link TagList }
     *     
     */
    public void setTagList(TagList value) {
        this.tagList = value;
    }

    /**
     * Gets the value of the transcode property.
     * 
     * @return
     *     possible object is
     *     {@link Transcode }
     *     
     */
    public Transcode getTranscode() {
        return transcode;
    }

    /**
     * Sets the value of the transcode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Transcode }
     *     
     */
    public void setTranscode(Transcode value) {
        this.transcode = value;
    }

    /**
     * Gets the value of the unregister property.
     * 
     * @return
     *     possible object is
     *     {@link Unregister }
     *     
     */
    public Unregister getUnregister() {
        return unregister;
    }

    /**
     * Sets the value of the unregister property.
     * 
     * @param value
     *     allowed object is
     *     {@link Unregister }
     *     
     */
    public void setUnregister(Unregister value) {
        this.unregister = value;
    }

}