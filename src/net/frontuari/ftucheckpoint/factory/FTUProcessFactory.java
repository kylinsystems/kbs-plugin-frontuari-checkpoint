package net.frontuari.ftucheckpoint.factory;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;

import net.frontuari.ftucheckpoint.process.FTUConfirmedCheckPoint;
import net.frontuari.ftucheckpoint.process.FTUConfirmedCheckPointAdmin;

public class FTUProcessFactory implements IProcessFactory{

	@Override
	public ProcessCall newProcessInstance(String className) {
	
		
		if(className.equals("net.frontuari.ftucheckpoint.FTUConfirmedCheckPoint"))
			return new FTUConfirmedCheckPoint();
		
		if(className.equals("net.frontuari.ftucheckpoint.FTUConfirmedCheckPointAdmin"))
			return new FTUConfirmedCheckPointAdmin();
		
		return null;
	}

}
