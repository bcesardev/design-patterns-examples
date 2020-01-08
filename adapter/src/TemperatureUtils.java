
public class TemperatureUtils {

    private TemperatureUtils() {
    }

    public static double convertCelsiusToFahrenheit(double value) {
        return value * 9 / 5 + 32;
    }

    public static double convertFahrenheitToCelsius(double value) {
        return (value - 32) * 5 / 9;
    }
}
