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
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7914"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7915-12"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7915-24"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7916-12"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7916-24"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_12SP"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7902"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7906"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7910"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7911"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7912"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7920"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7921"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7925"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7931"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7935"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7936"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7937"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7960-7940"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7941"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7941GE"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7942"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7961"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7962"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7965"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7970"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7971"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7975"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_7985"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_ata"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_6921"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_6941"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}phone_6961"/>
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
    "phone7914",
    "phone791512",
    "phone791524",
    "phone791612",
    "phone791624",
    "phone12SP",
    "phone7902",
    "phone7906",
    "phone7910",
    "phone7911",
    "phone7912",
    "phone7920",
    "phone7921",
    "phone7925",
    "phone7931",
    "phone7935",
    "phone7936",
    "phone7937",
    "phone79607940",
    "phone7941",
    "phone7941GE",
    "phone7942",
    "phone7961",
    "phone7962",
    "phone7965",
    "phone7970",
    "phone7971",
    "phone7975",
    "phone7985",
    "phoneAta",
    "phone6921",
    "phone6941",
    "phone6961"
})
@XmlRootElement(name = "load_list")
public class LoadList {

    @XmlElement(name = "phone_7914", required = true)
    protected String phone7914;
    @XmlElement(name = "phone_7915-12", required = true)
    protected String phone791512;
    @XmlElement(name = "phone_7915-24", required = true)
    protected String phone791524;
    @XmlElement(name = "phone_7916-12", required = true)
    protected String phone791612;
    @XmlElement(name = "phone_7916-24", required = true)
    protected String phone791624;
    @XmlElement(name = "phone_12SP", required = true)
    protected String phone12SP;
    @XmlElement(name = "phone_7902", required = true)
    protected String phone7902;
    @XmlElement(name = "phone_7906", required = true)
    protected String phone7906;
    @XmlElement(name = "phone_7910", required = true)
    protected String phone7910;
    @XmlElement(name = "phone_7911", required = true)
    protected String phone7911;
    @XmlElement(name = "phone_7912", required = true)
    protected String phone7912;
    @XmlElement(name = "phone_7920", required = true)
    protected String phone7920;
    @XmlElement(name = "phone_7921", required = true)
    protected String phone7921;
    @XmlElement(name = "phone_7925", required = true)
    protected String phone7925;
    @XmlElement(name = "phone_7931", required = true)
    protected String phone7931;
    @XmlElement(name = "phone_7935", required = true)
    protected String phone7935;
    @XmlElement(name = "phone_7936", required = true)
    protected String phone7936;
    @XmlElement(name = "phone_7937", required = true)
    protected String phone7937;
    @XmlElement(name = "phone_7960-7940", required = true)
    protected String phone79607940;
    @XmlElement(name = "phone_7941", required = true)
    protected String phone7941;
    @XmlElement(name = "phone_7941GE", required = true)
    protected String phone7941GE;
    @XmlElement(name = "phone_7942", required = true)
    protected String phone7942;
    @XmlElement(name = "phone_7961", required = true)
    protected String phone7961;
    @XmlElement(name = "phone_7962", required = true)
    protected String phone7962;
    @XmlElement(name = "phone_7965", required = true)
    protected String phone7965;
    @XmlElement(name = "phone_7970", required = true)
    protected String phone7970;
    @XmlElement(name = "phone_7971", required = true)
    protected String phone7971;
    @XmlElement(name = "phone_7975", required = true)
    protected String phone7975;
    @XmlElement(name = "phone_7985", required = true)
    protected String phone7985;
    @XmlElement(name = "phone_ata", required = true)
    protected String phoneAta;
    @XmlElement(name = "phone_6921", required = true)
    protected String phone6921;
    @XmlElement(name = "phone_6941", required = true)
    protected String phone6941;
    @XmlElement(name = "phone_6961", required = true)
    protected String phone6961;

