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
public class Reservacion {
    
    private int numeroResevacion;

    public int getNumeroResevacion() {
        return numeroResevacion;
    }

    public void setNumeroResevacion(int numeroResevacion) {
        this.numeroResevacion = numeroResevacion;
    }

    private String cedula;

    /**
     * Get the value of cedula
     *
     * @return the value of cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * Set the value of cedula
     *
     * @param cedula new value of cedula
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    private String nombre;

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    private Date fecha;

    /**
     * Get the value of fecha
     *
     * @return the value of fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * Set the value of fecha
     *
     * @param fecha new value of fecha
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

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

    private int valor_vuelo;

    /**
     * Get the value of valor_vuelo
     *
     * @return the value of valor_vuelo
     */
    public int getValor_vuelo() {
        return valor_vuelo;
    }

    /**
     * Set the value of valor_vuelo
     *
     * @param valor_vuelo new value of valor_vuelo
     */
    public void setValor_vuelo(int valor_vuelo) {
        this.valor_vuelo = valor_vuelo;
    }
  
    }


