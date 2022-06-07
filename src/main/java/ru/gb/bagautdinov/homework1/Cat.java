package ru.gb.bagautdinov.homework1;

public class Cat implements Bouncy, Runnable{
    private String name;
    private int jumpHeight;
    private int runDistance;

    public Cat(String name, int jumpHeight, int runDistance) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }
    public boolean jump(int height) {
        System.out.println("Кот " + name + " оценивает возможности прыжка.");
        if (height <= jumpHeight) {
            System.out.println("Кот " + name + " перепрыгнул стену " + height + " сантиметров!");

            return true;
        } else {
            System.out.println(name + " не может прыгать на высоту " + height + " сантиметров!");

            return false;
        }

    }

    public boolean run(int distance) {
        System.out.println("Кот " + name + " оценил возможность бега");
        if (distance <= runDistance) {
            System.out.println("Кот " + name + " пробежал " + distance + " метра(ов)!");

            return true;
        } else {
            System.out.println(name + " не может бегать на расстояние " + distance + " метра(ов)!");

            return false;
        }
    }
}
