package ejemplo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class Alternativa {

    @FXML
    public Label txt_nombre;
    @FXML
    public Button btn_anterior;

    @FXML
    public void salir(ActionEvent actionEvent) {
        Platform.exit(); // Para salir del programa
    }

    @FXML
    public void cargarPrincipal(ActionEvent actionEvent) throws IOException {
        Stage stage =  (Stage) btn_anterior.getScene().getWindow(); // Guarda el Stage actual basado en el boton
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Principal.fxml")); // Carga el fichero FXML de Principal
        Parent root = (Parent)fxmlLoader.load(); // Carga inicial de la pantalla padre
        Scene scene = new Scene(root); // Establece Scene de la pantalla padre
        stage.setScene(scene); // Monta Scene en Stage
        stage.show(); // Muestra Stage
    }

    // Hace el cambio del valor de la cadena en la pantalla
    public void setNombre(String nombre)  {
        txt_nombre.setText(nombre);
    }
}