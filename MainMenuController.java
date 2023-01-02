/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class MainMenuController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Buy_ticket(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("Buy Ticket.fxml"));
                    primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    primaryStage.setScene(scene);
                    primaryStage.show();
    }

    @FXML
    private void band_list(ActionEvent event) throws IOException {
           Stage primaryStage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("BandList.fxml"));
                    primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    primaryStage.setScene(scene);
                    primaryStage.show();
    }

    @FXML
    private void show_ticket(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("ShowTicket.fxml"));
                    primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    primaryStage.setScene(scene);
                    primaryStage.show(); 
        
    }

    @FXML
    private void seatch_band(ActionEvent event) throws IOException {
        Stage primaryStage = new Stage();
                    Parent root = FXMLLoader.load(getClass().getResource("SearchBand.fxml"));
                    primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
                    Scene scene = new Scene(root);
                    primaryStage.setScene(scene);
                    primaryStage.show(); 
        
    }

    @FXML
    private void management(ActionEvent event) {
    }
    
}
