package home.sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

// 事件要實作 EventHandler
public class MyEvent extends Application {
    private Button btn = new Button("按我");

    @Override
    public void start(Stage stage) throws Exception {
        btn.setOnMouseClicked(new MyButtonOfMouseEvent());

        StackPane sp = new StackPane();
        sp.getChildren().add(btn);

        Scene scene = new Scene(sp, 100d, 200d); // 寬高
        scene.setOnMouseClicked(new MyButtonOfMouseEvent());
        // scene.setOnMouseClicked(m -> System.out.println("場景觸發-lambda"));

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    class MyButtonOfMouseEvent implements EventHandler<MouseEvent> {
        @Override
        public void handle(MouseEvent mouseEvent) {
            System.out.println(mouseEvent.getSource());
            if (mouseEvent.getSource() == btn) {
                System.out.println("按鈕觸發");
            } else {
                System.out.println("場景觸發");
            }
        }
    }
}
