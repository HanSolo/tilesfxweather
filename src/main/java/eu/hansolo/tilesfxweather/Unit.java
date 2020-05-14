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

public enum Unit {
    US("us", "\u00B0F", "mb", "\u0025", "mph"),     // imperial units
    SI("si", "\u00B0C", "mb", "\u0025", "m/s"),     // SI units
    CA("ca", "\u00B0C", "mb", "\u0025", "kph"),     // same as SI except wind speed is in kph
    UK("uk", "\u00B0C", "mb", "\u0025", "mph"),
    UK2("uk2", "\u00B0C", "mb", "\u0025", "mph"),   // same as SI except that nearest storm distance and visibility are in miles and wind speed is in mph
    AUTO("auto", "\u00B0C", "mb", "\u0025", "mph"); // units based on geographic location

    public final String value;
    public final String temperatureUnitString;
    public final String pressureUnitString;
    public final String humidityUnitString;
    public final String speedUnitString;

    Unit(final String VALUE, final String TEMPERATURE_UNIT_STRING, final String PRESSURE_UNIT_STRING,
         final String HUMIDITY_UNIT_STRING, final String SPEED_UNIT_STRING) {
        value                 = VALUE;
        temperatureUnitString = TEMPERATURE_UNIT_STRING;
        pressureUnitString    = PRESSURE_UNIT_STRING;
        humidityUnitString    = HUMIDITY_UNIT_STRING;
        speedUnitString       = SPEED_UNIT_STRING;
    }
}
