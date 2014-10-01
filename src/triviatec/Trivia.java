/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triviatec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author QRly
 */

public class Trivia {
    
private ArrayList arregloestudiantes = new ArrayList();
private ArrayList arregloprofesores = new ArrayList();
int n = 0;
int l = 0;
    
    
    //método para obtener los top 10 estudiantes con mas uso de comodines
    public void topTenEstudiantesConmasUsoComodines(){
            
        }
    //Método para obtener los top 10 estudiantes con mas monedas
    public void topTenEstudiantesConmasMonedas(){
            
        }
    //Método para obtener los top 10 estudiantes con mas preguntas formuladas
    public void topTenEstudiantesconmaspreguntasFormuladas(){
        
    }
    //Método para cambiar jugador
    public void cambiarJugador(){
        
    }
    //Método para finalizar una partida
    public void finalizarPartida(){
        
    }
    //Método para generar estadísticas generales
    public void GenerarEstadisticasGenerales(){
        
    }
    //Método para verificar cantidad minima de estudiantes
    public void VerificarcantidadMinimaEstudiantes(Curso c){
        
    }
    //Método para controlar tiempo de respuesta a una pregunta
    public void ControlarTiempoRespuesta(){
        
    }
    //Método para obtener el top 10 estudiantes con mas aciertos nivel 5
    public void TopTenEstudiantesConMasAciertosNivel5(){
        
    }
    //Métodos para obtener el top 10 estudiantes con mas fallos nivel 1
    public void TopTenEstudiantesConMasFallosNivel1(){
        
    }
    //Método para obtener el top 10 preguntas mas aceptadas por nivel
    public void topTenPreguntasMasAcertadasPorNivel(){
        
    }
        //Método para registrarse
    public void registrarEstudiante(Estudiante e){
        
        arregloestudiantes.add(n,e);
        System.out.print(arregloestudiantes.size()+"\n");
        n++;
        //System.out.println(arregloestudiantes.get(n).toString());
}
    public void registrarProfesor(Profesor p){
        arregloprofesores.add(l,p);
        System.out.print(arregloprofesores.size()+"\n");
        l++;
    }
    public void imprimirestudiante(){
        int c=arregloestudiantes.size();
        System.out.print("<---------Estudiantes------->"+"\n");
        for (int i = 0; i < c; i++) {
           System.out.print(arregloestudiantes.get(i).toString()+"\n");
        }
    
    }
     public void imprimirprofesor(){
        int c=arregloprofesores.size();
        System.out.print("<---------Profesores------->"+"\n");
        for (int i = 0; i < c; i++) {
           System.out.print(arregloprofesores.get(i).toString()+"\n");
        }
    
    }
     public void iniciarsesion(int cedula, String contrasena){
         int c = arregloestudiantes.size();
         for (int i = 0; i < c; i++) {
            Estudiante estudiante =(Estudiante) arregloestudiantes.get(i); 
            int ced = estudiante.getCedula();
           
            char[] passw= estudiante.getContraseña();    
            
            String pass = Arrays.toString(passw);
            
            if(cedula == ced && contrasena==pass){
                System.out.println(pass);
            }
            
         }
         
         
     }
}
