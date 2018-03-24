package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    Label mensaje;

    @FXML
    TextField nombre;

    public void chotear(ActionEvent actionEvent) {
        System.out.println("Habla Petra!");
    }

    public void saludar(ActionEvent actionEvent) {
        String n = nombre.getText();
        mensaje.setText(n);
    }
}
