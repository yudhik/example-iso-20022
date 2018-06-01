
package id.brainmaster.iso20022.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TrackData1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TrackData1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TrckNb" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Exact1NumericText" minOccurs="0"/>
 *         &lt;element name="TrckVal" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Max140Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrackData1", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", propOrder = {
    "trckNb",
    "trckVal"
})
public class TrackData1 {

    @XmlElement(name = "TrckNb", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected String trckNb;
    @XmlElement(name = "TrckVal", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", required = true)
    protected String trckVal;

    /**
     * Gets the value of the trckNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrckNb() {
        return trckNb;
    }

    /**
     * Sets the value of the trckNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrckNb(String value) {
        this.trckNb = value;
    }

    /**
     * Gets the value of the trckVal property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrckVal() {
        return trckVal;
    }

    /**
     * Sets the value of the trckVal property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTrckVal(String value) {
        this.trckVal = value;
    }

}
