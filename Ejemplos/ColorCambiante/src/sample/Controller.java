package sample;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

public class Controller {
    @FXML
    ImageView humano;
    @FXML
    Circle status;
    @FXML
    ImageView cheinchein;

    boolean hacker = false;

    public void cambiar(MouseEvent mouseEvent) {
        if (!hacker) {
            humano.setImage(new Image("sample/2.png"));
            status.setFill(Color.GREEN);
            cheinchein.setVisible(true);
            hacker = true;
        } else {
            humano.setImage(new Image("sample/1.png"));
            status.setFill(Color.RED);
            cheinchein.setVisible(false);
            hacker = false;
        }
    }
}
