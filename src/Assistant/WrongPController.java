package Assistant;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class WrongPController {

    @FXML
    void click(ActionEvent event) throws IOException {
    	Parent w = FXMLLoader.load(getClass().getResource("MainP.fxml"));
        Scene ws = new Scene(w);
        Stage ww = (Stage) ((Node) event.getSource()).getScene().getWindow();
        ww.setScene(ws);
        ww.show();
    }
}