//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.12 at 09:08:03 AM EST 
//


package edu.harvard.i2b2.crc.datavo.pdo.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GetEventByPrimaryKey_requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GetEventByPrimaryKey_requestType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}requestType">
 *       &lt;sequence>
 *         &lt;element name="event_primary_key" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}event_primary_key_Type"/>
 *         &lt;element name="event_output_option" type="{http://www.i2b2.org/xsd/cell/crc/pdo/1.1/}output_optionType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetEventByPrimaryKey_requestType", propOrder = {
    "eventPrimaryKey",
    "eventOutputOption"
})
public class GetEventByPrimaryKeyRequestType
    extends RequestType
{

    @XmlElement(name = "event_primary_key", required = true)
    protected EventPrimaryKeyType eventPrimaryKey;
    @XmlElement(name = "event_output_option", required = true)
    protected OutputOptionType eventOutputOption;

    /**
     * Gets the value of the eventPrimaryKey property.
     * 
     * @return
     *     possible object is
     *     {@link EventPrimaryKeyType }
     *     
     */
    public EventPrimaryKeyType getEventPrimaryKey() {
        return eventPrimaryKey;
    }

    /**
     * Sets the value of the eventPrimaryKey property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventPrimaryKeyType }
     *     
     */
    public void setEventPrimaryKey(EventPrimaryKeyType value) {
        this.eventPrimaryKey = value;
    }

    /**
     * Gets the value of the eventOutputOption property.
     * 
     * @return
     *     possible object is
     *     {@link OutputOptionType }
     *     
     */
    public OutputOptionType getEventOutputOption() {
        return eventOutputOption;
    }

    /**
     * Sets the value of the eventOutputOption property.
     * 
     * @param value
     *     allowed object is
     *     {@link OutputOptionType }
     *     
     */
    public void setEventOutputOption(OutputOptionType value) {
        this.eventOutputOption = value;
    }

}
