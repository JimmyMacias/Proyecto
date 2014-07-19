/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GESTIONES;

import CapaDatos.Conexion;
import ClasesPoco.Horarios_Vuelo;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author VjJimmy
 */
public class GestionHorariosVuelo implements IGestion
{
DefaultTableModel m;
    public GestionHorariosVuelo() 
    {
     Conexion.GetInstancia().Enlace();
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
    Conexion.GetInstancia().Ejecutar("INSERT INTO horarios_vuelo(destino, fecha, valor_vuelo, numero_vuelo, origen)values ('"+this.aero.getDestino()+"','"+this.aero.getFecha()+"',"+this.aero.getValor()+","+this.aero.getNumeroVuelo()+",'"+this.aero.getOrigen()+"')");
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
    Conexion.GetInstancia().Ejecutar("UPDATE horarios_vuelo SET destino='"+this.aero.getDestino()+"',  fecha='"+this.aero.getFecha()+"',valor_vuelo='"+this.aero.getValor()+"'");
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
    this.aero.setValor(0);
    
    }

    @Override
    public void Eliminar() throws SQLException {
      
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("DELETE FROM horarios_vuelo where nombre_aerolinea="+this.aero.getNumeroVuelo()+"");
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
       try{
    
    Conexion.GetInstancia().Conectar();
    
    ResultSet cn = Conexion.GetInstancia().EjecutarConsulta("SELECT destino, fecha, valor_vuelo, numero_vuelo, origen  FROM horarios_vuelo  WHERE numero_vuelo="+aero.getNumeroVuelo()+"");
    while(cn.next())
    {
       this.aero.setDestino(cn.getString(1));
        this.aero.setFecha(cn.getDate(2));        
        this.aero.setValor(Integer.parseInt(cn.getString(3)));
        this.aero.setNumeroVuelo(Integer.parseInt(cn.getString(4)));
        this.aero.setOrigen(cn.getString(5));
                
    }
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
     
   
    }
    
   
}