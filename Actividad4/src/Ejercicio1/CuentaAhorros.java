package Ejercicio1;

public class CuentaAhorros extends Cuenta {
    
    // Atributo
    private boolean activa;
    
    // Constructor
    public CuentaAhorros(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
        if (saldo >= 10000) {
            activa = true;
        } else {
            activa = false;
        }
    }
    
    // Métodos
    public void consignar(float cantidad) {
        if (activa == true) {
            super.consignar(cantidad);
        }
    }
    
    public void retirar(float cantidad) {
        if (activa == true) {
            super.retirar(cantidad);
        }
    }
    
    public void extractoMensual() {
        if (super.numeroRetiros > 4) {
            super.comisionMensual += 1000 * (super.numeroRetiros - 4);
        }
        
        // Se determina si la cuenta permanece activa o no
        if (saldo >= 10000) {
            activa = true;
        } else {
            activa = false;
        }
    }
    
    public void imprimir() {
        System.out.println("Saldo: " + super.saldo);
        System.out.println("Comisión mensual: " + super.comisionMensual);
        System.out.println("Número de transacciones: " +
                (numeroRetiros + numeroConsignaciones));
    }
}
