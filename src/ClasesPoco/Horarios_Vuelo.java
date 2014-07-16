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
    
        private String destino;

    /**
     * Get the value of destino
     *
     * @return the value of destino
     */
    public String getDestino() {
        return destino;
    }

    /**
     * Set the value of destino
     *
     * @param destino new value of destino
     */
    public void setDestino(String destino) {
        this.destino = destino;
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
    
    private String id_aerolinea;

    /**
     * Get the value of id_aerolinea
     *
     * @return the value of id_aerolinea
     */
    public String getId_aerolinea() {
        return id_aerolinea;
    }

    /**
     * Set the value of id_aerolinea
     *
     * @param id_aerolinea new value of id_aerolinea
     */
    public void setId_aerolinea(String id_aerolinea) {
        this.id_aerolinea = id_aerolinea;
    }
    
    private String id_vuelo;

    /**
     * Get the value of id_vuelo
     *
     * @return the value of id_vuelo
     */
    public String getId_vuelo() {
        return id_vuelo;
    }

    /**
     * Set the value of id_vuelo
     *
     * @param id_vuelo new value of id_vuelo
     */
    public void setId_vuelo(String id_vuelo) {
        this.id_vuelo = id_vuelo;
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
