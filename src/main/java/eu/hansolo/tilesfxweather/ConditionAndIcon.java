/*
 * Copyright (c) 2020 by Gerrit Grunwald
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

public enum ConditionAndIcon {
    // WeatherConditions with Icons
    NONE("none", "unknown", 0.305085,0.576271),
    CLEAR_DAY("clear-day", "sun", 0.881356, 0.881356),
    CLEAR_NIGHT("clear-night", "sun", 0.881356, 0.881356),
    RAIN("rain", "rain", 0.89831, 0.79661),
    SNOW("snow", "snow", 0.898305, 0.728814),
    SLEET("sleet", "sleet", 0.898305, 0.677966),
    WIND("wind", "wind", 0.813559, 0.474576),
    FOG("fog", "fog", 0.949153, 0.661017),
    CLOUDY("cloudy", "cloud", 0.898305, 0.559322),
    PARTLY_CLOUDY_DAY("partly-cloudy-day", "sun-and-cloud", 0.983051, 0.745763),
    PARTLY_CLOUDY_NIGHT("partly-cloudy-night", "sun-and-cloud", 0.983051, 0.745763),
    HAIL("hail", "sleet", 0.898305, 0.677966),
    THUNDERSTORM("thunderstorm", "thunderstorm", 0.898305, 0.728814),
    // Unit-Icons
    INSIDE_TEMP("inside-temp", "inside-temp", 0.67307692, 0.92307692),
    OUTSIDE_TEMP("outside-temp", "outside-temp", 0.38461538, 0.92307692),
    PRESSURE("pressure", "pressure", 0.610169, 0.610169),
    HUMIDITY("humidity", "humidity", 0.644068, 0.728814),
    WIND_SPEED("windSpeed", "wind", 0.813559, 0.474576),
    SUNRISE("sunrise", "sun-rise", 1.0, 0.69230769),
    SUNSET("sunset", "sun-set", 1.0, 0.73076923);

    public String value;
    public String styleClass;
    public double widthFactor;
    public double heightFactor;

    ConditionAndIcon(final String VALUE, final String STYLE_CLASS, final double WIDTH_FACTOR, final double HEIGHT_FACTOR) {
        value        = VALUE;
        styleClass   = STYLE_CLASS;
        widthFactor  = WIDTH_FACTOR;
        heightFactor = HEIGHT_FACTOR;
    }
}
