
package id.brainmaster.iso20022.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Rate4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rate4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}RateType4Choice"/>
 *         &lt;element name="VldtyRg" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}ActiveOrHistoricCurrencyAndAmountRange2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rate4", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", propOrder = {
    "tp",
    "vldtyRg"
})
public class Rate4 {

    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", required = true)
    protected RateType4Choice tp;
    @XmlElement(name = "VldtyRg", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected ActiveOrHistoricCurrencyAndAmountRange2 vldtyRg;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link RateType4Choice }
     *     
     */
    public RateType4Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link RateType4Choice }
     *     
     */
    public void setTp(RateType4Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the vldtyRg property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmountRange2 }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmountRange2 getVldtyRg() {
        return vldtyRg;
    }

    /**
     * Sets the value of the vldtyRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmountRange2 }
     *     
     */
    public void setVldtyRg(ActiveOrHistoricCurrencyAndAmountRange2 value) {
        this.vldtyRg = value;
    }

}
