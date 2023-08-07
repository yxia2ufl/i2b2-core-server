/*******************************************************************************
 * Copyright (c) 2006-2018 Massachusetts General Hospital 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Mozilla Public License,
 * v. 2.0. If a copy of the MPL was not distributed with this file, You can
 * obtain one at http://mozilla.org/MPL/2.0/. I2b2 is also distributed under
 * the terms of the Healthcare Disclaimer.
 ******************************************************************************/
package edu.harvard.i2b2.crc.loader.dao;

import edu.harvard.i2b2.common.exception.I2B2DAOException;
import edu.harvard.i2b2.crc.loader.datavo.loader.query.MissingCodesConceptSetType;
import edu.harvard.i2b2.crc.loader.datavo.loader.query.MissingCodesModifierSetType;
import edu.harvard.i2b2.crc.loader.datavo.loader.query.MissingCodesObserverSetType;
import edu.harvard.i2b2.crc.loader.datavo.loader.query.MissingTermSetReportType;

public interface IMissingTermDAO {

	public MissingCodesConceptSetType getMissingConceptSet(int uploadId, int startPos, int endPos, boolean detailFlag)
	throws I2B2DAOException ;
	public MissingCodesObserverSetType getMissingObserverSet(int uploadId, int startPos, int endPos, boolean detailFlag)
	throws I2B2DAOException ;
	public MissingCodesModifierSetType getMissingModifierSet(int uploadId, int startPos, int endPos, boolean detailFlag)
	throws I2B2DAOException ;
	public MissingTermSetReportType getMissingTermReport(int uploadId,
			String setName) throws I2B2DAOException;
	
}
