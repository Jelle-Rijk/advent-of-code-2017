package com.jellerijk.aoc2017.common.java.gui.inputs;

import com.jellerijk.aoc2017.common.java.interfaces.Submittable;

import javafx.scene.control.TextField;

public class IntegerInput extends InputElement<Integer> {
	TextField txfInput;

	public IntegerInput(Submittable<Integer> submitFunction) {
		super(submitFunction);
		buildGUI();
	}

	private void buildGUI() {
		txfInput = new TextField();
		getChildren().add(txfInput);
		txfInput.setPromptText("Please enter an integer");
		txfInput.setOnKeyTyped(evt -> onKeyTyped());
		txfInput.setOnAction(evt -> {
			try {
				submit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});
	}

	private void onKeyTyped() {
		try {
			String inputString = txfInput.getText();
			int input = inputString.isBlank() ? 0 : Integer.parseInt(inputString);
			setInput(input);
		} catch (NumberFormatException nfe) {
			if (getInput() == null)
				setInput(0);
		}
		txfInput.setText(getInput().toString());
		txfInput.positionCaret(txfInput.getText().length());
	}
}
