//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.12 at 09:08:03 AM EST 
//


package edu.harvard.i2b2.crc.loader.datavo.loader.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for load_optionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="load_optionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="encrypt_blob" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="ignore_bad_data" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="delete_existing_data" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "load_optionType")
@XmlSeeAlso({
    FactLoadOptionType.class
})
public class LoadOptionType {

    @XmlAttribute(name = "encrypt_blob")
    protected Boolean encryptBlob;
    @XmlAttribute(name = "ignore_bad_data")
    protected Boolean ignoreBadData;
    @XmlAttribute(name = "delete_existing_data")
    protected Boolean deleteExistingData;

    /**
     * Gets the value of the encryptBlob property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isEncryptBlob() {
        if (encryptBlob == null) {
            return false;
        } else {
            return encryptBlob;
        }
    }

    /**
     * Sets the value of the encryptBlob property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEncryptBlob(Boolean value) {
        this.encryptBlob = value;
    }

    /**
     * Gets the value of the ignoreBadData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIgnoreBadData() {
        if (ignoreBadData == null) {
            return true;
        } else {
            return ignoreBadData;
        }
    }

    /**
     * Sets the value of the ignoreBadData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIgnoreBadData(Boolean value) {
        this.ignoreBadData = value;
    }

    /**
     * Gets the value of the deleteExistingData property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isDeleteExistingData() {
        if (deleteExistingData == null) {
            return false;
        } else {
            return deleteExistingData;
        }
    }

    /**
     * Sets the value of the deleteExistingData property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeleteExistingData(Boolean value) {
        this.deleteExistingData = value;
    }

}
