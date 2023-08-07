//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.12 at 09:08:03 AM EST 
//


package edu.harvard.i2b2.crc.datavo.setfinder.query;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for queryModeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="queryModeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="optimize_without_temp_table"/>
 *     &lt;enumeration value="count_min_sketch"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "queryModeType")
@XmlEnum
public enum QueryModeType {

    @XmlEnumValue("optimize_without_temp_table")
    OPTIMIZE_WITHOUT_TEMP_TABLE("optimize_without_temp_table"),
    @XmlEnumValue("count_min_sketch")
    COUNT_MIN_SKETCH("count_min_sketch");
    private final String value;

    QueryModeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QueryModeType fromValue(String v) {
        for (QueryModeType c: QueryModeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
