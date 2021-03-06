//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.23 at 05:30:10 PM CEST 
//


package mx.randalf.schedaF;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element ref="{}nome_normativa"/>
 *         &lt;element ref="{}tipo"/>
 *         &lt;element ref="{}ver_numero"/>
 *         &lt;element ref="{}data_crea"/>
 *         &lt;element ref="{}ente_schedatore"/>
 *         &lt;element ref="{}concessione"/>
 *         &lt;element ref="{}spedizione"/>
 *         &lt;element ref="{}note"/>
 *         &lt;element ref="{}numero_schede"/>
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
    "nomeNormativa",
    "tipo",
    "verNumero",
    "dataCrea",
    "enteSchedatore",
    "concessione",
    "spedizione",
    "note",
    "numeroSchede"
})
@XmlRootElement(name = "csm_info")
public class CsmInfo {

    @XmlElement(name = "nome_normativa", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String nomeNormativa;
    @XmlElement(required = true)
    protected String tipo;
    @XmlElement(name = "ver_numero", required = true)
    protected BigDecimal verNumero;
    @XmlElement(name = "data_crea", required = true)
    protected BigInteger dataCrea;
    @XmlElement(name = "ente_schedatore", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String enteSchedatore;
    @XmlElement(required = true)
    protected Concessione concessione;
    @XmlElement(required = true)
    protected Spedizione spedizione;
    @XmlElement(required = true)
    protected Note note;
    @XmlElement(name = "numero_schede", required = true)
    protected BigInteger numeroSchede;

    /**
     * Gets the value of the nomeNormativa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeNormativa() {
        return nomeNormativa;
    }

    /**
     * Sets the value of the nomeNormativa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeNormativa(String value) {
        this.nomeNormativa = value;
    }

    /**
     * Gets the value of the tipo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the tipo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the verNumero property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVerNumero() {
        return verNumero;
    }

    /**
     * Sets the value of the verNumero property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVerNumero(BigDecimal value) {
        this.verNumero = value;
    }

    /**
     * Gets the value of the dataCrea property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDataCrea() {
        return dataCrea;
    }

    /**
     * Sets the value of the dataCrea property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDataCrea(BigInteger value) {
        this.dataCrea = value;
    }

    /**
     * Gets the value of the enteSchedatore property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnteSchedatore() {
        return enteSchedatore;
    }

    /**
     * Sets the value of the enteSchedatore property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnteSchedatore(String value) {
        this.enteSchedatore = value;
    }

    /**
     * Gets the value of the concessione property.
     * 
     * @return
     *     possible object is
     *     {@link Concessione }
     *     
     */
    public Concessione getConcessione() {
        return concessione;
    }

    /**
     * Sets the value of the concessione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Concessione }
     *     
     */
    public void setConcessione(Concessione value) {
        this.concessione = value;
    }

    /**
     * Gets the value of the spedizione property.
     * 
     * @return
     *     possible object is
     *     {@link Spedizione }
     *     
     */
    public Spedizione getSpedizione() {
        return spedizione;
    }

    /**
     * Sets the value of the spedizione property.
     * 
     * @param value
     *     allowed object is
     *     {@link Spedizione }
     *     
     */
    public void setSpedizione(Spedizione value) {
        this.spedizione = value;
    }

    /**
     * Gets the value of the note property.
     * 
     * @return
     *     possible object is
     *     {@link Note }
     *     
     */
    public Note getNote() {
        return note;
    }

    /**
     * Sets the value of the note property.
     * 
     * @param value
     *     allowed object is
     *     {@link Note }
     *     
     */
    public void setNote(Note value) {
        this.note = value;
    }

    /**
     * Gets the value of the numeroSchede property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroSchede() {
        return numeroSchede;
    }

    /**
     * Sets the value of the numeroSchede property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroSchede(BigInteger value) {
        this.numeroSchede = value;
    }

}
