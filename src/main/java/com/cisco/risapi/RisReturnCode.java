
package com.cisco.risapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RisReturnCode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RisReturnCode"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Ok"/&gt;
 *     &lt;enumeration value="NotFound"/&gt;
 *     &lt;enumeration value="InvalidRequest"/&gt;
 *     &lt;enumeration value="InternalError"/&gt;
 *     &lt;enumeration value="NodeNotResponding"/&gt;
 *     &lt;enumeration value="InvalidNodeName"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RisReturnCode")
@XmlEnum
public enum RisReturnCode {

    @XmlEnumValue("Ok")
    OK("Ok"),
    @XmlEnumValue("NotFound")
    NOT_FOUND("NotFound"),
    @XmlEnumValue("InvalidRequest")
    INVALID_REQUEST("InvalidRequest"),
    @XmlEnumValue("InternalError")
    INTERNAL_ERROR("InternalError"),
    @XmlEnumValue("NodeNotResponding")
    NODE_NOT_RESPONDING("NodeNotResponding"),
    @XmlEnumValue("InvalidNodeName")
    INVALID_NODE_NAME("InvalidNodeName");
    private final String value;

    RisReturnCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RisReturnCode fromValue(String v) {
        for (RisReturnCode c: RisReturnCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
