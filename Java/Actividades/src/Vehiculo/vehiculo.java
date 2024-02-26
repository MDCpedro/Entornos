package Vehiculo;

public abstract class vehiculo {
    private int ruedas;
    private String matricula;

    public vehiculo(int ruedas, String matricula) {
        this.ruedas = ruedas;
        this.matricula = matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getMatricula() {
        return matricula;
    }

    public int getRuedas() {
        return ruedas;
    }
    public void setRuedas(int ruedas) {
        this.ruedas = ruedas;
    }


}
