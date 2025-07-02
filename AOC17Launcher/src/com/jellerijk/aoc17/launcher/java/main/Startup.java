package com.jellerijk.aoc17.launcher.java.main;

import java.util.List;

import com.jellerijk.aoc17.launcher.java.gui.Launchable;
import com.jellerijk.aoc17.launcher.java.gui.MainScreen;
import com.jellerijk.aoc17.launcher.java.persistence.AppLoader;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Startup extends Application {
	private static List<Launchable> apps;

	public static void main(String[] args) {
		apps = AppLoader.getLaunchables(args);
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		MainScreen root = new MainScreen(apps);
		Scene scene = new Scene(root);

		stage.setScene(scene);
		stage.setTitle("Project Launcher");
		stage.show();
	}

}
