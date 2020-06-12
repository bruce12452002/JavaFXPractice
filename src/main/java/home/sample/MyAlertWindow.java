package home.sample;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MyAlertWindow extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        Button btn = new Button("按我");
        btn.setOnMouseClicked(e -> {
            String rtn = JumpWindow.alert("內窗標頭", "標籤標頭");
            System.out.println("rtn=" + rtn);
        });

        VBox vBox = new VBox();
        vBox.getChildren().add(btn);

        Scene scene = new Scene(vBox, 300d, 600d); // 寬高

        stage.setScene(scene);
        stage.setTitle("外窗標頭");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class JumpWindow {
    static String alert(String title, String labelText) {
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);

        Label label = new Label();
        label.setText(labelText); // 也可寫在建構子

        Button btn = new Button("關閉");
        btn.setOnMouseClicked(e -> stage.close());

        VBox vBox = new VBox();
        vBox.getChildren().addAll(label, btn);
        vBox.setAlignment(Pos.CENTER); // 將控件置中

        Scene scene = new Scene(vBox, 200d, 200d); // 寬高

        stage.setTitle(title);
        stage.setScene(scene);
        stage.setOnCloseRequest(e -> {
            e.consume(); // 取消預設行為
            System.out.println("點擊右上角的 X 按鈕觸發");
        });
        stage.showAndWait(); //  showAndWait () 之後的程式碼必需關閉窗體才會執行；而 show()不會等待，直接執行

        System.out.println("xxxxxxxxxxxxx");
        return "yeah!";
    }
}
