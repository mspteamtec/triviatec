

package triviatec;


public class Curso {
    private Estudiante integrantes[];
    private Temas temas[];
    private String nombre;
    private int codigo;
    private int cupo;
    private int numerodesemestre;
    private int annos;
//Constructor por defecto
    public Curso() {
    }
//Contructor sobrecargado
    public Curso(Estudiante[] integrantes, Temas[] temas, String nombre, int codigo, int cupo, int numerodesemestre, int annos) {
        this.integrantes = integrantes;
        this.temas = temas;
        this.nombre = nombre;
        this.codigo = codigo;
        this.cupo = cupo;
        this.numerodesemestre = numerodesemestre;
        this.annos = annos;
    }
//Setters and getters
    public Temas[] getTemas() {
        return temas;
    }

    public void setTemas(Temas[] temas) {
        this.temas = temas;
    }

    

    public Estudiante[] getIntegrantes() {
        return integrantes;
    }

    public void setIntegrantes(Estudiante[] integrantes) {
        this.integrantes = integrantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCupo() {
        return cupo;
    }

    public void setCupo(int cupo) {
        this.cupo = cupo;
    }

    public int getNumerodesemestre() {
        return numerodesemestre;
    }

    public void setNumerodesemestre(int numerodesemestre) {
        this.numerodesemestre = numerodesemestre;
    }

    public int getAnnos() {
        return annos;
    }

    public void setAnnos(int annos) {
        this.annos = annos;
    }
    public void RegistrarCurso(){
    }//Método para Registrar Curso
    public void SoiclitarMatrícula(){
    }//Método para registrar matrícula
    public void AgregarEstudiante(){
    }//Método para agregar estudiante
    public void MostrarTema(){
    }//Método para mostrar tema
//Mètodo TO STRING
    @Override
    public String toString() {
        return "Curso{" + "integrantes=" + integrantes + ", temas=" + temas + ", nombre=" + nombre + ", codigo=" + codigo + ", cupo=" + cupo + ", numerodesemestre=" + numerodesemestre + ", annos=" + annos + '}';
    }

    
    
}
