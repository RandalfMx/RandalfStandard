//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.20 at 09:54:46 PM CEST 
//


package org.niso.pdfs.datadict;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for image_creation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="image_creation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourcetype" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scanningagency" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="devicesource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="scanningsystem" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="scanner_manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="scanner_model" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="capture_software" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "image_creation", propOrder = {
    "sourcetype",
    "scanningagency",
    "devicesource",
    "scanningsystem"
})
public class ImageCreation {

    protected String sourcetype;
    protected String scanningagency;
    protected String devicesource;
    protected ImageCreation.Scanningsystem scanningsystem;

    /**
     * Gets the value of the sourcetype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourcetype() {
        return sourcetype;
    }

    /**
     * Sets the value of the sourcetype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourcetype(String value) {
        this.sourcetype = value;
    }

    /**
     * Gets the value of the scanningagency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScanningagency() {
        return scanningagency;
    }

    /**
     * Sets the value of the scanningagency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScanningagency(String value) {
        this.scanningagency = value;
    }

    /**
     * Gets the value of the devicesource property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevicesource() {
        return devicesource;
    }

    /**
     * Sets the value of the devicesource property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevicesource(String value) {
        this.devicesource = value;
    }

    /**
     * Gets the value of the scanningsystem property.
     * 
     * @return
     *     possible object is
     *     {@link ImageCreation.Scanningsystem }
     *     
     */
    public ImageCreation.Scanningsystem getScanningsystem() {
        return scanningsystem;
    }

    /**
     * Sets the value of the scanningsystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link ImageCreation.Scanningsystem }
     *     
     */
    public void setScanningsystem(ImageCreation.Scanningsystem value) {
        this.scanningsystem = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="scanner_manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="scanner_model" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="capture_software" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "scannerManufacturer",
        "scannerModel",
        "captureSoftware"
    })
    public static class Scanningsystem {

        @XmlElement(name = "scanner_manufacturer", required = true)
        protected String scannerManufacturer;
        @XmlElement(name = "scanner_model", required = true)
        protected String scannerModel;
        @XmlElement(name = "capture_software", required = true)
        protected String captureSoftware;

        /**
         * Gets the value of the scannerManufacturer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScannerManufacturer() {
            return scannerManufacturer;
        }

        /**
         * Sets the value of the scannerManufacturer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScannerManufacturer(String value) {
            this.scannerManufacturer = value;
        }

        /**
         * Gets the value of the scannerModel property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getScannerModel() {
            return scannerModel;
        }

        /**
         * Sets the value of the scannerModel property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setScannerModel(String value) {
            this.scannerModel = value;
        }

        /**
         * Gets the value of the captureSoftware property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaptureSoftware() {
            return captureSoftware;
        }

        /**
         * Sets the value of the captureSoftware property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaptureSoftware(String value) {
            this.captureSoftware = value;
        }

    }

}
