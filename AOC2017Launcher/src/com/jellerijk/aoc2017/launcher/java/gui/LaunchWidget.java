package com.jellerijk.aoc2017.launcher.java.gui;

import com.jellerijk.aoc2017.common.java.interfaces.AOCApp;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LaunchWidget extends VBox {
	private AOCApp app;

	@SuppressWarnings("exports")
	public LaunchWidget(AOCApp app) {
		this.app = app;
		buildGUI();
	}

	private void buildGUI() {
		setAlignment(Pos.CENTER);

		Label lblDay = new Label(String.format("Day %d", app.getDay()));
		Label lblTitle = new Label(app.getTitle());
		Region whiteSpace = new Region();
		whiteSpace.setPrefHeight(10);
		Button btnLaunch = new Button("Launch");
		btnLaunch.setOnAction(evt -> {
			try {
				app.start((Stage) getScene().getWindow());
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		getChildren().addAll(lblDay, lblTitle, whiteSpace, btnLaunch);
		setPadding(new Insets(10));
		setSpacing(5);
	}

}
