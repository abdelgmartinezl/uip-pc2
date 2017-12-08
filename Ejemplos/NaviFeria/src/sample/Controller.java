package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    ComboBox<String> opcion;
    @FXML
    TextArea descripcion;
    @FXML
    CheckBox hembra;
    @FXML
    CheckBox macho;
    @FXML
    TextField nombre;

    @FXML
    public void initialize() {
        ObservableList<String> data = FXCollections.observableArrayList();
        data.add("Pavo");
        data.add("Pollo");
        data.add("Pato");
        opcion.setItems(data);
        opcion.getSelectionModel().selectFirst();
    }

    public void mostrar(ActionEvent actionEvent) {
        if (opcion.getSelectionModel().getSelectedItem().toString().equals("Pavo")) {
            descripcion.setText("El pavo hace blururu");
        } else if (opcion.getSelectionModel().getSelectedItem().toString().equals("Pollo")) {
            descripcion.setText("El pollo hace kokoroko");
        } else {
            descripcion.setText("El pato ni idea, cuak?");
        }
    }

    public void digerir(ActionEvent actionEvent) {
        if (hembra.isSelected()) {
            descripcion.setText(descripcion.getText() + "\n" +
                    "Es hembra");
        }
        if (macho.isSelected()) {
            descripcion.setText(descripcion.getText() + "\n" +
                    "Es macho");
        }
    }

    public void continuar(ActionEvent actionEvent) {
        if (!nombre.getText().equals("")) {
            System.out.println("Cambio de pantalla");
        } else {
            System.out.println("No se cambio la pantalla");
        }

    }
}
