package ru.novsu.povt.gan.graphics;

public class Background extends Graph {
    private int ab;
    private int bc;
    private int cd;
    private int ad;

    private  String colorBackground;

    private String colorCircle;
    private String nameCircle;

    private String colorEllipse;
    private String nameEllipse;

    private String colorRectangle;
    private String nameRectangle;

    public Background() {

    }

    public void getInfoCircle(String colorCircle, String nameCircle) {
        this.colorCircle = colorCircle;
        this.nameCircle = nameCircle;
    }

    public void getInfoEllipse(String colorEllipse, String nameEllipse) {
        this.colorEllipse = colorEllipse;
        this.nameEllipse = nameEllipse;
    }

    public  void getInfoRectangle(String colorRectangle, String nameRectangle) {
        this.colorRectangle = colorRectangle;
        this.nameRectangle = nameRectangle;
    }

    public void moveTo(int ab, int bc, int cd, int ad) {
        this.ab = ab;
        this.bc = bc;
        this.cd = cd;
        this.ad = ad;
    }

    @Override
    public void draw() {
        System.out.print("Фон: ");
        System.out.println("ab = " + ab + ", bc = " + bc + ", cd = " + cd + ", ad = " + ad);
        System.out.println("Цвет фона: " + colorBackground);
        System.out.println(nameCircle + ": цвет - " + colorCircle);
        System.out.println(nameEllipse + ": цвет - " + colorEllipse);
        System.out.println(nameRectangle + ": цвет - " + colorRectangle);
    }

    public void moveToColorBackground (String colorBackground) {
        this.colorBackground = colorBackground;
    }
}
