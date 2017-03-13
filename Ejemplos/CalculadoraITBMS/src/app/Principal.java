package app;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class Principal {
    @FXML
    TextField subtotal;
    @FXML
    Button btn_enviar;

    public void enviar(ActionEvent actionEvent) throws IOException {
        double st = 0.0;
        String st1 = subtotal.getText();
        if (st1.isEmpty()) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error en Sub-total");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("El sub-total no debe estar vacio.");
            alerta.showAndWait();
            subtotal.setText("");
            return;
        } else {
            try {
                st = Double.parseDouble(st1);
            } catch (NumberFormatException e) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error en Sub-total");
                alerta.setHeaderText("Mira, hubo un error...");
                alerta.setContentText("El sub-total es un numero.");
                alerta.showAndWait();
                subtotal.setText("");
                return;
            }
            Stage stage = (Stage) btn_enviar.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Secundaria.fxml"));
            Parent root = null;
            try {
                root = (Parent) fxmlLoader.load();
            } catch (Exception e) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error de Aplicacion");
                alerta.setHeaderText("Mira, hubo un error...");
                alerta.setContentText("Lo siento. Llama al administrador.");
                alerta.showAndWait();
                Platform.exit();
            }
            Secundaria sc = fxmlLoader.<Secundaria>getController();
            sc.setTotal(st*1.07);
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    public void limpiar(ActionEvent actionEvent) {
        subtotal.setText("");
    }

    public void salir(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Confirmacion de Salida");
        alerta.setHeaderText("Usted esta saliendo de la aplicacion");
        alerta.setContentText("Esta seguro de esto?");
        Optional<ButtonType> resultado = alerta.showAndWait();
        if (resultado.get() == ButtonType.OK) {
            Platform.exit();
        }
    }
}
