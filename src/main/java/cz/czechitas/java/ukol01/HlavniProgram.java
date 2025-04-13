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
        zofka.penUp();
        zofka.move(150);
        zofka.turnLeft(90);
        zofka.move(250);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliSlunce();
        zofka.penUp();
        zofka.turnLeft(150);
        zofka.move(120);
        zofka.turnLeft(120);
        zofka.penDown();
        for (int i = 0; i < 5; i++) {
            nakresliDomecek();
            zofka.penUp();
            zofka.move(50);
            zofka.penDown();
        }
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(550);
        zofka.turnLeft(90);
        zofka.move(180);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliDomecek();
        zofka.penUp();
        zofka.move(160);
        zofka.turnRight(90);
        zofka.move(55);
        zofka.turnLeft(180);
        zofka.penDown();
        nakresliPrasatko();
        zofka.penUp();
        zofka.move(55);
        zofka.turnRight(90);
        zofka.move(145);
        zofka.penDown();
        nakresliDomecek();
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(500);
        zofka.turnLeft(90);
        zofka.move(120);
        nakresliK();
        makresliACarka();
        nakresliJ();
        nakresliA();

    }

    public void nakresliPrasatko() {
        nakresliDomecek();
        zofka.turnRight(180);
        zofka.move(60);
        zofka.turnRight(30);
        zofka.move(20);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnRight(120);
        zofka.move(20);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnRight(120);
        zofka.move(75);
        zofka.turnRight(120);
        zofka.move(20);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnRight(120);
        zofka.move(20);
        zofka.turnRight(180);
        zofka.move(20);
        zofka.turnRight(30);

    }

    public void nakresliDomecek() {
        for (int i = 0; i < 2; i++) {
            zofka.move(60);
            zofka.turnRight(90);
            zofka.move(75);
            zofka.turnRight(90);
        }
        zofka.turnLeft(60);
        zofka.move(60);
        zofka.turnRight(120);
        zofka.move(60);
        zofka.turnLeft(60);
    }

    public void nakresliOsmiuhelnik() {
        for (int i = 0; i < 8; i++) {
            zofka.move(50);
            zofka.turnRight(45);
        }
    }

    public void nakresliKruh() {
        for (int i = 0; i < 72; i++) {
            zofka.move(5);
            zofka.turnRight(5);
        }
    }

    public void nakresliSlunce() {
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 6; j++) {
                zofka.move(2);
                zofka.turnRight(5);
            }
            zofka.turnLeft(90);
            zofka.move(15);
            zofka.turnRight(180);
            zofka.move(15);
            zofka.turnLeft(90);
        }
    }
    public void nakresliK (){
        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(71);
        zofka.turnLeft(180);
        zofka.move(70);
        zofka.turnLeft(90);
        zofka.move(71);
        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(30);
    }
    public void makresliACarka (){
        zofka.penDown();
        zofka.turnLeft(70);
        zofka.move(106);
        zofka.penUp();
        zofka.turnLeft(20);
        zofka.move(20);
        zofka.turnRight(20);
        zofka.penDown();
        zofka.move(25);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(25);
        zofka.turnLeft(20);
        zofka.move(20);
        zofka.turnLeft(20);
        zofka.penDown();
        zofka.move(106);
        zofka.turnLeft(180);
        zofka.move(36);
        zofka.turnLeft(70);
        zofka.move(48);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(90);
        zofka.turnRight(90);
        zofka.move(34);
        zofka.turnLeft(90);
    }
    public void nakresliJ () {
        zofka.turnLeft(90);
        zofka.move(34);
        zofka.penDown();
        zofka.turnLeft(180);
        for (int i = 0; i < 36; i++) {
            zofka.move(2.5);
            zofka.turnLeft(5);
        }
        zofka.move(70);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(30);
    }
    public void nakresliA () {
        zofka.penDown();
        zofka.turnLeft(70);
        zofka.move(106);
        zofka.turnRight(140);
        zofka.move(106);
        zofka.turnLeft(180);
        zofka.move(36);
        zofka.turnLeft(70);
        zofka.move(48);
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(90);
        zofka.turnRight(90);
        zofka.move(34);
        zofka.turnLeft(90);
    }

}
