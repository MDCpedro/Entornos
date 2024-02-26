package Formas;

public class Cuadrado extends Figura {
    private int lado;
    public Cuadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }
    public double calcularPerimetro() {
        return lado*4;
    }
}
