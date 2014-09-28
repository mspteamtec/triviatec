

package triviatec;


public class Participante {
    private int vidas;
    private int monedas;
    private String nombre;
//Constructor por defecto
    public Participante() {
    }
//Contructor sobrecargado
    public Participante(int vidas, int monedas, String nombre) {
        this.vidas = vidas;
        this.monedas = monedas;
        this.nombre = nombre;
    }
//Getters y setters
    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//Método To String
    @Override
    public String toString() {
        return "Participante{" + "vidas=" + vidas + ", monedas=" + monedas + ", nombre=" + nombre + '}';
    }

    
}
