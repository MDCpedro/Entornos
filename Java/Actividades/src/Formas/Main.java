package Formas;

public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(6);
        Cuadrado cuadrado = new Cuadrado(9);
        Rectangulo rectangulo = new Rectangulo(20, 7);

        System.out.println("CIRCULO: ");
        System.out.println("AREA: "+circulo.calcularArea());
        System.out.println("PERIMETRO: "+circulo.calcularPerimetro());

        System.out.println("CUADRADO: ");
        System.out.println("AREA: "+cuadrado.calcularArea());
        System.out.println("PERIMETRO: "+cuadrado.calcularPerimetro());

        System.out.println("RECTANGULO: ");
        System.out.println("AREA: "+rectangulo.calcularArea());
        System.out.println("PERIMETRO: "+rectangulo.calcularPerimetro());
    }
}
