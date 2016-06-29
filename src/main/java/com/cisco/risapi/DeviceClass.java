
package com.cisco.risapi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DeviceClass.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DeviceClass"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Any"/&gt;
 *     &lt;enumeration value="Phone"/&gt;
 *     &lt;enumeration value="Gateway"/&gt;
 *     &lt;enumeration value="H323"/&gt;
 *     &lt;enumeration value="Cti"/&gt;
 *     &lt;enumeration value="VoiceMail"/&gt;
 *     &lt;enumeration value="MediaResources"/&gt;
 *     &lt;enumeration value="SIPTrunk"/&gt;
 *     &lt;enumeration value="HuntList"/&gt;
 *     &lt;enumeration value="Unknown"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DeviceClass")
@XmlEnum
public enum DeviceClass {

    @XmlEnumValue("Any")
    ANY("Any"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("Gateway")
    GATEWAY("Gateway"),
    @XmlEnumValue("H323")
    H_323("H323"),
    @XmlEnumValue("Cti")
    CTI("Cti"),
    @XmlEnumValue("VoiceMail")
    VOICE_MAIL("VoiceMail"),
    @XmlEnumValue("MediaResources")
    MEDIA_RESOURCES("MediaResources"),
    @XmlEnumValue("SIPTrunk")
    SIP_TRUNK("SIPTrunk"),
    @XmlEnumValue("HuntList")
    HUNT_LIST("HuntList"),
    @XmlEnumValue("Unknown")
    UNKNOWN("Unknown");
    private final String value;

    DeviceClass(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DeviceClass fromValue(String v) {
        for (DeviceClass c: DeviceClass.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
