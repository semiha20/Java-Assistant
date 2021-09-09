package Assistant;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SignUpController {

    @FXML
    private TextField username;

    @FXML
    private PasswordField userpass;

    @FXML
    private TextField name;
    @FXML
    private Hyperlink hyperlink2;

    @FXML
    void changescreen2(ActionEvent event) throws IOException {
    	Parent backlogin = FXMLLoader.load(getClass().getResource("MainP.fxml"));
        Scene  backlogscene = new Scene(backlogin);
        Stage  backwindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        backwindow.setScene(backlogscene);
        backwindow.show();
    }
    
    @FXML
    void signup(ActionEvent event) throws IOException {
    	File userFile= new File("users.txt");
    	FileWriter fileW = new FileWriter(userFile,true);
    	BufferedWriter bufferw= new BufferedWriter(fileW);
    	PrintWriter printW=new PrintWriter(bufferw);
    	
    	String NewUsername= username.getText();
    	String NewPassword = userpass.getText();
    	String NewName= name.getText();
    	if ((NewUsername!=null)&(NewPassword!=null)&(NewName!=null)) {
    		printW.print("\n"+NewUsername);
        	printW.print(" ");
        	printW.print(NewPassword);
        	//printW.print(",");
        	//printW.print(NewName);
        	printW.close();
        	System.out.println("sign up succesfull");
        	Parent as = FXMLLoader.load(getClass().getResource("OpenAssistant.fxml"));
            Scene asscene = new Scene(as);
            Stage aswindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
            aswindow.setScene(asscene);
            aswindow.show();
        	
    	}
    	else {
    	System.out.println("Please fill in all the questions");
    	}
    }
}
