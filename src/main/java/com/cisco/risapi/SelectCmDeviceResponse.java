
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
 *         &lt;element name="selectCmDeviceReturn" type="{http://schemas.cisco.com/ast/soap}selectCmDeviceReturn"/&gt;
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
    "selectCmDeviceReturn"
})
@XmlRootElement(name = "selectCmDeviceResponse")
public class SelectCmDeviceResponse {

    @XmlElement(required = true)
    protected SelectCmDeviceReturn selectCmDeviceReturn;

    /**
     * Gets the value of the selectCmDeviceReturn property.
     * 
     * @return
     *     possible object is
     *     {@link SelectCmDeviceReturn }
     *     
     */
    public SelectCmDeviceReturn getSelectCmDeviceReturn() {
        return selectCmDeviceReturn;
    }

    /**
     * Sets the value of the selectCmDeviceReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectCmDeviceReturn }
     *     
     */
    public void setSelectCmDeviceReturn(SelectCmDeviceReturn value) {
        this.selectCmDeviceReturn = value;
    }

}
