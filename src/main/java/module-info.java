module home {
    // 以下兩個模組已有傳遞性依賴一些必要的套件
    requires javafx.controls;
    requires javafx.fxml;

    opens home to javafx.fxml;

    exports home;
    exports home.sample;
}