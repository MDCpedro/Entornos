package HashMaps1;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ProductosApp {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        HashMap<Integer, Producto> inventario = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        String path_absoluto = "C:\\Users\\alumne-DAM\\Documents\\EntornosyProgramacion\\EntornosyProgramacion\\Java\\Actividades\\src\\HashMaps1\\productos.txt";
        BufferedReader br = new BufferedReader(new FileReader(path_absoluto));

        String texto = br.readLine();
        while (texto != null) {
            String[] linia = texto.split(", ");

            System.out.println(linia[0]);
            System.out.println(linia[1]);
            System.out.println(linia[2]);
            texto = br.readLine();
        }
        boolean salir = false;
        int opcion;
        int buscar_codigo;
        while (salir == false) {
            System.out.println("Que te gustaria hacer?");
            System.out.println("0- Salir del programa.");
            System.out.println("1- Buscar un producto.");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Escribe el codigo del producto a buscar.");
                    buscar_codigo = scanner.nextInt()
            }


        }



    }
}
