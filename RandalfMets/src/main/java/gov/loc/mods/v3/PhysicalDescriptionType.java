//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.02.02 at 08:11:10 PM GMT+01:00 
//


package gov.loc.mods.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for physicalDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="physicalDescriptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="form">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="authority" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="reformattingQuality">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="access"/>
 *               &lt;enumeration value="preservation"/>
 *               &lt;enumeration value="replacement"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="internetMediaType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="extent" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="digitalOrigin">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="born digital"/>
 *               &lt;enumeration value="reformatted digital"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="note" type="{http://www.loc.gov/mods/v3}unstructuredText"/>
 *       &lt;/choice>
 *       &lt;attGroup ref="{http://www.loc.gov/mods/v3}language"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "physicalDescriptionType", propOrder = {
    "formOrReformattingQualityOrInternetMediaType"
})
public class PhysicalDescriptionType {

    @XmlElementRefs({
        @XmlElementRef(name = "extent", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class),
        @XmlElementRef(name = "reformattingQuality", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class),
        @XmlElementRef(name = "internetMediaType", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class),
        @XmlElementRef(name = "form", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class),
        @XmlElementRef(name = "digitalOrigin", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class),
        @XmlElementRef(name = "note", namespace = "http://www.loc.gov/mods/v3", type = JAXBElement.class)
    })
    protected List<JAXBElement<?>> formOrReformattingQualityOrInternetMediaType;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String lang;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String script;
    @XmlAttribute
    @XmlSchemaType(name = "anySimpleType")
    protected String transliteration;

    /**
     * Gets the value of the formOrReformattingQualityOrInternetMediaType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOrReformattingQualityOrInternetMediaType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOrReformattingQualityOrInternetMediaType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * {@link JAXBElement }{@code <}{@link UnstructuredText }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link PhysicalDescriptionType.Form }{@code >}
     * {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getFormOrReformattingQualityOrInternetMediaType() {
        if (formOrReformattingQualityOrInternetMediaType == null) {
            formOrReformattingQualityOrInternetMediaType = new ArrayList<JAXBElement<?>>();
        }
        return this.formOrReformattingQualityOrInternetMediaType;
    }

    /**
     * Gets the value of the lang property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLang() {
        return lang;
    }

    /**
     * Sets the value of the lang property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLang(String value) {
        this.lang = value;
    }

    /**
     * Gets the value of the script property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScript() {
        return script;
    }

    /**
     * Sets the value of the script property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScript(String value) {
        this.script = value;
    }

    /**
     * Gets the value of the transliteration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransliteration() {
        return transliteration;
    }

    /**
     * Sets the value of the transliteration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransliteration(String value) {
        this.transliteration = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="authority" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Form {

        @XmlValue
        protected String value;
        @XmlAttribute
        @XmlSchemaType(name = "anySimpleType")
        protected String authority;
        @XmlAttribute
        protected String type;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * Gets the value of the authority property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthority() {
            return authority;
        }

        /**
         * Sets the value of the authority property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthority(String value) {
            this.authority = value;
        }

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}