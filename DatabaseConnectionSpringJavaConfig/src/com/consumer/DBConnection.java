package com.consumer;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.config.ConnectionConfig;
import com.producer.DBConnectionProducer;

public class DBConnection {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext springContainer = new AnnotationConfigApplicationContext(ConnectionConfig.class);
		DBConnectionProducer db = (DBConnectionProducer)springContainer.getBean("dbConnection");
		
		db.dbConnect();
		db.dbDisconnect();
	}
}