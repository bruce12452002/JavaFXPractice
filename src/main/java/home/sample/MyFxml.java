package home.sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MyFxml extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws IOException {
        // 方法一：使用 URL
        URL url = getClass().getResource("/home/xxx.fxml");

        // 方法二：使用 InputStream
        // InputStream is = getClass().getResourceAsStream("/home/xxx.fxml");
        // Parent p = new FXMLLoader().load(is);

        if (url != null) {
            // 以下兩種方法擇一
            // Parent p = FXMLLoader.load(url);
            Parent p = new FXMLLoader(url).load();

            Scene scene = new Scene(p);
            stage.setScene(scene);
        }
        stage.show();
    }
}
