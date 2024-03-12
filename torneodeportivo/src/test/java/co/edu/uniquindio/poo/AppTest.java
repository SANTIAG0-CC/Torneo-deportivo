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
import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestFactory;

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

        assertEquals("Copa del mundo", torneo.getNombre());
        assertEquals(LocalDate.of(2024, 03, 10), torneo.getFechaInicio());
        assertEquals(LocalDate.of(2024, 03, 15), torneo.getFechaInicioInscripciones());
        assertEquals(LocalDate.of(2024, 04, 15), torneo.getFechaCierreInscripciones());
        assertEquals(17, torneo.getNumeroParticipantes());
        assertEquals(0, torneo.getLimiteEdad());
        assertEquals(0, torneo.getValorInscripcion());

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
        LOG.info("Iniciado test participantesNegativos");
        assertThrows(Throwable.class, ()-> new Torneo("Copa del mundo", LocalDate.of(2024, 05, 10), LocalDate.of(2024, 03, 15),
        LocalDate.of(2024, 04, 15), (byte) -17, (byte) 0, 0));
        LOG.info("Finalizando test participantesNegativos");
    }

    @Test
    public void limiteEdadNegativo (){
        LOG.info("Iniciado test limiteEdadNegativo");
        assertThrows(Throwable.class, ()-> new Torneo("Copa del mundo", LocalDate.of(2024, 05, 10), LocalDate.of(2024, 03, 15),
        LocalDate.of(2024, 04, 15), (byte) 17, (byte) -1, 0));
        LOG.info("Finalizando test limiteEdadNegativo");
    }

    @Test
    public void inscripcionNegativa(){
        LOG.info("Iniciado test limiteEdadNegativo");
        assertThrows(Throwable.class, ()-> new Torneo("Copa del mundo", LocalDate.of(2024, 05, 10), LocalDate.of(2024, 03, 15),
        LocalDate.of(2024, 04, 15), (byte) 17, (byte) 0, -1));
    }

    @Test 
    public void inscripcionTardia(){
        LOG.info("Iniciado test inscripcionTardia");
        assertThrows(Throwable.class,()->new Torneo("Copa del mundo", LocalDate.of(2024, 05, 10), LocalDate.of(2024, 06, 15),
        LocalDate.of(2024, 04, 15), (byte) 17, (byte) 0, 0));
        LOG.info("Finalizando test inscripcionTardia");
    }

    @Test
    public void inscripcionAnterioInicio(){
        LOG.info("Iniciado test inscripcionAnterioInicio");
        assertThrows(Throwable.class,()-> new Torneo("Copa del mundo", LocalDate.of(2024, 05, 10), LocalDate.of(2024, 03, 15),
        LocalDate.of(2024, 02, 15), (byte) 17, (byte) 0, 0));

        LOG.info("Finalizando test inscripcionAnterioInicio");

    }
}

    

