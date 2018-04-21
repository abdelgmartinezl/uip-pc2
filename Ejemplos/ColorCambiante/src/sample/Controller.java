package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class Controller {
    @FXML
    ImageView humano;

    boolean hacker = false;

    public void cambiar(MouseEvent mouseEvent) {
        if (!hacker) {
            humano.setImage(new Image("sample/2.png"));
            hacker = true;
        } else {
            humano.setImage(new Image("sample/1.png"));
            hacker = false;
        }
    }
}
