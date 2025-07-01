package main;

import domain.DomainController;
import gui.MainScreen;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Startup extends Application {
	public static final String TITLE = "Corruption Checksum";

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		DomainController dc = new DomainController();
		MainScreen root = new MainScreen(dc);

		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setTitle(TITLE);
		stage.show();
		
		
	}

}
