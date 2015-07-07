/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author Zamuel
 */
public class Prestamos {
    /* se agrega a cada formulario validaciones de 
    campos los cuales verifican que no esten vacios ..
    no se puede ingresar un registro a la lista si algun campo no se ha llenado*/
    public String CodigoPrestamo;
    public String CodigoLibro;
    public String Cedula;
    public String FechaSalida;
    public String FechaMaximaDevolucion;

    public Prestamos(String CodigoPrestamo, String CodigoLibro, String Cedula, String FechaSalida, String FechaMaximaDevolucion) {
        this.CodigoPrestamo = CodigoPrestamo;
        this.CodigoLibro = CodigoLibro;
        this.Cedula = Cedula;
        this.FechaSalida = FechaSalida;
        this.FechaMaximaDevolucion = FechaMaximaDevolucion;
    }

    Prestamos (){
    
    }
    
    public String getCodigoPrestamo() {
        return CodigoPrestamo;
    }

    public void setCodigoPrestamo(String CodigoPrestamo) {
        this.CodigoPrestamo = CodigoPrestamo;
    }

    public String getCodigoLibro() {
        return CodigoLibro;
    }

    public void setCodigoLibro(String CodigoLibro) {
        this.CodigoLibro = CodigoLibro;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getFechaSalida() {
        return FechaSalida;
    }

    public void setFechaSalida(String FechaSalida) {
        this.FechaSalida = FechaSalida;
    }

    public String getFechaMaximaDevolucion() {
        return FechaMaximaDevolucion;
    }

    public void setFechaMaximaDevolucion(String FechaMaximaDevolucion) {
        this.FechaMaximaDevolucion = FechaMaximaDevolucion;
    }

    @Override
    public String toString() {
        return "Código del Préstamo:  " + CodigoPrestamo +" \n " + "Código del Libro:  "+CodigoLibro+" \n " + "Cédula:  "+Cedula+" \n " + "Fecha de Salida:  "+FechaSalida+" \n " + "Fecha Máxima de Devolución:  "+FechaMaximaDevolucion+ "\n" ;
    }
    
    
    
    
}
