package com.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sybase")
public class SybaseConnection implements Connection {
	private String url,username,password;
	
	public SybaseConnection(@Value("sybase_url") String url, @Value("sybase_user") String username, @Value("sybase_password") String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	@Override
	public void connect() {
		System.out.println("Connecting Sybase with url : "+url+", username : "+username+", password : "+password);

	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting Sybase!");

	}

	public void setUrl(@Value("sybase_url") String url) {
		this.url = url;
	}

	public void setUsername(@Value("sybase_user") String username) {
		this.username = username;
	}

	public void setPassword(@Value("sybase_password") String password) {
		this.password = password;
	}
}
