package com.jellerijk.aoc17.launcher.java.gui;

import javafx.application.Platform;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Launchable extends VBox implements LaunchMethod {
	int day;
	String name;
	LaunchMethod launchMethod;

	Button btnLaunch;

	public Launchable(int day, String name, LaunchMethod launchMethod) {
		this.day = day;
		this.name = name;
		this.launchMethod = launchMethod;
		buildGUI();
	}

	private void buildGUI() {
		Label lblDay = new Label(String.format("Day %d", day));
		Label lblName = new Label(name);
		btnLaunch = new Button("Launch");
		btnLaunch.setOnAction(evt -> launch());

		getChildren().addAll(lblDay, lblName, btnLaunch);

	}

	@Override
	public void launch() {
		launchMethod.launch();
		Platform.exit();
	}
}
