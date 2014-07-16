/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClasesPoco;



/**
 *
 * @author VjJimmy
 */
public class Cabecera_Factura {
    private Cliente datosCliente;
    private Empleado datosEmpleado;

    public Cabecera_Factura(Cliente datosCliente, Empleado datosEmpleado, String idFactura, boolean tieneReservacion) {
        this.datosCliente = datosCliente;
        this.datosEmpleado = datosEmpleado;
        this.idFactura = idFactura;
        this.tieneReservacion = tieneReservacion;
    }

   
    
    private String idFactura;

    /**
     * Get the value of idFactura
     *
     * @return the value of idFactura
     */
    public String getIdFactura() {
        return idFactura;
    }

    /**
     * Set the value of idFactura
     *
     * @param idFactura new value of idFactura
     */
    public void setIdFactura(String idFactura) {
      
        try 
    { 
      this.idFactura = idFactura;
    } 
        catch(Exception ex)
    { //codigo que ejecuta al capturar la excepcion} 
       System.out.println(ex);  
    }
    }

       private boolean tieneReservacion;

    /**
     * Get the value of tieneReservacion
     *
     * @return the value of tieneReservacion
     */
    public boolean isTieneReservacion() {
        return tieneReservacion;
    }

    /**
     * Set the value of tieneReservacion
     *
     * @param tieneReservacion new value of tieneReservacion
     */
    public void setTieneReservacion(boolean tieneReservacion) {
         try 
    { 
     this.tieneReservacion = tieneReservacion;
    } 
        catch(Exception ex)
    { //codigo que ejecuta al capturar la excepcion} 
       System.out.println(ex);  
    }
        
    }

    
}
