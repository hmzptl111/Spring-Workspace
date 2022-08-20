package com.producer;

public class DBConnectionProducer {
	private Connection connection;
	
	public void dbConnect() {
		connection.connect();
	}
	
	public void dbDisconnect() {
		connection.disconnect();
	}

	public void setConnection(Connection connection) {
		this.connection = connection;
	}
}
