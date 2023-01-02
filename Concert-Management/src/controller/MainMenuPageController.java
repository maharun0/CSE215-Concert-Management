package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainMenuPageController {

    @FXML private Button buyTicketButton;
    @FXML private Button cancelTicketButton;
    @FXML private Button showMyTicketButton;
    @FXML private Button downloadMyTiicketButton;
    @FXML private Button searchBandButton;
    @FXML private Button managementButton;

    @FXML
    void pressedSearchBandButton(ActionEvent event) throws IOException {
        // Load SearchBandPage
        Parent root = FXMLLoader.load(getClass().getResource("../controller/SearchPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Search Band");
        stage.show();
    }

    @FXML
    void pressedManagementButton(ActionEvent event) throws IOException {
        // Load SearchBandPage
        Parent root = FXMLLoader.load(getClass().getResource("../controller/ManagementPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Search Band");
        stage.show();
    }
    
    @FXML
    void pressedBuyTicketButton(ActionEvent event) {

    }

    @FXML
    void pressedCancelTicketButton(ActionEvent event) {

    }
    
    @FXML
    void pressedShowMyTicketButton(ActionEvent event) {

    }

    @FXML
    void pressedDownloadMyTicketButton(ActionEvent event) {

    }

    

   

    
}
