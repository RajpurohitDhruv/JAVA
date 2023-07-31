import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Prac8b extends Application {

    @Override
    public void start(Stage stage) {
        Rectangle r = new Rectangle();
        Text t = new Text();
        StackPane sp = new StackPane(r, t);

        // Rectangle set

        r.heightProperty().bind(sp.heightProperty().divide(2));
        r.widthProperty().bind(sp.widthProperty().divide(2));
        r.setX(100);
        r.setY(150);
        r.setFill(Color.DARKBLUE);

        //

        t.setText("Welcome to JavaFX Programming");
        t.setFill(Color.WHITE);
        Scene s = new Scene(sp, 500, 400);
        stage.setTitle("My First JavaFX Programme");
        stage.setScene(s);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }

}