package controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import basic_class.DataFile;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class PurchaseHistoryController {

    @FXML private Button backButton;
    @FXML private TextArea textOutputArea;
    @FXML private Button showPurchaseHistoryButton;

    @FXML
    void pressedBackButton(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../controller/ManagementPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Search Band");
        stage.show();
    }

    @FXML
    void pressedShowPurchaseHistoryButton(ActionEvent event) throws FileNotFoundException {
        String output = DataFile.getPurchaseHistory();
        textOutputArea.setText(output);
    }
}

