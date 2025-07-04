package com.jellerijk.aoc2017.solutions.day3.main;

import com.jellerijk.aoc2017.common.java.interfaces.AOCApp;
import com.jellerijk.aoc2017.solutions.day3.domain.DomainController;
import com.jellerijk.aoc2017.solutions.day3.gui.MainScreen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day3 extends Application implements AOCApp {

	@Override
	public int getDay() {
		return 3;
	}

	@Override
	public String getTitle() {
		return "Spiral Memory";
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

	public static void main(String[] args) {
		launch(args);
	}

}
