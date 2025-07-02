package com.jellerijk.aoc17.launcher.java.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jellerijk.aoc17.launcher.java.gui.Launchable;

public class AppLoader {

	public static List<Launchable> getLaunchables(String[] args) {
		List<Launchable> launchables = new ArrayList<Launchable>();

		launchables.add(new Launchable(1, "Inverse Captcha", () -> com.jellerijk.aoc17.day1.main.Startup.main(args)));

		return launchables;
	}

}
