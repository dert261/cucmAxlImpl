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
 *         &lt;element ref="{cisco_cme_xml_namespace}moh_ipaddr"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}port"/>
 *         &lt;element ref="{cisco_cme_xml_namespace}route_list"/>
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
    "mohIpaddr",
    "port",
    "routeList"
})
@XmlRootElement(name = "multicast")
public class Multicast {

    @XmlElement(name = "moh_ipaddr", required = true)
    protected String mohIpaddr;
    @XmlElement(required = true)
    protected String port;
    @XmlElement(name = "route_list", required = true)
    protected RouteList routeList;

    /**
     * Gets the value of the mohIpaddr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMohIpaddr() {
        return mohIpaddr;
    }

    /**
     * Sets the value of the mohIpaddr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMohIpaddr(String value) {
        this.mohIpaddr = value;
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
     * Gets the value of the routeList property.
     * 
     * @return
     *     possible object is
     *     {@link RouteList }
     *     
     */
    public RouteList getRouteList() {
        return routeList;
    }

    /**
     * Sets the value of the routeList property.
     * 
     * @param value
     *     allowed object is
     *     {@link RouteList }
     *     
     */
    public void setRouteList(RouteList value) {
        this.routeList = value;
    }

}
