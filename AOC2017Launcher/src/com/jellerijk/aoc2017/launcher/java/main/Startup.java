package com.jellerijk.aoc2017.launcher.java.main;

import com.jellerijk.aoc2017.launcher.java.gui.LaunchScreen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Startup extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@SuppressWarnings("exports")
	@Override
	public void start(Stage stage) throws Exception {
		LaunchScreen root = new LaunchScreen();
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Launcher");
		stage.show();
	}

}
