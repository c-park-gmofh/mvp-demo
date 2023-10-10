module com.example.mvpdemo {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.mvpdemo.app;
    opens com.example.mvpdemo.app to javafx.fxml;
    exports com.example.mvpdemo.controller;
    opens com.example.mvpdemo.controller to javafx.fxml;
}