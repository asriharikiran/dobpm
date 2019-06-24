package com.techsophy.listener;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.apache.log4j.Logger;



public class PrintLogger implements TaskListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	static final Logger logger = Logger.getLogger(PrintLogger.class);
	
	@Override
	public void notify(DelegateTask delegateTask) {
		
		logger.info("------------------------Custom Listener in PrintLogger-------------------------------");
		
	}

}
