package basic_class;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;
import java.io.*;


public class tempMain extends Application {
    @Override
    public void start(Stage primaryStage) throws IOException {
        // Taking input from file
        try {
            DataFile.takeInputBandDetails();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            DataFile.takeInputConcertDetails();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Parent root = FXMLLoader.load(getClass().getResource("../controller/MainMenuPage.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Main Menu");
        primaryStage.show();
    }

    public static void main(String[] args) throws FileNotFoundException {
        launch(args);
    }
}