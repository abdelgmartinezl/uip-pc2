package ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Optional;

public class Controller {
    @FXML
    private Button btn_siguiente;
    @FXML
    private Button btn_anterior;

    public void cambiar_pantalla(ActionEvent actionEvent) throws IOException {
        Stage stage;
        Parent root;
        if (actionEvent.getSource() == btn_siguiente) {
            stage = (Stage) btn_siguiente.getScene().getWindow();
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("Informacion Importante");
            alerta.setHeaderText("No me vas a ignorar");
            alerta.setContentText("Vas a cambiar de pantalla");
            Optional<ButtonType> resultado = alerta.showAndWait();
            if (resultado.get() == ButtonType.OK) {
                root = FXMLLoader.load(getClass().getResource("Secundario.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        } else {
            stage = (Stage) btn_anterior.getScene().getWindow();
            Alert alerta = new Alert(Alert.AlertType.CONFIRMATION);
            alerta.setTitle("Informacion Importante");
            alerta.setHeaderText("No me vas a ignorar");
            alerta.setContentText("Vas a cambiar de pantalla");
            Optional<ButtonType> resultado = alerta.showAndWait();
            if (resultado.get() == ButtonType.OK) {
                root = FXMLLoader.load(getClass().getResource("Principal.fxml"));
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();
            }
        }

    }
}
