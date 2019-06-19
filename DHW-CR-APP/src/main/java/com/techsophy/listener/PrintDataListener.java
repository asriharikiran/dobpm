package com.techsophy.listener;

import org.activiti.engine.delegate.DelegateTask;
import org.activiti.engine.delegate.TaskListener;
import org.apache.log4j.Logger;



public class PrintDataListener implements TaskListener {
	static final Logger logger = Logger.getLogger(PrintDataListener.class);
	@Override
	public void notify(DelegateTask delegateTask) {
		System.out.println("-----------------------Custom Listener in PrintDataListener----------------------------");
		logger.info("------------------------Custom Listener in PrintDataListener-------------------------------");
		
	}

}
