//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2021.02.12 at 09:08:03 AM EST 
//


package edu.harvard.i2b2.crc.datavo.ontology;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for metadataLoadType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="metadataLoadType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadata" type="{http://www.i2b2.org/xsd/cell/ont/1.1/}ontologyDataType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute name="table_name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="truncate_table" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "metadataLoadType", propOrder = {
    "metadata"
})
public class MetadataLoadType {

    @XmlElement(required = true)
    protected List<OntologyDataType> metadata;
    @XmlAttribute(name = "table_name")
    protected String tableName;
    @XmlAttribute(name = "truncate_table")
    protected Boolean truncateTable;

    /**
     * Gets the value of the metadata property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the metadata property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMetadata().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OntologyDataType }
     * 
     * 
     */
    public List<OntologyDataType> getMetadata() {
        if (metadata == null) {
            metadata = new ArrayList<OntologyDataType>();
        }
        return this.metadata;
    }

    /**
     * Gets the value of the tableName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTableName() {
        return tableName;
    }

    /**
     * Sets the value of the tableName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTableName(String value) {
        this.tableName = value;
    }

    /**
     * Gets the value of the truncateTable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isTruncateTable() {
        if (truncateTable == null) {
            return false;
        } else {
            return truncateTable;
        }
    }

    /**
     * Sets the value of the truncateTable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTruncateTable(Boolean value) {
        this.truncateTable = value;
    }

}
