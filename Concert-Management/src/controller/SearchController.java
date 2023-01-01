package controller;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SearchController {

    @FXML private Button buttonBack;
    @FXML private Button buttonSearch;
    @FXML private TextArea outputTextArea;
    @FXML private TextField textField;

    @FXML
    void pressedButtonSearch(ActionEvent event) {
        String s = textField.getText();

        String resultBands = DataFile.searchForBands(s);
        String resultConcerts = DataFile.searchForConcerts(s);
        String resutltMembers = DataFile.searchForMembers(s);

        String output = resultBands + resultConcerts + resutltMembers;

        outputTextArea.setText(output);
    }

    @FXML
    void pressedButtonBack(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../controller/MainMenuPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Search Band");
        stage.show();
    }
}
