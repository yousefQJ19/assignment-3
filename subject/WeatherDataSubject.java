package subject;

import Observer.Observer;
import java.util.ArrayList;

public class WeatherDataSubject implements IWeatherDataSubject {
    private ArrayList<Observer> Data=null;
    private double temperature;
    private double humidity;
    private double pressure;
    private double avgTemp;
    private double avgHumidity;
    private double avgPressure;
    private int tempCount=0;
    private int humidityCount=0;
    private int pressureCount;

    public WeatherDataSubject(){
        Data=new ArrayList<Observer>();
    }
    @Override
    public void removeObserver(Observer observer) {
        this.Data.remove(observer);
    }

    @Override
    public void registerObserver(Observer observer) {
        this.Data.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer o:this.Data){
            o.update(temperature,humidity,pressure,avgTemp, avgHumidity,avgPressure);
        }
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        tempCount++;
        avgTemp+=temperature;
        avgTemp/=tempCount;
        notifyObservers();
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        humidityCount++;
        avgHumidity+=humidity;
        avgHumidity/=humidityCount;
        notifyObservers();
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        notifyObservers();
        pressureCount++;
        avgPressure+=pressure;
        avgPressure/=pressureCount;
    }
}
