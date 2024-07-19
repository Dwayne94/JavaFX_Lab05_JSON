module org.example.week11_javafxapp_json {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.week11_javafxapp_json to javafx.fxml;
    exports org.example.week11_javafxapp_json;
}