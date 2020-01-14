package model;

public class ConsoleObserver implements Observer {

    @Override
    public void update(Subject subject) {
        WeatherForecast wg = (WeatherForecast) subject;

        System.out.println("Temperatura atualizada para: " + wg.getTemperature());
    }
}
