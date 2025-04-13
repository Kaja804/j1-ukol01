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
        nakresliOsmiuhelnik();
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.move(25);
        zofka.penDown();
        nakresliKruh();
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();
        zofka.turnLeft(90);
        nakresliSlunce();

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
    public void nakresliOsmiuhelnik (){
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }
    }
    public void nakresliKruh (){
        for (int i = 0; i < 72; i++) {
            zofka.move(5);
            zofka.turnRight(5);
        }
    }
    public void nakresliSlunce () {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                zofka.move(5);
                zofka.turnRight(5);
            }
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnRight(180);
            zofka.move(30);
            zofka.turnLeft(90);
        }
    }

}
