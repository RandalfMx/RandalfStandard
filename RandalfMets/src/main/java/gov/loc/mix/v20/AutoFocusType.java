//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.02 at 08:11:10 PM GMT+01:00 
//


package gov.loc.mix.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for autoFocusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="autoFocusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Auto Focus Used"/>
 *     &lt;enumeration value="Auto Focus Interrupted"/>
 *     &lt;enumeration value="Near Focused"/>
 *     &lt;enumeration value="Soft Focused"/>
 *     &lt;enumeration value="Manual"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "autoFocusType")
@XmlEnum
public enum AutoFocusType {

    @XmlEnumValue("Auto Focus Used")
    AUTO_FOCUS_USED("Auto Focus Used"),
    @XmlEnumValue("Auto Focus Interrupted")
    AUTO_FOCUS_INTERRUPTED("Auto Focus Interrupted"),
    @XmlEnumValue("Near Focused")
    NEAR_FOCUSED("Near Focused"),
    @XmlEnumValue("Soft Focused")
    SOFT_FOCUSED("Soft Focused"),
    @XmlEnumValue("Manual")
    MANUAL("Manual");
    private final String value;

    AutoFocusType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AutoFocusType fromValue(String v) {
        for (AutoFocusType c: AutoFocusType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
