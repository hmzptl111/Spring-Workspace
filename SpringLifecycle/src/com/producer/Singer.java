package com.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Singer implements Performer, BeanNameAware, BeanFactoryAware, ApplicationContextAware, 
InitializingBean, DisposableBean {
	private String song, singer;
	
	public Singer() {
		System.out.println("1. Constructor");
	}
	
	public void setSong(String song) {
		this.song = song;
		System.out.println("2. Property call (setter): " + song);
	}

	@Override
	public void perform() {
		System.out.println("Singing " + song);
	}

	@Override
	public void setBeanName(String name) {
		singer = name;
		System.out.println("3. Setting bean name: " + name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4. Setting bean factory: " + singer);
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("5. Setting application context: " + singer);
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("7. After properties set: " + singer);
	}
	
	public void chitranshuInit() {
		System.out.println("8. Customer init: " + singer);
	}
	
	public void hamzaInit() {
		System.out.println("8. Customer init: " + singer);
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("9. Default destroy: " + singer);
	}
	
	public void chitranshuDestroy() {
		System.out.println("10. Customer destroy: " + singer);
	}
	
	public void hamzaDestroy() {
		System.out.println("10. Customer destroy: " + singer);
	}
}