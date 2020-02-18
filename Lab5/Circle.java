package com.company;

public class Circle extends Point {
    private int r;
    private String color;
    private String name;

    public Circle() {

    }

    @Override
    public void moveTo(int x, int y) {
        super.moveTo(x, y);
    }

    public void moveToRadius(int r) {
        this.r = r;
    }

    public void moveToColor(String color) {
        this.color = color;
    }

    public void moveToName(String name) {
        this.name = name;
    }

    @Override
    public void move(int dx, int dy) {
        super.move(dx, dy);
    }

    @Override
    public void draw() {
        System.out.println("Для круга: ");
        super.draw();
        System.out.print("Радиус: ");
        System.out.println("r = " + r);
        System.out.println("Цвет: " + color);
    }

    public String getColor() {
        return this.color;
    }

    public String getName() {
        return this.name;
    }
}
