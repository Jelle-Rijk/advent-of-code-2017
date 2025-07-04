package com.jellerijk.aoc2017.solutions.day3.gui;

import com.jellerijk.aoc2017.common.java.gui.inputs.IntegerInput;
import com.jellerijk.aoc2017.common.java.gui.outputs.OutputTextField;
import com.jellerijk.aoc2017.solutions.day3.domain.DomainController;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MainScreen extends VBox {
	private DomainController dc;

	public MainScreen(@SuppressWarnings("exports") DomainController dc) {
		this.dc = dc;
		buildGUI();
	}

	private void buildGUI() {
		buildManhattanDistanceConverter();
	}

	private void buildManhattanDistanceConverter() {
		HBox converter = new HBox();

		IntegerInput input = new IntegerInput(i -> dc.inputTargetSquare(i));
		Label arrow = new Label(">>");
		
		arrow.setAlignment(Pos.CENTER);
		arrow.setMinSize(30, 15);

		VBox outputs = new VBox();
		OutputTextField output1 = new OutputTextField("Manhattan Distance");
		dc.subscribeToManhattanDistance(output1);
		OutputTextField output2 = new OutputTextField("Smallest stress test value");
		dc.subscribeToMinStressTestValue(output2);
		outputs.getChildren().addAll(output1, output2);

		converter.getChildren().addAll(new VBox(new Label("Target Square"), input), arrow, outputs);
		converter.setSpacing(20);
		converter.setAlignment(Pos.CENTER);
		converter.setMinWidth(USE_COMPUTED_SIZE);
		converter.setPadding(new Insets(10));
		getChildren().add(converter);
	}

}
