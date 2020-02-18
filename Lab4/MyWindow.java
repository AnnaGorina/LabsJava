package com.company;

public class MyWindow implements Movable {
    int x;
    int y;

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void moveTo(int x, int y) {
        x = getX();
        y = getY();
        System.out.println("Координаты изменены!");
    }
}
