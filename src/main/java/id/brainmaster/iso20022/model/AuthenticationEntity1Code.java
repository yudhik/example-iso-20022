
package id.brainmaster.iso20022.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationEntity1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationEntity1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ICCD"/>
 *     &lt;enumeration value="AGNT"/>
 *     &lt;enumeration value="MERC"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationEntity1Code", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
@XmlEnum
public enum AuthenticationEntity1Code {

    ICCD,
    AGNT,
    MERC;

    public String value() {
        return name();
    }

    public static AuthenticationEntity1Code fromValue(String v) {
        return valueOf(v);
    }

}
