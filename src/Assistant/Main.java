package Assistant;



import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}
		
	
	
	  
    @Override
    public void start(Stage primaryStage) throws Exception{
    	
        Parent root =FXMLLoader.load(getClass().getResource("MainP.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("ASSISTANT");
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }

	
    
}



