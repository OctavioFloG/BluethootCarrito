module com.example.carritobluethoot {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.carritobluethoot to javafx.fxml;
    exports com.example.carritobluethoot;
}