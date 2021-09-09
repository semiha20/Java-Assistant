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
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AContactController {

    @FXML
    private TextField CName;

    @FXML
    private TextField CMail;

    @FXML
    private TextField CNumber;

    @FXML
    void backtomenu2(ActionEvent event) throws IOException {
    	Parent e = FXMLLoader.load(getClass().getResource("OpenAssistant.fxml"));
        Scene b = new Scene(e);
        Stage r = (Stage) ((Node) event.getSource()).getScene().getWindow();
        r.setScene(b);
        r.show();
    }
    @FXML
    void yenikisi(ActionEvent event) throws IOException {
    	File addC=new File("Contacts.txt");
		FileWriter CWriter=new FileWriter(addC,true);
		BufferedWriter CB=new BufferedWriter(CWriter);
		PrintWriter Cprint=new PrintWriter(CB);
		String isim=CName.getText();
		String mail=CMail.getText();
		String numara=CNumber.getText();
		Cprint.print(isim);
		Cprint.print(",");
		Cprint.print(mail);
		Cprint.print(",");
		Cprint.print(numara+"\n");
		Cprint.close();
		System.out.println("saved!");
    }

}