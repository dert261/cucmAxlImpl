
package com.cisco.risapi;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="StateInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="CmSelectionCriteria" type="{http://schemas.cisco.com/ast/soap}CmSelectionCriteria"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "stateInfo",
    "cmSelectionCriteria"
})
@XmlRootElement(name = "selectCmDevice")
public class SelectCmDevice {

    @XmlElement(name = "StateInfo", required = true)
    protected String stateInfo;
    @XmlElement(name = "CmSelectionCriteria", required = true)
    protected CmSelectionCriteria cmSelectionCriteria;

    /**
     * Gets the value of the stateInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStateInfo() {
        return stateInfo;
    }

    /**
     * Sets the value of the stateInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStateInfo(String value) {
        this.stateInfo = value;
    }

    /**
     * Gets the value of the cmSelectionCriteria property.
     * 
     * @return
     *     possible object is
     *     {@link CmSelectionCriteria }
     *     
     */
    public CmSelectionCriteria getCmSelectionCriteria() {
        return cmSelectionCriteria;
    }

    /**
     * Sets the value of the cmSelectionCriteria property.
     * 
     * @param value
     *     allowed object is
     *     {@link CmSelectionCriteria }
     *     
     */
    public void setCmSelectionCriteria(CmSelectionCriteria value) {
        this.cmSelectionCriteria = value;
    }

}
