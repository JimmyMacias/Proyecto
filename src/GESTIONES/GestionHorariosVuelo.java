/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GESTIONES;

import CapaDatos.Conexion;
import ClasesPoco.Horarios_Vuelo;
import java.sql.SQLException;


/**
 *
 * @author VjJimmy
 */
public class GestionHorariosVuelo implements IGestion
{

    public GestionHorariosVuelo() 
    {
    CapaDatos.Conexion.GetInstancia().Enlace();
    }
    
   private Horarios_Vuelo aero=new Horarios_Vuelo();
    public Horarios_Vuelo getHorarios()
    {
    return aero;
    }
    public void setHorarios(Horarios_Vuelo aero)
    {
    this.aero=aero;
    }
    
    @Override
    public void Grabar() throws SQLException {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("INSERT INTO aerolinea(\"direccion_aerolinea\", \"nombre_aerolinea\", \"numero_asiento\") values ('"+this.aero.getDireccion()+"','"+this.aero.getNombreAerolinea()+"','"+this.aero.getNumeroAsiento()+"')");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    
    }

    @Override
    public void Modificar() throws SQLException {
    
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("UPDATE aerolinea SET direccion_aerolinea='"+this.aero.getDireccion()+"',  nombreAerolinea='"+this.aero.getNombreAerolinea()+"',numero_asiento='"+this.aero.getNumeroAsiento()+"'");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    
   }
 }

    @Override
    public void Nuevo() throws SQLException {
    
    
    this.aero.setDireccion(" ");
    this.aero.setNombreAerolinea(" ");
    this.aero.setNumeroAsiento(" ");
    
    }

    @Override
    public void Eliminar() throws SQLException {
      
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("DELETE FROM aerolinea where nombre_aerolinea='"+this.aero.getNombreAerolinea()+"'");
    Conexion.GetInstancia().Desconectar();
//    DELETE FROM `facturacion`.`cliente` WHERE `cliente`.`cedula` = \'123\'"
    }
    catch(SQLException e)
    {
    throw e;
    }
    }

    @Override
    public void Consultar() throws SQLException {
     
    }
    }
