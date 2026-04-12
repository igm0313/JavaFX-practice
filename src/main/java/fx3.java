import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.shape.Circle;

public class fx3 extends Application {
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage){
        Circle circle = new Circle(200,150,30);
        Button b = new Button("Click me!");
        Group root = new Group(circle);
        root.getChildren().add(b);
        Scene scene = new Scene(root,400,300);

        stage.setTitle("Circle");
        stage.setScene(scene);
        stage.show();
    }
}
