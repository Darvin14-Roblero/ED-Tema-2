module com.darvinsystems.recursividad02 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.darvinsystems.recursividad02 to javafx.fxml;
    exports com.darvinsystems.recursividad02;
    exports com.darvinsystems.recursividad02.controller;
    opens com.darvinsystems.recursividad02.controller to javafx.fxml;
}