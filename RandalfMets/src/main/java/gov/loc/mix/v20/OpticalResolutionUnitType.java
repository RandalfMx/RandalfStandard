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
 * <p>Java class for opticalResolutionUnitType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="opticalResolutionUnitType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="no absolute unit"/>
 *     &lt;enumeration value="in."/>
 *     &lt;enumeration value="cm"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "opticalResolutionUnitType")
@XmlEnum
public enum OpticalResolutionUnitType {

    @XmlEnumValue("no absolute unit")
    NO_ABSOLUTE_UNIT("no absolute unit"),
    @XmlEnumValue("in.")
    IN("in."),
    @XmlEnumValue("cm")
    CM("cm");
    private final String value;

    OpticalResolutionUnitType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OpticalResolutionUnitType fromValue(String v) {
        for (OpticalResolutionUnitType c: OpticalResolutionUnitType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
