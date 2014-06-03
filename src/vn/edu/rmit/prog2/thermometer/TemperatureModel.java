package vn.edu.rmit.prog2.thermometer;

import java.util.Observable;

/**
 * @author kev jackson
 */
public class TemperatureModel extends Observable {
    
    private double fahrenheit = 32.0d;

    public double getFahrenheit() {
        return fahrenheit;
    }

    public void setFahrenheit(double f) {
        this.fahrenheit = f;
        setChanged();
        notifyObservers();
    }
    
    public double getCelcius() {
        return (fahrenheit - 32.0) * (5.0 / 9.0);
    }
    
    public void setCelcius(double c) {
        this.fahrenheit = c * (9.0/5.0) + 32.0;
        setChanged();
	notifyObservers(); 
    }
    
}