
package id.brainmaster.iso20022.model;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Product2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Product2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PdctCd" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Max70Text"/>
 *         &lt;element name="UnitOfMeasr" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}UnitOfMeasure1Code" minOccurs="0"/>
 *         &lt;element name="PdctQty" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}DecimalNumber" minOccurs="0"/>
 *         &lt;element name="UnitPric" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="PdctAmt" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}ImpliedCurrencyAndAmount" minOccurs="0"/>
 *         &lt;element name="TaxTp" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Max35Text" minOccurs="0"/>
 *         &lt;element name="AddtlPdctInf" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Product2", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", propOrder = {
    "pdctCd",
    "unitOfMeasr",
    "pdctQty",
    "unitPric",
    "pdctAmt",
    "taxTp",
    "addtlPdctInf"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class Product2 {

    @XmlElement(name = "PdctCd", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String pdctCd;
    @XmlElement(name = "UnitOfMeasr", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    @XmlSchemaType(name = "string")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected UnitOfMeasure1Code unitOfMeasr;
    @XmlElement(name = "PdctQty", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigDecimal pdctQty;
    @XmlElement(name = "UnitPric", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigDecimal unitPric;
    @XmlElement(name = "PdctAmt", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected BigDecimal pdctAmt;
    @XmlElement(name = "TaxTp", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String taxTp;
    @XmlElement(name = "AddtlPdctInf", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String addtlPdctInf;

    /**
     * Gets the value of the pdctCd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getPdctCd() {
        return pdctCd;
    }

    /**
     * Sets the value of the pdctCd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPdctCd(String value) {
        this.pdctCd = value;
    }

    /**
     * Gets the value of the unitOfMeasr property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public UnitOfMeasure1Code getUnitOfMeasr() {
        return unitOfMeasr;
    }

    /**
     * Sets the value of the unitOfMeasr property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure1Code }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setUnitOfMeasr(UnitOfMeasure1Code value) {
        this.unitOfMeasr = value;
    }

    /**
     * Gets the value of the pdctQty property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigDecimal getPdctQty() {
        return pdctQty;
    }

    /**
     * Sets the value of the pdctQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPdctQty(BigDecimal value) {
        this.pdctQty = value;
    }

    /**
     * Gets the value of the unitPric property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigDecimal getUnitPric() {
        return unitPric;
    }

    /**
     * Sets the value of the unitPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setUnitPric(BigDecimal value) {
        this.unitPric = value;
    }

    /**
     * Gets the value of the pdctAmt property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public BigDecimal getPdctAmt() {
        return pdctAmt;
    }

    /**
     * Sets the value of the pdctAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setPdctAmt(BigDecimal value) {
        this.pdctAmt = value;
    }

    /**
     * Gets the value of the taxTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getTaxTp() {
        return taxTp;
    }

    /**
     * Sets the value of the taxTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setTaxTp(String value) {
        this.taxTp = value;
    }

    /**
     * Gets the value of the addtlPdctInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getAddtlPdctInf() {
        return addtlPdctInf;
    }

    /**
     * Sets the value of the addtlPdctInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAddtlPdctInf(String value) {
        this.addtlPdctInf = value;
    }

}