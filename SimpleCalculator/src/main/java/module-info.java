module org.example.simplecalculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.simplecalculator to javafx.fxml;
    exports org.example.simplecalculator;
}