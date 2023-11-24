package Observer;

public class CurrentConditionsDisplay implements Observer{

    @Override
    public void update(double temperature, double humidity, double pressure,
                       double avgTemp, double avgHumidity, double avgPressure) {
        System.out.println("Current Conditional Temperature\t"+temperature);
        System.out.println("Current Conditional humidity\t"+humidity);
        System.out.println("Current Conditional pressure\t" +pressure);
    }

}
