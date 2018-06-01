
package id.brainmaster.iso20022.model;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TransactionEnvironment1Code.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TransactionEnvironment1Code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="MERC"/>
 *     &lt;enumeration value="PRIV"/>
 *     &lt;enumeration value="PUBL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "TransactionEnvironment1Code", namespace = "urn:iso:std:iso:20022:tech:xsd:iso20022")
@XmlEnum
public enum TransactionEnvironment1Code {

    MERC,
    PRIV,
    PUBL;

    public String value() {
        return name();
    }

    public static TransactionEnvironment1Code fromValue(String v) {
        return valueOf(v);
    }

}
