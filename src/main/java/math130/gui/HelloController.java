package math130.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class HelloController {
    @FXML
    private Label welcomeText;

    //@FXML
    //private ImageView blueEyes;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
       // blueEyes.setImage(new image(getClass().getResourceAsStream("resources/math130.gui/SacredFireKingGarunix.jpg")));
    }

    //@FXML
    //private ImageView redEyes;
}