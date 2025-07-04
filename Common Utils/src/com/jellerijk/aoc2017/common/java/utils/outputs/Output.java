package com.jellerijk.aoc2017.common.java.utils.outputs;

import java.util.ArrayList;
import java.util.List;

import com.jellerijk.aoc2017.common.java.interfaces.OutputSubscriber;
import com.jellerijk.aoc2017.common.java.interfaces.Publisher;
import com.jellerijk.aoc2017.common.java.interfaces.Subscriber;

public abstract class Output<T> implements Publisher {
	private T output;

	private List<OutputSubscriber> subscribers;

	public Output() {
		subscribers = new ArrayList<OutputSubscriber>();
	}

	protected List<OutputSubscriber> getSubscribers() {
		return subscribers;
	}

	public void setOutput(T output) {
		this.output = output;
		notifySubscribers();
	};

	protected T getOutput() {
		return output;
	};

	public void addSubscriber(Subscriber sub) {
		if (sub instanceof OutputSubscriber oSub)
			subscribers.add(oSub);
		else
			throw new IllegalArgumentException("Cannot add a non-output Subscriber as a Subscriber of Output");
	}

	public void removeSubscriber(Subscriber sub) {
		subscribers.remove(sub);
	}

}
