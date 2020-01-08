public class App {

    public static void main(String[] args) {
        FahrenheitTemperature t = new FahrenheitTemperature();
        t.setValue(90);
        System.out.println(t.getValue());

        TemperatureClassAdapter adapter1 = new TemperatureClassAdapter();
        adapter1.setValue(30);
        System.out.println(adapter1.getValue());
        System.out.println(adapter1.getValueInFahrenheit());

        FahrenheitTemperature temperature = new FahrenheitTemperature();
        temperature.setValue(86);

        TemperatureObjectAdapter adapter2 = new TemperatureObjectAdapter(temperature);
        System.out.println(adapter2.getValue());
        System.out.println(temperature.getValue());
    }
}
