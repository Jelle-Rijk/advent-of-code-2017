package com.jellerijk.aoc2017.common.java.utils.outputs;

public class StringOutput extends Output<String> {
	@Override
	public void notifySubscribers() {
		getSubscribers().forEach(sub -> {
			sub.displayOutput(getOutput());
			sub.update();
		});
	}
}
