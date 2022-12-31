package concert;
import javafx.application.Application;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import javafx.scene.image.Image;
import javafx.scene.text.Text;

public class signUp extends Application{
    Label nameLabel;
    TextField nameText;
    Label dobLabel;
    DatePicker datePicker;
    Label genderLabel;
    ToggleGroup groupGender;
    RadioButton maleRadio;
    RadioButton femaleRadio;
    Text lbl_user;
    Text lbl_pass;
    TextField user;
    PasswordField pass;
    Button signup_button;
    GridPane gridPane;
    Scene sc;
    Image icon;
    @Override
    public void start(Stage primarystage)throws IOException{
        //label for name
        Label nameLabel=new Label("Name");
        //text field for name
        nameText= new TextField();

        //lael for date of irth
        dobLabel=new Label("Birth Date");
        //date picker to choose date
        datePicker=new DatePicker();
        //label for gender
        genderLabel=new Label("Gender");


        //toggle grp of radio button
        groupGender= new ToggleGroup();
        maleRadio=new RadioButton("Male");
        maleRadio.setToggleGroup(groupGender);
        femaleRadio=new RadioButton("Female");
        femaleRadio.setToggleGroup(groupGender);

        //label for email and pass
        lbl_user=new Text("Email");
        lbl_pass=new Text("Password");
        //text field for user email
        user=new TextField();

        //pass field for email

        pass=new PasswordField();


        //label for register
        signup_button=new Button("Create Account");

        //grid pane creating
        gridPane=new GridPane();

        //setting size for pane
        gridPane.setMinSize(700,400);

        //set padding
        gridPane.setPadding(new Insets(20,20,20,20));

        //vertical and horizontal gaps between the collumns
        gridPane.setVgap(6);
        gridPane.setHgap(6);

        //setting grid allignment
        gridPane.setAlignment(Pos.CENTER);

        //Arranging nodes in the grid
        gridPane.add(nameLabel,0,0);
        gridPane.add(nameText,1,0);

        gridPane.add(dobLabel,0,1);
        gridPane.add(datePicker,1,1);



        gridPane.add(genderLabel,0,2);
        gridPane.add(maleRadio,1,2);
        gridPane.add(femaleRadio,2,2);
        gridPane.add(lbl_user,0,3);
        gridPane.add(user,1,3);
        gridPane.add(lbl_pass,0,4);
        gridPane.add(pass,1,4);

        gridPane.add(signup_button,2,7);

        //Styling nodes
        //Setting the background color
        //Creating a scene object
        sc = new Scene(gridPane);

        //Setting up an icon
        icon = new Image("E:\\ProjectConcert\\src\\main\\java\\concert");
        primarystage.getIcons().add(icon);
        //Setting up the title of the Stage
        primarystage.setTitle("ROKKAVEN CONCERT");
        primarystage.setScene(sc);

        //Adding scene to the stage
        primarystage.setScene(sc);

        //Displaying the contents of the stage
        primarystage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }

}