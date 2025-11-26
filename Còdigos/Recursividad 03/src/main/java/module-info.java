module com.darvinsystems.recursividad03 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.darvinsystems.recursividad03 to javafx.fxml;
    exports com.darvinsystems.recursividad03;
    exports com.darvinsystems.recursividad03.controller;
    opens com.darvinsystems.recursividad03.controller to javafx.fxml;
}