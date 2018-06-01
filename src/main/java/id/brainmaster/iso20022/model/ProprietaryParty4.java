
package id.brainmaster.iso20022.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProprietaryParty4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProprietaryParty4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tp" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Max35Text"/>
 *         &lt;element name="Pty" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Party35Choice"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProprietaryParty4", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", propOrder = {
    "tp",
    "pty"
})
public class ProprietaryParty4 {

    @XmlElement(name = "Tp", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", required = true)
    protected String tp;
    @XmlElement(name = "Pty", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", required = true)
    protected Party35Choice pty;

    /**
     * Gets the value of the tp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTp() {
        return tp;
    }

    /**
     * Sets the value of the tp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTp(String value) {
        this.tp = value;
    }

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link Party35Choice }
     *     
     */
    public Party35Choice getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Party35Choice }
     *     
     */
    public void setPty(Party35Choice value) {
        this.pty = value;
    }

}
