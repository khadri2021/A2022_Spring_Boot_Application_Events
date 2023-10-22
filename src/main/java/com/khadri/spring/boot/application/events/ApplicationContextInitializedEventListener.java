package com.khadri.spring.boot.application.events;

import org.springframework.boot.context.event.ApplicationContextInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;

public class ApplicationContextInitializedEventListener
		implements ApplicationListener<ApplicationContextInitializedEvent> {

 	@Override
	public void onApplicationEvent(ApplicationContextInitializedEvent event) {
		System.out.println("Application ContextInitialized Event Listener ");
		 
		System.out.println("===========================> "+event.getApplicationContext());
	}
 
}
