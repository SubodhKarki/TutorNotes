package com.assignment.arjun.MultiThreading;

public class CentimetersToMeters extends Thread {
	private float centimeters;

	CentimetersToMeters(float centimeters) {
		this.centimeters = centimeters;
	}

	float convert() {
		return (float) (this.centimeters / 100.0);
	}

	public void run() {
		System.out.println("In meters: " + convert());
	}
}
