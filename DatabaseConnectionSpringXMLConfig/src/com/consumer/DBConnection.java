package com.consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.producer.DBConnectionProducer;

public class DBConnection {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Connection.xml");
		DBConnectionProducer db = (DBConnectionProducer)applicationContext.getBean("dbConnection");
		
		db.dbConnect();
		db.dbDisconnect();
	}
}