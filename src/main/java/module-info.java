module com.example.snaaaake {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.snaaaake to javafx.fxml;
    exports com.example.snaaaake;
}