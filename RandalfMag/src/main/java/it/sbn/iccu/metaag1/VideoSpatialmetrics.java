//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.10.20 at 09:54:46 PM CEST 
//


package it.sbn.iccu.metaag1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for video_spatialmetrics complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="video_spatialmetrics">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="videosize" type="{http://www.iccu.sbn.it/metaAG1.pdf}videosizetype"/>
 *         &lt;element name="aspectratio" type="{http://www.iccu.sbn.it/metaAG1.pdf}aspectratiotype" minOccurs="0"/>
 *         &lt;element name="framerate" type="{http://www.iccu.sbn.it/metaAG1.pdf}frameratetype"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "video_spatialmetrics", propOrder = {
    "videosize",
    "aspectratio",
    "framerate"
})
public class VideoSpatialmetrics {

    @XmlElement(required = true)
    protected String videosize;
    protected String aspectratio;
    protected float framerate;

    /**
     * Gets the value of the videosize property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVideosize() {
        return videosize;
    }

    /**
     * Sets the value of the videosize property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVideosize(String value) {
        this.videosize = value;
    }

    /**
     * Gets the value of the aspectratio property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAspectratio() {
        return aspectratio;
    }

    /**
     * Sets the value of the aspectratio property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAspectratio(String value) {
        this.aspectratio = value;
    }

    /**
     * Gets the value of the framerate property.
     * 
     */
    public float getFramerate() {
        return framerate;
    }

    /**
     * Sets the value of the framerate property.
     * 
     */
    public void setFramerate(float value) {
        this.framerate = value;
    }

}
