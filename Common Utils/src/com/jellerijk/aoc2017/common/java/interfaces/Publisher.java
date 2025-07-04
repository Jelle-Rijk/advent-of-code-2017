package com.jellerijk.aoc2017.common.java.interfaces;

public interface Publisher {
	public void addSubscriber(Subscriber sub);

	public void removeSubscriber(Subscriber sub);

	public void notifySubscribers();
}
