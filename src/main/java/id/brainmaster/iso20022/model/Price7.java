
package id.brainmaster.iso20022.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Price7 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Price7">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}YieldedOrValueType1Choice"/>
 *         &lt;element name="Val" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}PriceRateOrAmount3Choice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Price7", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", propOrder = {
    "tp",
    "val"
})
public class Price7 {

    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", required = true)
    protected YieldedOrValueType1Choice tp;
    @XmlElement(name = "Val", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", required = true)
    protected PriceRateOrAmount3Choice val;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link YieldedOrValueType1Choice }
     *     
     */
    public YieldedOrValueType1Choice getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link YieldedOrValueType1Choice }
     *     
     */
    public void setTp(YieldedOrValueType1Choice value) {
        this.tp = value;
    }

    /**
     * Gets the value of the val property.
     * 
     * @return
     *     possible object is
     *     {@link PriceRateOrAmount3Choice }
     *     
     */
    public PriceRateOrAmount3Choice getVal() {
        return val;
    }

    /**
     * Sets the value of the val property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceRateOrAmount3Choice }
     *     
     */
    public void setVal(PriceRateOrAmount3Choice value) {
        this.val = value;
    }

}
