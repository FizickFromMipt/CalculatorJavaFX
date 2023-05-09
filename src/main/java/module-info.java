module ru.pevnenko.calculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens ru.pevnenko.calculator to javafx.fxml;
    exports ru.pevnenko.calculator;
}