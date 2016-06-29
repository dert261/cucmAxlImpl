
package com.cisco.risapi;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for selectCmDeviceReturn complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="selectCmDeviceReturn"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SelectCmDeviceResult" type="{http://schemas.cisco.com/ast/soap}SelectCmDeviceResult"/&gt;
 *         &lt;element name="StateInfo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "selectCmDeviceReturn", propOrder = {
    "selectCmDeviceResult",
    "stateInfo"
})
public class SelectCmDeviceReturn {

    @XmlElement(name = "SelectCmDeviceResult", required = true)
    protected SelectCmDeviceResult selectCmDeviceResult;
    @XmlElement(name = "StateInfo", required = true)
    protected String stateInfo;

    /**
     * Gets the value of the selectCmDeviceResult property.
     * 
     * @return
     *     possible object is
     *     {@link SelectCmDeviceResult }
     *     
     */
    public SelectCmDeviceResult getSelectCmDeviceResult() {
        return selectCmDeviceResult;
    }

    /**
     * Sets the value of the selectCmDeviceResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectCmDeviceResult }
     *     
     */
    public void setSelectCmDeviceResult(SelectCmDeviceResult value) {
        this.selectCmDeviceResult = value;
    }

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

}
