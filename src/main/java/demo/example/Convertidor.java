package demo.example;
public class Convertidor {

    public double convertirKmAMetros (double km) {
        return km * 1000d;
    }

    public double convertirMetrosAKilometros (double metros) {
        return metros / 1000d;
    }

    public double errorEnKmNegativo (double km) {
        if (km < 0) {
            throw new IllegalArgumentException("El valor de km no puede ser negativo");
        }
        return km;
    }

    public double errorEnMetrosNegativo (double metros){
        if (metros < 0){
            throw new IllegalArgumentException("El valor de metros no puede ser negativo");
        }
        return metros;
    }
}
