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

public enum Language {
    ARABIC("ar"),
    AZERBAIJANI("az"),
    BELRUSIAN("be"),
    BOSNIAN("bs"),
    CZECH("cs"),
    GERMAN("de"),
    GREEK("el"),
    ENGLISH("en"), // default
    SPANISH("es"),
    FRENCH("fr"),
    CROATIAN("hr"),
    HUNGARIAN("hu"),
    ITALIAN("it"),
    ICELANDIC("is"),
    CORNISH("kw"),
    NORWEGIAN("nb"),
    DUTCH("nl"),
    POLISH("pl"),
    PORTUGUESE("pt"),
    RUSSIAN("ru"),
    SLOVAK("sk"),
    SERBIAN("sr"),
    SWEDISH("sv"),
    TETUM("tet"),
    TURKISH("tr"),
    UKRAINIAN("uk"),
    IKPAY_ATINLAY("x-pig-latin"),
    SIMPLIFIED_CHINESE("zh"),
    TRADITIONAL_CHINESE("zw-tw");

    public String value;

    Language(final String VALUE) {
        value = VALUE;
    }
}
