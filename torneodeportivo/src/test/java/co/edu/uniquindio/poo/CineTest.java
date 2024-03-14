package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class CineTest {
    private static final Logger LOG = Logger.getLogger(CineTest.class.getName());

    @Test
    public void datosCompletos(){
        LOG.info("inicio prueba datos completos");
        Cine c1 = new Cine("cine colombia");
        assertEquals("cine colombia", c1.getNombreCine());
        LOG.info("fin pruebas datos completos");
    }

    @Test
    public void datosNulos(){
        LOG.info("inicio prueba datos nulos");
        assertThrows(Throwable.class, ()-> new Cine(null));
    }


    @Test

    public void registrarBoleta(){
        LOG.info("inicio prueba registrarBoleta");

        Cine c1 = new Cine("cine colombia");
        BoletaEntrada b1 = new BoletaEntrada(LocalDate.of(2024, 03, 10), LocalTime.of(1, 20, 23), "ruta feliz", 20000);
        BoletaEntrada b2 = new BoletaEntrada(LocalDate.of(2024, 03, 10), LocalTime.of(1, 20, 23), "rut feliz", 20000);
        
        c1.registrarBoletasEntradas(b1);
        c1.registrarBoletasEntradas(b2);

        
        assertTrue(c1.getEntradas().contains(b1));
        assertTrue(c1.getEntradas().contains(b2));
        assertEquals(2, c1.getEntradas().size());
    }

    



}
