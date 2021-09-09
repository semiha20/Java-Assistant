package Assistant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainPController {
	public Scanner x;
    @FXML
    private TextField usernamelog;

    @FXML
    private PasswordField passwordlog;

    @FXML
    private Hyperlink hyperlink;
 
    @FXML
    void Loggg(ActionEvent event) throws IOException {
    	x =new Scanner(new File("users.txt"));
    	while(x.hasNext()) {
    		String a=x.next();
    		String b =x.next();
    		
    		String j=usernamelog.getText();
    		String o=passwordlog.getText();
    		if ((j.contentEquals(a))&&((o.contentEquals(b)))) {
    			Parent as = FXMLLoader.load(getClass().getResource("OpenAssistant.fxml"));
                Scene asscene = new Scene(as);
                Stage aswindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
                aswindow.setScene(asscene);
                aswindow.show();
    		}
    		else {
    			Parent p = FXMLLoader.load(getClass().getResource("WrongP.fxml"));
                Scene wp = new Scene(p);
                Stage wps = (Stage) ((Node) event.getSource()).getScene().getWindow();
                wps.setScene(wp);
                wps.show();
    		}
    		}
    }
    
    @FXML
    public void changescreen(ActionEvent event) throws IOException {
    	Parent userlogparent = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
        Scene  userlogscene = new Scene(userlogparent);
        Stage  userwindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        userwindow.setScene(userlogscene);
        userwindow.show();
    	
    
}
    
}
