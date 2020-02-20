package ru.novsu.povt.gan.graphics;

public class Rectangle extends Point {
    private int A;
    private int B;

    private String color;
    private String name;

    public  Rectangle() {

    }

    @Override
    public void moveTo(int x, int y) {
        super.moveTo(x, y);
    }

    public void moveToOtr(int A, int B) {
        this.A = A;
        this.B = B;
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
        System.out.println("Для прямоугольника: ");
        super.draw();
        System.out.print("Отрезки: ");
        System.out.println("A = " + A + ", B = " + B);
        System.out.println("Цвет: " + color);
    }

    public String getColor() {
        return this.color;
    }

    public String getName() {
        return this.name;
    }
}
