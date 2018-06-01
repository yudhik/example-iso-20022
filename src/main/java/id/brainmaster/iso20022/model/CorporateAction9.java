
package id.brainmaster.iso20022.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CorporateAction9 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CorporateAction9">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EvtTp" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Max35Text"/>
 *         &lt;element name="EvtId" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Max35Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporateAction9", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", propOrder = {
    "evtTp",
    "evtId"
})
public class CorporateAction9 {

    @XmlElement(name = "EvtTp", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", required = true)
    protected String evtTp;
    @XmlElement(name = "EvtId", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", required = true)
    protected String evtId;

    /**
     * Gets the value of the evtTp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtTp() {
        return evtTp;
    }

    /**
     * Sets the value of the evtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtTp(String value) {
        this.evtTp = value;
    }

    /**
     * Gets the value of the evtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEvtId() {
        return evtId;
    }

    /**
     * Sets the value of the evtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEvtId(String value) {
        this.evtId = value;
    }

}
