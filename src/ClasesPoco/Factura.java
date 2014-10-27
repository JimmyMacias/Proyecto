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
public class Factura 
{
    
      private int numeroVuelo;

    /**
     * Get the value of numeroVuelo
     *
     * @return the value of numeroVuelo
     */
    public int getNumeroVuelo() {
        return numeroVuelo;
    }

    /**
     * Set the value of numeroVuelo
     *
     * @param numeroVuelo new value of numeroVuelo
     */
    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    private int numeroBoletos;

    /**
     * Get the value of numeroBoletos
     *
     * @return the value of numeroBoletos
     */
    public int getNumeroBoletos() {
        return numeroBoletos;
    }

    /**
     * Set the value of numeroBoletos
     *
     * @param numeroBoletos new value of numeroBoletos
     */
    public void setNumeroBoletos(int numeroBoletos) {
        this.numeroBoletos = numeroBoletos;
    }

    private int numeroReservacion;

    /**
     * Get the value of numeroReservacion
     *
     * @return the value of numeroReservacion
     */
    public int getNumeroReservacion() {
        return numeroReservacion;
    }

    /**
     * Set the value of numeroReservacion
     *
     * @param numeroReservacion new value of numeroReservacion
     */
    public void setNumeroReservacion(int numeroReservacion) {
        this.numeroReservacion = numeroReservacion;
    }
    
    private String origen;

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    private String destino;

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    private Date fecha;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    private double valor;

    /**
     * Get the value of valor
     *
     * @return the value of valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * Set the value of valor
     *
     * @param valor new value of valor
     */
    public void setValor(double valor) {
        this.valor = valor;
    }


}
