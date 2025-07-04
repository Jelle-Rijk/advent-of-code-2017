package main;

import com.jellerijk.aoc2017.common.java.gui.inputs.IntegerInput;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class TestScreen extends BorderPane {

	public TestScreen() {
		buildCenter();
		buildBottom();
		buildRight();

	}

	private void buildCenter() {
		VBox center = new VBox();
		IntegerInput input = new IntegerInput((Integer i) -> System.out.println(i));
		center.setMaxWidth(50);
		center.setPrefSize(10, 10);

		center.getChildren().add(input);
		setCenter(center);
	}

	private void buildBottom() {
		Label bottom = new Label("Bottom");
		setBottom(bottom);
	}

	private void buildRight() {
		Label right = new Label("Right");
		setRight(right);
	}

}
