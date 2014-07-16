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
    private Cliente datosCliente;
    private Empleado datosEmpleado;

    public Reservacion(Cliente datosCliente, Empleado datosEmpleado, Date tiempoReserva) {
        this.datosCliente = datosCliente;
        this.datosEmpleado = datosEmpleado;
        this.tiempoReserva = tiempoReserva;
    }
     
        private Date tiempoReserva;

    /**
     * Get the value of tiempoReserva
     *
     * @return the value of tiempoReserva
     */
    public Date getTiempoReserva() {
        return tiempoReserva;
    }

    /**
     * Set the value of tiempoReserva
     *
     * @param tiempoReserva new value of tiempoReserva
     */
    public void setTiempoReserva(Date tiempoReserva) {
         try 
    { 
          this.tiempoReserva = tiempoReserva;
    } 
        catch(Exception ex){
       System.out.println(ex);  
    }
       
    }

}
