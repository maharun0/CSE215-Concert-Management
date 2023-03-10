/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author USER
 */
public class ShowTicketPageController implements Initializable {

    @FXML
    private Label naem;
    @FXML
    private Label Gender;
    @FXML
    private Label email;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String n,gen,mail;
        try{
            File fr = new File("src/textfiles/Buy.txt");
            Scanner scan = new Scanner(fr);
            
            while(scan.hasNext()){
                n = scan.nextLine();
                gen = scan.next();
                mail = scan.next();
                
                naem.setText(n);
                Gender.setText(gen);
                email.setText(mail);
                
            }
            scan.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ShowTicketPageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }    
    
}
