
package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Cine {

    private String nombre;
    private Collection <BoletaEntrada> boletas;

    public Cine (String nombre){

        assert nombre != null;
        this.nombre = nombre;
        boletas = new LinkedList<>();

    }

    public String getNombreCine (){
        return nombre;
    }

    public void registrarBoletaEntrada (BoletaEntrada boleta){
        boletas.add(boleta);

        //tambien se podria hacer un asser para que no registre boletas repetidas, pero en este caso una persona puede comprar varias boletas, es decir, no importa si estan repetidos.
        //de todas formas al final del codigo se encuentran los metodos para que no se puedan registrar boletas repetidas en base al nombre de la persona que compro la boleta
    }

    public Collection<BoletaEntrada> getEntradas(){
        return boletas;
    }

    // OPCIONAL

    public void registrarBoletasEntradas(BoletaEntrada boleta){
        assert validarBoletaEntrada(boleta.getNombre())==false;
        boletas.add(boleta);
    }

    private boolean validarBoletaEntrada(String nombre){
        boolean existe = false;
        for(BoletaEntrada boletaEntrada : boletas){
            if(boletaEntrada.getNombre().equals(nombre)){
                existe = true;
            }
        }
        return existe;
    }



}


