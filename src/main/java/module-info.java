module dk.via.vinyl_system {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens dk.via.vinyl_system to javafx.fxml;
    exports dk.via.vinyl_system;
}