package com.jellerijk.aoc2017.solutions.day2.gui;

import com.jellerijk.aoc2017.common.java.gui.inputs.TextAreaInput;
import com.jellerijk.aoc2017.common.java.gui.outputs.OutputTextField;
import com.jellerijk.aoc2017.solutions.day2.domain.DomainController;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MainScreen extends BorderPane {
	private final DomainController dc;

	public MainScreen(DomainController dc) {
		this.dc = dc;
		buildGUI();
	}

	private void buildGUI() {
		buildSpreadsheetPane();
		buildTestPanel();
	}

	private void buildSpreadsheetPane() {
		VBox pane = new VBox();

		Label lblContent = new Label("Spreadsheet content");
		lblContent.setStyle("-fx-font-weight: bold;");

		TextAreaInput txaSpreadsheet = new TextAreaInput((String s) -> dc.enterInput(s));
		txaSpreadsheet.setPromptText("Please enter your puzzle input");

		pane.getChildren().addAll(lblContent, txaSpreadsheet);
		pane.setPadding(new Insets(10));
		pane.setSpacing(10);
		setCenter(pane);
	}

	private void buildTestPanel() {
		VBox pane = new VBox();

		OutputTextField checksum = new OutputTextField("Checksum");
		dc.subscribeToPart1(checksum);

		OutputTextField userOutput = new OutputTextField("User's output");
		dc.subscribeToPart2(userOutput);

		pane.getChildren().addAll(checksum, userOutput);
		pane.setPadding(new Insets(10));
		pane.setSpacing(10);
		setRight(pane);
	}
}
