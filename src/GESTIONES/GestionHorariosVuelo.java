/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GESTIONES;

import CapaDatos.Conexion;
import ClasesPoco.Horarios_Vuelo;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;


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
    Conexion.GetInstancia().Ejecutar("INSERT INTO horarios_vuelo(destino, fecha, valor_vuelo,numero_vuelo) values ('"+this.aero.getDestino()+"','"+this.aero.getFecha()+"','"+this.aero.getValor_vuelo()+"',"+this.aero.getNumero_vuelo()+")");
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
    Conexion.GetInstancia().Ejecutar("UPDATE horarios_vuelo SET destino='"+this.aero.getDestino()+"',  fecha='"+this.aero.getFecha()+"',valor_vuelo='"+this.aero.getValor_vuelo()+"'");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    
   }
 }

    @Override
    public void Nuevo() throws SQLException {
    
    
    this.aero.setDestino(" ");
    //this.aero.setFecha();
    this.aero.setValor_vuelo(0);
    
    }

    @Override
    public void Eliminar() throws SQLException {
      
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("DELETE FROM horarios_vuelo where nombre_aerolinea="+this.aero.getNumero_vuelo()+"");
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
