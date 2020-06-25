import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.event.EventHandler;
import javafx.scene.paint.Color;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.HBox;
import javafx.scene.control.DatePicker;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.geometry.Insets;
import javafx.scene.Group; 
import javafx.scene.input.MouseEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.*;
import javafx.scene.text.*;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.FileInputStream;


public class Amelie extends Application{
	
	public static void main(String[]args){
		launch(args);
	}
	

	public void start(Stage stage){
		
		Text text1 = new Text ("First Name:");
		TextField textfield1 = new TextField();
		
		Text text2 = new Text ("Last Name:");
		TextField textfield2 = new TextField();
		 
		Text text3 = new Text ("Middle name:");
		TextField textfield3 = new TextField();
		
		Text text4 = new Text ("Date Of Birth:");
		TextField textfield4 = new TextField();
		
		Text text5 = new Text ("Current Address:");
		TextField textfield5 = new TextField();
		
		Text text6 = new Text ("Sex");
		
		Text text7 = new Text ("Phone Number");
		TextField textfield7 = new TextField();
		
		Text text8 = new Text ("Email");
        TextField textfield8 = new TextField();		
		
		Text text9 = new Text ("Password");
		PasswordField password1 = new PasswordField();
		
		Text text10 = new Text ("Confirm Password");
		PasswordField password2 = new PasswordField();
		
		RadioButton radioButton1 = new RadioButton("Male");
		RadioButton radioButton2 = new RadioButton ("Female");
		HBox hbox = new HBox(radioButton1, radioButton2);
		
		Label label1 = new Label("*Your Password must have 8 characters at least;Uppercase; Lowercase; one special character and numbers");
		Label label4 = new Label("*Your email must contain an @ special caracter ");
		Label label3 = new Label();
		DatePicker datePicker = new DatePicker();
		CheckBox checkBox1 = new CheckBox("I agree to the terms and policies of Amelie !");
		
		Button button = new Button("Complete Registration");
		
		
		GridPane gridPane = new GridPane();
		EventHandler<MouseEvent> eventHandler = new EventHandler<MouseEvent>() { 
         @Override 
         public void handle(MouseEvent e) { 
            
            gridPane.add(label3,1,13);
            System.out.println("Thank you for registering for Amelie Application"); 
            button.setStyle("-fx-background-color: #3214b8;-fx-text-fill:white; -fx-font: normal bold 15px 'serif';");
            gridPane.setStyle("-fx-background-color:grey;");
            label1.setStyle("-fx-text-fill:white; -fx-font: normal bold 15px 'serif';");
			label4.setStyle("-fx-text-fill:white; -fx-font: normal bold 15px 'serif';");
            
         } 
      };  
		
		button.addEventFilter(MouseEvent.MOUSE_CLICKED, eventHandler);
	  
		
		gridPane.setMinSize(400, 200);
		gridPane.setPadding(new Insets(10, 10, 10, 10 ));
		gridPane.setVgap(12);
		gridPane.setHgap(12);
		gridPane.setAlignment(Pos.CENTER);
		
		
		button.setStyle("-fx-background-color:#fcb040; -fx-text-fill:white; -fx-font: normal bold 15px 'serif';");
        label1.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
		label4.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text1.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text2.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text3.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text4.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text5.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text6.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text7.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text8.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        text9.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
		text10.setStyle("-fx-text-fill:black; -fx-font: normal bold 15px 'serif';");
        checkBox1.setStyle("-fx-text-fill:black; -fx-font:normal bold 15px 'serif';");
        hbox.setStyle("-fx-text-fill:black; -fx-font:normal bold 15px 'serif';");
        datePicker.setMinSize(800,30);

        gridPane.add(text1,0,1);
        gridPane.add(textfield1,1,1);
        gridPane.add(text2,0,2);
        gridPane.add(textfield2,1,2);
        gridPane.add(text3,0,3);
        gridPane.add(textfield3,1,3);
		gridPane.add(text4,0,4);
		gridPane.add(datePicker,1,4);
        gridPane.add(text5,0,5);
        gridPane.add(textfield5,1,5);
		gridPane.add(text6,0,6);
		gridPane.add(hbox,1,6);
		gridPane.add(text7,0,7);
		gridPane.add(textfield7,1,7);
		gridPane.add(label4,1,8);
		gridPane.add(text8,0,9);
		gridPane.add(textfield8,1,9);
		gridPane.add(label1,1,10);
		gridPane.add(text9,0,11);
		gridPane.add(password1,1,11);
		gridPane.add(text10,0,12);
		gridPane.add(password2,1,12);
        gridPane.add(checkBox1,1,13);
        gridPane.add(button,1,15);
        
        Scene scene= new Scene(gridPane);
 
        stage.setTitle("Safe Journey With Amelie!");
		
        stage.setScene(scene);

        stage.show();

    }
    
}

