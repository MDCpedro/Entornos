package act_3;

public class Matrices {
    public static void main(String[] args) {
        int[][] matriz = {
            {4, 7, 2},
            {1, 9, 3},
            {5, 6, 10}};
        int suma = 0;
        int contadorH = 0;
        int contadorV = 0;
        while (contadorV < matriz.length) {
            suma = suma+matriz[contadorV][contadorH];
            contadorH++;
            if (contadorH == matriz[0].length) {
                contadorH = 0;
                contadorV++;
            } 

        }
        System.out.println(suma);
    }
}
