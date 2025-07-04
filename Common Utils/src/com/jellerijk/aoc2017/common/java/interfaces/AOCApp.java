package com.jellerijk.aoc2017.common.java.interfaces;

import javafx.stage.Stage;

public interface AOCApp {

	public int getDay();

	public String getTitle();

	public default void launch() throws Exception {
		start(new Stage());
	};

	public void start(Stage stage) throws Exception;

}
