package ru.novsu.povt.gan.graphics;

public class Point extends Graph {
    protected int x;
    protected int y;

    public Point() {

    }

    @Override
    public void draw() {
        System.out.print("Точка: ");
        System.out.println("x = " + x + ", y = " + y);
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
