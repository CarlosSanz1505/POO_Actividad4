package Ejercicio1;

public class CuentaCorriente extends Cuenta {
    
    // Atributo
    float sobregiro = 0;
    
    // Constructor
    public CuentaCorriente(float saldo, float tasaAnual) {
        super(saldo, tasaAnual);
    }
    
    // Métodos
    public void retirar(float cantidad) {
        if (cantidad <= saldo) {
            super.retirar(cantidad);
        } else {
            saldo = 0;
            sobregiro = cantidad - saldo;
        }
    }
    
    public void consignar(float cantidad) {
        if (cantidad >= sobregiro) {
            sobregiro = 0;
            super.consignar(cantidad - sobregiro);
        } else {
            sobregiro -= cantidad;
        }
    }
    
    public void extractoMensual() {
        super.extractoMensual();
    }
    
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Comisión mensual: " + comisionMensual);
        System.out.println("Número de transacciones: " +
                numeroConsignaciones + numeroRetiros);
        System.out.println("Valor de sobregiro: " + sobregiro);
    }
}
