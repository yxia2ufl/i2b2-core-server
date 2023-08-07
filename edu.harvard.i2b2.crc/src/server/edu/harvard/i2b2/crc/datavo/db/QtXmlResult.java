/*******************************************************************************
 * Copyright (c) 2006-2018 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. I2b2 is also distributed under
 * the terms of the Healthcare Disclaimer.
 ******************************************************************************/
package edu.harvard.i2b2.crc.datavo.db;
// Generated Oct 10, 2006 5:52:18 PM by Hibernate Tools 3.1.0.beta5



/**
 * QtXmlResult generated by hbm2java
 */
public class QtXmlResult  implements java.io.Serializable {

    // Fields    

     private String xmlResultId;
     private QtQueryResultInstance qtQueryResultInstance;
     private String xmlValue;

     // Constructors

    /** default constructor */
    public QtXmlResult() {
    }

	/** minimal constructor */
    public QtXmlResult(String xmlResultId) {
        this.xmlResultId = xmlResultId;
    }
    /** full constructor */
    public QtXmlResult(String xmlResultId, QtQueryResultInstance qtQueryResultInstance, String xmlValue) {
       this.xmlResultId = xmlResultId;
       this.qtQueryResultInstance = qtQueryResultInstance;
       this.xmlValue = xmlValue;
    }
    
   
    // Property accessors
    public String getXmlResultId() {
        return this.xmlResultId;
    }
    
    public void setXmlResultId(String xmlResultId) {
        this.xmlResultId = xmlResultId;
    }
    public QtQueryResultInstance getQtQueryResultInstance() {
        return this.qtQueryResultInstance;
    }
    
    public void setQtQueryResultInstance(QtQueryResultInstance qtQueryResultInstance) {
        this.qtQueryResultInstance = qtQueryResultInstance;
    }
    public String getXmlValue() {
        return this.xmlValue;
    }
    
    public void setXmlValue(String xmlValue) {
        this.xmlValue = xmlValue;
    }




}


