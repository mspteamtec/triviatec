

package triviatec;


public class Partida {
    private Preguntas preguntas[];
    private Participante participante[];
    
    private int NivelDeDificultad;
    private int CantidadDeParticipantes;
//Constructor por defecto
    public Partida() {
    }
//Constructor sobrecargado
    public Partida(Preguntas[] preguntas, Participante[] participante, int NivelDeDificultad, int CantidadDeParticipantes) {
        this.preguntas = preguntas;
        this.participante = participante;
        this.NivelDeDificultad = NivelDeDificultad;
        this.CantidadDeParticipantes = CantidadDeParticipantes;
    }
//Getters y setters
    public Preguntas[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Preguntas[] preguntas) {
        this.preguntas = preguntas;
    }

    public Participante[] getParticipante() {
        return participante;
    }

    public void setParticipante(Participante[] participante) {
        this.participante = participante;
    }

    public int getNivelDeDificultad() {
        return NivelDeDificultad;
    }

    public void setNivelDeDificultad(int NivelDeDificultad) {
        this.NivelDeDificultad = NivelDeDificultad;
    }

    public int getCantidadDeParticipantes() {
        return CantidadDeParticipantes;
    }

    public void setCantidadDeParticipantes(int CantidadDeParticipantes) {
        this.CantidadDeParticipantes = CantidadDeParticipantes;
    }
//Método to string
    @Override
    public String toString() {
        return "Partida{" + "preguntas=" + preguntas + ", participante=" + participante + ", NivelDeDificultad=" + NivelDeDificultad + ", CantidadDeParticipantes=" + CantidadDeParticipantes + '}';
    }
      
    
}
