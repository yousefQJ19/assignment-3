import Decorater.TemperatureUnitsDecorator;
import Decorater.WindSpeedDecorator;
import Observer.CurrentConditionsDisplay;
import Observer.StatisticsDisplay;
import subject.WeatherDataSubject;

public class Main {
    public static void  main(String[] args){
        WeatherDataSubject subject=new WeatherDataSubject();
        subject.setHumidity(10);
        subject.setTemperature(10);
        subject.setPressure(10);

        CurrentConditionsDisplay currentDisplay=new CurrentConditionsDisplay();
        StatisticsDisplay staticalDisplay= new StatisticsDisplay();

        subject.registerObserver(currentDisplay);
        subject.registerObserver(staticalDisplay);

        subject.setHumidity(20);
        subject.setTemperature(20);
        subject.setPressure(20);


        TemperatureUnitsDecorator temp= new TemperatureUnitsDecorator(currentDisplay,1);
        WindSpeedDecorator temp2=new WindSpeedDecorator(staticalDisplay,10);
        subject.registerObserver(temp);
        subject.registerObserver(temp2);

        subject.setHumidity(30);
        subject.setTemperature(30);
        subject.setPressure(30);
        subject.removeObserver(currentDisplay);
    }
}
