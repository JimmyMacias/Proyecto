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
    Conexion.GetInstancia().Ejecutar("INSERT INTO reservacion(cedula_cliente, nombre_cliente, fecha, numero_reservacion, numero_vuelo, valor_vuelo) VALUES ( '"+this.aero.getCedula()+"','"+this.aero.getNombre()+"','"+this.aero.getFecha()+"',"+this.aero.getNumeroResevacion()+","+this.aero.getNumeroVuelo()+")");
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
//      Conexion.GetInstancia().Conectar();    
//    ResultSet cn = Conexion.GetInstancia().EjecutarConsulta("SELECT numero_aerolinea,\"direccion_aerolinea\", \"nombre_aerolinea\", \"numero_asiento\"  FROM aerolinea WHERE nombre_aerolinea ='"+aero.getNombreAerolinea()+"'");
//    while(cn.next())
//    {   this.aero.setNumero_aerolinea(Integer.parseInt(cn.getString(1)));
//        this.aero.setDireccion(cn.getString(2));
//        this.aero.setNombreAerolinea(cn.getString(3));
//        this.aero.setNumeroAsiento(cn.getString(4));        
//    }
//    Conexion.GetInstancia().Desconectar();
    }
}