package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField nombre;

    public void clicar(ActionEvent actionEvent) {
    }

    public void saludar(ActionEvent actionEvent) {
        String n = nombre.getText();
        if (n.length() == 0) {
            System.out.println("No hay naa!");
        } else {
            System.out.println("Bomba y plena, " + n);
        }
    }

    public void salir(ActionEvent actionEvent) {
        Platform.exit();
    }
}
