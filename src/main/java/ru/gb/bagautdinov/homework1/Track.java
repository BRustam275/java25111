package ru.gb.bagautdinov.homework1;

public class Track {
    private int distance;

    public Track(int distance) {
        this.distance = distance;
    }

    public boolean doRun(Object object) {
        if (object instanceof Runnable) {
            return ((Runnable) object).run(distance);
        }
        return false;
    }
}
