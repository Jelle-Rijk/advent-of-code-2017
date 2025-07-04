package com.jellerijk.aoc2017.solutions.day1.main;

import com.jellerijk.aoc2017.common.java.interfaces.AOCApp;
import com.jellerijk.aoc2017.solutions.day1.domain.DomainController;
import com.jellerijk.aoc2017.solutions.day1.gui.MainScreen;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Day1 extends Application implements AOCApp {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public int getDay() {
		return 1;
	}

	@Override
	public String getTitle() {
		return "Inverse Captcha";
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

}
