package Decorater;

import Observer.Observer;

public class PrecipitationDecorator implements Decorater{
    private Observer temp;
    private StringBuilder preception;
    public PrecipitationDecorator(Observer temp,String perception){
        this.temp=temp;
        this.preception.append(perception);
    }

    @Override
    public void update(double temperature, double humidity, double pressure, double avgTemp, double avgHumidity, double pressureCount) {
        temp.update( temperature,  humidity,  pressure,  avgTemp,  avgHumidity,  pressureCount);
        System.out.println(this.preception);
    }
}
