package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.producer.Dancer;
import com.producer.Drum;
import com.producer.Flute;
import com.producer.Guitar;
import com.producer.Instrumentalist;
import com.producer.Juggler;
import com.producer.PostProcessInitializations;
import com.producer.Singer;

@Configuration
public class Config {
	@Bean(name = "Chitranshu", initMethod = "chitranshuInit", destroyMethod = "chitranshuDestroy")
	public Singer singer() {
		Singer singer = new Singer();
		singer.setSong("Gulabi Aankhen");
		return singer;
	}
	
	@Bean(name = "Hamza", initMethod = "hamzaInit", destroyMethod = "hamzaDestroy")
	public Singer getSinger() {
		Singer singer = new Singer();
		singer.setSong("Mere Mehboob Qayamat Hogi");
		return singer;
	}
	
	@Bean(name = "juggle")
	public Juggler getJuggler() {
		return new Juggler(3);
	}
	
	@Bean(name = "dance")
	public Dancer getDancer() {
		Dancer dancer = new Dancer();
		dancer.setStyle("Classical");
		return dancer;
	}
	
	@Bean
	public Guitar guitar() {
		return new Guitar();
	}
	
	@Bean
	public Flute flute() {
		return new Flute();
	}
	
	@Bean
	public Drum drum() {
		return new Drum();
	}
	
	@Bean
	public Instrumentalist instrumentalist() {
		return new Instrumentalist(guitar());
	}
	
	@Bean
	public PostProcessInitializations postProcessInitializations() {
		return new PostProcessInitializations();
	}
}
