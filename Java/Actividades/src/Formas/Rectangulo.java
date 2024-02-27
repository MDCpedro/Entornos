package Formas;

public class Rectangulo extends Figura {
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        this.altura = altura;
        this.base = base;
    }
    @Override
    public double calcularArea() {
        return base*altura;
    }
    public double calcularPerimetro() {
        return base+base+altura+altura;
    }
}
