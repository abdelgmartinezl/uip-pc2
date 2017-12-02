package bancolimpio;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Observable;


public class Movimientos {

    @FXML
    ImageView salir;
    @FXML
    ImageView atras;
    @FXML
    ListView movimientos;
    @FXML
    Label cuenta;

    String n;

    public void cargar_movimientos(String nc) {
        cuenta.setText(nc);

        String linea = null;
        ObservableList<String> listViewData = FXCollections.observableArrayList();
        try {
            FileReader fileReader = new FileReader("supersecreto.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((linea = bufferedReader.readLine()) != null) {
                List<String> datos = Arrays.asList(linea.split(","));
                n = datos.get(0);
                if (n.equals("123456")) {
                    if (datos.get(2).equals("RETIRO")) {
                        listViewData.add("Se retiro $" + datos.get(3).toString());
                    } else if (datos.get(2).equals("TRANSFERIR")) {
                        listViewData.add("Se transfirio $" + datos.get(3).toString());
                    } else {
                        listViewData.add("Se deposito $" + datos.get(3).toString());
                    }
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No existe super secreto...");
        } catch (IOException e) {
            System.out.println("Problema con super secreto...");
        }

        movimientos.setItems(listViewData);
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
