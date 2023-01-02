/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

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
public class ShowTicketController implements Initializable {

    @FXML
    private Label name;
    @FXML
    private Label Gender;
    @FXML
    private Label email;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        String name,gen,mail;
        try{
            File fr = new File("C:/Users/USER/Documents/NetBeansProjects/Concet Management System/Buy.txt");
            Scanner scan = new Scanner(fr);
            
            while(scan.hasNext()){
                name = scan.nextLine();
                gen = scan.next();
                mail = scan.next();
                
                name.setText(name);
                Gender.setText(gen);
                email.setText(mail);
                
            }
            scan.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ShowTicketController.class.getName()).log(Level.SEVERE, null, ex);
        }
        // TODO
    }    
    
}
