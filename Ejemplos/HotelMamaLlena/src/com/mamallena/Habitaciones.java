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
import javafx.scene.control.RadioButton;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Optional;


public class Habitaciones {
    @FXML
    ImageView img_suite;
    @FXML
    ImageView img_deluxe;
    @FXML
    ImageView img_ejecutiva;
    @FXML
    ImageView img_standard;
    @FXML
    Button btn_cancelar;
    @FXML
    Button btn_continuar;
    @FXML
    ImageView btn_regresar;
    @FXML
    RadioButton rb_suite;
    @FXML
    RadioButton rb_ejecutiva;
    @FXML
    RadioButton rb_deluxe;
    @FXML
    RadioButton rb_standard;

    public void regresar(MouseEvent mouseEvent) {
        Stage stage = (Stage) btn_regresar.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Fecha.fxml"));
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
        System.out.println("X");
    }

    public void habilitar_opcion(MouseEvent mouseEvent) {
        if (mouseEvent.getSource().equals(img_suite)) {
            rb_suite.setSelected(true);
        }
        if (mouseEvent.getSource().equals(img_deluxe)) {
            rb_deluxe.setSelected(true);
        }
        if (mouseEvent.getSource().equals(img_ejecutiva)) {
            rb_ejecutiva.setSelected(true);
        }
        if (mouseEvent.getSource().equals(img_standard)) {
            rb_standard.setSelected(true);
        }
    }
}
