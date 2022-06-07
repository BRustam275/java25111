package ru.gb.bagautdinov.homework1;

public class Robot implements Bouncy, Runnable{
    private String model;
    private int jumpHeight;
    private int runDistance;

    public Robot(String model, int jumpHeight, int runDistance) {
        this.model = model;
        this.jumpHeight = jumpHeight;
        this.runDistance = runDistance;
    }

    public boolean jump(int height) {
        System.out.println("Робот " + model + " оценивает возможности прыжка.");
        if (height <= jumpHeight) {
            System.out.println("Робот " + model + " перепрыгнул стену " + height + " сантиметров!");

            return true;
        } else {
            System.out.println(model + " не может прыгать на высоту " + height + " сантиметров!");
        }
        return false;
    }

    public boolean run(int distance) {
        System.out.println("Робот " + model + " оценил возможность бега");
        if (distance <= runDistance) {
            System.out.println("Робот " + model + " пробежал " + distance + " метра(ов)!");

            return true;
        } else {
            System.out.println(model + " не может бегать на расстояние " + distance + " метра(ов)!");
            return false;
        }
    }
}
