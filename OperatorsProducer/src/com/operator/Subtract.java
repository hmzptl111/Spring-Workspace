package com.operator;

public class Subtract implements Operator {
	public int n1, n2;
	
	public Subtract(int n1, int n2) {
		this.n1 = n1;
		this.n2 = n2;
	}
	
	@Override
	public int perform() {
		return (n1 - n2);
	}

}
