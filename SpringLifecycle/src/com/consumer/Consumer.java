package com.consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.Config;
import com.producer.Performer;

public class Consumer {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(Config.class);
		
		springContainer.registerShutdownHook();
		
		Performer chitranshu = (Performer)springContainer.getBean("Chitranshu");
		chitranshu.perform();
		

		Performer hamza = (Performer)springContainer.getBean("Hamza");
		hamza.perform();
		
//		Performer p2 = (Performer)springContainer.getBean("juggle");
//		p2.perform();
//		
//		Performer p3 = (Performer)springContainer.getBean("dance");
//		p3.perform();
//		
//		Performer p4 = (Performer)springContainer.getBean("instrumentalist");
//		p4.perform();
	}
}