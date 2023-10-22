package com.khadri.spring.boot.application.events;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

public class AppStartListener implements ApplicationListener<ApplicationStartingEvent >{

	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		 System.out.println("Application Start Listener");
		
	}

}
