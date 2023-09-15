package com.limit.bean;

public class LimitConfiguration {

	private int maximum;
	private int minimum;

	public int getMaximum() {
		return maximum;
	}

	public int getMinimum() {
		return minimum;
	}
	private LimitConfiguration() {
		
	}

	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}

	@Override
	public String toString() {
		return "LimitConfiguration [maximum=" + maximum + ", minimum=" + minimum + "]";
	}
}
