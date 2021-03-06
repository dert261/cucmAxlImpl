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
 *         &lt;element ref="{cisco_cme_xml_namespace}ip_addr"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}port"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}route"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}out-call"/>
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
    "ipAddr",
    "port",
    "route",
    "outCall"
})
@XmlRootElement(name = "moh")
public class Moh {

    @XmlElement(name = "ip_addr", required = true)
    protected String ipAddr;
    @XmlElement(required = true)
    protected String port;
    @XmlElement(required = true)
    protected String route;
    @XmlElement(name = "out-call", required = true)
    protected String outCall;

    /**
     * Gets the value of the ipAddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpAddr() {
        return ipAddr;
    }

    /**
     * Sets the value of the ipAddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpAddr(String value) {
        this.ipAddr = value;
    }

    /**
     * Gets the value of the port property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPort() {
        return port;
    }

    /**
     * Sets the value of the port property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPort(String value) {
        this.port = value;
    }

    /**
     * Gets the value of the route property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoute() {
        return route;
    }

    /**
     * Sets the value of the route property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoute(String value) {
        this.route = value;
    }

    /**
     * Gets the value of the outCall property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOutCall() {
        return outCall;
    }

    /**
     * Sets the value of the outCall property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOutCall(String value) {
        this.outCall = value;
    }

}
