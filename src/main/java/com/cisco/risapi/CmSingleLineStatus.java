
package com.cisco.risapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CmSingleLineStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CmSingleLineStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Any"/&gt;
 *     &lt;enumeration value="Registered"/&gt;
 *     &lt;enumeration value="UnRegistered"/&gt;
 *     &lt;enumeration value="Rejected"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CmSingleLineStatus")
@XmlEnum
public enum CmSingleLineStatus {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Registered")
    REGISTERED("Registered"),
    @XmlEnumValue("UnRegistered")
    UN_REGISTERED("UnRegistered"),
    @XmlEnumValue("Rejected")
    REJECTED("Rejected"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    CmSingleLineStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CmSingleLineStatus fromValue(String v) {
        for (CmSingleLineStatus c: CmSingleLineStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
