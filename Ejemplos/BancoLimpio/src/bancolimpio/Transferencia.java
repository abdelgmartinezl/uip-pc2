package bancolimpio;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Transferencia {

    @FXML
    ImageView atras;
    @FXML
    ImageView salir;
    @FXML
    ComboBox<String> origen;
    @FXML
    TextField monto;

    // Cargando el ComboBox con un dato. El dato es nc, nc viene de Resumen linea 114 ¯\_(ツ)_/¯
    public void cargar_datos(String nc) {
        ObservableList<String> comboBoxData = FXCollections.observableArrayList();
        comboBoxData.add(nc);
        origen.setItems(comboBoxData);
    }

    public void transferir(ActionEvent actionEvent) {
        try {
            FileWriter fileWriter = new FileWriter("supersecreto.txt", true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(origen.getSelectionModel().getSelectedItem() + ",123," + "TRANSFERIR," + monto.getText());
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void salir(MouseEvent mouseEvent) {
        Stage stage = (Stage) salir.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Login.fxml"));
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
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void atras(MouseEvent mouseEvent) {
        Stage stage = (Stage) atras.getScene().getWindow();
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
    }
}
