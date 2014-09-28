

package triviatec;


public class Temas {
    
    private String nombre;
    private String duracion;
    private String imagen;

//Constructor por defecto
    public Temas() {
    }

//Constructor sobrecargado
    public Temas(String nombre, String duracion, String imagen) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.imagen = imagen;
    }
//Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
    //Método para Asociar Tema
    public void AsociarTema(){
        
    }
    //Método para crear tema
    public void CrearTema(){
        
    }
    //Método para editar Tema
    public void EditarTema(){
        
    }
    //Método para deshabilitar tema
    public void DeshabilitarTema(){
        
    }
    //Método para cambiar tema
    public void CambiarTema(){
        
    }
    //Método para selccionar tema
    public void SeleccionarTema(){
        
    }
    //Método para ganar dominio
    public void GanarDominio(){
        
    }
//Método To String
    @Override
    public String toString() {
        return "Temas{" + "nombre=" + nombre + ", duracion=" + duracion + ", imagen=" + imagen + '}';
    }
    
    
    
}
