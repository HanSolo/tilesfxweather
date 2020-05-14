/*
 * Copyright (c) 2017 by Gerrit Grunwald
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package eu.hansolo.tilesfxweather;

import eu.hansolo.tilesfx.Tile;
import eu.hansolo.tilesfx.Tile.SkinType;
import eu.hansolo.tilesfx.TileBuilder;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


/**
 * User: hansolo
 * Date: 14.05.20
 * Time: 19:52
 */
public class Demo extends Application {
    private static final double WIDTH     = 600;
    private static final double HEIGHT    = 400;
    private static       int    noOfNodes = 0;
    private              Tile   tile1;
    private              Tile   tile2;


    @Override public void init() {
        tile1 = TileBuilder.create()
                           .skinType(SkinType.CUSTOM)
                           .prefSize(WIDTH, HEIGHT)
                           .title("Weather")
                           .unit("\u00B0C")
                           .minValue(0)
                           .maxValue(150)
                           .decimals(1)
                           .tickLabelDecimals(0)
                           .customDecimalFormatEnabled(true)
                           .customDecimalFormat(new DecimalFormat("#"))
                           .time(ZonedDateTime.now(ZoneId.of("Europe/Berlin")))
                           .build();
        WeatherTileSkin weatherTileSkin = new WeatherTileSkin(tile1);

        /*
        double  lat     = 51.911858;
        double  lon     = 7.632815;
        DarkSky darkSky = new DarkSky("YOUR API KEY", Unit.CA, Language.ENGLISH, lat, lon);
        if (darkSky.update()) {
            System.out.println(darkSky.toJsonString());
        }
        DataPoint today = darkSky.getToday();
        */
        DataPoint today = new DataPoint();
        today.setTime(LocalDateTime.now());
        today.setSummary("Partly Cloudy");
        today.setCondition(ConditionAndIcon.PARTLY_CLOUDY_DAY);
        today.setTemperature(9.65);
        today.setPressure(1020.7);
        today.setHumidity(0.55);
        today.setWindSpeed(15.94);
        today.setTemperatureMin(0);
        today.setTemperatureMax(0);
        today.setSunriseTime(LocalDateTime.of(LocalDate.now(), LocalTime.of(5, 38)));
        today.setSunsetTime(LocalDateTime.of(LocalDate.now(), LocalTime.of(21, 44)));

        weatherTileSkin.setDataPoint(today, Unit.CA);
        tile1.setSkin(weatherTileSkin);

        tile2 = TileBuilder.create()
                           .skinType(SkinType.CUSTOM)
                           .prefSize(WIDTH, HEIGHT)
                           .title("Ephemeris")
                           .build();
        tile2.setSkin(new EphemerisTileSkin(tile2));
    }

    @Override public void start(Stage stage) {
        HBox pane = new HBox(10, tile1, tile2);
        pane.setPadding(new Insets(10));

        Scene scene = new Scene(pane);

        stage.setTitle("TilesFX Weather");
        stage.setScene(scene);
        stage.show();

        // Calculate number of nodes
        calcNoOfNodes(pane);
        System.out.println(noOfNodes + " Nodes in SceneGraph");
    }

    @Override public void stop() {
        Platform.exit();
        System.exit(0);
    }

    private static void calcNoOfNodes(Node node) {
        if (node instanceof Parent) {
            if (((Parent) node).getChildrenUnmodifiable().size() != 0) {
                ObservableList<Node> tempChildren = ((Parent) node).getChildrenUnmodifiable();
                noOfNodes += tempChildren.size();
                for (Node n : tempChildren) { calcNoOfNodes(n); }
            }
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
