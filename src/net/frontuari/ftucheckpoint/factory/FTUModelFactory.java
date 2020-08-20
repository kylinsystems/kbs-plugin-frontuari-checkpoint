package net.frontuari.ftucheckpoint.factory;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;

import net.frontuari.model.MFTU_CheckPointSeqLine;

public class FTUModelFactory implements IModelFactory{

	@Override
	public Class<?> getClass(String tableName) {
		// TODO Auto-generated method stub
		if(tableName.equalsIgnoreCase(MFTU_CheckPointSeqLine.Table_Name))
			return MFTU_CheckPointSeqLine.class;
		
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		// TODO Auto-generated method stub
		if(tableName.equalsIgnoreCase(MFTU_CheckPointSeqLine.Table_Name))
			return new MFTU_CheckPointSeqLine(Env.getCtx(), Record_ID, trxName);
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		// TODO Auto-generated method stub
		if(tableName.equalsIgnoreCase(MFTU_CheckPointSeqLine.Table_Name))
			return new MFTU_CheckPointSeqLine(Env.getCtx(), rs, trxName);
		return null;
	}

}
