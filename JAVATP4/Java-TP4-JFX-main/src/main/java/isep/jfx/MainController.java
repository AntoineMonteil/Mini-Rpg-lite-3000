package isep.jfx;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;

import java.io.IOException;

public class MainController {

    @FXML
    protected void ButtonClick() throws IOException {
        // Affiche la fenêtre principale du jeu
        FXMLLoader fxmlLoader = new FXMLLoader
                (MainApplication.class.getResource("Choice-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        MainApplication.stage.setScene(scene);
        MainApplication.stage.show();
    }

}