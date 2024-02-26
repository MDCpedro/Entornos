package Vehiculo;

public class VehiculosApp {
    public static void main(String[] args) {
        Coche coche1 = new Coche(3, "HFU24");
        Moto moto1 = new Moto("JFE31");
        System.out.println("Informacion del Coche: "+coche1.toString());
        System.out.println("Informacion de la moto: "+moto1.toString());
    }
}
