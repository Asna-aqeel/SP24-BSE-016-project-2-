module com.company.demo7 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.company.demo7 to javafx.fxml;
    exports com.company.demo7;
}