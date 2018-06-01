
package id.brainmaster.iso20022.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SequenceRange1Choice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SequenceRange1Choice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="FrSeq" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Max35Text"/>
 *         &lt;element name="ToSeq" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Max35Text"/>
 *         &lt;element name="FrToSeq" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}SequenceRange1" maxOccurs="unbounded"/>
 *         &lt;element name="EQSeq" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Max35Text" maxOccurs="unbounded"/>
 *         &lt;element name="NEQSeq" type="{urn:iso:std:iso:20022:tech:xsd:iso20022}Max35Text" maxOccurs="unbounded"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SequenceRange1Choice", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022", propOrder = {
    "frSeq",
    "toSeq",
    "frToSeq",
    "eqSeq",
    "neqSeq"
})
public class SequenceRange1Choice {

    @XmlElement(name = "FrSeq", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected String frSeq;
    @XmlElement(name = "ToSeq", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected String toSeq;
    @XmlElement(name = "FrToSeq", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected List<SequenceRange1> frToSeq;
    @XmlElement(name = "EQSeq", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected List<String> eqSeq;
    @XmlElement(name = "NEQSeq", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
    protected List<String> neqSeq;

    /**
     * Gets the value of the frSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFrSeq() {
        return frSeq;
    }

    /**
     * Sets the value of the frSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFrSeq(String value) {
        this.frSeq = value;
    }

    /**
     * Gets the value of the toSeq property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToSeq() {
        return toSeq;
    }

    /**
     * Sets the value of the toSeq property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToSeq(String value) {
        this.toSeq = value;
    }

    /**
     * Gets the value of the frToSeq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the frToSeq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFrToSeq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SequenceRange1 }
     * 
     * 
     */
    public List<SequenceRange1> getFrToSeq() {
        if (frToSeq == null) {
            frToSeq = new ArrayList<SequenceRange1>();
        }
        return this.frToSeq;
    }

    /**
     * Gets the value of the eqSeq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the eqSeq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEQSeq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getEQSeq() {
        if (eqSeq == null) {
            eqSeq = new ArrayList<String>();
        }
        return this.eqSeq;
    }

    /**
     * Gets the value of the neqSeq property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the neqSeq property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNEQSeq().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNEQSeq() {
        if (neqSeq == null) {
            neqSeq = new ArrayList<String>();
        }
        return this.neqSeq;
    }

}
