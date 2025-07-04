package com.jellerijk.aoc2017.launcher.java.gui;

import com.jellerijk.aoc2017.solutions.day1.main.Day1;

import javafx.scene.layout.FlowPane;

public class LaunchScreen extends FlowPane {
	public LaunchScreen() {
		buildGUI();
	}

	private void buildGUI() {
		getChildren().add(new LaunchWidget(new Day1()));
	}

}
