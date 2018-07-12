package megaCalc;

public enum Bewerking {
    PLUS,
    MIN,
    MAAL,
    OVER;

    Bewerking() {
    }

    public static double plus(double a, double b) {
        return a + b;
    }

    public static double min(double a, double b) {
        return a - b;
    }

    public static double maal(double a, double b) {
        return a * b;
    }

    public static double over(double a, double b) {
        return a / b;
    }

}
