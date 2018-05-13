
package id.brainmaster.iso20022.model;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ClearingSystemMemberIdentification2 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ClearingSystemMemberIdentification2">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ClrSysId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07}ClearingSystemIdentification2Choice" minOccurs="0"/>
 *         &lt;element name="MmbId" type="{urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07}Max35Text"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClearingSystemMemberIdentification2", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07", propOrder = {
    "clrSysId",
    "mmbId"
})
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
public class ClearingSystemMemberIdentification2 {

    @XmlElement(name = "ClrSysId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07")
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected ClearingSystemIdentification2Choice clrSysId;
    @XmlElement(name = "MmbId", namespace = "urn:iso:std:iso:20022:tech:xsd:pacs.008.001.07", required = true)
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    protected String mmbId;

    /**
     * Gets the value of the clrSysId property.
     * 
     * @return
     *     possible object is
     *     {@link ClearingSystemIdentification2Choice }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public ClearingSystemIdentification2Choice getClrSysId() {
        return clrSysId;
    }

    /**
     * Sets the value of the clrSysId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ClearingSystemIdentification2Choice }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setClrSysId(ClearingSystemIdentification2Choice value) {
        this.clrSysId = value;
    }

    /**
     * Gets the value of the mmbId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public String getMmbId() {
        return mmbId;
    }

    /**
     * Sets the value of the mmbId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    @Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-05-01T07:05:51+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
    public void setMmbId(String value) {
        this.mmbId = value;
    }

}