    /**
     * Gets the value of the phone7914 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7914() {
        return phone7914;
    }

    /**
     * Sets the value of the phone7914 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7914(String value) {
        this.phone7914 = value;
    }

    /**
     * Gets the value of the phone791512 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone791512() {
        return phone791512;
    }

    /**
     * Sets the value of the phone791512 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone791512(String value) {
        this.phone791512 = value;
    }

    /**
     * Gets the value of the phone791524 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone791524() {
        return phone791524;
    }

    /**
     * Sets the value of the phone791524 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone791524(String value) {
        this.phone791524 = value;
    }

    /**
     * Gets the value of the phone791612 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone791612() {
        return phone791612;
    }

    /**
     * Sets the value of the phone791612 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone791612(String value) {
        this.phone791612 = value;
    }

    /**
     * Gets the value of the phone791624 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone791624() {
        return phone791624;
    }

    /**
     * Sets the value of the phone791624 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone791624(String value) {
        this.phone791624 = value;
    }

    /**
     * Gets the value of the phone12SP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone12SP() {
        return phone12SP;
    }

    /**
     * Sets the value of the phone12SP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone12SP(String value) {
        this.phone12SP = value;
    }

    /**
     * Gets the value of the phone7902 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7902() {
        return phone7902;
    }

    /**
     * Sets the value of the phone7902 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7902(String value) {
        this.phone7902 = value;
    }

    /**
     * Gets the value of the phone7906 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7906() {
        return phone7906;
    }

    /**
     * Sets the value of the phone7906 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7906(String value) {
        this.phone7906 = value;
    }

    /**
     * Gets the value of the phone7910 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7910() {
        return phone7910;
    }

    /**
     * Sets the value of the phone7910 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7910(String value) {
        this.phone7910 = value;
    }

    /**
     * Gets the value of the phone7911 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7911() {
        return phone7911;
    }

    /**
     * Sets the value of the phone7911 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7911(String value) {
        this.phone7911 = value;
    }

    /**
     * Gets the value of the phone7912 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7912() {
        return phone7912;
    }

    /**
     * Sets the value of the phone7912 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7912(String value) {
        this.phone7912 = value;
    }

    /**
     * Gets the value of the phone7920 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7920() {
        return phone7920;
    }

    /**
     * Sets the value of the phone7920 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7920(String value) {
        this.phone7920 = value;
    }

    /**
     * Gets the value of the phone7921 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7921() {
        return phone7921;
    }

    /**
     * Sets the value of the phone7921 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7921(String value) {
        this.phone7921 = value;
    }

    /**
     * Gets the value of the phone7925 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7925() {
        return phone7925;
    }

    /**
     * Sets the value of the phone7925 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7925(String value) {
        this.phone7925 = value;
    }

    /**
     * Gets the value of the phone7931 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7931() {
        return phone7931;
    }

    /**
     * Sets the value of the phone7931 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7931(String value) {
        this.phone7931 = value;
    }

    /**
     * Gets the value of the phone7935 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7935() {
        return phone7935;
    }

    /**
     * Sets the value of the phone7935 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7935(String value) {
        this.phone7935 = value;
    }

    /**
     * Gets the value of the phone7936 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7936() {
        return phone7936;
    }

    /**
     * Sets the value of the phone7936 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7936(String value) {
        this.phone7936 = value;
    }

    /**
     * Gets the value of the phone7937 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7937() {
        return phone7937;
    }

    /**
     * Sets the value of the phone7937 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7937(String value) {
        this.phone7937 = value;
    }

    /**
     * Gets the value of the phone79607940 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone79607940() {
        return phone79607940;
    }

    /**
     * Sets the value of the phone79607940 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone79607940(String value) {
        this.phone79607940 = value;
    }

    /**
     * Gets the value of the phone7941 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7941() {
        return phone7941;
    }

    /**
     * Sets the value of the phone7941 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7941(String value) {
        this.phone7941 = value;
    }

    /**
     * Gets the value of the phone7941GE property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7941GE() {
        return phone7941GE;
    }

    /**
     * Sets the value of the phone7941GE property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7941GE(String value) {
        this.phone7941GE = value;
    }

    /**
     * Gets the value of the phone7942 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7942() {
        return phone7942;
    }

    /**
     * Sets the value of the phone7942 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7942(String value) {
        this.phone7942 = value;
    }

    /**
     * Gets the value of the phone7961 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7961() {
        return phone7961;
    }

    /**
     * Sets the value of the phone7961 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7961(String value) {
        this.phone7961 = value;
    }

    /**
     * Gets the value of the phone7962 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7962() {
        return phone7962;
    }

    /**
     * Sets the value of the phone7962 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7962(String value) {
        this.phone7962 = value;
    }

    /**
     * Gets the value of the phone7965 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7965() {
        return phone7965;
    }

    /**
     * Sets the value of the phone7965 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7965(String value) {
        this.phone7965 = value;
    }

    /**
     * Gets the value of the phone7970 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7970() {
        return phone7970;
    }

    /**
     * Sets the value of the phone7970 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7970(String value) {
        this.phone7970 = value;
    }

    /**
     * Gets the value of the phone7971 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7971() {
        return phone7971;
    }

    /**
     * Sets the value of the phone7971 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7971(String value) {
        this.phone7971 = value;
    }

    /**
     * Gets the value of the phone7975 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7975() {
        return phone7975;
    }

    /**
     * Sets the value of the phone7975 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7975(String value) {
        this.phone7975 = value;
    }

    /**
     * Gets the value of the phone7985 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone7985() {
        return phone7985;
    }

    /**
     * Sets the value of the phone7985 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone7985(String value) {
        this.phone7985 = value;
    }

    /**
     * Gets the value of the phoneAta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhoneAta() {
        return phoneAta;
    }

    /**
     * Sets the value of the phoneAta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhoneAta(String value) {
        this.phoneAta = value;
    }

    /**
     * Gets the value of the phone6921 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone6921() {
        return phone6921;
    }

    /**
     * Sets the value of the phone6921 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone6921(String value) {
        this.phone6921 = value;
    }

    /**
     * Gets the value of the phone6941 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone6941() {
        return phone6941;
    }

    /**
     * Sets the value of the phone6941 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone6941(String value) {
        this.phone6941 = value;
    }

    /**
     * Gets the value of the phone6961 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhone6961() {
        return phone6961;
    }

    /**
     * Sets the value of the phone6961 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhone6961(String value) {
        this.phone6961 = value;
    }

}
