package com.jellerijk.aoc2017.common.java.gui.inputs;

import com.jellerijk.aoc2017.common.java.interfaces.Submittable;

import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;

public class TextAreaInput extends InputElement<String> {
	Label lblError;
	TextArea txaInput;

	public TextAreaInput(Submittable<String> submitFunction) {
		super(submitFunction);
		buildGUI();
	}

	private void buildGUI() {
		VBox vbox = new VBox();
		txaInput = new TextArea();
		txaInput.setPrefSize(350, 250);
		txaInput.setWrapText(true);
		txaInput.setOnKeyTyped(evt -> {
			setInput(txaInput.getText());
			submit();
		});

		lblError = new Label("");
		lblError.setStyle("-fx-text-fill: red; -fx-font-weight: bold;");

		vbox.setSpacing(5);
		vbox.getChildren().addAll(txaInput, lblError);
		getChildren().add(vbox);
	}

	@Override
	protected void submit() {
		try {
			super.submit();
			lblError.setText("");
		} catch (IllegalArgumentException iae) {
			lblError.setText(iae.getMessage());
			iae.printStackTrace();
		} catch (Exception e) {
			lblError.setText(String.format("%s thrown: %s", e.getClass().getSimpleName(), e.getMessage()));
			e.printStackTrace();
		}
	};

	public void setPromptText(String prompt) {
		txaInput.setPromptText(prompt);
	}

}
