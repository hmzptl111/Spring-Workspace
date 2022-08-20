package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.producer.Dancer;
import com.producer.Drum;
import com.producer.Flute;
import com.producer.Guitar;
import com.producer.Instrumentalist;
import com.producer.Juggler;
import com.producer.Singer;

@Configuration
public class Config {
	@Bean
	public Singer sing() {
		Singer singer = new Singer();
		singer.setSong("Gulabi Aankhen");
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
}
