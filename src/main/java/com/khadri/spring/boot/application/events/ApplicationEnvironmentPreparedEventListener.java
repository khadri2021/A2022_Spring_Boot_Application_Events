package com.khadri.spring.boot.application.events;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;

public class ApplicationEnvironmentPreparedEventListener
		implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

	private ConfigurableEnvironment configurableEnvironment;

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
		System.out.println("Application Environment PreparedEvent Listener ");
		this.configurableEnvironment = event.getEnvironment();
	}

	public ConfigurableEnvironment getConfigurableEnvironment() {
		return configurableEnvironment;
	} 
}
