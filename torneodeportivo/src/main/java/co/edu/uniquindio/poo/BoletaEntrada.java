package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

public class BoletaEntrada {

    private LocalDate fecha;
    private LocalTime hora;
    private String nombre;
    private float valor;

    public BoletaEntrada(LocalDate fecha, LocalTime hora, String nombre, float valor){

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

    public float getValor() {
        return valor;
    }

    

}
