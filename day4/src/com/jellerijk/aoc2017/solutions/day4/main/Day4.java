package com.jellerijk.aoc2017.solutions.day4.main;

import com.jellerijk.aoc2017.common.java.interfaces.AOCApp;
import com.jellerijk.aoc2017.solutions.day4.domain.DomainController;
import com.jellerijk.aoc2017.solutions.day4.gui.MainScreen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day4 extends Application implements AOCApp {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public int getDay() {
		return 4;
	}

	@Override
	public String getTitle() {
		return "High-Entropy Passphrases";
	}

	@Override
	public void start(Stage stage) throws Exception {
		DomainController dc = new DomainController();
		MainScreen root = new MainScreen(dc);

		Scene scene = new Scene(root);

		stage.setScene(scene);
		stage.setTitle(getTitle());
		stage.sizeToScene();
		stage.show();
	}

}
