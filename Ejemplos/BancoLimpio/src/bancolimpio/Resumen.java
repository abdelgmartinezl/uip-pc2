package bancolimpio;

import javafx.animation.FadeTransition;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Resumen {
    @FXML
    Label cuenta;
    @FXML
    Label saldo;
    @FXML
    ImageView salir;

    String n;
    double s = 0.0;

    public void setCuenta() {
        String linea = null;
        try {
            FileReader fileReader = new FileReader("supersecreto.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while((linea = bufferedReader.readLine()) != null) {
                List<String> datos = Arrays.asList(linea.split(","));
                n = datos.get(0);
                if (n.equals("123456")) {
                    if (datos.get(2).equals("RETIRO") || datos.get(2).equals("TRANSFERIR")) {
                        s -= Double.parseDouble(datos.get(3));
                    } else {
                        s += Double.parseDouble(datos.get(3));
                    }
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No existe super secreto...");
        } catch (IOException e) {
            System.out.println("Problema con super secreto...");
        }

        cuenta.setText(n);
    }

    public void setSaldo() {
        saldo.setText(String.valueOf(s));
    }

    public void ver(ActionEvent actionEvent) {
    }

    public void transferir(ActionEvent actionEvent) {
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
}
