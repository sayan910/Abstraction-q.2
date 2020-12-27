package com.model;

public class Sphere extends Shape {
	private int radius;

	public Sphere(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public double calculateVolume() {
		// TODO Auto-generated method stub
		double volume=(Math.PI*4*radius*radius*radius)/3;
		return volume;
	}
	
	
	

}
