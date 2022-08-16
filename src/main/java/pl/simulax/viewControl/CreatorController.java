package pl.simulax.viewControl;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import pl.simulax.simulax.HelloController;

public class CreatorController {

    @FXML
    private Label title;

    @FXML
    protected void onWindowOpen() {
        title.setText("Witamy w kreatorze elementu. Wybierz rodzaj tworzonego obiektu:");
        FXMLLoader myLoader = new FXMLLoader(getClass().getResource("hello-view.fxml"));
        try {
            Parent root = myLoader.load();
            HelloController controller = myLoader.getController();

        } catch(Exception e) {
            e.printStackTrace();
        }

    }
}
