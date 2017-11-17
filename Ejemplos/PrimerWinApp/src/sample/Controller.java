package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.Optional;

public class Controller {

    @FXML
    TextField nombre;
    @FXML
    Label cantidad;

    public void clicar(ActionEvent actionEvent) {
        Alert alerta;
        int c = Integer.parseInt(cantidad.getText());
        c += 1;
        switch (c) {
            case 25:
                alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Avanzando 25 clics");
                alerta.setContentText("BIRRIOSO");
                alerta.showAndWait();
                break;
            case 50:
                alerta = new Alert(Alert.AlertType.WARNING);
                alerta.setTitle("Avanzando 50 clics");
                alerta.setContentText("OCIOSO");
                alerta.showAndWait();
                break;
            case 100:
                alerta = new Alert(Alert.AlertType.CONFIRMATION);
                alerta.setTitle("Confirmación de Salida");
                alerta.setHeaderText("Mmm, Quieres salir?");
                alerta.setContentText("Estás seguro?");
                Optional<ButtonType> resultado = alerta.showAndWait();
                if (resultado.get() == ButtonType.OK) {
                    Platform.exit();
                }
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
