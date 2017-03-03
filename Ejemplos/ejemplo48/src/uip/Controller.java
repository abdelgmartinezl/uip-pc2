package uip;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    public TextField tf_nombre;
    @FXML
    public TextField tf_edad;
    @FXML
    public TextArea ta_edad;

    public void imprimir_saludo(ActionEvent actionEvent) {
        System.out.println("Esto es un saludo FX");
    }

    public void imprimir_nombre(ActionEvent actionEvent) {
        String nombre = tf_nombre.getText();
        if (nombre.isEmpty()) {
            System.out.println("Bienvenido desconocido(a)");
        } else {
            System.out.println("Bievenido, " + nombre);
            //tf_nombre.clear();
            tf_nombre.setText("Ingrese nuevo nombre...");
        }
    }

    public void imprimir_mensaje(ActionEvent actionEvent) {
        int edad = 0;
        try {
            edad = Integer.parseInt(tf_edad.getText());
        }
        catch (Exception e) {
            ta_edad.setText("Ingreso una edad inválida. \nIntente nuevamente.");
            tf_edad.clear();
        }
        if (edad < 1) {
            ta_edad.setText("Ingreso una edad inválida. \nIntente nuevamente.");
            tf_edad.clear();
        } else if (edad < 18) {
            ta_edad.setText("Sal de aqui");
            tf_edad.clear();
        } else {
            ta_edad.setText("Cuidado con lo que ves");
            tf_edad.clear();
        }
    }

    public void salir(ActionEvent actionEvent) {
        Platform.exit();
    }
}
