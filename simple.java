import javafx.application.Application;  
import javafx.scene.Scene;  
import javafx.scene.control.Button;  
import javafx.stage.Stage;  
import javafx.scene.layout.StackPane;  
public class simple extends Application{  
  
    @Override  
    public void start(Stage primaryStage) throws Exception {    
        Button btn1=new Button("Say, Hello World");  
        StackPane root=new StackPane();  
        root.getChildren().add(btn1);  
        Scene scene=new Scene(root);      
        primaryStage.setScene(scene);  
        primaryStage.setTitle("First JavaFX Application");  
        primaryStage.show();  
    }  
    
    public static void main(String[] args) {
        launch(args);
    }
}  