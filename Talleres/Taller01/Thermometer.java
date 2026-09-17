
public class Thermometer {
 
    private static final double MIN_TEMPERATURE = -50.0;
    private static final double MAX_TEMPERATURE = 100.0;
 
    private double temperature;
 
  
    public Thermometer() {
        this.temperature = 0.0;
    }
 
  
    public double getTemperature() {
        return temperature;
    }
 
    public boolean setTemperature(double newTemperature) {
        if (newTemperature < MIN_TEMPERATURE || newTemperature > MAX_TEMPERATURE) {
            return false;
        }
        this.temperature = newTemperature;
        return true;
    }
}
 