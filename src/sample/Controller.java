package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private Label dummyLabel;

    @FXML
    private TextField dummyTextField;

    public void sayHi(ActionEvent event){
        String oldLabelText = dummyLabel.getText();
        //dummyLabel.setText(oldLabelText + " Andrius!");//pakeiciame label teksta su vardu

        //dummyLabel.setText(oldLabelText + " " + dummyTextField.getText());

        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setContentText(oldLabelText + " " + dummyTextField.getText());
        alert.show();
    }
}
