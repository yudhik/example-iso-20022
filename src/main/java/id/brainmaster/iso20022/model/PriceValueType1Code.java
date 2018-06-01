
package id.brainmaster.iso20022.model;

import javax.annotation.Generated;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PriceValueType1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PriceValueType1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="DISC"/>
 *     &lt;enumeration value="PREM"/>
 *     &lt;enumeration value="PARV"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PriceValueType1Code", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
@XmlEnum
@Generated(value = "com.sun.tools.internal.xjc.Driver", date = "2018-06-01T07:49:03+07:00", comments = "JAXB RI v2.2.8-b130911.1802")
public enum PriceValueType1Code {

    DISC,
    PREM,
    PARV;

    public String value() {
        return name();
    }

    public static PriceValueType1Code fromValue(String v) {
        return valueOf(v);
    }

}