package controller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ManagementController {

    @FXML private Button BackButton;
    @FXML private Button SaleRecordsButton;
    @FXML private Button popularBandsButton;
    @FXML private Text titleText;
    @FXML private Button PurchaseHistoryButton;

    @FXML
    void PressedPurchaseHistoryButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../controller/PurchaseHistoryPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Purchase History");
        stage.show();
    }

    @FXML
    void pressedPopularBandsButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../controller/PopularBandsPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Popular Bands");
        stage.show();
    }

    @FXML
    void pressedBackButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../controller/MainMenuPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Main Menu");
        stage.show();
    }
}
