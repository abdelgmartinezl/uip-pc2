package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
//import javafx.scene.control.Button;

public class Controller {
    //@FXML private Button btn1;

    @FXML protected void imprimir(ActionEvent evento) {
        System.out.println("Usted presiono el boton...");
    }
}
