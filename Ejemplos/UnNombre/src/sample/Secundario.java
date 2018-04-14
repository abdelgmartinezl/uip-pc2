package sample;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Secundario {

    @FXML
    Button btnvolver;

    int conteo = 0;

    public void volver(ActionEvent actionEvent) {
        Stage stage = (Stage) btnvolver.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Principal.fxml"));
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
        Principal controller = fxmlLoader.<Principal>getController();
        controller.setConteo(conteo);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void setConteo(int c) {
        conteo = c;
    }

}
