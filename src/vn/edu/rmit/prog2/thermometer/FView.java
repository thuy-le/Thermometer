package vn.edu.rmit.prog2.thermometer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

/**
 * @author kev jackson
 */
public class FView extends TemperatureView {

    public FView(int h, int v, TemperatureModel model) {
        super("Fahrenheit", h, v, model);
    }

    @Override
    public void init() {
        super.init();
        setDisplay("" + getModel().getFahrenheit());
        addUpListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getModel().setFahrenheit(getModel().getFahrenheit() + 1.0);
            }
        });
        addDownListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getModel().setFahrenheit(getModel().getFahrenheit() - 1.0);
            }
        });
        addDisplayListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = getDisplay();
                getModel().setFahrenheit(value);
            }
        });
    }

    @Override
    public void update(Observable t, Object o) {
        setDisplay("" + getModel().getFahrenheit());
    }
}