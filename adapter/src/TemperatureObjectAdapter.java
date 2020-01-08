public class TemperatureObjectAdapter {

    private final FahrenheitTemperature temperature;

    public TemperatureObjectAdapter(FahrenheitTemperature temperature) {
        this.temperature = temperature;
    }

    public double getValue() {
        return TemperatureUtils.convertFahrenheitToCelsius(temperature.getValue());
    }

    public void setValue(double value) {
        temperature.setValue(TemperatureUtils.convertCelsiusToFahrenheit(value));
    }
}
