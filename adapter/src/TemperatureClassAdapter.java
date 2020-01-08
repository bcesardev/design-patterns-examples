public class TemperatureClassAdapter extends FahrenheitTemperature {

    @Override
    public void setValue(double value) {
        super.setValue(TemperatureUtils.convertCelsiusToFahrenheit(value));
    }

    @Override
    public double getValue() {
        return TemperatureUtils.convertFahrenheitToCelsius(super.getValue());
    }

    public double getValueInFahrenheit() {
        return super.getValue();
    }
}
