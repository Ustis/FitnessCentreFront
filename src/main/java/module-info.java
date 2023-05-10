module ustis.fitnesscentrefront {
    requires javafx.controls;
    requires javafx.fxml;


    opens ustis.fitnesscentrefront to javafx.fxml;
    exports ustis.fitnesscentrefront;
}