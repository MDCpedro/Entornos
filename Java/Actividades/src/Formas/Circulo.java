package Formas;

public class Circulo extends Figura {
    private int radio;

    public Circulo(int radio) {
      this.radio = radio;
    }
    @Override
    public double calcularArea() {
        return 3.14 * (radio*radio);
    }

    public double calcularPerimetro() {
        return 2*3.14*radio;
    }

}

