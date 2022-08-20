package com.producer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("mysql")
public class MySQLConnection implements Connection {
	private String url, username, password;
	
	public MySQLConnection(@Value("mysql_url") String url, @Value("mysql_user") String username, @Value("mysql_password") String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}
	
	@Override
	public void connect() {
		System.out.println("Connecting MySQL with url : " + url + ", username : " + username + ", password : " + password);

	}

	@Override
	public void disconnect() {
		System.out.println("Disconnecting MySQL!");

	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}