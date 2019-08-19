package vista;

import controlador.Combate;
import modelo.Personajes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <Personajes> personajes = new ArrayList<>();

        Personajes roy = new Personajes("Roy", 1, 100, 30, 15);
        Personajes cloud = new Personajes("Cloud", 1, 100, 45, 5);
        Personajes peach = new Personajes("Peach",1,100, 20, 30);

        personajes.add(roy);
        personajes.add(cloud);
        personajes.add(peach);

        Combate royVScloud = new Combate(roy, cloud);
    }
}
