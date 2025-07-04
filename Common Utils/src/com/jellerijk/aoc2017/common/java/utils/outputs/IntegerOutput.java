package com.jellerijk.aoc2017.common.java.utils.outputs;

public class IntegerOutput extends Output<Integer> {

	@Override
	public void notifySubscribers() {
		getSubscribers().forEach(sub -> {
			sub.displayOutput(getOutput());
			sub.update();
		});
	}
}
