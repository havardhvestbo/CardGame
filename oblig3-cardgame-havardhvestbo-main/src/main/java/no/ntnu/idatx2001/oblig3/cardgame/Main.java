package no.ntnu.idatx2001.oblig3.cardgame;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
      Parent root = null;
      try {
        root = FXMLLoader.load(getClass().getResource("SceneBuilder.fxml"));

        primaryStage.setTitle("Card Game");
        primaryStage.setScene(new Scene(root, 900, 500));
        primaryStage.show();
      } catch (IOException e) {
        System.out.println("ERROR: " + e.getMessage());
      }
    }


    public static void main(String[] args) {
      launch(args);
    }
}
