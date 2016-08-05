package validador;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.io.IOException;

public class Controller {

    @FXML
    public TextField txt_nombre;
    @FXML
    public TextField txt_edad;
    @FXML
    public Button btn_evaluar;
    @FXML
    public Label txt_mensaje;
    @FXML
    public Button btn_volver;

    @FXML
    private void evaluar(ActionEvent actionEvent) throws IOException {
        int edad = Integer.parseInt(txt_edad.getText());
        String nombre = txt_nombre.getText();
        Stage stage = new Stage();

        if (edad < 18) {
            stage = (Stage) btn_evaluar.getScene().getWindow();
            stage.close();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("secundario.fxml"));
            loader.setController(this);
            Parent root = (Parent)loader.load();
            Scene scene = new Scene(root, 400, 400);
            txt_mensaje.setText(nombre + ", eres \nmenor de edad.");
            stage.setScene(scene);
            stage.show();
        } else {
            stage = (Stage) btn_evaluar.getScene().getWindow();
            stage.close();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("secundario.fxml"));
            loader.setController(this);
            Parent root = (Parent)loader.load();
            Scene scene = new Scene(root, 400, 400);
            txt_mensaje.setText(nombre + ", eres \nmayor de edad.");
            stage.setScene(scene);
            stage.show();
        }
    }

    @FXML
    private void cambioPantalla(ActionEvent actionEvent) throws IOException {
        Stage stage;
        Parent root;
        stage = (Stage) btn_volver.getScene().getWindow();
        root = FXMLLoader.load(getClass().getResource("principal.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
