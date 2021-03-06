package Calculate;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("Calculator.fxml"));
        Scene mainScene = new Scene(root, 700, 400);
        mainScene.getStylesheets().add(Main.class.getResource("Calculator.css").toExternalForm());
        primaryStage.setTitle("Java FX Calculator - Created by Gavin Benson");
        primaryStage.setScene(mainScene);
        primaryStage.show();

    }


}
