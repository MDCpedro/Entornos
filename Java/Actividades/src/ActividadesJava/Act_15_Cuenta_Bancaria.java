package ActividadesJava;

import java.time.temporal.ChronoUnit;

public class Act_15_Cuenta_Bancaria {
    public static void main(String[] args) {
        Cuenta cuenta1 = new Cuenta("Pedro", "353425", 21, 2);




        };

    public static class Cuenta {
        String nombre_cliente;
        String numero_cuenta;
        double tipo_interes;
        double saldo;

        public Cuenta(String nombre_cliente, String numero_cuenta, double tipo_interes, double saldo) {
            this.nombre_cliente = nombre_cliente;
            this.numero_cuenta = numero_cuenta;
            this.tipo_interes = tipo_interes;
            this.saldo = saldo;
        }

        public String get_nombre_cliente() {
            return this.nombre_cliente;
        }
        public void set_nombre_cliente(String nuevo_nombre) {
            this.nombre_cliente = nuevo_nombre;
        }
        public String get_numero_cuenta() {
            return this.numero_cuenta;
        }
        public void set_numero_cuenta(String nuevo_numero) {
            this.numero_cuenta = nuevo_numero;
        }

        public double get_tipo_interes() {
            return this.tipo_interes;
        }
        public void set_tipo_interes(double nuevo_tipo_interes) {
            this.tipo_interes = nuevo_tipo_interes;
        }

        public double get_saldo() {
            return this.saldo;
        }
        public void set_saldo(double nuevo_saldo) {
            this.saldo = nuevo_saldo;
        }

        public boolean ingreso(double ingreso) {
            if (ingreso < 0) {
                return false;
            } else {
                this.saldo = saldo+ingreso;
                return true;
            }
        }
        public boolean reintegro(double pago) {
            if ((saldo-pago < 0)) {
                return false;
            } else {
                this.saldo = (saldo-pago);
                return true;
            }
        }

    }
}



