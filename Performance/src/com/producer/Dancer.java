package com.producer;

public class Dancer implements Performer {
	private String style;
	
	public void setStyle(String style) {
		this.style = style;
	}

	@Override
	public void perform() {
		System.out.println(style + " dance");
	}
}