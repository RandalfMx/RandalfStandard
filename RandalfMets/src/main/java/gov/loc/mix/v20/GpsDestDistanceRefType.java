//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.02 at 08:11:10 PM GMT+01:00 
//


package gov.loc.mix.v20;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for gpsDestDistanceRefType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="gpsDestDistanceRefType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="K"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="N"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "gpsDestDistanceRefType")
@XmlEnum
public enum GpsDestDistanceRefType {

    K,
    M,
    N;

    public String value() {
        return name();
    }

    public static GpsDestDistanceRefType fromValue(String v) {
        return valueOf(v);
    }

}
