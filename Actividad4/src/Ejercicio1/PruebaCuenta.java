package Ejercicio1;

import java.util.Scanner;

public class PruebaCuenta {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Se ha generado una nueva Cuenta de Ahorros");
        
        System.out.println("Ingrese el saldo inicial de la cuenta:");
        float saldoInicial = input.nextFloat();
        System.out.println("Ahora ingrese la tasa anual de la cuenta:");
        float tasaAnualInicial = input.nextFloat();
        
        CuentaAhorros ca = new CuentaAhorros(saldoInicial, tasaAnualInicial);
        
        System.out.println("¿Cuanto desea consignar?");
        ca.consignar(input.nextFloat());
        System.out.println("¿Cuanto desea retirar?");
        ca.retirar(input.nextFloat());
        System.out.println("Estado de la cuenta:");
        ca.calcularInteres();
        ca.extractoMensual();
        ca.imprimir();
    }
    
}
