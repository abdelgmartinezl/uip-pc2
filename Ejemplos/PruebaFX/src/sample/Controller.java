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
    Label cantidad;
    @FXML
    TextField campoblanco;

    public void contar(ActionEvent actionEvent) {
        Alert alerta;
        String p = campoblanco.getText();
        String nc = String.valueOf(p.length());
        if (p.length() > 10) {
            alerta = new Alert(Alert.AlertType.INFORMATION);
            alerta.setTitle("Oracion");
            alerta.setContentText("Esto es una oracion");
            alerta.setHeaderText("Presta atencion");
            alerta.showAndWait();
        } else if (p.length() > 5) {
            alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Frase");
            alerta.setContentText("Esto es una frase");
            alerta.setHeaderText("Presta atencion");
            alerta.showAndWait();
        } else {
            alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Palabra");
            alerta.setContentText("Esto es una palabra");
            alerta.setHeaderText("Presta atencion");
            alerta.showAndWait();
        }
        cantidad.setText(nc);

    }

    public void saludar(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setTitle("Saludo");
        alerta.setContentText("Habla malaki!");
        alerta.showAndWait();
    }

    public void salir(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Pa lante!");
        alerta.setContentText("Seguro que te quieres ir");
        alerta.setHeaderText("Intento de fuga");
        Optional<ButtonType> resultado = alerta.showAndWait();
        if (resultado.get() == ButtonType.OK) {
            Platform.exit();
        }

        int x = Integer.parseInt(campoblanco.getText());
    }
}
