package InterficiesAnimales;

public class Leon extends Animal implements Carnivoro {

    public Leon(String nombre, int edad, int peso) {
        super(nombre, edad, peso);
    }

    @Override
    public void Alimentar(Carne carne) {
        System.out.println("El leon esta comiendo: "+carne);
    }
}
