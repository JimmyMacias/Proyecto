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
        Conexion.setCadena("jdbc:postgresql://localhost:5432/SistemaVenta");
        Conexion.setUsuario("postgres");
        Conexion.setPass("vjjimmy92");
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
    Conexion.GetInstancia().Ejecutar("INSERT INTO factura(numeroFactura) values ('"+this.empleado.getNumeroFactura()+"')");
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
    
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("UPDATE \"factura\"SET numeroFactura='"+this.empleado.getNumeroFactura()+"''");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    
   }
 }

    @Override
    public void Nuevo() throws SQLException 
    {
        this.empleado.setNumeroFactura(" ");
    }

    @Override
    public void Eliminar() throws SQLException {
      
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("DELETE FROM factura WHERE numeroFactura ='"+empleado.getNumeroFactura()+"'");
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
    
    ResultSet cn = Conexion.GetInstancia().EjecutarConsulta("SELECT numeroFactura,idReservacion, idFacturaReserva FROM factura WHERE numeroFactura = '"+empleado.getNumeroFactura()+"'");
    while(cn.next())
    {
        this.empleado.setNumeroFactura(cn.getString(1));        
    }
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
  }
}
