module eu.hansolo.tilesfxweather {

    // Java
    requires java.base;

    // 3rd party
    requires json.simple;
    requires eu.hansolo.tilesfx;

    // Java-FX
    requires transitive javafx.base;
    requires transitive javafx.graphics;
    requires transitive javafx.controls;
    requires transitive javafx.web;

    exports eu.hansolo.tilesfxweather;
}