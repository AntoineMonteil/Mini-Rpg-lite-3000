package isep.jfx;

import isep.rpg.Healer;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;

import java.io.IOException;

public class ChoiceController {
    @FXML
    protected void onStartWarriorButtonClick() throws IOException {
        // Affiche la fenêtre principale du jeu
        FXMLLoader fxmlLoader = new FXMLLoader
                (MainApplication.class.getResource("game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        MainApplication.stage.setScene(scene);
        MainApplication.stage.show();
    }
    @FXML
    protected void onStartHealerButtonClick() throws IOException {
        // Affiche la fenêtre principale du jeu
        FXMLLoader fxmlLoader = new FXMLLoader
                (MainApplication.class.getResource("game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        MainApplication.stage.setScene(scene);
        MainApplication.stage.show();
    }
    @FXML
    protected void onStartHunterButtonClick() throws IOException {
        // Affiche la fenêtre principale du jeu
        FXMLLoader fxmlLoader = new FXMLLoader
                (MainApplication.class.getResource("game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        MainApplication.stage.setScene(scene);
        MainApplication.stage.show();
    }
    @FXML
    protected void onStartMageButtonClick() throws IOException {
        // Affiche la fenêtre principale du jeu
        FXMLLoader fxmlLoader = new FXMLLoader
                (MainApplication.class.getResource("game-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        MainApplication.stage.setScene(scene);
        MainApplication.stage.show();
    }
}
