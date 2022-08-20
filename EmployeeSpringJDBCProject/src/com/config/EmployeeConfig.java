package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class EmployeeConfig {
	@Bean
	public DriverManagerDataSource mysqlDataSource() {
		DriverManagerDataSource dds = new DriverManagerDataSource();
		dds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dds.setUrl("jdbc:mysql://127.0.0.1:3306/wileyc256");
		dds.setUsername("root");
		dds.setPassword("wiley");
		
		return dds;
	}
	
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate();
		jdbcTemplate.setDataSource(mysqlDataSource());
		
		return jdbcTemplate;
	}
}
