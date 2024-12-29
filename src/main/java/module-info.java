module com.example.travelapplication {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.media;


    opens com.example.travelapplication to javafx.fxml;
    exports com.example.travelapplication;
}