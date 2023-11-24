package Observer;

public class StatisticsDisplay implements Observer{

    @Override
    public void update(double temperature, double humidity, double pressure,
                       double avgTemp,double avgHumidity ,double avgPressure) {
        System.out.println("  Temperature"+avgTemp+"%");

        System.out.println(" humidity"+avgHumidity+"%");

        System.out.println(" pressure"+avgPressure+"%");


    }


}
