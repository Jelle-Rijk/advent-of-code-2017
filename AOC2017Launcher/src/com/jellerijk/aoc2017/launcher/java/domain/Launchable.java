package com.jellerijk.aoc2017.launcher.java.domain;

import javafx.stage.Stage;

@FunctionalInterface
public interface Launchable {
	public void launch(Stage stage);
}
