package geometria;

import java.awt.Point;

public class Triangulo extends Geometria2D {
    private Point p1, p2, p3;

    public Triangulo(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public double calcularArea() {
        double lado1 = p1.distance(p2);
        double lado2 = p2.distance(p3);
        double lado3 = p3.distance(p1);
        double s = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }

    @Override
    public double calcularPerimetro() {
        double lado1 = p1.distance(p2);
        double lado2 = p2.distance(p3);
        double lado3 = p3.distance(p1);
        return lado1 + lado2 + lado3;
    }

    @Override
    public boolean esRegular() {
        double lado1 = p1.distance(p2);
        double lado2 = p2.distance(p3);
        double lado3 = p3.distance(p1);
        return (lado1 == lado2) && (lado2 == lado3);
    }

    @Override
    public int obtenerNumeroLados() {
        return 3;
    }

    @Override
    public String obtenerTipoFigura() {
        return "Triángulo";
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public Point getP3() {
        return p3;
    }
}