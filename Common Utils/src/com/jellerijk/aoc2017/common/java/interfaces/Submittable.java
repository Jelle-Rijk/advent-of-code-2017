package com.jellerijk.aoc2017.common.java.interfaces;

@FunctionalInterface
public interface Submittable<T> {
	public void submit(T data) throws Exception;
}
