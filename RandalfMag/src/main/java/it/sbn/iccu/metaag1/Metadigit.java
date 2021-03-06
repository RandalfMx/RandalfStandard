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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="gen" type="{http://www.iccu.sbn.it/metaAG1.pdf}gen"/>
 *         &lt;element name="bib" type="{http://www.iccu.sbn.it/metaAG1.pdf}bib"/>
 *         &lt;element name="stru" type="{http://www.iccu.sbn.it/metaAG1.pdf}stru" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="img" type="{http://www.iccu.sbn.it/metaAG1.pdf}img" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="audio" type="{http://www.iccu.sbn.it/metaAG1.pdf}audio" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="video" type="{http://www.iccu.sbn.it/metaAG1.pdf}video" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ocr" type="{http://www.iccu.sbn.it/metaAG1.pdf}ocr" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="doc" type="{http://www.iccu.sbn.it/metaAG1.pdf}doc" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="dis" type="{http://www.iccu.sbn.it/metaAG1.pdf}dis" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" type="{http://www.w3.org/2001/XMLSchema}string" default="2.0.1" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gen",
    "bib",
    "stru",
    "img",
    "audio",
    "video",
    "ocr",
    "doc",
    "dis"
})
@XmlRootElement(name = "metadigit")
public class Metadigit {

    @XmlElement(required = true)
    protected Gen gen;
    @XmlElement(required = true)
    protected Bib bib;
    protected List<Stru> stru;
    protected List<Img> img;
    protected List<Audio> audio;
    protected List<Video> video;
    protected List<Ocr> ocr;
    protected List<Doc> doc;
    protected Dis dis;
    @XmlAttribute(name = "version")
    protected String version;

    /**
     * Gets the value of the gen property.
     * 
     * @return
     *     possible object is
     *     {@link Gen }
     *     
     */
    public Gen getGen() {
        return gen;
    }

    /**
     * Sets the value of the gen property.
     * 
     * @param value
     *     allowed object is
     *     {@link Gen }
     *     
     */
    public void setGen(Gen value) {
        this.gen = value;
    }

    /**
     * Gets the value of the bib property.
     * 
     * @return
     *     possible object is
     *     {@link Bib }
     *     
     */
    public Bib getBib() {
        return bib;
    }

    /**
     * Sets the value of the bib property.
     * 
     * @param value
     *     allowed object is
     *     {@link Bib }
     *     
     */
    public void setBib(Bib value) {
        this.bib = value;
    }

    /**
     * Gets the value of the stru property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the stru property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStru().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Stru }
     * 
     * 
     */
    public List<Stru> getStru() {
        if (stru == null) {
            stru = new ArrayList<Stru>();
        }
        return this.stru;
    }

    /**
     * Gets the value of the img property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the img property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getImg().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Img }
     * 
     * 
     */
    public List<Img> getImg() {
        if (img == null) {
            img = new ArrayList<Img>();
        }
        return this.img;
    }

    /**
     * Gets the value of the audio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the audio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAudio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Audio }
     * 
     * 
     */
    public List<Audio> getAudio() {
        if (audio == null) {
            audio = new ArrayList<Audio>();
        }
        return this.audio;
    }

    /**
     * Gets the value of the video property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the video property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVideo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Video }
     * 
     * 
     */
    public List<Video> getVideo() {
        if (video == null) {
            video = new ArrayList<Video>();
        }
        return this.video;
    }

    /**
     * Gets the value of the ocr property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ocr property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOcr().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Ocr }
     * 
     * 
     */
    public List<Ocr> getOcr() {
        if (ocr == null) {
            ocr = new ArrayList<Ocr>();
        }
        return this.ocr;
    }

    /**
     * Gets the value of the doc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the doc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDoc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Doc }
     * 
     * 
     */
    public List<Doc> getDoc() {
        if (doc == null) {
            doc = new ArrayList<Doc>();
        }
        return this.doc;
    }

    /**
     * Gets the value of the dis property.
     * 
     * @return
     *     possible object is
     *     {@link Dis }
     *     
     */
    public Dis getDis() {
        return dis;
    }

    /**
     * Sets the value of the dis property.
     * 
     * @param value
     *     allowed object is
     *     {@link Dis }
     *     
     */
    public void setDis(Dis value) {
        this.dis = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        if (version == null) {
            return "2.0.1";
        } else {
            return version;
        }
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
