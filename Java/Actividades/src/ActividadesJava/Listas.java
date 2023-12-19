package ActividadesJava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        int suma = 0;
        for (int i = 0; i < numeros.size(); i++) {
            Integer Numactual = numeros.get(i);

            if (Numactual % 2 == 0) {
                suma = suma + (Numactual * 2);
            } else {
                suma = suma + Numactual;
            }
        }


        // Punto 1
        List<String> listaDias = new ArrayList<>(Arrays.asList
                ("Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"));
        // Punto 2
        String DiaNuevo = "Juernes";
        listaDias.add(4, DiaNuevo);
        // Punto 3
        List<String> listaDiasCopia = new ArrayList<>(listaDias);
        // Punto 4
        listaDias.addAll(listaDiasCopia);
        // Punto 5
        String Dia_3 = listaDias.get(3);
        String Dia_4 = listaDias.get(4);
        System.out.println("Hoy es " + Dia_3 + " y " + Dia_4);
        // Punto 6
        String Dia_0 = listaDias.get(0);
        String Dia_Final = listaDias.get(listaDias.size() - 1);
        System.out.println("El primer dia es" + Dia_0 + " y el ultimo es " + Dia_Final);
        // Punto 7
        boolean borrado = false;
        for (int i = 0; i < (listaDiasCopia.size() - 1); i++) {
            String dia_actual = listaDiasCopia.get(i);
            if (dia_actual == "Juernes") {
                listaDiasCopia.remove(i);
                borrado = true;
            }
        }
        // Punto 8
        String dia_actual_2;
        for (int i2 = 0; i2 <= listaDiasCopia.size(); i2++) {
            dia_actual_2 = listaDias.get(i2);
            System.out.println(dia_actual_2);
        }
        // Punto 9 y 10
        String comprobar_lunes;
        for (int i3 = 0; i3 <= listaDiasCopia.size() - 1; i3++) {
            comprobar_lunes = listaDiasCopia.get(i3);
            if (comprobar_lunes == "Lunes" || comprobar_lunes == "lunes") {
                System.out.println("Se encuentra Lunes en la posicion " + i3);
            }
        }
        // Punto 11
        String dia_actual_3;
        for (int i4 = listaDias.size() - 1; i4 > 1; i4--) {
            dia_actual_3 = listaDias.get(i4);
            System.out.println(dia_actual_3);
        }
        // Punto 12
        listaDias.clear();
        System.out.println(listaDias);
    }
}
