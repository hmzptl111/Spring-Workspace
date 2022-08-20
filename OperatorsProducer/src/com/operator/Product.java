package com.operator;

public class Product implements Operator {
	public int n1, n2;

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	@Override
	public int perform() {
		return (n1 * n2);
	}
}