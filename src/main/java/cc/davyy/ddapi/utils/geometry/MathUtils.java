package cc.davyy.ddapi.utils.geometry;

public class MathUtils {

    private MathUtils() {}


    public static int clamp(int value, int min, int max) {
        return Math.max(min, Math.min(max, value));
    }

    public static double clamp(double value, double min, double max) {
        return Math.max(min, Math.min(max, value));
    }

    public static float clamp(float value, float min, float max) {
        return Math.max(min, Math.min(max, value));
    }

    public static boolean isBetween(int value, int min, int max) {
        return value >= min && value <= max;
    }

    public static boolean isBetween(double value, double min, double max) {
        return value >= min && value <= max;
    }

    public static boolean isBetween(float value, float min, float max) {
        return value >= min && value <= max;
    }

    public static double round(double value, int decimalPlaces) {
        if (decimalPlaces < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, decimalPlaces);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public static double distance(double x1, double y1, double z1, double x2, double y2, double z2) {
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dz = z2 - z1;
        return Math.sqrt(dx * dx + dy * dy + dz * dz);
    }

    public static int getRandomInt(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }

}
