module com.wendy.codeclass {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.wendy.codeclass to javafx.fxml;
    exports com.wendy.codeclass;
}