

package triviatec;

import java.util.ArrayList;


public class Persona {
    
    private String nombre;
    private int cedula;
    private String correoelectronico;
    private char[] contraseña;
    private String fechaderegistro;
    private String fotografia;
 
//Constructor por defecto
    public Persona() {
    }
//Constructor Sobrecargado
    public Persona(String nombre, int cedula, String correoelectronico, char[] contraseña, String fechaderegistro, String fotografia) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.correoelectronico = correoelectronico;
        this.contraseña = contraseña;
        this.fechaderegistro = fechaderegistro;
        this.fotografia = fotografia;
        
    }
    
//Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public char[] getContraseña() {
        return contraseña;
    }

    public void setContraseña(char[] contraseña) {
        this.contraseña = contraseña;
    }

    public String getFechaderegistro() {
        return fechaderegistro;
    }

    public void setFechaderegistro(String fechaderegistro) {
        this.fechaderegistro = fechaderegistro;
    }

    public String getFotografia() {
        return fotografia;
    }

    public void setFotografia(String fotografia) {
        this.fotografia = fotografia;
    }

//Método To string
    @Override
    public String toString() {
        return "Nombre: " + nombre + "Cédula: " + cedula + "e-Mail: " + correoelectronico 
                + "Contraseña: " + contraseña + "Fecha de Registro: " + fechaderegistro + "Fotografía: " + fotografia;
    }
    
    
}
