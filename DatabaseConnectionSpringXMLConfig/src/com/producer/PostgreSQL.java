package com.producer;

public class PostgreSQL implements Connection {
	private String url,username,password;
	
	public PostgreSQL(String url, String username, String password) {
		super();
		this.url = url;
		this.username = username;
		this.password = password;
	}

	@Override
	public void connect() {
		System.out.println("Connecting PostgreSQL with url : "+url+", username : "+username+", password : "+password);

	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting PostgreSQL!");
	}
}
