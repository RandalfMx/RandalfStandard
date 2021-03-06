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
 * <p>Java class for samplingFrequencyPlaneType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="samplingFrequencyPlaneType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="camera/scanner focal plane"/>
 *     &lt;enumeration value="object plane"/>
 *     &lt;enumeration value="source object plane"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "samplingFrequencyPlaneType")
@XmlEnum
public enum SamplingFrequencyPlaneType {

    @XmlEnumValue("camera/scanner focal plane")
    CAMERA_SCANNER_FOCAL_PLANE("camera/scanner focal plane"),
    @XmlEnumValue("object plane")
    OBJECT_PLANE("object plane"),
    @XmlEnumValue("source object plane")
    SOURCE_OBJECT_PLANE("source object plane");
    private final String value;

    SamplingFrequencyPlaneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SamplingFrequencyPlaneType fromValue(String v) {
        for (SamplingFrequencyPlaneType c: SamplingFrequencyPlaneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
