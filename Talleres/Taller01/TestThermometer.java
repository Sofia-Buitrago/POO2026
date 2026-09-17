
public class TestThermometer {
 
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();
 
        System.out.println("Temperatura inicial: " + thermometer.getTemperature());
 
        // Intento valido dentro del rango
        boolean result1 = thermometer.setTemperature(25.0);
        System.out.println("Registrar 25.0 -> " + (result1 ? "Aceptado" : "Rechazado"));
        System.out.println("Temperatura actual: " + thermometer.getTemperature());
 
        // Intento invalido, por encima del maximo permitido
        boolean result2 = thermometer.setTemperature(150.0);
        System.out.println("Registrar 150.0 -> " + (result2 ? "Aceptado" : "Rechazado"));
        System.out.println("Temperatura actual: " + thermometer.getTemperature());
 
        // Intento invalido, por debajo del minimo permitido
        boolean result3 = thermometer.setTemperature(-60.0);
        System.out.println("Registrar -60.0 -> " + (result3 ? "Aceptado" : "Rechazado"));
        System.out.println("Temperatura actual: " + thermometer.getTemperature());
 
        // Intento valido en el limite exacto
        boolean result4 = thermometer.setTemperature(-50.0);
        System.out.println("Registrar -50.0 -> " + (result4 ? "Aceptado" : "Rechazado"));
        System.out.println("Temperatura actual: " + thermometer.getTemperature());
    }
}
 