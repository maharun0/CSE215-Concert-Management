package concert;
import java.util.*;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/*
signin() {

}*/



public class signin extends Application {
    //creating label email
    Text lbl1;
    //creating label pass
    Text lbl2;
    //creating text field for email
    TextField text1;
    PasswordField pass;
    //creating infobutton
    Button LoginButton;
    Button ResetButton;
    GridPane gridpane;
    //Stage primarystage;
    Scene sc;
    Image icon;
    Label messageLabel;
    String name;
    String password;

    namePass idpass = new namePass(name, password);

    HashMap<String, String> logininfo = idpass.getLoginInfo();


    @Override
    public void start(Stage primarystage) throws Exception {
        //creating email and pass
        lbl1 = new Text("Email");
        lbl2 = new Text("Password");

        text1 = new TextField();
        messageLabel = new Label();//if pass matched or inncorrect gives msg

        pass = new PasswordField();
        LoginButton = new Button("Login");
        ResetButton = new Button("Reset");

        gridpane = new GridPane();

        //setting size for pane
        gridpane.setMinSize(400, 200);
        gridpane.setPadding(new Insets(10, 10, 10, 10));

        //setting vertical and horizontal gaps between columns
        gridpane.setVgap(5);
        gridpane.setHgap(5);


        //setting button actions
        ResetButton.setOnAction(e -> {
            text1.setText("");
            pass.setText("");
        });

        //messageLabel.setText("This is your dadi");

        LoginButton.setOnAction(e -> {
            name = text1.getText();
            password = pass.getText();

            if (logininfo.containsKey(name)) {
                if (logininfo.get(name).equals(password)) {
                    messageLabel.setTextFill(Color.GREEN);
                    messageLabel.setText("You are sucessfu lly logged in");

                    //PageOpen page= new PageOpen();
                    //  primarystage.close();
                    //page.concert(primarystage);
                    // Concerts concert=new concerts;
                     /*   try{
                            concerts.start(primarystage);
                        }catch(Exception ex){
                            Logger.getLogger(Signin_Page.class.getName().log(Level.SEVERE,null,ex));
                        }*/


                } else {
                    messageLabel.setTextFill(Color.RED);
                    messageLabel.setText("Incorrect password");
                }
            } else {
                messageLabel.setTextFill(Color.RED);
                messageLabel.setText("Username not found");
            }
        });

        //setting up the grid allignment
        gridpane.setAlignment(Pos.CENTER);


        gridpane.add(lbl1, 0, 0);
        gridpane.add(text1, 1, 0);
        gridpane.add(lbl2, 0, 1);
        gridpane.add(pass, 1, 1);
        gridpane.add(LoginButton, 0, 2);
        gridpane.add(ResetButton, 1, 2);
        gridpane.add(messageLabel, 1, 4);
        sc = new Scene(gridpane);

        //primarystage.getIcons().add(applicationIcon);
        // icon = new Image("E:\\ProjectConcert\\src\\main\\java\\concert");
        //primarystage.getIcons().add(icon);

        //  setting the title of the stage

        primarystage.setTitle("ROCKKAVEN CONCERT");
        primarystage.setScene(sc);

        primarystage.show();

    }


    public static void main(String[] args) {

        launch(args);


    }
}
