package ejemplo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Principal {
    @FXML
    public TextField txt_nombre;
    @FXML
    public Button btn_siguiente;

    @FXML
    public void salir(ActionEvent actionEvent) {
        Platform.exit(); // Para salir del programa
    }

    @FXML
    public void cargarAlternativa(ActionEvent actionEvent) throws IOException {
        String nombre = txt_nombre.getText(); // Obtiene la cadena del TextField
        if (nombre.isEmpty()) {
            System.out.println("Vacío");
        } else {
            Stage stage = (Stage) btn_siguiente.getScene().getWindow(); // Guarda el Stage actual basado en el boton
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Alternativa.fxml")); // Carga el fichero FXML de Principal
            Parent root = (Parent) fxmlLoader.load(); // Carga inicial de la pantalla padre
            Alternativa controller = fxmlLoader.<Alternativa>getController(); // Crea un objeto (controller) de tipo Alternativa
            controller.setNombre(nombre); // Llama a un metodo de la clase alternativa a traves de su objeto (controller)
            Scene scene = new Scene(root); // Establece Scene de la pantalla padre
            stage.setScene(scene); // Monta Scene en Stage
            stage.show(); // Muestra Stage
        }
    }

    @FXML
    public void limpiar(ActionEvent actionEvent) {
        txt_nombre.setText("");
    }
}