import javafx.application.Application;
import javafx.scene.canvas.Canvas;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.text.Font;
import javafx.scene.paint.Color;

//--module-path "C:\Users\igm03\Downloads\openjfx-26_windows-x64_bin-sdk
// \javafx-sdk-26\lib" --add-modules javafx.controls,javafx.fxml

public class fx2 extends Application { //부모클래스 Application을 받아서
    public static void main(String[] args) {
        launch(args); //실행
    }

    @Override //오버라이딩을 컴파일러에게 알려줌
    public void start(Stage primaryStage) throws Exception { //스타트 파라미터로 Stage를 받음
        Group root = new Group(); //그룹 객체
        Scene scene = new Scene(root); //씬 객체 (그룹을 받음) 안받으면 어떻게 되는가?
        Circle cir = new Circle();

        Canvas canvas = new Canvas(400, 300); // 새로운 캔버스 생성
        GraphicsContext gc = canvas.getGraphicsContext2D(); //캔버스에 그림그리는 붓이라고 생각
        gc.setFill(Color.YELLOW);
        gc.rect(100,50,200,200); //사각형 그리기
        gc.setFill(Color.YELLOW);
        gc.fillOval(100, 50, 200, 200); //빈 원 그리기
        gc.setFill(Color.BLACK);
        gc.fillOval(155, 100, 10, 20); //속이 찬 원 그리기
        gc.setFill(Color.BLACK);
        gc.fillOval(230, 100, 10, 20); //속이 찬 원
        gc.setFill(Color.YELLOW);
        gc.strokeArc(150, 160, 100, 50, 180, 180, ArcType.OPEN); // 호 그리기

        gc.setFill(Color.BLACK);
        gc.setFont(Font.font("Times New Roman",30));
        gc.fillText("Hello!",300,40);

        root.getChildren().add(canvas); //캔버스를 그룹안에 넣음
        primaryStage.setTitle("Happy face in JavaFX"); //프로그램 이름
        primaryStage.setScene(scene); //stage의 scene 추가
        primaryStage.show(); //stage 보여줌
    }
}
