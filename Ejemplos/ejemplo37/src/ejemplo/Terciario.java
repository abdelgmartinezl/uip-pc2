package ejemplo;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class Terciario implements Initializable, ControlledScreen {

    @FXML
    public WebView web_browser;

    ScreensController miController;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // TODO
    }

    public void setScreenParent(ScreensController screenParent) {
        miController = screenParent;
    }

    @FXML
    private void ir_secundaria(ActionEvent actionEvent) {
        miController.setScreen(Main.screen2ID);
    }

    @FXML
    private void ir_principal(ActionEvent actionEvent) {
        miController.setScreen(Main.screen1ID);
    }

    @FXML
    private void cargarGoogle(ActionEvent actionEvent) {
    }

    @FXML
    private void salir(ActionEvent actionEvent) {
        Platform.exit();
    }
}