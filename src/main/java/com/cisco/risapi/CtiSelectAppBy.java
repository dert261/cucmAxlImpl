
package com.cisco.risapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CtiSelectAppBy.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CtiSelectAppBy"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AppId"/&gt;
 *     &lt;enumeration value="AppIPV4Address"/&gt;
 *     &lt;enumeration value="AppIPV6Address"/&gt;
 *     &lt;enumeration value="UserId"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CtiSelectAppBy")
@XmlEnum
public enum CtiSelectAppBy {

    @XmlEnumValue("AppId")
    APP_ID("AppId"),
    @XmlEnumValue("AppIPV4Address")
    APP_IPV_4_ADDRESS("AppIPV4Address"),
    @XmlEnumValue("AppIPV6Address")
    APP_IPV_6_ADDRESS("AppIPV6Address"),
    @XmlEnumValue("UserId")
    USER_ID("UserId");
    private final String value;

    CtiSelectAppBy(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CtiSelectAppBy fromValue(String v) {
        for (CtiSelectAppBy c: CtiSelectAppBy.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
