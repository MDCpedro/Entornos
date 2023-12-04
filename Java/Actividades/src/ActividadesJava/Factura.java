package ActividadesJava;

public class Factura {
    private int codigo;
    private double coste;

    public static void main(String[] args) {
        Factura facturaNueva = new Factura(120,4123);
        facturaNueva.imprimir();
    }

    public Factura(double coste, int codigo) {
        this.coste = coste;
        this.codigo = codigo;
    }

    public void imprimir() {
        double costetotal = coste*1.21;
        System.out.println("Codigo de la factura: #"+codigo);
        System.out.println("Coste total con IVA: "+costetotal+ " €");
    }
}
