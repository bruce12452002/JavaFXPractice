module home {
    requires javafx.controls;
    requires javafx.fxml;

    opens home to javafx.fxml;

    exports home;
    exports home.sample;
}