//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.04.21 at 11:00:32 AM EDT 
//


package edu.harvard.i2b2.crc.datavo.setfinder.query;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for set_job_requestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="set_job_requestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="job" type="{http://www.i2b2.org/xsd/cell/crc/psm/1.1/}jobType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "set_job_requestType", propOrder = {
    "job"
})
public class SetJobRequestType {

    @XmlElement(required = true)
    protected JobType job;

    /**
     * Gets the value of the job property.
     * 
     * @return
     *     possible object is
     *     {@link JobType }
     *     
     */
    public JobType getJob() {
        return job;
    }

    /**
     * Sets the value of the job property.
     * 
     * @param value
     *     allowed object is
     *     {@link JobType }
     *     
     */
    public void setJob(JobType value) {
        this.job = value;
    }

}
