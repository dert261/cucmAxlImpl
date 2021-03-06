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
 *         &lt;choice>
 *           &lt;element ref="{cisco_cme_xml_namespace}af11"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}af12"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}af13"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}af21"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}af22"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}af23"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}af31"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}af32"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}af33"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}af41"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}af42"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}af43"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}cs1"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}cs2"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}cs3"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}cs4"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}cs5"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}cs6"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}cs7"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}default"/>
 *           &lt;element ref="{cisco_cme_xml_namespace}ef"/>
 *         &lt;/choice>
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
    "af11",
    "af12",
    "af13",
    "af21",
    "af22",
    "af23",
    "af31",
    "af32",
    "af33",
    "af41",
    "af42",
    "af43",
    "cs1",
    "cs2",
    "cs3",
    "cs4",
    "cs5",
    "cs6",
    "cs7",
    "_default",
    "ef"
})
@XmlRootElement(name = "dscp_item")
public class DscpItem {

    @XmlElement(required = true)
    protected String index;
    protected String af11;
    protected String af12;
    protected String af13;
    protected String af21;
    protected String af22;
    protected String af23;
    protected String af31;
    protected String af32;
    protected String af33;
    protected String af41;
    protected String af42;
    protected String af43;
    protected String cs1;
    protected String cs2;
    protected String cs3;
    protected String cs4;
    protected String cs5;
    protected String cs6;
    protected String cs7;
    @XmlElement(name = "default")
    protected String _default;
    protected String ef;

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
     * Gets the value of the af11 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAf11() {
        return af11;
    }

    /**
     * Sets the value of the af11 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAf11(String value) {
        this.af11 = value;
    }

    /**
     * Gets the value of the af12 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAf12() {
        return af12;
    }

    /**
     * Sets the value of the af12 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAf12(String value) {
        this.af12 = value;
    }

    /**
     * Gets the value of the af13 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAf13() {
        return af13;
    }

    /**
     * Sets the value of the af13 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAf13(String value) {
        this.af13 = value;
    }

    /**
     * Gets the value of the af21 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAf21() {
        return af21;
    }

    /**
     * Sets the value of the af21 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAf21(String value) {
        this.af21 = value;
    }

    /**
     * Gets the value of the af22 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAf22() {
        return af22;
    }

    /**
     * Sets the value of the af22 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAf22(String value) {
        this.af22 = value;
    }

    /**
     * Gets the value of the af23 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAf23() {
        return af23;
    }

    /**
     * Sets the value of the af23 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAf23(String value) {
        this.af23 = value;
    }

    /**
     * Gets the value of the af31 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAf31() {
        return af31;
    }

    /**
     * Sets the value of the af31 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAf31(String value) {
        this.af31 = value;
    }

    /**
     * Gets the value of the af32 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAf32() {
        return af32;
    }

    /**
     * Sets the value of the af32 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAf32(String value) {
        this.af32 = value;
    }

    /**
     * Gets the value of the af33 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAf33() {
        return af33;
    }

    /**
     * Sets the value of the af33 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAf33(String value) {
        this.af33 = value;
    }

    /**
     * Gets the value of the af41 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAf41() {
        return af41;
    }

    /**
     * Sets the value of the af41 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAf41(String value) {
        this.af41 = value;
    }

    /**
     * Gets the value of the af42 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAf42() {
        return af42;
    }

    /**
     * Sets the value of the af42 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAf42(String value) {
        this.af42 = value;
    }

    /**
     * Gets the value of the af43 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAf43() {
        return af43;
    }

    /**
     * Sets the value of the af43 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAf43(String value) {
        this.af43 = value;
    }

    /**
     * Gets the value of the cs1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCs1() {
        return cs1;
    }

    /**
     * Sets the value of the cs1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCs1(String value) {
        this.cs1 = value;
    }

    /**
     * Gets the value of the cs2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCs2() {
        return cs2;
    }

    /**
     * Sets the value of the cs2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCs2(String value) {
        this.cs2 = value;
    }

    /**
     * Gets the value of the cs3 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCs3() {
        return cs3;
    }

    /**
     * Sets the value of the cs3 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCs3(String value) {
        this.cs3 = value;
    }

    /**
     * Gets the value of the cs4 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCs4() {
        return cs4;
    }

    /**
     * Sets the value of the cs4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCs4(String value) {
        this.cs4 = value;
    }

    /**
     * Gets the value of the cs5 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCs5() {
        return cs5;
    }

    /**
     * Sets the value of the cs5 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCs5(String value) {
        this.cs5 = value;
    }

    /**
     * Gets the value of the cs6 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCs6() {
        return cs6;
    }

    /**
     * Sets the value of the cs6 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCs6(String value) {
        this.cs6 = value;
    }

    /**
     * Gets the value of the cs7 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCs7() {
        return cs7;
    }

    /**
     * Sets the value of the cs7 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCs7(String value) {
        this.cs7 = value;
    }

    /**
     * Gets the value of the default property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefault() {
        return _default;
    }

    /**
     * Sets the value of the default property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefault(String value) {
        this._default = value;
    }

    /**
     * Gets the value of the ef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEf() {
        return ef;
    }

    /**
     * Sets the value of the ef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEf(String value) {
        this.ef = value;
    }

}
