package ejemplo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;

public class Principal implements Initializable, ControlledScreen {

    ScreensController miController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO
    }

    public void setScreenParent(ScreensController screenParent) {
        miController = screenParent;
    }

    @FXML
    private void ir_secundario(ActionEvent actionEvent) {
        miController.setScreen(Main.screen2ID);
    }

    @FXML
    private void salir(ActionEvent actionEvent) {
        Platform.exit();
    }
}