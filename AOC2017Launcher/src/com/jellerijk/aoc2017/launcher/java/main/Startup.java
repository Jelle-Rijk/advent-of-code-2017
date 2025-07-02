package com.jellerijk.aoc2017.launcher.java.main;

import java.util.List;

import com.jellerijk.aoc2017.launcher.java.domain.Applet;
import com.jellerijk.aoc2017.launcher.java.persistence.AppletMapper;

import javafx.application.Application;
import javafx.stage.Stage;

public class Startup extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		List<Applet> apps = AppletMapper.loadApplets();
		apps.getFirst().launch();
	}

}
