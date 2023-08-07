//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.12 at 09:08:03 AM EST 
//


package edu.harvard.i2b2.crc.datavo.pdo.query;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for outputOptionTimeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="outputOptionTimeType">
 *   &lt;restriction base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}tokenType">
 *     &lt;enumeration value="nozone"/>
 *     &lt;enumeration value="withzone"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "outputOptionTimeType")
@XmlEnum
public enum OutputOptionTimeType {


    /**
     * No Zone
     * 
     */
    @XmlEnumValue("nozone")
    NOZONE("nozone"),

    /**
     * With Zone
     * 
     */
    @XmlEnumValue("withzone")
    WITHZONE("withzone");
    private final String value;

    OutputOptionTimeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OutputOptionTimeType fromValue(String v) {
        for (OutputOptionTimeType c: OutputOptionTimeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
