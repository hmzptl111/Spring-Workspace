package com.producer;

public class Singer implements Performer {
	private String song;
	
	public void setSong(String song) {
		this.song = song;
	}

	@Override
	public void perform() {
		System.out.println("Singing " + song);
	}
}