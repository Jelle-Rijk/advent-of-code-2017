package com.jellerijk.aoc17.launcher.java.gui;

import java.util.List;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;

public class MainScreen extends BorderPane {

	public MainScreen(List<Launchable> launchables) {
		buildGUI(launchables);
	}

	private void buildGUI(List<Launchable> launchables) {
		FlowPane launchMenu = buildLaunchMenu(launchables);
		setCenter(launchMenu);
	}

	private FlowPane buildLaunchMenu(List<Launchable> launchables) {
		FlowPane launchMenu = new FlowPane();
		launchMenu.getChildren().addAll(launchables);
		return launchMenu;
	}
}
