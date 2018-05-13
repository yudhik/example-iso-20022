
package id.brainmaster.iso20022.model;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NameAndAddress10 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NameAndAddress10">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Nm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07}Max140Text"/>
 *         &lt;element name="Adr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07}PostalAddress6"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NameAndAddress10", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07", propOrder = {
    "nm",
    "adr"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class NameAndAddress10 {

    @XmlElement(name = "Nm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String nm;
    @XmlElement(name = "Adr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PostalAddress6 adr;

    /**
     * Gets the value of the nm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getNm() {
        return nm;
    }

    /**
     * Sets the value of the nm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setNm(String value) {
        this.nm = value;
    }

    /**
     * Gets the value of the adr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PostalAddress6 getAdr() {
        return adr;
    }

    /**
     * Sets the value of the adr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setAdr(PostalAddress6 value) {
        this.adr = value;
    }

}
