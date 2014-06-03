package vn.edu.rmit.prog2.thermometer;

/**
 *
 * @author kev jackson
 */
public class Main {
 
    public static void main(String[] args) {
        TemperatureModel model = new TemperatureModel();
        CView cView = new CView(100, 350, model);
        cView.init();
        
        FView fView = new FView(400, 350, model);
        fView.init();
        
        SliderView sView = new SliderView(250, 500, model);
        sView.init();
    }
    
}