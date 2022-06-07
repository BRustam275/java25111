package ru.gb.bagautdinov.homework1;

public class Main {
    public static void main(String[] args) {
        Object [] participants = {
                new Human("Nikolai", 200, 70),
                new Cat("Murzic", 140, 50),
                new Robot("K20", 160, 60)
        };

        Track track = new Track(160);
        Wall wall = new Wall(55);

        for (Object object : participants) {
            System.out.println(object);
            System.out.println(track.doRun(object));
            System.out.println(wall.doJump(object));
            System.out.println("-------------------------------------------------------");

        }
    }
}
