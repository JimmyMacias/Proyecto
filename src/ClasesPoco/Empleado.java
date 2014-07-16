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
public class Empleado 
        {

    public Empleado(String idEmpleado, String cargo, String cedula, String nombre, int idPersona, String telefono, String direccion) {
        this.idEmpleado = idEmpleado;
        this.cargo = cargo;
        this.cedula = cedula;
        this.nombre = nombre;
        this.idPersona = idPersona;
        this.telefono = telefono;
        this.direccion = direccion;
    }

   
    
    private String idEmpleado;

    public Empleado() {
        
    }

    /**
     * Get the value of idEmpleado
     *
     * @return the value of idEmpleado
     */
    public String getIdEmpleado() {
        return idEmpleado;
    }

    /**
     * Set the value of idEmpleado
     *
     * @param idEmpleado new value of idEmpleado
     */
    public void setIdEmpleado(String idEmpleado) {
        try 
    { 
    this.idEmpleado = idEmpleado;
    } 
        catch(Exception ex)
    { //codigo que ejecuta al capturar la excepcion} 
       System.out.println(ex);  
    }
       

        
    }

    private String cargo;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        
           try 
    { 
         this.cargo = cargo;
    } 
    catch(Exception ex)
    { //codigo que ejecuta al capturar la excepcion} 
       System.out.println(ex);  
    }
       
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
