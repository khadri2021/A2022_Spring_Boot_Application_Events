package com.khadri.spring.boot.application.events;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class A2022SpringBootApplicationEventsApplication {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(A2022SpringBootApplicationEventsApplication.class);
		System.out.println("Before run");
		application.addListeners(new AppStartListener(), new ApplicationEnvironmentPreparedEventListener(),
				new ApplicationContextInitializedEventListener(), new ApplicationPreparedEventListener(),
				new ApplicationStartedEventListener(),new ApplicationReadyEventListener(),new ApplicationFailedEventListener());
		 application.run(args);
		System.out.println("After run");
			}

}
