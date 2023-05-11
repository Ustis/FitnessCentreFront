module ustis.fitnesscentrefront {
    requires javafx.controls;
    requires javafx.fxml;
    requires okhttp3;
    requires com.google.gson;
    requires annotations;


    opens ustis.fitnesscentrefront to javafx.fxml;
    exports ustis.fitnesscentrefront;
    exports ustis.fitnesscentrefront.controller;
    opens ustis.fitnesscentrefront.controller to javafx.fxml;
    opens ustis.fitnesscentrefront.api.dto to com.google.gson;
    opens ustis.fitnesscentrefront.domain to com.google.gson, javafx.base;
}