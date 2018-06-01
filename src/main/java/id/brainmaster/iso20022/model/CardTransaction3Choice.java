
package id.brainmaster.iso20022.model;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardTransaction3Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CardTransaction3Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Aggtd" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}CardAggregated2"/>
 *         &lt;element name="Indv" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}CardIndividualTransaction2"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CardTransaction3Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", propOrder = {
    "aggtd",
    "indv"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class CardTransaction3Choice {

    @XmlElement(name = "Aggtd", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CardAggregated2 aggtd;
    @XmlElement(name = "Indv", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected CardIndividualTransaction2 indv;

    /**
     * Gets the value of the aggtd property.
     * 
     * @return
     *     possible object is
     *     {@link CardAggregated2 }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CardAggregated2 getAggtd() {
        return aggtd;
    }

    /**
     * Sets the value of the aggtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardAggregated2 }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAggtd(CardAggregated2 value) {
        this.aggtd = value;
    }

    /**
     * Gets the value of the indv property.
     * 
     * @return
     *     possible object is
     *     {@link CardIndividualTransaction2 }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public CardIndividualTransaction2 getIndv() {
        return indv;
    }

    /**
     * Sets the value of the indv property.
     * 
     * @param value
     *     allowed object is
     *     {@link CardIndividualTransaction2 }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIndv(CardIndividualTransaction2 value) {
        this.indv = value;
    }

}
