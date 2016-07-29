package registro;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.io.*;

public class Controller {
    public TextField txt_nombre;
    public TextField txt_carrera;

    public void guardar(ActionEvent actionEvent) {
        String nombre, carrera, entrada;
        nombre = txt_nombre.getText();
        carrera = txt_carrera.getText();

        if (!nombre.isEmpty() && !carrera.isEmpty()) {
            entrada = nombre + "," + carrera;

            try {
                File archivo = new File("lista.txt");

                if (!archivo.exists()) {
                    archivo.createNewFile();
                }

                FileWriter fw = new FileWriter(archivo.getAbsoluteFile(), true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(entrada);
                bw.write("\n");
                bw.close();
            } catch (IOException e) {
                System.err.println("ERROR: Manipulacion de archivo.");
            }
        } else {
            txt_carrera.setText("");
            txt_nombre.setText("");
        }
    }

    public void limpiar(ActionEvent actionEvent) {
        txt_carrera.setText("");
        txt_nombre.setText("");
    }
}
