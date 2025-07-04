package main;

import com.jellerijk.aoc2017.common.java.interfaces.AOCApp;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Startup extends Application implements AOCApp {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		System.out.println("App loaded");
		TestScreen root = new TestScreen();

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle("Test");
		stage.show();
	}

	@Override
	public int getDay() {
		return -1;
	}

	@Override
	public String getTitle() {
		return "Utils test";
	}

}
