import static org.junit.Assert.assertEquals;
import org.junit.Test;

import demo.example.Convertidor;

public class ConvertidorTest {
    
    @Test 
    public void probarConvertidor() {
        var convertidor = new Convertidor();
        double resultado = convertidor.convertirKmAMetros(2.5);
        assertEquals(2500d, resultado, 0);
    }

    @Test
    public void probarConvertidorMetrosAKilometros() {
        var convertidor = new Convertidor();
        double resultado = convertidor.convertirMetrosAKilometros(2500);
        assertEquals(2.5d, resultado, 0);
    }

    @Test 
    public void probarErrorDeKmNegativo(){
        var convertidor = new Convertidor();
        try {
            convertidor.errorEnKmNegativo(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("El valor de km no puede ser negativo", e.getMessage());
        }
    }

    @Test
    public void probarErrorDeMetrosNegativo(){
        var convertidor = new Convertidor();
        try {
            convertidor.errorEnMetrosNegativo(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("El valor de metros no puede ser negativo", e.getMessage());
        }
    }
}
