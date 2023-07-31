

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class javafx1 extends Application {

    @Override
    public void start(Stage primaryStage) {

        Rectangle r = new Rectangle(300, 300);
        r.setFill(Color.BLUE);

        Text t = new Text("welcome to javafx programming");
        t.setFont(Font.font("Arial", 20));
        t.setFill(Color.WHITE);

        StackPane root = new StackPane();
        root.getChildren().addAll(r,t);

        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("prog 1");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


