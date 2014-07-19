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
public class Cliente{

    public Cliente(int idCliente, String numeroPass, String cedula, String nombre, int idPersona, String telefono, String direccion) {
        this.idCliente = idCliente;
        this.numeroPass = numeroPass;
        this.cedula = cedula;
        this.nombre = nombre;
        this.idPersona = idPersona;
        this.telefono = telefono;
        this.direccion = direccion;
    }

 

    
    private int idCliente;

    public Cliente() 
    {     
    }
    
 
    /**
     * Get the value of idCliente
     *
     * @return the value of idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * Set the value of idCliente
     *
     * @param idCliente new value of idCliente
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }
    
    private String numeroPass;

    /**
     * Get the value of numeroPass
     *
     * @return the value of numeroPass
     */
    public String getNumeroPass() {
        return numeroPass;
    }

    /**
     * Set the value of numeroPass
     *
     * @param numeroPass new value of numeroPass
     */
    public void setNumeroPass(String numeroPass) {
        this.numeroPass = numeroPass;
    }
    private String cedula;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula)
    {
        try 
    { 
    this.cedula = cedula;
    } 
    catch(Exception ex)
    { //codigo que ejecuta al capturar la excepcion} 
       System.out.println(ex);  
    }
    }
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
           try 
    { 
    this.nombre = nombre;
    } 
    catch(Exception ex)
    { //codigo que ejecuta al capturar la excepcion} 
       System.out.println(ex);  
    }
        
    }

    private int idPersona;

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
          try 
    { 
    this.idPersona = idPersona;
    } 
    catch(Exception ex)
    { //codigo que ejecuta al capturar la excepcion} 
       System.out.println(ex);  
    }
        
        
    }

    private String telefono;

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    private String direccion;

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    



    
}
