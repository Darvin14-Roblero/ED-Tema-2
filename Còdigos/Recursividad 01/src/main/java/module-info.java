module com.darvinsystems.recursividad04 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.darvinsystems.recursividad04 to javafx.fxml;
    exports com.darvinsystems.recursividad04;
    exports com.darvinsystems.recursividad04.controller;
    opens com.darvinsystems.recursividad04.controller to javafx.fxml;
}