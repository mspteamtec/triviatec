/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package triviatec;
import Grafica.VEstudiante;
import Grafica.VProfesor;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author QRly
 */

public class Trivia {
    
public static ArrayList arregloestudiante = new ArrayList();
public static ArrayList arregloprofesor = new ArrayList();  
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
        
    arregloestudiante.add(e);
    /*System.out.print(arregloestudiantes.size()+"\n");*/
    //n++;
    //System.out.println(arregloestudiantes.get(n).toString());
}
    public void registrarProfesor(Profesor p){
        arregloprofesor.add(p);
        /*System.out.print(arregloprofesores.size()+"\n");*/
       // l++;
    }
    public void imprimirestudiante(){
        int c=arregloestudiante.size();
        System.out.print("<---------Estudiantes------->"+"\n");
        for (int i = 0; i < c; i++) {
           System.out.print(arregloestudiante.get(i).toString()+"\n");
        }
    
    }
     public void imprimirprofesor(){
        int c=arregloprofesor.size();
        System.out.print("<---------Profesores------->"+"\n");
        for (int i = 0; i < c; i++) {
           System.out.print(arregloprofesor.get(i).toString()+"\n");
        }
       
    }
    public void iniciarsesion(String cedula,String contrasena){
         int e = arregloestudiante.size(); 
         int p = arregloprofesor.size();
        
         for (int i = 0; i < e; i++) {
             Estudiante estudiante = (Estudiante) arregloestudiante.get(i);
            
             String pass=estudiante.getContraseña();
             String ced= Integer.toString(estudiante.getCedula());
             if (contrasena.equals(pass) && cedula.equals(ced)) {
                 new VEstudiante().setVisible(true);
             }
             
         
                 
             }
         for (int i = 0; i < p; i++) {
             Profesor profesor = (Profesor) arregloprofesor.get(i);
             
             String pass=profesor.getContraseña();
             String ced= Integer.toString(profesor.getCedula());
             if (contrasena.equals(pass) && cedula.equals(ced)) {
                 new VProfesor().setVisible(true);
             }
             
            
        }
         }
    
}
     

