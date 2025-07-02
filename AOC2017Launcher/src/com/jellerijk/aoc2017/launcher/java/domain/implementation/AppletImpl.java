package com.jellerijk.aoc2017.launcher.java.domain.implementation;

import com.jellerijk.aoc2017.launcher.java.domain.Applet;
import com.jellerijk.aoc2017.launcher.java.domain.Launchable;

import javafx.stage.Stage;

public class AppletImpl implements Applet, Launchable {
	int day;
	String title;

	Launchable launchable;

	public AppletImpl(int day, String title, Launchable launchable) {
		this.day = day;
		this.title = title;
		this.launchable = launchable;
	}

	@Override
	public int getDay() {
		return day;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void launch() {
		launch(new Stage());
	}

	@Override
	public void launch(Stage stage) {
		launchable.launch(stage);
	}

}
