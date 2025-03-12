package geometria;

public abstract class Geometria2D {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
    public boolean esRegular() {
        return false;
    }
    public int obtenerNumeroLados() {
        return 0;
    }
    public String obtenerTipoFigura() {
        return "Figura 2D Genérica";
    }
}