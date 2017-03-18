package com.mamallena;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.DatePicker;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.time.LocalDate;
import java.util.Optional;


public class Fecha {
    @FXML
    ImageView btn_regresar;
    @FXML
    Button btn_continuar;
    @FXML
    Button btn_cancelar;
    @FXML
    DatePicker ingreso;
    @FXML
    DatePicker salida;

    public void regresar(MouseEvent mouseEvent) {
        Stage stage = (Stage) btn_regresar.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Menu.fxml"));
        Parent root = null;
        try {
            root = (Parent)fxmlLoader.load();
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicacion");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("Lo siento. Llama al administrador.");
            alerta.showAndWait();
            Platform.exit();
        }
        FadeTransition ft = new FadeTransition(Duration.millis(1500), root);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.play();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void cancelar(ActionEvent actionEvent) {
        Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
        alerta.setTitle("Confirmar Cancelacion");
        alerta.setHeaderText("Usted esta cancelando la reserva");
        alerta.setContentText("Esta seguro de esto?");
        Optional<ButtonType> resultado = alerta.showAndWait();
        if (resultado.get() == ButtonType.OK) {
            Stage stage = (Stage) btn_cancelar.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Menu.fxml"));
            Parent root = null;
            try {
                root = (Parent)fxmlLoader.load();
            } catch (Exception e) {
                alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error de Aplicacion");
                alerta.setHeaderText("Mira, hubo un error...");
                alerta.setContentText("Lo siento. Llama al administrador.");
                alerta.showAndWait();
                Platform.exit();
            }
            FadeTransition ft = new FadeTransition(Duration.millis(1500), root);
            ft.setFromValue(0.0);
            ft.setToValue(1.0);
            ft.play();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }
    }

    public void continuar(ActionEvent actionEvent) {
        LocalDate ing = ingreso.getValue();
        LocalDate sal = salida.getValue();
        try {
            if (ing.isBefore(LocalDate.now())) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error de Aplicacion");
                alerta.setHeaderText("Fecha incorrecta: antes de hoy");
                alerta.setContentText("Intenta nuevamente.");
                alerta.showAndWait();
                return;
            }
            if (sal.isBefore(ing)) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error de Aplicacion");
                alerta.setHeaderText("Fecha incorrecta: antes de ingreso");
                alerta.setContentText("Intenta nuevamente.");
                alerta.showAndWait();
                return;
            }
        } catch (NullPointerException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicacion");
            alerta.setHeaderText("Fecha incorrecta: valores nulos");
            alerta.setContentText("Intenta nuevamente.");
            alerta.showAndWait();
            return;
        }

        Stage stage = (Stage) btn_continuar.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Habitaciones.fxml"));
        Parent root = null;
        try {
            root = (Parent)fxmlLoader.load();
        } catch (Exception e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Error de Aplicacion");
            alerta.setHeaderText("Mira, hubo un error...");
            alerta.setContentText("Lo siento. Llama al administrador.");
            alerta.showAndWait();
            Platform.exit();
        }
        FadeTransition ft = new FadeTransition(Duration.millis(1500), root);
        ft.setFromValue(0.0);
        ft.setToValue(1.0);
        ft.play();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
