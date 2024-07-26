module com.example.ta2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ta2 to javafx.fxml;
    exports com.example.ta2;
}