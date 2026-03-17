package com;

public class Rettangolo {
	private float b;
	private float h;
	
	public Rettangolo(float b, float h) {
		super();
		this.b = b;
		this.h = h;
	}
	
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public float getH() {
		return h;
	}
	public void setH(float h) {
		this.h = h;
	}
	
	public float calculatePerimeter() {
		return (b+h) * 2;
	}
	
	public float calculateArea() {
		return b*h;
	}
	
}
