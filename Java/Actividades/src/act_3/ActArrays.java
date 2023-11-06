package act_3;

public class ActArrays {
    public static void main(String[] args) {
        int[]numero = {1, 2, 4, 6, 8, 23};
        int contador = 0;
        
        while (contador<numero.length) {
            int multip = numero[contador] * 2;
            System.out.println(multip);
            contador++;
        }

        
    }
}
