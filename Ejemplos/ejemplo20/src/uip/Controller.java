package uip;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private TextField tf1;
    @FXML
    private TextField tf2;

    @FXML
    private void imprimirNombre(ActionEvent e) {
        System.out.println("Tu nombre es: " + tf1.getText());
        System.out.println("Tienes " + tf2.getText() + " años.");
    }

    @FXML
    private void limpiar(ActionEvent e) {
        tf1.setText("");
        tf2.setText("");
    }

    //@FXML
    //private void imprimirPantalla(ActionEvent evento) {
    //    System.out.println("Soy una prueba");
    //}

    //@FXML
    //private void cambiarNombre(ActionEvent e) {
    //    lbl1.setText("ALBERTO");
    //}
}
