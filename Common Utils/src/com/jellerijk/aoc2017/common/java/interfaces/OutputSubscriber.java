package com.jellerijk.aoc2017.common.java.interfaces;

public interface OutputSubscriber extends Subscriber {
	public void displayOutput(String output);

	public default void displayOutput(int output) {
		displayOutput(Integer.toString(output));
	}
}
