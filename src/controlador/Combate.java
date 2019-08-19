package controlador;

import modelo.Personajes;

public class Combate {

    private Personajes jugador1;
    private Personajes jugador2;

    public Combate(Personajes jugador1, Personajes jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        combatir();
    }

    public void combatir() {
        System.out.println("COMIENZA EL COMBATE");
        do {
            if (jugador1.getVida() > 0 && jugador2.getVida() > 0) {
                System.out.println(jugador1.getNombre() + " ataca a " + jugador2.getNombre());
                jugador2.setVida(jugador2.getVida() - (jugador1.getAtaque() - jugador2.getDefensa()));
                System.out.println( jugador2.getNombre() + " tiene " + jugador2.getVida() + " puntos de vida");
            } else {
                System.out.println(jugador1.getNombre() + " ha muerto");
                break;
            }

            if (jugador1.getVida() > 0 && jugador2.getVida() > 0) {
                System.out.println(jugador2.getNombre() + " ataca a " + jugador1.getNombre());
                jugador1.setVida(jugador1.getVida() - (jugador2.getAtaque() - jugador1.getDefensa()));
                System.out.println( jugador1.getNombre() + " tiene " + jugador1.getVida() + " puntos de vida");
            } else {
                System.out.println(jugador2.getNombre() + " ha muerto");
                break;
            }
        } while(!jugador1.isVivo() || !jugador2.isVivo());


    }

}
