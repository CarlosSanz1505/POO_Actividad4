package inmuebles;

public class casaUrbana extends casa {
    public casaUrbana(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños, int númeroPisos) {
    // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños, númeroPisos);
    }
    /**
    * Método que muestra en pantalla los datos de una casa urbana
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
    }
}
