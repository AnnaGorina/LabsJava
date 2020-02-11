package com.company;

public class Ellipse extends Point{
    private int a;
    private int b;

    private String color;
    private String name;

    public Ellipse() {

    }

    @Override
    public void moveTo(int x, int y) {
        super.moveTo(x, y);
    }

    public void moveToOsi(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void move(int dx, int dy) {
        super.move(dx, dy);
    }

    public void moveToColor(String color) {
        this.color = color;
    }

    public void moveToName(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println("Для эллипса: ");
        super.draw();
        System.out.print("Полуоси: ");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Цвет: " + color);
    }

    public String getColor() {
        return this.color;
    }

    public String getName() {
        return this.name;
    }
}
