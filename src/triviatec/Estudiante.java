

package triviatec;


public class Estudiante extends Persona{
    private int carne;
    //Contructor por defecto
    public Estudiante() {
    }
//Contructor sobrecargado
    public Estudiante(int carne, String nombre, int cedula, String correoelectronico, char[] contraseña, String fechaderegistro, String fotografia) {
        super(nombre, cedula, correoelectronico, contraseña, fechaderegistro, fotografia);
        this.carne = carne;
    }
//Getters y setters
    public int getCarne() {
        return carne;
    }

    public void setCarne(int carne) {
        this.carne = carne;
    }
    //Método recomendar pregunta
    public void RecomendarPregunta(){
        
    }
    //Método para iniciar partida
   public void IniciarPartida(){
       
   }
   //Método para aprobar matrícua
   public void AprobarMatricula(){
       
   }
    
//Método To String
    @Override
    public String toString() {
        return super.toString() + "Estudiante{" + "carne=" + carne + '}';
    }
    
    
    
}
