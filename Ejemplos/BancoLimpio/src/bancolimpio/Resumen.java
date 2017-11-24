package bancolimpio;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class Resumen {
    @FXML
    Label cuenta;
    @FXML
    Label saldo;

    public void setCuenta() {

        cuenta.setText("000000");
    }

    public void setSaldo() {
        saldo.setText("$9999.99");
    }

    public void ver(ActionEvent actionEvent) {
    }

    public void transferir(ActionEvent actionEvent) {
    }

    public void salir(MouseEvent mouseEvent) {
        Platform.exit();
    }
}
