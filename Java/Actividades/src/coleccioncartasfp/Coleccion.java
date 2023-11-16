package coleccioncartasfp;

public class Coleccion {

    public Superheroe[] superheroes;
    public String propietario;
    public String fecha;

    /* Constructor vacio */
    public Coleccion(){
    }

    //Metodos de nuestra coleccion:

    /**
     * Pinta la info de todos los heroes.
     */
    public void pintarInfColeccion(){
        int i = 0;
        while(i < superheroes.length){
            superheroes[i].pintarInformacion();
            i++;
        }
    }

    /**
     * Pinta la info de todos los heroes con mas
     * fuerza que el valor de @fuerza.
     * @param fuerza
     */
    public void pintarInfColeccion(int fuerza){
        int i = 0;
        while(i < superheroes.length){
            if(superheroes[i].fuerza > fuerza){
                superheroes[i].pintarInformacion();
            }

            i++;
        }
    }
}