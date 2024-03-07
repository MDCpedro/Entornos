package HashMaps1;

public class Producto {
    String nombre;
    int codigo;
    double precio;

    public Producto(String nombre, int codigo, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.precio = precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getCodigo() {
        return codigo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public double getPrecio() {
        return precio;
    }
}
