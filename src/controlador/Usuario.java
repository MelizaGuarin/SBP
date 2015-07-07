/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
/**
 *
 * @author Melissa
 */


//Aquí es donde se definen las variables que se van a utilizasr en el formulario de los usuarios 
public class Usuario {

    
    //Declaración de variables
    public String cedula;
    public String apellido;
    public String nombres;
    public String FechaNacimiento;
    public String Telefono;
    public String Celular;
    public String CorreoElectronico;
    public String Perfil;
    public String Contraseña;
    public String ConfirmarContraseña;

    //Por ejemplo THIS es a este campo cedula, llevele el campo cedula. 
    
    public Usuario(String cedula, String apellido, String nombres, String FechaNacimiento, String Telefono, String Celular, String CorreoElectronico, String Perfil, String Contraseña, String ConfirmarContraseña) {
        this.cedula = cedula;
        this.apellido = apellido;
        this.nombres = nombres;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
        this.Celular = Celular;
        this.CorreoElectronico = CorreoElectronico;
        this.Perfil = Perfil;
        this.Contraseña = Contraseña;
        this.ConfirmarContraseña = ConfirmarContraseña;
    }
   
    Usuario() {
        
        //inicializa el formulaario o campos, los habilita para que funcionen. 
        
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getApelldido() {
        return apellido;
    }

    public void setApelldidos(String apelldidos) {
        this.apellido = apelldidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getCelular() {
        return Celular;
    }

    public void setCelular(String Celular) {
        this.Celular = Celular;
    }

    public String getCorreoElectronico() {
        return CorreoElectronico;
    }

    public void setCorreoElectronico(String CorreoElectronico) {
        this.CorreoElectronico = CorreoElectronico;
    }

    public String getPerfil() {
        return Perfil;
    }

    public void setPerfil(String Perfil) {
        this.Perfil = Perfil;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getConfirmarContraseña() {
        return ConfirmarContraseña;
    }

    public void setConfirmarContraseña(String ConfirmarContraseña) {
        this.ConfirmarContraseña = ConfirmarContraseña;
    }

    
    

   

    @Override
    public String toString() {
        //Retorne estos valores al fomulario de las interfaces graficas, o vistas. 
        return "Cédula:  " + cedula +" \n " + "Apellidos:  "+apellido+" \n " + "Nombres:  "+nombres+" \n " + "Celular:  "+Telefono+" \n " + "Perfil:  "+Celular+ "\n" + "Correo Electronico:  "+Perfil+" \n " + "Teléfono:  "+FechaNacimiento+" \n "+ "Fecha de Nacimieno:  "+CorreoElectronico+" \n "+ "Contraseña:  "+Contraseña+" \n " ;
    }


    
    
    
}
