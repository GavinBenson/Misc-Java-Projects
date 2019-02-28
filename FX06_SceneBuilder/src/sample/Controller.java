package sample;

import javafx.event.ActionEvent;
import java.util.Random;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.util.StringConverter;

public class Controller {

    @FXML
    private Button myButton;



    public void generateRandom(ActionEvent event){

        Random rand = new Random();
        int myrand = rand.nextInt(50) + 1;
        System.out.println(Integer.toString(myrand));
    }

    @FXML
    private void handleButtonAction(ActionEvent event) {
        // Button was clicked, do something...
        System.out.println("Lambda");
    }

    @FXML
    private void initialize() {
        // Handle Button event.
        myButton.setOnAction((event) -> {
            System.out.println("listening");
        });
    }
}
