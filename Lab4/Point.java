package com.company;

public class Point extends Graph implements Movable{
    protected int x;
    protected int y;

    public Point() {

    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void draw() {
        System.out.print("Точка: ");
        System.out.println("x = " + x + ", y = " + y);
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }
}
