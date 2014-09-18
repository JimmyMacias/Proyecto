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
public class Cabecera_Factura {

    public Cabecera_Factura(int numeroFactura, Date fecha) {
        this.numeroFactura = numeroFactura;
        this.fecha = fecha;
    }
    
    private int numeroFactura;

    public Cabecera_Factura() {

    }

    /**
     * Get the value of numeroFactura
     *
     * @return the value of numeroFactura
     */
    public int getNumeroFactura() {
        return numeroFactura;
    }

    /**
     * Set the value of numeroFactura
     *
     * @param numeroFactura new value of numeroFactura
     */
    public void setNumeroFactura(int numeroFactura) {
        this.numeroFactura = numeroFactura;
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


    
}
