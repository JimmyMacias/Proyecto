/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GESTIONES;

import CapaDatos.Conexion;
import ClasesPoco.Empleado;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author VjJimmy
 */
public class GestionEmpleado implements IGestion
{

    public GestionEmpleado() 
    {
        Conexion.GetInstancia().Enlace();
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
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("INSERT INTO empleado(nombre, cedula, direccion, telefono,cargo) values ('"+this.empleado.getNombre()+"','"+this.empleado.getCedula()+"','"+this.empleado.getDireccion()+"','"+this.empleado.getTelefono()+"','"+this.empleado.getCargo()+"')");
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
    Conexion.GetInstancia().Ejecutar("UPDATE \"empleado\"SET cargo='"+this.empleado.getCargo()+"',  nombre='"+this.empleado.getNombre()+"', cedula='"+this.empleado.getCedula()+"', direccion='"+this.empleado.getDireccion()+"', telefono='"+this.empleado.getTelefono()+"'");
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    
   }
 }

    @Override
    public void Nuevo() throws SQLException {
    
    
    this.empleado.setCedula(" ");
    this.empleado.setNombre(" ");
    this.empleado.setDireccion(" ");
    this.empleado.setCargo(" ");
    this.empleado.setTelefono(" ");
    
    
    }

    @Override
    public void Eliminar() throws SQLException {
      
    try{
    Conexion.GetInstancia().Conectar();
    Conexion.GetInstancia().Ejecutar("DELETE FROM empleado WHERE cedula ='"+empleado.getCedula()+"'");
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
    
    ResultSet cn = Conexion.GetInstancia().EjecutarConsulta("SELECT cargo,nombre, cedula, direccion, telefono  FROM empleado WHERE cedula = '"+empleado.getCedula()+"'");
    while(cn.next())
    {
        this.empleado.setCargo(cn.getString(1));
        this.empleado.setNombre(cn.getString(2));
        this.empleado.setCedula(cn.getString(3));
        this.empleado.setDireccion(cn.getString(4));
        this.empleado.setTelefono(cn.getString(5));
                
    }
    Conexion.GetInstancia().Desconectar();
    }
    catch(SQLException e)
    {
    throw e;
    }
  }
 }
    
