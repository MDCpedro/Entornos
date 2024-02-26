package Vehiculo;

public class Moto extends vehiculo {

    public Moto(String matricula) {
        super(2, matricula);
    }
    @Override
    public String toString() {
        return "MATRICULA: "+getMatricula()+" Nº RUEDAS: "+getRuedas();
    }
}
