package bancolimpio;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class Login {
    @FXML
    TextField usuario;
    @FXML
    PasswordField password;
    @FXML
    Button btn_ingresar;

    int intentos = 0;

    public void ingresar(ActionEvent actionEvent) throws IOException {
        String u = usuario.getText();
        String p = password.getText();

        if (u.equals("petra")) {
            if (p.equals("petrov")) {
                Stage stage = (Stage) btn_ingresar.getScene().getWindow();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Resumen.fxml"));
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
                Resumen controller = fxmlLoader.<Resumen>getController();
                controller.setCuenta();
                controller.setSaldo();
                Scene scene = new Scene(root);
                stage.setScene(scene);
                stage.show();

            } else {
                intentos++;
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error de Autenticacion");
                alerta.setContentText("Llevas " + intentos + "/3 intentos.");
                alerta.showAndWait();
            }
        } else
            if (p.equals("maestro"))
                System.out.println("Me largo para la 2da pantalla");
            else {
                intentos++;
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error de Autenticacion");
                alerta.setContentText("Llevas " + intentos + "/3 intentos.");
                alerta.showAndWait();
            }

        if (intentos == 3)
            Platform.exit();
    }
}
