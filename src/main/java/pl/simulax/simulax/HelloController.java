package pl.simulax.simulax;

import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Canvas workspaceArea;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    protected void onMousePressed() {
        workspaceArea.getGraphicsContext2D().beginPath();
        workspaceArea.getGraphicsContext2D().fillRect(1,2,3,4);
        workspaceArea.getGraphicsContext2D().closePath();
    }
}