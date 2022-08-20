package com.producer;

public class Juggler implements Performer {
	private int balls;
	
	public Juggler(int balls) {
		this.balls = balls;
	}
	
//	public void setBalls(int balls) {
//		this.balls = balls;
//	}

	@Override
	public void perform() {
		System.out.println("Juggling " + balls + " balls");
	}
}