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
import ClasesPoco.Cliente;
import ClasesPoco.Empleado;
import ClasesPoco.Cabecera_Factura;
import java.sql.ResultSet;
import java.sql.SQLException;



/**
 *
 * @author VjJimmy
 */
public class GestionCabecera implements IGestion
{

    public GestionCabecera() 
    {
    Conexion.GetInstancia().Enlace();
    }
  private Cabecera_Factura cabecera=new Cabecera_Factura();
    public Cabecera_Factura getCabecera()
    {
    return cabecera;
    }
    public void setcabecera(Cabecera_Factura cabecera)
    {
    this.cabecera=cabecera;
    }
 private Cliente client=new Cliente();
    public Cliente getCliente()
    {
    return client;
    }
    public void setCliente(Cliente client)
    {
    this.client=client;
    }
 
    private Empleado empleado=new Empleado();
    public Empleado getEmpleado()
    {
    return empleado;
    }
    public void setEmpleado(Empleado empleado)
    {
    this.empleado=empleado;
    }
    
    @Override
    public void Grabar() throws SQLException {
       try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("INSERT INTO cabezera_factura(fecha_emision, numero_factura, id_cliente, id_empleado) values ('"+this.getCabecera().getFecha()+"',"+this.getCabecera().getNumeroFactura()+","+this.getCliente().getIdCliente()+","+this.getEmpleado().getIdEmpleado()+")");
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
    
  // }
 }

    @Override
    public void Nuevo() throws SQLException {
    
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