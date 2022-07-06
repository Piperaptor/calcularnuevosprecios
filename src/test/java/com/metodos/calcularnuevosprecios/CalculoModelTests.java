package com.metodos.calcularnuevosprecios;

import com.metodos.calcularnuevosprecios.models.CalculoModel;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculoModelTests {
    CalculoModel calculo = new CalculoModel();
    @Test
    void testgetNombre() {
        calculo.setNombre("Paraguas");
        assertEquals("Paraguas", calculo.getNombre());
    }

    @Test
    void testgetPrecio(){
        calculo.setPrecio(1500);
        assertEquals(1500, calculo.getPrecio());
    }

}
