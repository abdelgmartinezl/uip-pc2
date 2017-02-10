package ui;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.scene.control.TextInputDialog;

import javax.swing.text.html.Option;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Optional;

public class Controller {

    public int numero;
    public int resultado;

    public void solicitar(ActionEvent actionEvent) {
        TextInputDialog dialogo = new TextInputDialog("0");
        dialogo.setTitle("Solicitud de Datos");
        dialogo.setContentText("Ingrese un numero:");
        Optional<String> resultado = dialogo.showAndWait();
        if (resultado.isPresent()) {
            System.out.println("Numero: " + resultado.get());
            numero = Integer.parseInt(resultado.get());
        }
    }

    public void guardar(ActionEvent actionEvent) {
        File archivo = new File("archivo.txt");
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (IOException e) {
                System.out.println("Problema creando archivo...");
            }
        }

        try {
            FileWriter fw = new FileWriter(archivo.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("El duplicado de " + numero + " es " + resultado);
            bw.write("\n");
            bw.close();
        } catch (IOException e) {
            System.out.println("Problema con el escritor...");
        }

    }

    public void salir(ActionEvent actionEvent) {
        Platform.exit();
    }

    public void calcular(ActionEvent actionEvent) {
        resultado = numero * 2;
    }
}
