package com.jellerijk.aoc17.launcher.java.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jellerijk.aoc17.launcher.java.gui.Launchable;

import javafx.stage.Stage;

public class AppLoader {

	public static List<Launchable> getLaunchables(String[] args) {
		List<Launchable> launchables = new ArrayList<Launchable>();
		Stage stage = new Stage();

		launchables.add(new Launchable(1, "Inverse Captcha", () -> com.jellerijk.aoc17.day1.main.Startup.start(stage)));

		return launchables;
	}

}
