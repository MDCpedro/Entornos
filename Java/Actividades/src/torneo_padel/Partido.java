package torneo_padel;

public class Partido {

    private  Integer id;

    private Pareja pareja1;
    private Pareja pareja2;

    private String resultado;
    private Pareja ganadores;
    private Integer ronda;

    public Partido(Integer id, Pareja pareja1, Pareja pareja2, String resultado, Pareja ganadores, Integer ronda) {
        this.id = id;
        this.pareja1 = pareja1;
        this.pareja2 = pareja2;
        this.resultado = resultado;
        this.ganadores = ganadores;
        this.ronda = ronda;
    }
}


