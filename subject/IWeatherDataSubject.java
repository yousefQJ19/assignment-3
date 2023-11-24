package subject;
import Observer.Observer;
public interface IWeatherDataSubject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObservers();
}
