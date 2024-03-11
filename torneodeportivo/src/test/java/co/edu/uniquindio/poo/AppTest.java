/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
 @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datosCompletos");

        Torneo torneo = new Torneo("Copa del mundo", LocalDate.of(2024, 03, 10), LocalDate.of(2024, 03, 15),
                LocalDate.of(2024, 04, 15), (byte) 17, (byte) 0, 0);

        assertEquals("Copa del mundo", torneo.nombre());
        assertEquals(LocalDate.of(2024, 03, 10), torneo.fechaInicio());
        assertEquals(LocalDate.of(2024, 03, 15), torneo.fechaInicioInscripciones());
        assertEquals(LocalDate.of(2024, 04, 15), torneo.fechaCierreInscripciones());
        assertEquals(17, torneo.numeroParticipantes());
        assertEquals(0, torneo.limiteEdad());
        assertEquals(0, torneo.valorInscripcion());

        LOG.info("Finalizando test datosCompletos");
    }

    @Test 
    public void datosNulos(){
        LOG.info("Iniciado test datosNulos");
        assertThrows(Throwable.class, ()-> new Torneo(null, null, null, null, (byte)24, (byte)0, 0));

        LOG.info("Finalizando test datosNulos");

    }

    @Test
    public void participantesNegativos(){

        assertThrows(Throwable.class, ()-> new Torneo("Copa del mundo", LocalDate.of(2024, 03, 10), LocalDate.of(2024, 03, 15),
        LocalDate.of(2024, 04, 15), (byte) -17, (byte) 0, 0));
    }
}

    

