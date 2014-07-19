
package GESTIONES;

import java.util.Date;

public class Person {

    public Person(String destino, String origen, Date fecha, int numeroVuelo, int valor) {
        this.destino = destino;
        this.origen = origen;
        this.fecha = fecha;
        this.numeroVuelo = numeroVuelo;
        this.valor = valor;
    }

    
    
    
         private String destino;
    
    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    private String origen;

   
    public String getOrigen() {
        return origen;
    }

   
    public void setOrigen(String origen) {
        this.origen = origen;
    }

    private Date fecha;

    
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    private int numeroVuelo;

    public Person() {
    }

  
    public int getNumeroVuelo() {
        return numeroVuelo;
    }

 
    public void setNumeroVuelo(int numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    private int valor;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}