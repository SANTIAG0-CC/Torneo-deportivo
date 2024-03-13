package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

public class BoletaEntrada {

    private LocalDate fecha;
    private LocalTime hora;
    private String nombre;
    private int valor;

    public BoletaEntrada(LocalDate fecha, LocalTime hora, String nombre, int valor){

        assert fecha != null;
        assert hora != null;
        assert nombre != null;
        assert valor >= 5000;

        this.fecha = fecha;
        this.hora = hora;
        this.nombre = nombre;
        this.valor = valor;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getNombre() {
        return nombre;
    }

    public int getValor() {
        return valor;
    }

    

}
