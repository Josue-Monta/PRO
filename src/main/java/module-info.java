module com.example.clase {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.clase to javafx.fxml;
    exports com.example.clase;
}