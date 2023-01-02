package concert;
import java.util.*;

import java.util.HashMap;
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

public class signin extends Application {
    //creating label username
    Text lbl1;
    //creating label pass
    Text lbl2;
    //creating text field for email
    TextField text1;
    PasswordField pass;
    Button LoginButton;
    Button ResetButton;
    GridPane grid;
    Scene scene;
    Image icon;
    Label messageLabel;
    String email;
    String password;

    namePass idpass = new namePass(email, password);

    HashMap<String, String> logininfo = idpass.getLoginInfo();

    @Override
    public void start(Stage primarystage) throws Exception {
        //creating email and pass
        lbl1 = new Text("Email");
        lbl2 = new Text("Password");

        text1 = new TextField();
        messageLabel = new Label();//if pass matched or inncorrect gives msg

        pass = new PasswordField();
        LoginButton = new Button("Sign-In");
        ResetButton = new Button("Clear");

        grid = new GridPane();

        //setting size for pane
        grid.setMinSize(400, 200);
        grid.setPadding(new Insets(10, 10, 10, 10));


        grid.setVgap(5);
        grid.setHgap(5);


        //setting button actions
        ResetButton.setOnAction(e -> {
            text1.setText("");
            pass.setText("");
        });

        //messageLabel.setText("This is your dadi");

        LoginButton.setOnAction(e -> {
            email = text1.getText();
            password = pass.getText();

            if (logininfo.containsKey(email)) {
                if (logininfo.get(email).equals(password)) {
                    messageLabel.setTextFill(Color.GREEN);
                    messageLabel.setText("You are sucessfully signed in");


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
                    messageLabel.setText("Invalid password");
                }
            } else {
                messageLabel.setTextFill(Color.RED);
                messageLabel.setText("Username not found");
            }
        });

        //setting up the grid allignment
        grid.setAlignment(Pos.CENTER);

        grid.add(lbl1, 0, 0);
        grid.add(text1, 1, 0);
        grid.add(lbl2, 0, 1);
        grid.add(pass, 1, 1);
        grid.add(LoginButton, 0, 2);
        grid.add(ResetButton, 1, 2);
        grid.add(messageLabel, 1, 4);
        scene = new Scene(grid);

      //  icon = new Image("E:\\ProjectConcert\\src\\main\\java\\concert\\concert_image.jpeg");
        //primarystage.getIcons().add(icon);

        //  setting the title of the stage

        primarystage.setTitle("ROCKKAVEN CONCERT");
        primarystage.setScene(scene);

        primarystage.show();

    }


    // Signin() {}

    /*public static void main(String[] args) {

        launch(args);


    }*/
}

