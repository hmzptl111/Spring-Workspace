package com.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("postgres")
public class PostgreSQL implements Connection {
	private String url,username,password;
	
	public PostgreSQL(@Value("postgres_url") String url, @Value("postgres_user") String username, @Value("postgres_password") String password) {
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
