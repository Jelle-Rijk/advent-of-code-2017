package com.jellerijk.aoc2017.solutions.day2.main;

import com.jellerijk.aoc2017.common.java.interfaces.AOCApp;
import com.jellerijk.aoc2017.solutions.day2.domain.DomainController;
import com.jellerijk.aoc2017.solutions.day2.gui.MainScreen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day2 extends Application implements AOCApp {

	@Override
	public int getDay() {
		return 2;
	}

	@Override
	public String getTitle() {
		return "Corruption Checksum";
	}

	@Override
	public void start(Stage stage) throws Exception {
		DomainController dc = new DomainController();
		MainScreen root = new MainScreen(dc);

		Scene scene = new Scene(root);

		stage.setTitle(getTitle());
		stage.setScene(scene);
		stage.sizeToScene();
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
