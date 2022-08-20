package com.producer;

public class Instrumentalist implements Performer {
	private Instrument instrument;
	
	public Instrumentalist(Instrument instrument) {
		super();
		this.instrument = instrument;
	}

	@Override
	public void perform() {
		System.out.println("Instrumentalist is performing");
		instrument.play();
	}
}