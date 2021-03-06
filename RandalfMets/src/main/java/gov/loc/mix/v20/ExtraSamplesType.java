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
 * <p>Java class for extraSamplesType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="extraSamplesType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="unspecified data"/>
 *     &lt;enumeration value="associated alpha data (with pre-multiplied color)"/>
 *     &lt;enumeration value="unassociated alpha data"/>
 *     &lt;enumeration value="range or depth data"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "extraSamplesType")
@XmlEnum
public enum ExtraSamplesType {

    @XmlEnumValue("unspecified data")
    UNSPECIFIED_DATA("unspecified data"),
    @XmlEnumValue("associated alpha data (with pre-multiplied color)")
    ASSOCIATED_ALPHA_DATA_WITH_PRE_MULTIPLIED_COLOR("associated alpha data (with pre-multiplied color)"),
    @XmlEnumValue("unassociated alpha data")
    UNASSOCIATED_ALPHA_DATA("unassociated alpha data"),
    @XmlEnumValue("range or depth data")
    RANGE_OR_DEPTH_DATA("range or depth data");
    private final String value;

    ExtraSamplesType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ExtraSamplesType fromValue(String v) {
        for (ExtraSamplesType c: ExtraSamplesType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
