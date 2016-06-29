
package com.cisco.risapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceDownloadStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceDownloadStatus"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Any"/&gt;
 *     &lt;enumeration value="Upgrading"/&gt;
 *     &lt;enumeration value="Successful"/&gt;
 *     &lt;enumeration value="Failed"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceDownloadStatus")
@XmlEnum
public enum DeviceDownloadStatus {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Upgrading")
    UPGRADING("Upgrading"),
    @XmlEnumValue("Successful")
    SUCCESSFUL("Successful"),
    @XmlEnumValue("Failed")
    FAILED("Failed"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DeviceDownloadStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceDownloadStatus fromValue(String v) {
        for (DeviceDownloadStatus c: DeviceDownloadStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
