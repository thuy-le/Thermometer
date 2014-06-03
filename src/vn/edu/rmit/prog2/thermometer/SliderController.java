package vn.edu.rmit.prog2.thermometer;

import java.awt.Scrollbar;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class SliderController implements AdjustmentListener {

    private TemperatureModel model;
    private Scrollbar tempControl;
    
    public SliderController(TemperatureModel model, Scrollbar tempControl) {
        this.model = model;
        this.tempControl = tempControl;
    }
    
    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        model.setCelcius(tempControl.getValue());
    }
    
}
