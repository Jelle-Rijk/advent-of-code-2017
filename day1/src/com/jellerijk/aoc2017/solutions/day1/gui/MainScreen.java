package com.jellerijk.aoc2017.solutions.day1.gui;

import com.jellerijk.aoc2017.common.java.gui.inputs.TextAreaInput;
import com.jellerijk.aoc2017.common.java.gui.outputs.OutputTextField;
import com.jellerijk.aoc2017.solutions.day1.domain.DomainController;

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
		buildCaptchaPane();
		buildTestPanel();
	}

	private void buildCaptchaPane() {
		VBox pane = new VBox();

		Label lblContent = new Label("Captcha content");
		lblContent.setStyle("-fx-font-weight: bold;");
		TextAreaInput txaCaptcha = new TextAreaInput((String s) -> dc.enterPuzzleInput(s));

		pane.getChildren().addAll(lblContent, txaCaptcha);
		pane.setPadding(new Insets(10));
		pane.setSpacing(10);
		setCenter(pane);
	}

	private void buildTestPanel() {
		VBox pane = new VBox();

		OutputTextField sumOfDouble = new OutputTextField("Sum of double digits");
		dc.subscribetoPart1(sumOfDouble);

		OutputTextField sumOfOpposites = new OutputTextField("Sum of Opposites");
		dc.subscribetoPart2(sumOfOpposites);

		pane.getChildren().addAll(sumOfDouble, sumOfOpposites);
		pane.setPadding(new Insets(10));
		pane.setSpacing(10);
		setRight(pane);
	}
}
