# assignment-3
## this project explains how the observer pattern works with the decorater pattern 
### with the using of the solid princa[les 



![class Digram](https://github.com/yousefQJ19/assignment-3/assets/92521652/f80aa17d-1d27-42b0-8fb4-afea15c8e9a5)


-the decorater file :
 * inter face decorater that inhirate from the class observer to use the update function
 * preceptionDEcorator class implements the decorater interface and add the preceptions to the update function
 * TempretureUnitsDecorater implements the director interface and includes the desired tempreture in the update function
 * WindSpeedDecorater class implements the director interface and includes the wind speed in the update function

-the observer file:
 * Observer interface that implements the update function
 * CurrentConditionalDisplay implement the observer interface and displayes the cuurent wethar status 
 * StatisticsDisplay implements the observer interface and displayes the avg status of the wether


-the subject file:
 * IWeatherDataSubject interface the implement the
     * regesterObserver function
     * removeObserver function
     * notifyobserver function
 * WeatherDataSubject the holds the real-time data and controles the event listner oberations
