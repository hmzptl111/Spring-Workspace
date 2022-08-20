package com.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.producer.DBConnectionProducer;

public class DBConnection {

	public static void main(String[] args) {
		ApplicationContext springContainer = new ClassPathXmlApplicationContext("Connection.xml");
		
		DBConnectionProducer db = (DBConnectionProducer)springContainer.getBean("dbConnection");
		db.dbConnect();
		db.dbDisconnect();
	}
}