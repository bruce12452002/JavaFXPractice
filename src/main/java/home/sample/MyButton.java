package home.sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *  窗(Window) >> 場景(Scene) >> 1~多個節點(Node) >> 控件(Control)
 */
public class MyButton extends Application {
    private Button btn;

    @Override
    public void start(Stage stage) throws Exception {
        btn = new Button();
        btn.setText("按我"); // 也可寫在建構子

        StackPane sp = new StackPane();
        sp.getChildren().add(btn);

        Scene scene = new Scene(sp, 100d, 200d); // 寬高

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
