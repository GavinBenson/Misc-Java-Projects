package Calculate;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Random;

public class Controller {

    public TextField showResult;

    @FXML
    private Label resultLabel;
    private double n1 = 0;
    private double n2 = 0;
    private double finalResult = 0;
    private String mathOperator = "";
    private boolean startNumber = true;
    private Model model = new Model();

    @FXML
    public void Random(ActionEvent e) {
        Random rand = new Random();
        int random = rand.nextInt( 50) + 1;
        resultLabel.setText(Integer.toString(random));
        showResult.setText(Integer.toString(random));


    }

    @FXML
    public void processNumbers(ActionEvent event) {
        if (startNumber) {
            resultLabel.setText("");
            startNumber
                    = false;
        }
        String value = ((Button) event.getSource()).getText();
        resultLabel.setText(resultLabel.getText() + value);
    }

    @FXML
    public void processOperators(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        // n1 is done, so save it
        mathOperator = value;
        n1 = Double.parseDouble(resultLabel.getText());

        resultLabel.setText("");



    }

    @FXML
    public void processResult(ActionEvent event) {

            n2 = Double.parseDouble(resultLabel.getText());

            finalResult = model.calculate(n1,n2,mathOperator);
            resultLabel.setText(String.valueOf(finalResult));

            System.out.println(n2);


    }

    @FXML void processPowResult(ActionEvent event) {
        String value = ((Button) event.getSource()).getText();

        // n1 is done, so save it
        mathOperator = value;
        n1 = Double.parseDouble(resultLabel.getText());

        resultLabel.setText("");

        finalResult = model.calculatePow(n1,mathOperator);
        resultLabel.setText(String.valueOf(finalResult));


    }


    @FXML
    public void processClear(ActionEvent event) {
        n1 = 0;
        n2 = 0;
        finalResult = 0;
        mathOperator = "";

        resultLabel.setText("");

    }

}
