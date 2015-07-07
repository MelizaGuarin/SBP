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
public class Libro {
    
    public String CodigoLibro;
    public String NombreLibro;
    public String Editorial;
    public String Autor;
    public String Genero;

    public Libro(String CodigoLibro, String NombreLibro, String Editorial, String Autor, String Genero) {
        this.CodigoLibro = CodigoLibro;
        this.NombreLibro = NombreLibro;
        this.Editorial = Editorial;
        this.Autor = Autor;
        this.Genero = Genero;
    }
    
    Libro(){
    
    }

    public String getCodigoLibro() {
        return CodigoLibro;
    }

    public void setCodigoLibro(String CodigoLibro) {
        this.CodigoLibro = CodigoLibro;
    }

    public String getNombreLibro() {
        return NombreLibro;
    }

    public void setNombreLibro(String NombreLibro) {
        this.NombreLibro = NombreLibro;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return "Código del Libro:  " + CodigoLibro +" \n " + "Nombre del Libro:  "+NombreLibro+" \n " + "Editorial:  "+Editorial+" \n " + "Autor:  "+Autor+" \n " + "Género:  "+Genero+ "\n" ;
    }
    
    
    
}
