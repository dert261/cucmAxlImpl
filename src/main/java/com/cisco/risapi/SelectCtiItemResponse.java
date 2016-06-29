
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
 *         &lt;element name="selectCtiItemReturn" type="{http://schemas.cisco.com/ast/soap}selectCtiItemReturn"/&gt;
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
    "selectCtiItemReturn"
})
@XmlRootElement(name = "selectCtiItemResponse")
public class SelectCtiItemResponse {

    @XmlElement(required = true)
    protected SelectCtiItemReturn selectCtiItemReturn;

    /**
     * Gets the value of the selectCtiItemReturn property.
     * 
     * @return
     *     possible object is
     *     {@link SelectCtiItemReturn }
     *     
     */
    public SelectCtiItemReturn getSelectCtiItemReturn() {
        return selectCtiItemReturn;
    }

    /**
     * Sets the value of the selectCtiItemReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SelectCtiItemReturn }
     *     
     */
    public void setSelectCtiItemReturn(SelectCtiItemReturn value) {
        this.selectCtiItemReturn = value;
    }

}
