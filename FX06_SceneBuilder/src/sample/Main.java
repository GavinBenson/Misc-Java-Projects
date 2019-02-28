package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{

        Parent root = FXMLLoader.load(getClass().getResource("calculator.fxml"));
        Scene mainScene = new Scene (root, 800, 400);
        mainScene.getStylesheets().add(Main.class.getResource("application.css").toExternalForm());
        primaryStage.setTitle("My FX Calculator! May 2018");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
