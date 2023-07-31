import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class b extends Application {
    public void start(Stage stg) throws Exception {
        Circle c = new Circle();
        Pane p = new Pane(c);
        c.setRadius(50);
        c.setCenterX(60);
        c.setCenterY(60);
        c.centerXProperty().bind(p.heightProperty().divide(2));
        c.centerYProperty().bind(p.widthProperty().divide(2));

        c.setFill(Color.RED);

        c.setOnMouseEntered(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent arg0) {
                c.setFill(Color.BLUE);
                c.setRadius(70);
            }
        });
        c.setOnMouseExited(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent arg0) {
                c.setFill(Color.RED);
                c.setRadius(50);
            }
        });

        c.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent key) {
                // if (key.getCode() == KeyCode.UP)
                // c.setTranslateY(c.getTranslateY() - 10);
                // if (key.getCode() == KeyCode.DOWN)
                // c.setTranslateY(c.getTranslateY() + 10);
                if (key.getCode() == KeyCode.LEFT)
                    c.setFill(Color.GREEN);
                if (key.getCode() == KeyCode.RIGHT)
                    c.setFill(Color.YELLOW);
            }
        });
        Scene s1 = new Scene(p, 500, 450);
        stg.setScene(s1);
        c.requestFocus();
        stg.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}