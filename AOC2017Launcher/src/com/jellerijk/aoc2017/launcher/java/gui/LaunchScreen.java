package com.jellerijk.aoc2017.launcher.java.gui;

import com.jellerijk.aoc2017.solutions.day1.main.Day1;
import com.jellerijk.aoc2017.solutions.day2.main.Day2;
import com.jellerijk.aoc2017.solutions.day3.main.Day3;

import javafx.scene.layout.FlowPane;

public class LaunchScreen extends FlowPane {
	public LaunchScreen() {
		buildGUI();
	}

	private void buildGUI() {
		getChildren().add(new LaunchWidget(new Day1()));
		getChildren().add(new LaunchWidget(new Day2()));
		getChildren().add(new LaunchWidget(new Day3()));
		this.setPrefWidth(600);
	}

}
