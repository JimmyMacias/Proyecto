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
public class Aerolinea {

    public Aerolinea(String nombreAerolinea, String direccion, String idAerolinea, String numeroAsiento) {
        this.nombreAerolinea = nombreAerolinea;
        this.direccion = direccion;
        this.idAerolinea = idAerolinea;
        this.numeroAsiento = numeroAsiento;
    }

 
   
    
    
    private String nombreAerolinea;

    public Aerolinea() {
        
    }

    /**
     * Get the value of nombreAerolinea
     *
     * @return the value of nombreAerolinea
     */
    public String getNombreAerolinea() {
        return nombreAerolinea;
    }

    /**
     * Set the value of nombreAerolinea
     *
     * @param nombreAerolinea new value of nombreAerolinea
     */
    public void setNombreAerolinea(String nombreAerolinea) {
        this.nombreAerolinea = nombreAerolinea;
    }

       private String direccion;

    /**
     * Get the value of direccion
     *
     * @return the value of direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * Set the value of direccion
     *
     * @param direccion new value of direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    private String idAerolinea;

    /**
     * Get the value of idAerolinea
     *
     * @return the value of idAerolinea
     */
    public String getIdAerolinea() {
        return idAerolinea;
    }

    /**
     * Set the value of idAerolinea
     *
     * @param idAerolinea new value of idAerolinea
     */
    public void setIdAerolinea(String idAerolinea) {
        this.idAerolinea = idAerolinea;
    }

    private String numeroAsiento;

    /**
     * Get the value of numeroAsiento
     *
     * @return the value of numeroAsiento
     */
    public String getNumeroAsiento() {
        return numeroAsiento;
    }

    /**
     * Set the value of numeroAsiento
     *
     * @param numeroAsiento new value of numeroAsiento
     */
    public void setNumeroAsiento(String numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }

    
}
