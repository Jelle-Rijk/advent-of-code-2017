package gui;

import domain.DomainController;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MainScreen extends BorderPane {
	private final DomainController dc;

	private TextField txfInput;
	private TextField txfResultPart1;

	public MainScreen(DomainController dc) {
		this.dc = dc;
		buildGUI();
	}

	private void buildGUI() {
		VBox mainPane = new VBox();
		Label lblPrompt = new Label("Enter target square");
		txfInput = new TextField();
		txfInput.setOnKeyTyped(evt -> {
			dc.setTargetSquare(Integer.parseInt(txfInput.getText()));
			update();
		});
		Label lblResultPart1 = new Label("Result");
		txfResultPart1 = new TextField();
		txfResultPart1.setEditable(false);

		mainPane.setSpacing(10);
		mainPane.setPadding(new Insets(10));
		mainPane.getChildren().addAll(lblPrompt, txfInput, lblResultPart1, txfResultPart1);
		setCenter(mainPane);
	}

	private void update() {

	}

}
