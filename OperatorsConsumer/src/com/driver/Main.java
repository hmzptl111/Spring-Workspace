package com.driver;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.operator.Operator;

public class Main {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("OperatorsConfiguration.xml");
		
		Operator op = (Operator)applicationContext.getBean("divide");
		int result = op.perform();
		
		System.out.println(result);
		
	}
}