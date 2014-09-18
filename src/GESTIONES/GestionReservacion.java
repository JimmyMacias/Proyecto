/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GESTIONES;

/**
 *
 * @author VjJimmy
 */
import CapaDatos.Conexion;
import ClasesPoco.Reservacion;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author VjJimmy
 */
public class GestionReservacion implements IGestion
{

    public GestionReservacion() 
    {
    Conexion.GetInstancia().Enlace();
    }
    
   private Reservacion aero=new Reservacion();
    public Reservacion getReservacion()
    {
    return aero;
    }
    public void setReservacion(Reservacion aero)
    {
    this.aero=aero;
    }
    
    @Override
    public void Grabar() throws SQLException {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("INSERT INTO reservacion(cedula_cliente, nombre_cliente, fecha, numero_reservacion, numero_vuelo, valor_vuelo) VALUES ( '"+this.aero.getCedula()+"','"+this.aero.getNombre()+"','"+this.aero.getFecha()+"',"+this.aero.getNumeroResevacion()+","+this.aero.getNumeroVuelo()+","+this.aero.getValor_vuelo()+")");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    
    }

    @Override
    public void Modificar() throws SQLException {
    
//    try{
//    Conexion.GetInstancia().Conectar();
//    Conexion.GetInstancia().Ejecutar("UPDATE aerolinea SET numero_aerolinea='"+this.aero.getNumero_aerolinea()+"', direccion_aerolinea='"+this.aero.getDireccion()+"',  nombreAerolinea='"+this.aero.getNombreAerolinea()+"',numero_asiento='"+this.aero.getNumeroAsiento()+"'");
//    Conexion.GetInstancia().Desconectar();
//    }
//    catch(SQLException e)
//    {
//    throw e;
    
   //}
 }

    @Override
    public void Nuevo() throws SQLException {
//    
//    this.aero.setNumero_aerolinea(0);
//    this.aero.setDireccion(" ");
//    this.aero.setNombreAerolinea(" ");
//    this.aero.setNumeroAsiento(" ");
    
    }

    @Override
    public void Eliminar() throws SQLException {
      
//    try{
//    Conexion.GetInstancia().Conectar();
//    Conexion.GetInstancia().Ejecutar("DELETE FROM aerolinea where nombre_aerolinea='"+this.aero.getNombreAerolinea()+"'");
//    Conexion.GetInstancia().Desconectar();
////    DELETE FROM `facturacion`.`cliente` WHERE `cliente`.`cedula` = \'123\'"
//    }
//    catch(SQLException e)
//    {
//    throw e;
//    }
    }

    @Override
    public void Consultar() throws SQLException {
     Conexion.GetInstancia().Conectar();    
    ResultSet cn = Conexion.GetInstancia().EjecutarConsulta("SELECT cedula_cliente, nombre_cliente, fecha, numero_reservacion, numero_vuelo, valor_vuelo FROM reservacion WHERE numero_reservacion="+aero.getNumeroResevacion()+"");
    while(cn.next())
    {   this.aero.setCedula((cn.getString(1)));
        this.aero.setNombre(cn.getString(2));
        this.aero.setFecha(cn.getDate(3));
        this.aero.setNumeroResevacion(cn.getInt(4));
        this.aero.setNumeroVuelo(cn.getInt(5));
        this.aero.setValor_vuelo(cn.getInt(6));
        
    }
    Conexion.GetInstancia().Desconectar();
    }
}