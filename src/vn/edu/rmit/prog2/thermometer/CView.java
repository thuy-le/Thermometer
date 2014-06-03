package vn.edu.rmit.prog2.thermometer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

/**
 * @author kev jackson
 */
public class CView extends TemperatureView {

    public CView(int h, int v, TemperatureModel model) {
        super("Celsius Temperature", h, v, model);
    }

    @Override
    public void init() {
        super.init();
        setDisplay("" + getModel().getCelcius());
        addUpListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getModel().setCelcius(getModel().getCelcius() + 1.0);
            }
        });
        addDownListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getModel().setCelcius(getModel().getCelcius() - 1.0);
            }
        });
        addDisplayListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = getDisplay();
                getModel().setCelcius(value);
            }
        });
    }

    @Override
    public void update(Observable t, Object o) {
        setDisplay("" + getModel().getCelcius());
    }
}