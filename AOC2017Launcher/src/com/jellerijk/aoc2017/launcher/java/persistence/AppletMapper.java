package com.jellerijk.aoc2017.launcher.java.persistence;

import java.util.ArrayList;
import java.util.List;

import com.jellerijk.aoc2017.launcher.java.domain.Applet;
import com.jellerijk.aoc2017.launcher.java.domain.implementation.AppletImpl;

import javafx.stage.Stage;

public class AppletMapper {

	public static List<Applet> loadApplets() throws Exception {

		List<Applet> applets = new ArrayList<Applet>();
		try {
			applets.add(new AppletImpl(1, "Inverse Captcha",
					(Stage stage) -> {
						try {
							new com.jellerijk.aoc17.day1.main.Startup().start(stage);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}));
		} catch (Exception e) {
			e.printStackTrace();
		}

		return applets;
	}
}
