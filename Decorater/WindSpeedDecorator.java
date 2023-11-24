package Decorater;

import Observer.Observer;

public class WindSpeedDecorator implements Decorater{
    private Observer temp;
    private double windSpeed;

    public WindSpeedDecorator(Observer decorated,double windSpeed){
        this.temp=decorated;
        this.windSpeed=windSpeed;

    }
    @Override
    public void update(double temperature, double humidity, double pressure, double avgTemp, double avgHumidity, double pressureCount) {
        temp.update(temperature,humidity,pressure,avgTemp,avgHumidity,pressureCount);
        System.out.println("wind speed "+windSpeed);
    }
}
