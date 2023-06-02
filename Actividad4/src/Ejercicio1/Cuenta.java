package Ejercicio1;

public class Cuenta {
    
    // Atributos
    protected float saldo;
    protected int numeroConsignaciones = 0;
    protected int numeroRetiros = 0;
    protected float tasaAnual;
    protected float comisionMensual = 0;
    
    // Constructor
    public Cuenta(float saldo, float tasaAnual) {
        this.saldo = saldo;
        this.tasaAnual = tasaAnual;
    }
    
    // Métodos
    public void consignar(float cantidad) {
        saldo += cantidad;
        numeroConsignaciones += 1;
    }
    
    public void retirar(float cantidad) {
        if (cantidad > saldo) {
            System.out.println("La cantidad especificada supera el saldo\n");
        } else {
            saldo -= cantidad;
            numeroRetiros += 1;
        }
    }
    
    public void calcularInteres() {
        float interesMensual = saldo * (tasaAnual / 12) / 100;
        saldo += interesMensual;
    }
    
    public void extractoMensual() {
        saldo -= comisionMensual;
        calcularInteres();
    }
    
    public void imprimir() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Número de consignaciones: " + numeroConsignaciones);
        System.out.println("Número de retiros: " + numeroRetiros);
        System.out.println("Tasa anual: " + tasaAnual + "%");
        System.out.println("Comisión mensual: " + comisionMensual);
    }
}
