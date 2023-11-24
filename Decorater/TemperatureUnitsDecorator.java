package Decorater;

import Observer.Observer;

public class TemperatureUnitsDecorator implements Decorater{
        private Observer temp;
        private int unit;
        public TemperatureUnitsDecorator(Observer temp,int s){
            this.temp=temp;
            this.unit=s;
        }
    @Override
    public void update(double temperature, double humidity, double pressure, double avgTemp, double avgHumidity, double pressureCount) {
        temp.update( temperature,  humidity,  pressure,  avgTemp,  avgHumidity,  pressureCount);
        System.out.print("temperature in fahrenhight");
        if(unit==1){
            System.out.println((double) (temperature*(9.0/5.0))-32);
        }

    }
}
