//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.20 at 09:54:46 PM CEST 
//


package org.niso.pdfs.datadict;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for photometricinterpretationtype.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="photometricinterpretationtype">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="WhiteIsZero"/>
 *     &lt;enumeration value="BlackIsZero"/>
 *     &lt;enumeration value="RGB"/>
 *     &lt;enumeration value="Palette color"/>
 *     &lt;enumeration value="Transparency Mask"/>
 *     &lt;enumeration value="CMYK"/>
 *     &lt;enumeration value="YCbCr"/>
 *     &lt;enumeration value="CIELab"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "photometricinterpretationtype")
@XmlEnum
public enum Photometricinterpretationtype {

    @XmlEnumValue("WhiteIsZero")
    WHITE_IS_ZERO("WhiteIsZero"),
    @XmlEnumValue("BlackIsZero")
    BLACK_IS_ZERO("BlackIsZero"),
    RGB("RGB"),
    @XmlEnumValue("Palette color")
    PALETTE_COLOR("Palette color"),
    @XmlEnumValue("Transparency Mask")
    TRANSPARENCY_MASK("Transparency Mask"),
    CMYK("CMYK"),
    @XmlEnumValue("YCbCr")
    Y_CB_CR("YCbCr"),
    @XmlEnumValue("CIELab")
    CIE_LAB("CIELab");
    private final String value;

    Photometricinterpretationtype(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Photometricinterpretationtype fromValue(String v) {
        for (Photometricinterpretationtype c: Photometricinterpretationtype.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
