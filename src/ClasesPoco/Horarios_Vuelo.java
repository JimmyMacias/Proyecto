/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPoco;

import java.util.Date;

/**
 *
 * @author VjJimmy
 */

public class Horarios_Vuelo {

    public Horarios_Vuelo(String destino, String origen, Date fecha, int numeroVuelo, int valor) {
        this.destino = destino;
        this.origen = origen;
        this.fecha = fecha;
        this.numeroVuelo = numeroVuelo;
        this.valor = valor;
    }

    
    
    
         private String destino;

  
    
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    private String origen;

   
    public String getOrigen() {
        return origen;
    }

   
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    private Date fecha;

    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    private int numeroVuelo;

    public Horarios_Vuelo() {
    }

  
    public int getNumeroVuelo() {
        return numeroVuelo;
    }

 
    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }




}
