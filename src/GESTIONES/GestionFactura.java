/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GESTIONES;
import CapaDatos.Conexion;
import ClasesPoco.Factura;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author AnchundiaAnderson
 */
public class GestionFactura   implements IGestion
{
    
    public GestionFactura() 
    {
       Conexion.GetInstancia().Enlace();
    }
    
   private Factura empleado=new Factura();
    public Factura getEmpleado()
    {
    return empleado;
    }
    public void setEmpleado(Factura empleado)
    {
    this.empleado=empleado;
    }
    
    @Override
    public void Grabar() throws SQLException {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("INSERT INTO factura(numero_vuelo,numero_boletos,numero_reservacion) values ("+this.empleado.getNumeroVuelo()+","+this.empleado.getNumeroBoletos()+","+this.empleado.getNumeroReservacion()+")");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
    
    }

    @Override
    public void Modificar() throws SQLException 
    {
   
   }
 

    @Override
    public void Nuevo() throws SQLException 
    {
     
    }

    @Override
    public void Eliminar() throws SQLException {
      
   
    }

    @Override
    public void Consultar() throws SQLException {
  
  }
}
