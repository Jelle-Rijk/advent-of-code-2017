package com.jellerijk.aoc2017.common.java.gui.inputs;

import com.jellerijk.aoc2017.common.java.interfaces.Submittable;

import javafx.scene.Group;

public abstract class InputElement<T> extends Group implements Submittable<T> {
	private Submittable<T> submitFunction;
	private T input;

	public InputElement(Submittable<T> submitFunction) {
		setSubmitFunction(submitFunction);
	}

	public void submit(T input) throws Exception {
		submitFunction.submit(input);
	}

	protected void submit() throws Exception {
		submit(getInput());
	}

	/*
	 * GETTER / SETTER
	 */
	protected final void setInput(T input) {
		this.input = input;
	}

	protected T getInput() {
		return input;
	}

	private void setSubmitFunction(Submittable<T> submitFunction) {
		if (submitFunction == null)
			throw new IllegalArgumentException("Submit function was not passed to the InputElement");
		this.submitFunction = submitFunction;
	}
}
