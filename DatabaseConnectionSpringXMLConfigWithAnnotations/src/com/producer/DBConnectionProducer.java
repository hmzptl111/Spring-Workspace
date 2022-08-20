package com.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dbConnection")
public class DBConnectionProducer {
	private Connection connection;
	
	public DBConnectionProducer(@Autowired @Qualifier("mysql") Connection connection) {
		this.connection = connection;
	}
	
	public void dbConnect() {
		connection.connect();
	}
	
	public void dbDisconnect() {
		connection.disconnect();
	}

//	public void setConnection(Connection connection) {
//		this.connection = connection;
//	}
}
