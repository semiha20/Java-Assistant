package Assistant;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class AddingeventController {
    @FXML
    private TextField not61;
    @FXML
    void backtomenu1(ActionEvent event) throws IOException {
    	Parent e = FXMLLoader.load(getClass().getResource("OpenAssistant.fxml"));
        Scene b = new Scene(e);
        Stage r = (Stage) ((Node) event.getSource()).getScene().getWindow();
        r.setScene(b);
        r.show();
    }

    @FXML
    void event61(ActionEvent event) throws IOException {
    	File addevent= new File("Events.txt");
		FileWriter EW = new FileWriter(addevent,true);
		BufferedWriter BW= new BufferedWriter(EW);
		PrintWriter PW=new PrintWriter(BW);
		String YnoT=not61.getText();
		PW.print(YnoT+"\n");
        PW.close();
      System.out.println("saved!");
    }

}


