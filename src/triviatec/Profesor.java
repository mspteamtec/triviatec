

package triviatec;


public class Profesor extends Persona {

//Constructor por defecto
    public Profesor() {
    }

//Constructor sobrecargado
    public Profesor(String nombre, int cedula, String correoelectronico, char[] contraseña, String fechaderegistro, String fotografia) {
        super(nombre, cedula, correoelectronico, contraseña, fechaderegistro, fotografia);
    }
    //Método para apreobar estudiante
    public void AprebarEstudiante(){
        
    }
    //Método para gestinar Temas
    public void GestionarTemas(){
        
    }
    //Método para gestionar preguntas
    public void GestionarPreguntas(){
        
    }
    //Método para aprobar pregunta
    public void AprobarPregunta(){
        
    }
    //Método para iniciar partida
    public void IniciarPartida(){
        
    }
    //Método para verificar Cupo
    public void VerificarCupo(){
        
    }
    //Método para mostrar cursos de profesor
    public void MostrarCursosdeProfesor(){
        
    }
    
    
//Método To String
    @Override
    public String toString() {
        return super.toString() + "Profesor{" + '}';
    }

    
    
}
