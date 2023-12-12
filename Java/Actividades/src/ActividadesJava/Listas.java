package ActividadesJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int suma = 0;
        for(int i = 0; i<numeros.size(); i++) {
        Integer Numactual = numeros.get(i);

        if(Numactual%2 == 0) {
            suma = suma+(Numactual*2);
        } else {
            suma = suma + Numactual;
        }
        }
    }

}
