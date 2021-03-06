//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.20 at 09:54:46 PM CEST 
//


package it.sbn.iccu.metaag1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for audio_creation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="audio_creation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourcetype" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="transcriptionagency" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="transcriptiondate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="devicesource" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="transcriptionchain" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="device_description">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Unique_identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="device_manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="device_model">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Model" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Serial_Number" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="capture_software" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="device_settings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="transcriptionsummary" type="{http://www.iccu.sbn.it/metaAG1.pdf}audio_transcriptionsummarytype" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="transcriptiondata" type="{http://www.iccu.sbn.it/metaAG1.pdf}audio_transcriptiondatatype" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "audio_creation", propOrder = {
    "sourcetype",
    "transcriptionagency",
    "transcriptiondate",
    "devicesource",
    "transcriptionchain",
    "transcriptionsummary",
    "transcriptiondata"
})
public class AudioCreation {

    @XmlElement(required = true)
    protected String sourcetype;
    protected Object transcriptionagency;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transcriptiondate;
    protected String devicesource;
    protected List<AudioCreation.Transcriptionchain> transcriptionchain;
    protected List<AudioTranscriptionsummarytype> transcriptionsummary;
    protected List<AudioTranscriptiondatatype> transcriptiondata;

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
     * Gets the value of the transcriptionagency property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTranscriptionagency() {
        return transcriptionagency;
    }

    /**
     * Sets the value of the transcriptionagency property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTranscriptionagency(Object value) {
        this.transcriptionagency = value;
    }

    /**
     * Gets the value of the transcriptiondate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTranscriptiondate() {
        return transcriptiondate;
    }

    /**
     * Sets the value of the transcriptiondate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTranscriptiondate(XMLGregorianCalendar value) {
        this.transcriptiondate = value;
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
     * Gets the value of the transcriptionchain property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transcriptionchain property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranscriptionchain().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioCreation.Transcriptionchain }
     * 
     * 
     */
    public List<AudioCreation.Transcriptionchain> getTranscriptionchain() {
        if (transcriptionchain == null) {
            transcriptionchain = new ArrayList<AudioCreation.Transcriptionchain>();
        }
        return this.transcriptionchain;
    }

    /**
     * Gets the value of the transcriptionsummary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transcriptionsummary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranscriptionsummary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioTranscriptionsummarytype }
     * 
     * 
     */
    public List<AudioTranscriptionsummarytype> getTranscriptionsummary() {
        if (transcriptionsummary == null) {
            transcriptionsummary = new ArrayList<AudioTranscriptionsummarytype>();
        }
        return this.transcriptionsummary;
    }

    /**
     * Gets the value of the transcriptiondata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transcriptiondata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTranscriptiondata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AudioTranscriptiondatatype }
     * 
     * 
     */
    public List<AudioTranscriptiondatatype> getTranscriptiondata() {
        if (transcriptiondata == null) {
            transcriptiondata = new ArrayList<AudioTranscriptiondatatype>();
        }
        return this.transcriptiondata;
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
     *         &lt;element name="device_description">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Unique_identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="device_manufacturer" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="device_model">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Model" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Serial_Number" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="capture_software" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="device_settings" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "deviceDescription",
        "deviceManufacturer",
        "deviceModel",
        "captureSoftware",
        "deviceSettings"
    })
    public static class Transcriptionchain {

        @XmlElement(name = "device_description", required = true)
        protected AudioCreation.Transcriptionchain.DeviceDescription deviceDescription;
        @XmlElement(name = "device_manufacturer", required = true)
        protected String deviceManufacturer;
        @XmlElement(name = "device_model", required = true)
        protected AudioCreation.Transcriptionchain.DeviceModel deviceModel;
        @XmlElement(name = "capture_software")
        protected String captureSoftware;
        @XmlElement(name = "device_settings")
        protected String deviceSettings;

        /**
         * Gets the value of the deviceDescription property.
         * 
         * @return
         *     possible object is
         *     {@link AudioCreation.Transcriptionchain.DeviceDescription }
         *     
         */
        public AudioCreation.Transcriptionchain.DeviceDescription getDeviceDescription() {
            return deviceDescription;
        }

        /**
         * Sets the value of the deviceDescription property.
         * 
         * @param value
         *     allowed object is
         *     {@link AudioCreation.Transcriptionchain.DeviceDescription }
         *     
         */
        public void setDeviceDescription(AudioCreation.Transcriptionchain.DeviceDescription value) {
            this.deviceDescription = value;
        }

        /**
         * Gets the value of the deviceManufacturer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceManufacturer() {
            return deviceManufacturer;
        }

        /**
         * Sets the value of the deviceManufacturer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceManufacturer(String value) {
            this.deviceManufacturer = value;
        }

        /**
         * Gets the value of the deviceModel property.
         * 
         * @return
         *     possible object is
         *     {@link AudioCreation.Transcriptionchain.DeviceModel }
         *     
         */
        public AudioCreation.Transcriptionchain.DeviceModel getDeviceModel() {
            return deviceModel;
        }

        /**
         * Sets the value of the deviceModel property.
         * 
         * @param value
         *     allowed object is
         *     {@link AudioCreation.Transcriptionchain.DeviceModel }
         *     
         */
        public void setDeviceModel(AudioCreation.Transcriptionchain.DeviceModel value) {
            this.deviceModel = value;
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

        /**
         * Gets the value of the deviceSettings property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceSettings() {
            return deviceSettings;
        }

        /**
         * Sets the value of the deviceSettings property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceSettings(String value) {
            this.deviceSettings = value;
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
         *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Unique_identifier" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Comments" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class DeviceDescription {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Type", required = true)
            protected String type;
            @XmlAttribute(name = "Unique_identifier")
            protected String uniqueIdentifier;
            @XmlAttribute(name = "Comments")
            protected String comments;

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

            /**
             * Gets the value of the uniqueIdentifier property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getUniqueIdentifier() {
                return uniqueIdentifier;
            }

            /**
             * Sets the value of the uniqueIdentifier property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setUniqueIdentifier(String value) {
                this.uniqueIdentifier = value;
            }

            /**
             * Gets the value of the comments property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getComments() {
                return comments;
            }

            /**
             * Sets the value of the comments property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setComments(String value) {
                this.comments = value;
            }

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
         *       &lt;attribute name="Model" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Serial_Number" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class DeviceModel {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Model", required = true)
            protected String model;
            @XmlAttribute(name = "Serial_Number")
            protected String serialNumber;

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
             * Gets the value of the model property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getModel() {
                return model;
            }

            /**
             * Sets the value of the model property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setModel(String value) {
                this.model = value;
            }

            /**
             * Gets the value of the serialNumber property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSerialNumber() {
                return serialNumber;
            }

            /**
             * Sets the value of the serialNumber property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSerialNumber(String value) {
                this.serialNumber = value;
            }

        }

    }

}
