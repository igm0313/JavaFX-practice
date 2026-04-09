import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
//--module-path "C:\Users\igm03\Downloads\openjfx-26_windows-x64_bin-sdk\javafx-sdk-26\lib" --add-modules javafx.controls,javafx.fxml

public class JavaFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group root = new Group();
        Scene scene = new Scene(root);

        Canvas canvas = new Canvas(400, 300);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        gc.strokeOval(100, 50, 200, 200);
        gc.fillOval(155, 100, 10, 20);
        gc.fillOval(230, 100, 10, 20);
        gc.strokeArc(150, 160, 100, 50, 180, 180, ArcType.OPEN);

        root.getChildren().add(canvas);
        primaryStage.setTitle("Happy face in JavaFX");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
