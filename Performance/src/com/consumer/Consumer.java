package com.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.producer.Performer;

public class Consumer {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Performer.xml");
		
		Performer singer = (Performer)applicationContext.getBean("sing");
		singer.perform();
		
		Performer dancer = (Performer)applicationContext.getBean("dance");
		dancer.perform();
		
		Performer juggler = (Performer)applicationContext.getBean("juggle");
		juggler.perform();
		
		Performer instrumentalist = (Performer)applicationContext.getBean("instrumentalist");
		instrumentalist.perform();
	}
}