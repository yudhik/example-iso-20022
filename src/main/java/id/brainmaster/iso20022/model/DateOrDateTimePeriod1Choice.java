
package id.brainmaster.iso20022.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DateOrDateTimePeriod1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DateOrDateTimePeriod1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Dt" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}DatePeriod2"/>
 *         &lt;element name="DtTm" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}DateTimePeriod1"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DateOrDateTimePeriod1Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", propOrder = {
    "dt",
    "dtTm"
})
public class DateOrDateTimePeriod1Choice {

    @XmlElement(name = "Dt", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected DatePeriod2 dt;
    @XmlElement(name = "DtTm", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected DateTimePeriod1 dtTm;

    /**
     * Gets the value of the dt property.
     * 
     * @return
     *     possible object is
     *     {@link DatePeriod2 }
     *     
     */
    public DatePeriod2 getDt() {
        return dt;
    }

    /**
     * Sets the value of the dt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DatePeriod2 }
     *     
     */
    public void setDt(DatePeriod2 value) {
        this.dt = value;
    }

    /**
     * Gets the value of the dtTm property.
     * 
     * @return
     *     possible object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public DateTimePeriod1 getDtTm() {
        return dtTm;
    }

    /**
     * Sets the value of the dtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimePeriod1 }
     *     
     */
    public void setDtTm(DateTimePeriod1 value) {
        this.dtTm = value;
    }

}
