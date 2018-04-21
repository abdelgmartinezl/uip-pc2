package sample;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Optional;

public class Controller {
    @FXML
    Button btn_entrar;
    @FXML
    TextField nombre;
    @FXML
    CheckBox vip;

    public void entrar(ActionEvent actionEvent) {
        TextInputDialog dialogo = new TextInputDialog();
        dialogo.setTitle("Super Secreto");
        dialogo.setHeaderText("Secreto...");
        dialogo.setContentText("Habla y te...");
        Optional<String> resultado = dialogo.showAndWait();
        if (resultado.isPresent()) {
            if (resultado.get().equals("salvas")) {
                Stage stage = (Stage) btn_entrar.getScene().getWindow();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("sample2.fxml"));
                Parent root = null;
                try {
                    root = fxmlLoader.load();
                } catch (Exception e) {
                    Alert alerta = new Alert(Alert.AlertType.ERROR);
                    alerta.setTitle("Error de Aplicación");
                    alerta.setContentText("Llama al lapecillo de sistemas.");
                    alerta.showAndWait();
                    Platform.exit();
                }
                FadeTransition ft = new FadeTransition(Duration.millis(1500), root);
                ft.setFromValue(0.0);
                ft.setToValue(1.0);
                ft.play();
                Controller2 controller = fxmlLoader.<Controller2>getController();
                if (vip.isSelected()) {
                    controller.saludar("Xopa VIP, " + nombre.getText());
                } else {
                    controller.saludar("Xopa, " + nombre.getText());
                }
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }
    }

    public void salir(ActionEvent actionEvent) {
        Platform.exit();
    }
}
