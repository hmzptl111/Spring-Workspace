package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.sujata.persistence.EmployeeDao;
import com.sujata.persistence.EmployeeDaoImpl;
import com.sujata.presentation.EmployeePresentation;
import com.sujata.presentation.EmployeePresentationImpl;
import com.sujata.service.EmployeeService;
import com.sujata.service.EmployeeServiceImpl;

public class EmployeeConfig {
	
	@Bean
	public EmployeePresentationImpl employeePresentation() {
		EmployeePresentationImpl epi = new EmployeePresentationImpl();
		epi.setEmployeeService(employeeService());
		
		return epi;
	}
	
	@Bean
	public EmployeeServiceImpl employeeService() {
		EmployeeServiceImpl esi = new EmployeeServiceImpl();
		esi.setEmployeeDao(employeeDao());
		
		return esi;
	}
	
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
	public EmployeeDaoImpl employeeDao() {
		EmployeeDaoImpl edi = new EmployeeDaoImpl();
		edi.setDataSource(mysqlDataSource());
		
		return edi;
	}
}
