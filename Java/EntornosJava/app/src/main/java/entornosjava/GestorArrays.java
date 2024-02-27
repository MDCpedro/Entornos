package entornosjava;

public class GestorArrays {
    
    public static void main(String[] args) {
        int numeros[] = {1, 2, 4, 5, 6, 8, 10, 20, 25, 30, 45, 70};
        comptarElements(numeros);
        
    }

    public static void comptarElements(int numeros[]) {
        for (int i  : numeros) {
            System.out.println(numeros[i]);
        }    
    }

    public static int retornarPrimer(int numeros[]) {
        return numeros[0];
    }

    public static int retornarUltim(int numeros[]) {
        return numeros[numeros.length];
    }

    public static int retornarTercer(int numeros[]) {
        return numeros[2];
    }

    public static int sumarElements(int numeros[]) {
        int suma = 0;
        for (int i  : numeros) {  
            suma = suma+numeros[i];
        }
        return suma;
    }
    
    public static int mitjanaElements(int numeros[]) {
        int media = sumarElements(numeros)/numeros.length;
        return media;
    }
}
