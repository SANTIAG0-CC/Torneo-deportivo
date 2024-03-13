/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class TorneoModificarFechas {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void  modificarFechaInicio(){

        LOG.info("Iniciado test modificarFechaInicio");
        Torneo torneo = new Torneo("Copa del mundo", LocalDate.of(2024, 06, 10), LocalDate.of(2024, 03, 15),
                LocalDate.of(2024, 04, 15), (byte) 17, (byte) 0, 0);

        torneo.setFechaInicio(LocalDate.of(2024, 03,12));

        assertEquals(LocalDate.of(2024, 03, 12), torneo.getFechaInicio());

    }

    @Test
    public void modificarFechaInicioInscripciones(){
        Torneo torneo = new Torneo("Copa del mundo", LocalDate.of(2024, 06, 10), LocalDate.of(2024, 03, 15),
        LocalDate.of(2024, 04, 15), (byte) 17, (byte) 0, 0);

        torneo.setFechaInicioInscripciones(LocalDate.of(2024, 04, 15));

        assertEquals(LocalDate.of(2024, 04, 15), torneo.getFechaInicioInscripciones());
    }
    @Test
    public void modificarFechaCierreInscripciones(){
        Torneo torneo = new Torneo("Copa del mundo", LocalDate.of(2024, 06, 10), LocalDate.of(2024, 03, 15),
        LocalDate.of(2024, 04, 15), (byte) 17, (byte) 0, 0);

        torneo.setFechaCierreInscripciones(LocalDate.of(2024, 06, 15));

        assertEquals(LocalDate.of(2024, 06, 15), torneo.getFechaCierreInscripciones());
    }

    @Test
    public void modificarFechaCierreInscripcioness(){
        Torneo torneo = new Torneo("Copa del mundo", LocalDate.of(2024, 06, 10), LocalDate.of(2024, 03, 15),
        LocalDate.of(2024, 04, 15), (byte) 17, (byte) 0, 0);

        torneo.setFechaCierreInscripciones(LocalDate.of(2024, 02, 15));

        assertEquals(LocalDate.of(2024, 02, 15), torneo.getFechaCierreInscripciones());
    }


}
