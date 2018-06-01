
package id.brainmaster.iso20022.model;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CardDataReading1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CardDataReading1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="TAGC"/>
 *     &lt;enumeration value="PHYS"/>
 *     &lt;enumeration value="BRCD"/>
 *     &lt;enumeration value="MGST"/>
 *     &lt;enumeration value="CICC"/>
 *     &lt;enumeration value="DFLE"/>
 *     &lt;enumeration value="CTLS"/>
 *     &lt;enumeration value="ECTL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CardDataReading1Code", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum CardDataReading1Code {

    TAGC,
    PHYS,
    BRCD,
    MGST,
    CICC,
    DFLE,
    CTLS,
    ECTL;

    public String value() {
        return name();
    }

    public static CardDataReading1Code fromValue(String v) {
        return valueOf(v);
    }

}
