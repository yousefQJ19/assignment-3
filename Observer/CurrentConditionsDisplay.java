package Observer;

public class CurrentConditionsDisplay implements Observer{

    @Override
    public void update(double temperature, double humidity, double pressure,
                       double avgTemp, double avgHumidity, double avgPressure) {
        System.out.println("Current Conditional Temperature"+temperature);
        System.out.println("Current humidity"+humidity);
        System.out.println("Current pressure" +pressure);
    }

}
