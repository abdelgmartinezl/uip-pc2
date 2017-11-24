package bancolimpio;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Login {
    @FXML
    TextField usuario;
    @FXML
    PasswordField password;

    int intentos = 0;

    public void ingresar(ActionEvent actionEvent) {
        String u = usuario.getText();
        String p = password.getText();

        if (u.equals("petra"))
            if (p.equals("petrov"))
                System.out.println("Me largo para la 2da pantalla");
            else {
                intentos++;
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error de Autenticacion");
                alerta.setContentText("Llevas " + intentos + "/3 intentos.");
                alerta.showAndWait();
            }
        else
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
