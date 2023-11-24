package Decorater;

import Observer.Observer;

public class TemperatureUnitsDecorator implements Decorater{
        private Observer temp;
        private StringBuilder unit;
        public TemperatureUnitsDecorator(Observer temp,String unit){
            this.temp=temp;
            this.unit.append(unit);
        }
    @Override
    public void update(double temperature, double humidity, double pressure, double avgTemp, double avgHumidity, double pressureCount) {
        temp.update( temperature,  humidity,  pressure,  avgTemp,  avgHumidity,  pressureCount);
        System.out.println("temperature in fahrenhight");
        if(unit.toString().equals("fahren")){
            System.out.println((double) (temperature*(9.0/5.0))-32);
        }

    }
}
