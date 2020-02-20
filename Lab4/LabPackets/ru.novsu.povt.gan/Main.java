package ru.novsu.povt.gan;

import java.util.Scanner;

import ru.novsu.povt.gan.graphics.*;

public class Main {

    public static void main(String[] args) {
        Point point = new Point();
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте координаты точки: ");
        System.out.print("x = ");
        int x = scan.nextInt();
        System.out.print("y = ");
        int y = scan.nextInt();
        point.moveTo(x, y);
        point.draw();
        System.out.println("Задайте смещение точки: ");
        System.out.print("dx = ");
        int dx = scan.nextInt();
        System.out.print("dy = ");
        int dy = scan.nextInt();
        point.move(dx, dy);
        point.draw();

        Circle circle = new Circle();
        System.out.println("Задайте название окружности: ");
        System.out.print("name = ");
        String nameCircle = scan.next();
        circle.moveToName(nameCircle);
        System.out.println("Задайте радиус окружности: ");
        System.out.print("r = ");
        int r = scan.nextInt();
        circle.moveToRadius(r);
        circle.moveTo(x, y);
        circle.move(dx, dy);
        System.out.println("Задайте цвет окружности: ");
        System.out.print("color = ");
        String colorCircle = scan.next();
        circle.moveToColor(colorCircle);
        circle.draw();

        Ellipse ellipse = new Ellipse();
        System.out.println("Задайте название эллипса: ");
        System.out.print("name = ");
        String nameEllipse = scan.next();
        ellipse.moveToName(nameEllipse);
        System.out.println("Задайте полуоси эллипса: ");
        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        ellipse.moveToOsi(a, b);
        ellipse.moveTo(x, y);
        ellipse.move(dx, dy);
        System.out.println("Задайте цвет эллипса: ");
        System.out.print("Цвет эллипса: ");
        String colorEllipse = scan.next();
        ellipse.moveToColor(colorEllipse);
        ellipse.draw();

        Rectangle rectangle = new Rectangle();
        System.out.println("Задайте название прямоугольника: ");
        System.out.print("name = ");
        String nameRectangle = scan.next();
        rectangle.moveToName(nameRectangle);
        System.out.println("Задайте отрезки прямоугольника: ");
        System.out.print("A = ");
        int A = scan.nextInt();
        System.out.print("B = ");
        int B = scan.nextInt();
        rectangle.moveToOtr(A, B);
        rectangle.moveTo(x, y);
        rectangle.move(dx, dy);
        System.out.println("Задайте цвет прямоугольника: ");
        System.out.print("color = ");
        String colorRectangle = scan.next();
        rectangle.moveToColor(colorRectangle);
        rectangle.draw();

        Background background = new Background();
        System.out.println("Задайте координаты фона: ");
        System.out.print("ab = ");
        int ab = scan.nextInt();
        System.out.print("bc = ");
        int bc = scan.nextInt();
        System.out.print("cd = ");
        int cd = scan.nextInt();
        System.out.print("ad = ");
        int ad = scan.nextInt();
        background.moveTo(ab, bc, cd, ad);
        System.out.println("Задайте цвет фона: ");
        System.out.print("color = ");
        String colorBackground = scan.next();
        background.moveToColorBackground(colorBackground);
        background.getInfoCircle(colorCircle, nameCircle);
        background.getInfoEllipse(colorEllipse, nameEllipse);
        background.getInfoRectangle(colorRectangle, nameRectangle);
        background.draw();
    }
}
