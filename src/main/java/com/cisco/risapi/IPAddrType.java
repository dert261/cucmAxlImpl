
package com.cisco.risapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IPAddrType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="IPAddrType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ipv4"/&gt;
 *     &lt;enumeration value="ipv6"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "IPAddrType")
@XmlEnum
public enum IPAddrType {

    @XmlEnumValue("ipv4")
    IPV_4("ipv4"),
    @XmlEnumValue("ipv6")
    IPV_6("ipv6");
    private final String value;

    IPAddrType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static IPAddrType fromValue(String v) {
        for (IPAddrType c: IPAddrType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
