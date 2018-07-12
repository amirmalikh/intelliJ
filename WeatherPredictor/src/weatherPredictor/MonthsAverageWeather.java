package weatherPredictor;

public enum MonthsAverageWeather {
    JANUARI(5, 10),
    FEBRUARI(6, 10),
    MARCH(10, 9),
    APRIL(13, 8),
    MAY(17, 7),
    JUNE(22, 6),
    JUY(25, 6),
    AUGUST(28, 7),
    SEPTEMBER(23, 8),
    OKTOBER(17, 9),
    NOVEMBER(10, 10),
    DECEMBER(5, 10);


    double gemiddeldeTemperatuur;
    double gemiddeldeRegenval;


    MonthsAverageWeather(double gemiddeldeTemperatuur, double gemiddeldeRegenval) {
        this.gemiddeldeTemperatuur = gemiddeldeTemperatuur;
        this.gemiddeldeRegenval = gemiddeldeRegenval;

    }

    public double getGemiddeldeTemperatuur() {
        return gemiddeldeTemperatuur;
    }

    public double getGemiddeldeRegenval() {
        return gemiddeldeRegenval;
    }

}
