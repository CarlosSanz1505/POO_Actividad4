package inmuebles;

public class prueba {
    public static void main(String args[]) {
    apartamentoFamiliar apto1 = new apartamentoFamiliar(103067,120, "Avenida Santander 45-45",3,2,200000);
    System.out.println("Datos apartamento");
    apto1.calcularPrecioVenta(apto1.valorArea);
    apto1.imprimir();
    
    System.out.println("Datos apartamento");
    apartaestudio aptestudio1 = new apartaestudio(12354,50,"Avenida Caracas 30-15",1,1);
    aptestudio1.calcularPrecioVenta(aptestudio1.valorArea);
    aptestudio1.imprimir();
    }
}
