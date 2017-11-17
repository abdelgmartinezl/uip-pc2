package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    TextField nombre;
    @FXML
    Label cantidad;

    public void clicar(ActionEvent actionEvent) {
        int c = Integer.parseInt(cantidad.getText());
        c += 1;
        switch (c) {
            case 25:
                Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
                alerta.setTitle("Confirmación de Salida");
                break;
            case 50:
                System.out.println("Ocioso(a)");
                break;
            case 100:
                Platform.exit();
                break;
        }
        cantidad.setText(String.valueOf(c));
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
