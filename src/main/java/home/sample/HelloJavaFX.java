package home.sample;

import javafx.application.Application;
import javafx.stage.Stage;

/**
 *  如果執行時出現以下的錯：
 *  Error:Kotlin: The Kotlin standard library is not found in the module graph. Please ensure you have the 'requires kotlin.stdlib' clause in your module definition
 *  解決方法：Build \rightarrowRebuild Project
 *
 *  包也要在 module-info exports
 */
public class HelloJavaFX extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
