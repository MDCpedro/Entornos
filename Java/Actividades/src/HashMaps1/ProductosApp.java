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

        String linia = br.readLine();
        int contador = 0;
        while (linia != null) {
            String[] partesLinia = linia.split(", ");

            Producto producto = new Producto();

            producto.setCodigo(Integer.valueOf(partesLinia[0]));
            producto.setNombre(partesLinia[1]);
            producto.setPrecio(Double.valueOf(partesLinia[2]));

            inventario.put(Integer.valueOf(partesLinia[0]), producto);
            linia = br.readLine();
        }
        br.close();
        boolean salir = false;
        int opcion;
        int buscar_codigo;
        while (!salir) {
            System.out.println("Que te gustaria hacer?");
            System.out.println("0- Salir del programa.");
            System.out.println("1- Buscar un producto.");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Escribe el codigo del producto a buscar.");
                    buscar_codigo = scanner.nextInt();
                case 0:
                    salir = true;
            }
        }
    }
}
