import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class Prac9a extends Application {
    private static final int PANE_WIDTH = 400;
    private static final int PANE_HEIGHT = 400;
    private static final int CIRCLE_RADIUS = 20;
    private static final int CIRCLE_STEP = 10;

    private Circle circle;

    @Override
    public void start(Stage primaryStage) {
        Pane pane = new Pane();
        pane.setPrefSize(PANE_WIDTH, PANE_HEIGHT);

        // Create the circle
        circle = new Circle(CIRCLE_RADIUS, Color.RED);
        circle.setStroke(Color.BLACK);
        circle.setCenterX(20);
        circle.setCenterY(20);
        pane.getChildren().add(circle);

        // Handle arrow key events
        pane.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
               if(event.getCode()==KeyCode.UP && circle.getTranslateY()>10){
                circle.setTranslateY(circle.getTranslateY()-10);
               }
               if(event.getCode()==KeyCode.DOWN && circle.getTranslateY()<(pane.getHeight()-40)){
                circle.setTranslateY(circle.getTranslateY()+10);
               }
               if(event.getCode()==KeyCode.LEFT && circle.getTranslateX()>10){
                circle.setTranslateX(circle.getTranslateX()-10);
               }
               if(event.getCode()==KeyCode.RIGHT && circle.getTranslateX()<(pane.getWidth()-40)){
                circle.setTranslateX(circle.getTranslateX()+10);
               }

            }
        });

        // Set focus on the pane to receive key events
        pane.setFocusTraversable(true);

        Scene scene = new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();
        circle.requestFocus();
    }

    private void moveCircle(double dX, double dY) {
        double newX = circle.getCenterX() + dX;
        double newY = circle.getCenterY() + dY;

        // Ensure the circle stays within the bounds of the pane
        newX = Math.max(CIRCLE_RADIUS, Math.min(PANE_WIDTH - CIRCLE_RADIUS, newX));
        newY = Math.max(CIRCLE_RADIUS, Math.min(PANE_HEIGHT - CIRCLE_RADIUS, newY));

        circle.setCenterX(newX);
        circle.setCenterY(newY);
    }

    public static void main(String[] args) {
        launch(args);
    }
}