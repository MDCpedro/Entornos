package ActividadesJava;

public class Circulo {
        private double radio = 1;
        private String color = "Rojo";

        public Circulo() {
        }

        public void RadioCirculo(double radio) {
            this.radio = radio;
        }

        public double getArea() {
            double area = 3.14*(radio*radio);
            return area;}

}
