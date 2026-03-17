package com;

public class Calcolatrice {
	private float a;
	private float b;
	
	
	
	public Calcolatrice(float a, float b) {
		super();
		this.a = a;
		this.b = b;
	}

	public float getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public float getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public float sum() {
		return a + b;
	}
	
	public float difference() {
		return a - b;	
	}
	
	public float moltiplication() {
		return a * b;
	}
	
	public float division() {
		return a / b;
	}
}
