package Assistant;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class OpenAssistantController {

    @FXML
    private Button eventadd;

    @FXML
    private Button eventshow;
    @FXML
    private Button eventadd1;

    @FXML
    private Button eventshow1;
   
    @FXML
    void KisiEkle(ActionEvent event) throws IOException {
    	Parent ks = FXMLLoader.load(getClass().getResource("AContact.fxml"));
        Scene kss = new Scene(ks);
        Stage ksw = (Stage) ((Node) event.getSource()).getScene().getWindow();
        ksw.setScene(kss);
        ksw.show();
    }
    
 
    @FXML
    void addevent(ActionEvent event) throws IOException {
    	Parent aob = FXMLLoader.load(getClass().getResource("Addingevent.fxml"));
        Scene obcene = new Scene(aob);
        Stage obwindow = (Stage) ((Node) event.getSource()).getScene().getWindow();
        obwindow.setScene(obcene);
        obwindow.show();
    }
   
    
    @FXML
    void goster(ActionEvent event) throws IOException {
    	BufferedReader br = new BufferedReader(new FileReader("Contacts.txt"));
		 String line;
		 while ((line = br.readLine()) != null) {
		   System.out.println(line);
    }
    }
    @FXML
    void listgoster(ActionEvent event) throws IOException {
    	BufferedReader br = new BufferedReader(new FileReader("ToDoList.txt"));
		 String line;
		 while ((line = br.readLine()) != null) {
		   System.out.println(line);
   }
    }


    @FXML
    void notekle(ActionEvent event) throws IOException {
    	Parent td = FXMLLoader.load(getClass().getResource("TDL.fxml"));
        Scene tdw = new Scene(td);
        Stage tds = (Stage) ((Node) event.getSource()).getScene().getWindow();
        tds.setScene(tdw);
        tds.show();
    }
    @FXML
    void showevent(ActionEvent event) throws IOException {
    	BufferedReader br = new BufferedReader(new FileReader("Events.txt"));
		 String line;
		 while ((line = br.readLine()) != null) {
		   System.out.println(line);
		   
		     
		 }
		 
    	
    }
    @FXML
    void sil(ActionEvent event) throws IOException {
    	Parent r = FXMLLoader.load(getClass().getResource("RemoveC.fxml"));
        Scene ba = new Scene(r);
        Stage rr = (Stage) ((Node) event.getSource()).getScene().getWindow();
        rr.setScene(ba);
        rr.show();
    }

}
