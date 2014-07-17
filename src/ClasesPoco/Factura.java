/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPoco;

import ClasesPoco.Cabecera_Factura;


/**
 *
 * @author VjJimmy
 */
public class Factura 
{
    private ClasesPoco.Cabecera_Factura datosFactura;
    private ClasesPoco.Reservacion datosReservacion;

    public Factura(Cabecera_Factura datosFactura, Reservacion datosReservacion) {
        this.datosFactura = datosFactura;
        this.datosReservacion = datosReservacion;
    }
}
