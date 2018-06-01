
package id.brainmaster.iso20022.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for PlainCardData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PlainCardData1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PAN" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Min8Max28NumericText"/>
 *         &lt;element name="CardSeqNb" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Min2Max3NumericText" minOccurs="0"/>
 *         &lt;element name="FctvDt" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}ISOYearMonth" minOccurs="0"/>
 *         &lt;element name="XpryDt" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}ISOYearMonth"/>
 *         &lt;element name="SvcCd" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Exact3NumericText" minOccurs="0"/>
 *         &lt;element name="TrckData" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}TrackData1" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="CardSctyCd" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}CardSecurityInformation1" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlainCardData1", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", propOrder = {
    "pan",
    "cardSeqNb",
    "fctvDt",
    "xpryDt",
    "svcCd",
    "trckData",
    "cardSctyCd"
})
public class PlainCardData1 {

    @XmlElement(name = "PAN", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", required = true)
    protected String pan;
    @XmlElement(name = "CardSeqNb", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected String cardSeqNb;
    @XmlElement(name = "FctvDt", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar fctvDt;
    @XmlElement(name = "XpryDt", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar xpryDt;
    @XmlElement(name = "SvcCd", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected String svcCd;
    @XmlElement(name = "TrckData", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected List<TrackData1> trckData;
    @XmlElement(name = "CardSctyCd", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected CardSecurityInformation1 cardSctyCd;

    /**
     * Gets the value of the pan property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAN() {
        return pan;
    }

    /**
     * Sets the value of the pan property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAN(String value) {
        this.pan = value;
    }

    /**
     * Gets the value of the cardSeqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardSeqNb() {
        return cardSeqNb;
    }

    /**
     * Sets the value of the cardSeqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardSeqNb(String value) {
        this.cardSeqNb = value;
    }

    /**
     * Gets the value of the fctvDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFctvDt() {
        return fctvDt;
    }

    /**
     * Sets the value of the fctvDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFctvDt(XMLGregorianCalendar value) {
        this.fctvDt = value;
    }

    /**
     * Gets the value of the xpryDt property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getXpryDt() {
        return xpryDt;
    }

    /**
     * Sets the value of the xpryDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setXpryDt(XMLGregorianCalendar value) {
        this.xpryDt = value;
    }

    /**
     * Gets the value of the svcCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSvcCd() {
        return svcCd;
    }

    /**
     * Sets the value of the svcCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSvcCd(String value) {
        this.svcCd = value;
    }

    /**
     * Gets the value of the trckData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the trckData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTrckData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TrackData1 }
     * 
     * 
     */
    public List<TrackData1> getTrckData() {
        if (trckData == null) {
            trckData = new ArrayList<TrackData1>();
        }
        return this.trckData;
    }

    /**
     * Gets the value of the cardSctyCd property.
     * 
     * @return
     *     possible object is
     *     {@link CardSecurityInformation1 }
     *     
     */
    public CardSecurityInformation1 getCardSctyCd() {
        return cardSctyCd;
    }

    /**
     * Sets the value of the cardSctyCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardSecurityInformation1 }
     *     
     */
    public void setCardSctyCd(CardSecurityInformation1 value) {
        this.cardSctyCd = value;
    }

}
