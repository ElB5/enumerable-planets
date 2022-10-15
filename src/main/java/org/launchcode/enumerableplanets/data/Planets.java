package org.launchcode.enumerableplanets.data;

public enum Planets {
    MERCURY("mercury", 88),
    VENUS("venus", 225),
    EARTH("earth", 365),
    MARS("mars", 687),
    JUPITER("jupiter", 4333),
    SATURN("saturn", 10759),
    URANUS("uranus", 30687),
    NEPTUNE("neptune", 60200);


    private final String planets;

    private final int yearLength;

    Planets(String planets, int yearLength) {
        this.planets = planets;
        this.yearLength = yearLength;
    }

    public String getPlanets() {
        return planets;
    }

    public int getYearLength() {
        return yearLength;
    }
}
