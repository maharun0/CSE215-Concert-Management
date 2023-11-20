/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.FileNotFoundException;
import java.io.FileWriter;
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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class BuyTicketController implements Initializable {

    @FXML
    private TextField name;
    @FXML
    private TextField gnd;
    @FXML
    private TextField mail;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Ticket_Buy(ActionEvent event) throws IOException {
        String n = name.getText(), gender = gnd.getText(), email = mail.getText();
        
        try{
        FileWriter fw = new FileWriter("src/textfiles/Buy.txt");
        fw.append(n+"\n"+gender+"\n"+email+"\n");
        fw.close();
        
    }catch(FileNotFoundException e){
        e.getStackTrace();
    }
        // Stage primaryStage = new Stage();
        // Parent root = FXMLLoader.load(getClass().getResource("../src/MainMenuPage.fxml"));
        // primaryStage = (Stage)((Node)event.getSource()).getScene().getWindow();
        // Scene scene = new Scene(root);
        // primaryStage.setScene(scene);
        // primaryStage.show();

        Parent root = FXMLLoader.load(getClass().getResource("../controller/MainMenuPage.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Search Band");
        stage.show();
    }
    
}
