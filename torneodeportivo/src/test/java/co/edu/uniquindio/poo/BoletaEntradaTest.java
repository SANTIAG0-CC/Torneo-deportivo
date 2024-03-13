package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class BoletaEntradaTest {

    private static final Logger LOG = Logger.getLogger(BoletaEntradaTest.class.getName());

    @Test

    public void datosCompletos(){
    LOG.info("Inicio prueba datos completos");
    BoletaEntrada b1 = new BoletaEntrada(LocalDate.of(2024, 03, 10), LocalTime.of(1, 20, 23), "ruta feliz", 20000);

    assertEquals(LocalDate.of(2024, 03, 10), b1.getFecha());
    assertEquals(LocalTime.of(1, 20, 23), b1.getHora());
    assertEquals("ruta feliz", b1.getNombre());
    assertEquals(20000, b1.getValor());
    LOG.info("fin prueba datos completos");
    }

    @Test
    public void datosNulos(){
        LOG.info("inicio pruebas datos nulos");
        assertThrows(Throwable.class, ()-> new BoletaEntrada(null, null, null, 0));
        LOG.info("fin pruebas datos nulos");
    }

    @Test
    public void valorMenor(){
        LOG.info("inicio pruebas valor menor");
        assertThrows(Throwable.class, ()-> new BoletaEntrada(LocalDate.of(2024, 03, 10), LocalTime.of(1, 20, 23), "ruta feliz", 3000));
        LOG.info("fin prueba valor menor");
    }



}
