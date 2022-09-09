package pl.simulax.simulax;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCombination;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        //Scene scene = new Scene(fxmlLoader.load());

        Path path = new Path();
        MoveTo moveTo = new MoveTo();
        moveTo.setX(100);
        moveTo.setY(150);

        LineTo lineTo = new LineTo();
        lineTo.setX(250);
        lineTo.setY(400);

        path.getElements().add(moveTo);
        path.getElements().add(lineTo);

        Group group = new Group(path);
        Scene scene = new Scene(group, 640, 480);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        Image icon = new Image("E:\\UniRepo\\Simulax\\src\\main\\resources\\pl\\simulax\\mainMenu\\logo.png");

        stage.getIcons().add(icon);
        stage.setResizable(false);
        stage.setX(50);
        stage.setY(50);
        stage.setFullScreenExitHint("If you wanna change scene press 'ESC' button!");
        stage.setFullScreenExitKeyCombination(KeyCombination.valueOf("q"));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}