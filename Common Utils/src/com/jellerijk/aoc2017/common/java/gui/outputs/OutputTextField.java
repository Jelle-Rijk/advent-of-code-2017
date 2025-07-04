package com.jellerijk.aoc2017.common.java.gui.outputs;

import com.jellerijk.aoc2017.common.java.interfaces.OutputSubscriber;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class OutputTextField extends VBox implements OutputSubscriber {
	private TextField display;

	private String label;
	private String prompt;

	/**
	 * Creates a TextField with a label and prompt
	 * 
	 * @param label  The string that will be set as the Label's text
	 * @param prompt The text to be displayed when the TextField is empty.
	 */
	public OutputTextField(String label, String prompt) {
		this.label = label == null || label.isBlank() ? null : label;
		this.prompt = prompt == null || prompt.isBlank() ? null : prompt;
		buildGUI();
	}

	/**
	 * Creates a TextField with a label.
	 * 
	 * @param label
	 */
	public OutputTextField(String label) {
		this(label, null);
	}

	/**
	 * Creates a TextField without label or prompt.
	 */
	public OutputTextField() {
		this(null, null);
	}

	private void buildGUI() {
		if (label != null) {
			Label lblLabel = new Label(label);
			getChildren().add(lblLabel);
		}

		display = new TextField();
		if (prompt != null)
			display.setPromptText(prompt);
		getChildren().add(display);

		update();
	}

	@Override
	public void update() {
		display.setDisable(display.getText().isBlank());
	}

	@Override
	public void displayOutput(String output) {
		display.setText(output == null ? "" : output);
	}

}
