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
    
   private Factura factura=new Factura();
    public Factura getfact()
    {
    return factura;
    }
    public void setfact(Factura empleado)
    {
    this.factura=empleado;
    }
    
    @Override
    public void Grabar() throws SQLException {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("INSERT INTO factura(numero_vuelo, numero_boletos, valor_boleto,origen, destino, fecha)values ("+this.factura.getNumeroVuelo()+","+this.factura.getNumeroBoletos()+","+this.factura.getValor()+",'"+this.factura.getOrigen()+"','"+this.factura.getDestino()+"')");
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
