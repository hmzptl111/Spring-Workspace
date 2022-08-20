package com.producer;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class PostProcessInitializations implements BeanPostProcessor {
	
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("6. PreInitialization bean post processor: " + beanName);
		return BeanPostProcessor.super.postProcessBeforeInitialization(bean, beanName);
	}
	
	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("9. PostInitialization bean post processor: " + beanName);
		return BeanPostProcessor.super.postProcessAfterInitialization(bean, beanName);
	}
}
