package vista;

import controlador.Combate;
import modelo.Personajes;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Personajes roy = new Personajes("Roy", 1, 100, 25, 15);
        Personajes cloud = new Personajes("Cloud", 1, 100, 45, 5);
        Personajes peach = new Personajes("Peach",1,100, 15, 20);
        Personajes mario = new Personajes("Mario", 1, 100, 40, 20);
        Personajes luigi = new Personajes("Luigi", 1, 100, 30, 10);
        Personajes inkling = new Personajes("Inkling", 1, 100, 40, 10);

        Combate royVScloud = new Combate(roy, cloud);
        Combate peachVSmario = new Combate(peach, mario);
        Combate luigiVSinkling = new Combate(luigi, inkling);
        Combate royVSpeach = new Combate(roy, peach);
        Combate cloudVSluigi = new Combate(cloud, luigi);
        Combate marioVSinkling = new Combate(mario, inkling);
        Combate royVSmario = new Combate(roy, mario);
        Combate peachVScloud = new Combate(peach, cloud);
        Combate peachVSinkling = new Combate(peach, inkling);
        Combate royVSluigi = new Combate(roy, luigi);
        Combate cloudVSinkling = new Combate(cloud, inkling);
        Combate royVSinkling = new Combate(roy, inkling);
        Combate cloudVSmario = new Combate(cloud, mario);
        Combate luigiVSpeach = new Combate(luigi,peach);
        Combate marioVSluigi = new Combate(mario, luigi);

        roy.verNivel();
        cloud.verNivel();
        peach.verNivel();
        mario.verNivel();
        luigi.verNivel();
        inkling.verNivel();

    }
}
