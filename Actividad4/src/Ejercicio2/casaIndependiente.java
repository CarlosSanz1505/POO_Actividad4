package Ejercicio2;

public class casaIndependiente extends casaUrbana{
    // Atributo que identifica el valor por área de una casa independiente
    protected static double valorArea = 3000000;
    
    public casaIndependiente(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños, int númeroPisos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños, númeroPisos);
    }
    /**
    * Método que muestra en pantalla los datos de una casa independiente
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println();
    }
}
