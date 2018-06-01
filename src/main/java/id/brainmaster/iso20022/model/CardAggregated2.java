
package id.brainmaster.iso20022.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardAggregated2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardAggregated2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddtlSvc" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}CardPaymentServiceType2Code" minOccurs="0"/>
 *         &lt;element name="TxCtgy" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}ExternalCardTransactionCategory1Code" minOccurs="0"/>
 *         &lt;element name="SaleRcncltnId" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Max35Text" minOccurs="0"/>
 *         &lt;element name="SeqNbRg" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}CardSequenceNumberRange1" minOccurs="0"/>
 *         &lt;element name="TxDtRg" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}DateOrDateTimePeriod1Choice" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardAggregated2", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", propOrder = {
    "addtlSvc",
    "txCtgy",
    "saleRcncltnId",
    "seqNbRg",
    "txDtRg"
})
public class CardAggregated2 {

    @XmlElement(name = "AddtlSvc", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    @XmlSchemaType(name = "string")
    protected CardPaymentServiceType2Code addtlSvc;
    @XmlElement(name = "TxCtgy", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected String txCtgy;
    @XmlElement(name = "SaleRcncltnId", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected String saleRcncltnId;
    @XmlElement(name = "SeqNbRg", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected CardSequenceNumberRange1 seqNbRg;
    @XmlElement(name = "TxDtRg", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected DateOrDateTimePeriod1Choice txDtRg;

    /**
     * Gets the value of the addtlSvc property.
     * 
     * @return
     *     possible object is
     *     {@link CardPaymentServiceType2Code }
     *     
     */
    public CardPaymentServiceType2Code getAddtlSvc() {
        return addtlSvc;
    }

    /**
     * Sets the value of the addtlSvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardPaymentServiceType2Code }
     *     
     */
    public void setAddtlSvc(CardPaymentServiceType2Code value) {
        this.addtlSvc = value;
    }

    /**
     * Gets the value of the txCtgy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxCtgy() {
        return txCtgy;
    }

    /**
     * Sets the value of the txCtgy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTxCtgy(String value) {
        this.txCtgy = value;
    }

    /**
     * Gets the value of the saleRcncltnId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaleRcncltnId() {
        return saleRcncltnId;
    }

    /**
     * Sets the value of the saleRcncltnId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaleRcncltnId(String value) {
        this.saleRcncltnId = value;
    }

    /**
     * Gets the value of the seqNbRg property.
     * 
     * @return
     *     possible object is
     *     {@link CardSequenceNumberRange1 }
     *     
     */
    public CardSequenceNumberRange1 getSeqNbRg() {
        return seqNbRg;
    }

    /**
     * Sets the value of the seqNbRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardSequenceNumberRange1 }
     *     
     */
    public void setSeqNbRg(CardSequenceNumberRange1 value) {
        this.seqNbRg = value;
    }

    /**
     * Gets the value of the txDtRg property.
     * 
     * @return
     *     possible object is
     *     {@link DateOrDateTimePeriod1Choice }
     *     
     */
    public DateOrDateTimePeriod1Choice getTxDtRg() {
        return txDtRg;
    }

    /**
     * Sets the value of the txDtRg property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateOrDateTimePeriod1Choice }
     *     
     */
    public void setTxDtRg(DateOrDateTimePeriod1Choice value) {
        this.txDtRg = value;
    }

}
