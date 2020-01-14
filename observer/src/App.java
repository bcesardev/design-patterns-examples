import gui.Window;
import model.ConsoleObserver;
import model.WeatherForecast;

public class App {

    public static void main(String[] args) {

        ConsoleObserver observer = new ConsoleObserver();
        WeatherForecast.getInstance().registerObserver(observer);

        Window window = new Window("Temperature", 300, 150);
        window.show();
    }
}
