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

public class TDLController {
    @FXML
    private TextField nottt;
    @FXML
    void backtomenu3(ActionEvent event) throws IOException {
    	Parent e = FXMLLoader.load(getClass().getResource("OpenAssistant.fxml"));
        Scene b = new Scene(e);
        Stage r = (Stage) ((Node) event.getSource()).getScene().getWindow();
        r.setScene(b);
        r.show();
    }
    @FXML
    void yeninotekle(ActionEvent event) throws IOException {
    	File todo=new File("ToDoList.txt");
    	FileWriter tdW=new FileWriter(todo,true);
    	BufferedWriter tdB=new BufferedWriter(tdW);
    	PrintWriter tdPrint=new PrintWriter(tdB);
        String not= nottt.getText();
        tdPrint.print(not+"\n");
        tdPrint.close();
        System.out.println("Saved!");
    }

}
