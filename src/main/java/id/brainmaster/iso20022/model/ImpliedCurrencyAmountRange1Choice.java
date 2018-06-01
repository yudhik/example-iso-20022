
package id.brainmaster.iso20022.model;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ImpliedCurrencyAmountRange1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ImpliedCurrencyAmountRange1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="FrAmt" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}AmountRangeBoundary1"/>
 *         &lt;element name="ToAmt" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}AmountRangeBoundary1"/>
 *         &lt;element name="FrToAmt" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}FromToAmountRange1"/>
 *         &lt;element name="EQAmt" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}ImpliedCurrencyAndAmount"/>
 *         &lt;element name="NEQAmt" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}ImpliedCurrencyAndAmount"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ImpliedCurrencyAmountRange1Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", propOrder = {
    "frAmt",
    "toAmt",
    "frToAmt",
    "eqAmt",
    "neqAmt"
})
public class ImpliedCurrencyAmountRange1Choice {

    @XmlElement(name = "FrAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected AmountRangeBoundary1 frAmt;
    @XmlElement(name = "ToAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected AmountRangeBoundary1 toAmt;
    @XmlElement(name = "FrToAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected FromToAmountRange1 frToAmt;
    @XmlElement(name = "EQAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected BigDecimal eqAmt;
    @XmlElement(name = "NEQAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected BigDecimal neqAmt;

    /**
     * Gets the value of the frAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public AmountRangeBoundary1 getFrAmt() {
        return frAmt;
    }

    /**
     * Sets the value of the frAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public void setFrAmt(AmountRangeBoundary1 value) {
        this.frAmt = value;
    }

    /**
     * Gets the value of the toAmt property.
     * 
     * @return
     *     possible object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public AmountRangeBoundary1 getToAmt() {
        return toAmt;
    }

    /**
     * Sets the value of the toAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link AmountRangeBoundary1 }
     *     
     */
    public void setToAmt(AmountRangeBoundary1 value) {
        this.toAmt = value;
    }

    /**
     * Gets the value of the frToAmt property.
     * 
     * @return
     *     possible object is
     *     {@link FromToAmountRange1 }
     *     
     */
    public FromToAmountRange1 getFrToAmt() {
        return frToAmt;
    }

    /**
     * Sets the value of the frToAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link FromToAmountRange1 }
     *     
     */
    public void setFrToAmt(FromToAmountRange1 value) {
        this.frToAmt = value;
    }

    /**
     * Gets the value of the eqAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEQAmt() {
        return eqAmt;
    }

    /**
     * Sets the value of the eqAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEQAmt(BigDecimal value) {
        this.eqAmt = value;
    }

    /**
     * Gets the value of the neqAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getNEQAmt() {
        return neqAmt;
    }

    /**
     * Sets the value of the neqAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setNEQAmt(BigDecimal value) {
        this.neqAmt = value;
    }

}
