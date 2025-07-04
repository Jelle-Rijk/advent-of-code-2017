package com.jellerijk.aoc2017.solutions.day4.gui;

import com.jellerijk.aoc2017.common.java.gui.inputs.TextAreaInput;
import com.jellerijk.aoc2017.common.java.gui.outputs.OutputTextField;
import com.jellerijk.aoc2017.solutions.day4.domain.DomainController;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MainScreen extends BorderPane {
	private final DomainController dc;

	public MainScreen(@SuppressWarnings("exports") DomainController dc) {
		this.dc = dc;
		buildGUI();
	}

	private void buildGUI() {
		buildInput();
		buildOutput();
	}

	private void buildInput() {
		VBox input = new VBox();
		input.setSpacing(10);
		Label lblTitle = new Label("Passphrases");
		TextAreaInput txaInput = new TextAreaInput((s) -> dc.enterInput(s));

		input.setPadding(new Insets(10));
		input.getChildren().addAll(lblTitle, txaInput);
		setCenter(input);
	}

	private void buildOutput() {
		VBox output = new VBox();
		output.setSpacing(10);

		OutputTextField numberOfValidPhrases = new OutputTextField("Valid passphrases");
		dc.subscribeToPart1(numberOfValidPhrases);
		OutputTextField withoutAnagrams = new OutputTextField("Valid passphrases without anagrams");
		dc.subscribeToPart2(withoutAnagrams);

		output.setPadding(new Insets(10));
		output.getChildren().addAll(numberOfValidPhrases, withoutAnagrams);
		setRight(output);
	}
}
