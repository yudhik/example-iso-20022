
package id.brainmaster.iso20022.model;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GenericPersonIdentification1 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GenericPersonIdentification1">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07}Max35Text"/>
 *         &lt;element name="SchmeNm" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07}PersonIdentificationSchemeName1Choice" minOccurs="0"/>
 *         &lt;element name="Issr" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07}Max35Text" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericPersonIdentification1", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07", propOrder = {
    "id",
    "schmeNm",
    "issr"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class GenericPersonIdentification1 {

    @XmlElement(name = "Id", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String id;
    @XmlElement(name = "SchmeNm", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected PersonIdentificationSchemeName1Choice schmeNm;
    @XmlElement(name = "Issr", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String issr;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the schmeNm property.
     * 
     * @return
     *     possible object is
     *     {@link PersonIdentificationSchemeName1Choice }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public PersonIdentificationSchemeName1Choice getSchmeNm() {
        return schmeNm;
    }

    /**
     * Sets the value of the schmeNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonIdentificationSchemeName1Choice }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setSchmeNm(PersonIdentificationSchemeName1Choice value) {
        this.schmeNm = value;
    }

    /**
     * Gets the value of the issr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getIssr() {
        return issr;
    }

    /**
     * Sets the value of the issr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setIssr(String value) {
        this.issr = value;
    }

}
