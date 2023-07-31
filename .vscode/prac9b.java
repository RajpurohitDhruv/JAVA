import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class prac9b extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    Circle c = new Circle();

    public void start(Stage primaryStage){
        primaryStage.setTitle("The Second Practical");

        c.setRadius(50);
        c.setFill(Color.RED);

        c.setOnMouseEntered(new EventHandler<Event>() {

            @Override
            public void handle(Event arg0) {
                c.setRadius(70);
                c.setFill(Color.BLUE);
            }

        });

        c.setOnMouseExited(new EventHandler<Event>() {

            @Override
            public void handle(Event arg0) {
                c.setRadius(50);
                c.setFill(Color.RED);
            }

        });

        c.setOnMouseClicked(Event->{
            if(Event.getButton() == MouseButton.PRIMARY){
                c.setFill(Color.GREEN);
            }else if(Event.getButton() == MouseButton.SECONDARY){
                c.setFill(Color.YELLOW);
            }
        });



        StackPane stp = new StackPane(c);

        Scene scene = new Scene(stp, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}