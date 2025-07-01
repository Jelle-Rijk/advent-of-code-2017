package gui;

import domain.DomainController;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class MainScreen extends BorderPane {
	private final DomainController dc;

	private TextArea txaCaptcha;
	private TextField txfChecksum;
	private TextField txfUserOutput;

	public MainScreen(DomainController dc) {
		this.dc = dc;
		buildGUI();
	}

	private void buildGUI() {
		buildCaptchaPane();
		buildTestPanel();
	}

	private void buildCaptchaPane() {
		VBox pane = new VBox();

		Label lblContent = new Label("Captcha content");
		lblContent.setStyle("-fx-font-weight: bold;");
		txaCaptcha = new TextArea();
		txaCaptcha.setPromptText("Please enter your puzzle input");
		txaCaptcha.setWrapText(true);

		Label lblError = new Label("");
		lblError.setStyle("-fx-text-fill: red; -fx-font-weight: bold;");
		txaCaptcha.setOnKeyTyped(evt -> {
			try {
				dc.enterInput(txaCaptcha.getText());
				lblError.setText("");
				update();
			} catch (IllegalArgumentException iae) {
				lblError.setText(iae.getMessage());
			} catch (Exception e) {
				e.printStackTrace();
				lblError.setText(String.format("%s thrown: %s", e.getClass().getSimpleName(), e.getMessage()));
			}
		});

		pane.getChildren().addAll(lblContent, txaCaptcha, lblError);
		pane.setPadding(new Insets(10));
		pane.setSpacing(10);
		setCenter(pane);
	}

	private void buildTestPanel() {
		VBox pane = new VBox();

		Label lblChecksum = new Label("Checksum");
		txfChecksum = new TextField();
		txfChecksum.setEditable(false);

		Label lblUserOutput = new Label("User's output");
		txfUserOutput = new TextField();
		txfUserOutput.setEditable(false);

		pane.getChildren().addAll(lblChecksum, txfChecksum, lblUserOutput, txfUserOutput);
		pane.setPadding(new Insets(10));
		pane.setSpacing(10);
		setRight(pane);
	}

	private void update() {
		txfChecksum.setText(Integer.toString(dc.getChecksum()));
		txfUserOutput.setText(Integer.toString(dc.getUserOutput()));
	}

}
