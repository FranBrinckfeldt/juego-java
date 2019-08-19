package modelo;

public class Personajes {

    private String nombre;
    private int nivel;
    private int vida;
    private int ataque;
    private int defensa;
    private boolean vivo;
    private double triunfo = 0;

    public Personajes(String nombre, int nivel, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public boolean isVivo() {
        return vivo;
    }

    public void setVivo(boolean vivo) {
        this.vivo = vivo;
    }

    public double getTriunfo() {
        return triunfo;
    }

    public void setTriunfo(double triunfo) {
        this.triunfo = triunfo;
    }

    public void subirNivel() {
        double niveles = getTriunfo()/5;
        int parteEntera = (int) niveles;
        setNivel(parteEntera);
    }

    public void verNivel() {
        System.out.println("El nivel de " + this.getNombre() + " es " + this.getNivel());
    }
}
