package ru.gb.bagautdinov.homework1;

public class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean doJump(Object object) {
        if (object instanceof Bouncy) {
            return ((Bouncy) object).jump(height);
        }
        return false;
    }
}
