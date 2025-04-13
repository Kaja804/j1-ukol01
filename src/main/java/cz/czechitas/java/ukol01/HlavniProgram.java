package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void start() {
        zofka = new Turtle();

        //TODO implementace domácího úkolu
        nakresliPrasatko();
    }

    public void nakresliPrasatko() {
        nakresliDomecek();
        zofka.turnRight(180);
        zofka.move(100);
        zofka.turnRight(30);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnRight(120);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnRight(120);
        zofka.move(150);
        zofka.turnRight(120);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnRight(120);
        zofka.move(40);
        zofka.turnRight(180);
        zofka.move(40);
        zofka.turnRight(30);

    }

    public void nakresliDomecek() {
        for (int i = 0; i < 2; i++) {
            zofka.move(100);
            zofka.turnRight(90);
            zofka.move(150);
            zofka.turnRight(90);
        }
        zofka.turnLeft(60);
        zofka.move(100);
        zofka.turnRight(120);
        zofka.move(100);
        zofka.turnLeft(60);
    }

}
