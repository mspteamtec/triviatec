

package triviatec;


public class Preguntas {
    private Temas tema[];
    private String contenido;
    private int niveldedificultad;
//Constructor por defecto
    public Preguntas() {
    }
//Constructor Sobrecargado
    public Preguntas(Temas[] tema, String contenido, int niveldedificultad) {
        this.tema = tema;
        this.contenido = contenido;
        this.niveldedificultad = niveldedificultad;
    }
//Getters y setters
    public Temas[] getTema() {
        return tema;
    }

    public void setTema(Temas[] tema) {
        this.tema = tema;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public int getNiveldedificultad() {
        return niveldedificultad;
    }

    public void setNiveldedificultad(int niveldedificultad) {
        this.niveldedificultad = niveldedificultad;
    }
    //Método para Formular pregunta
   public void FormularPregunta(){
       
   }
   //Método para asociar pregunta
   public void AsociarPregunta(){
       
   }
   //Método para editar pregunta
   public void EditarPregunta(){
       
   }
   //Método para deshabilitar Pregunta
   public void DeshabilitarPregunta(){
       
   }
//Método para usarcomodin
   public void UsarComodin(){
       
   }
   //Método para saltar pregunta
   public void SaltarPregunta(){
       
   }
   //Método que muestra la respuesta correcta
   public void MostrarRespuestaCorrecta(){
       
   }
   //Método que muestra respuesta aleatoria
   public void MostrarPreguntaAleatoria(){
       
   }
   //Método para responder pregunta
   public void ResponderPregunta(Temas T,Preguntas P,String respuesta){
       
   }
//Método to string
    @Override
    public String toString() {
        return "Preguntas{" + "tema=" + tema + ", contenido=" + contenido + ", niveldedificultad=" + niveldedificultad + '}';
    }
      
}
