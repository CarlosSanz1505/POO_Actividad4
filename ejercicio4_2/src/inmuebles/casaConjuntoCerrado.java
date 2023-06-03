package inmuebles;

public class casaConjuntoCerrado extends casaUrbana {
    // Atributo que define el valor por área de una casa en conjunto cerrado
    protected static double valorArea = 2500000;
    /* Atributo que define el valor de administración de una casa en
    conjunto cerrado */
    protected int valorAdministración;
    // Atributo que define si una casa en conjunto cerrado tiene piscina
    protected boolean tienePiscina;
    /* Atributo que define si una casa en conjunto cerrado tiene campos
    deportivos */
    protected boolean tieneCamposDeportivos;
    
    public casaConjuntoCerrado(int identificadorInmobiliario, int área, String dirección, int númeroHabitaciones, int númeroBaños, int númeroPisos, int valorAdministración, boolean tienePiscina, boolean tieneCamposDeportivos) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección, númeroHabitaciones, númeroBaños, númeroPisos);
        this.valorAdministración = valorAdministración;
        this.tienePiscina = tienePiscina;
        this.tieneCamposDeportivos = tieneCamposDeportivos;
    }
    /**
    * Método que muestra en pantalla los datos de una casa en conjunto
    * cerrado
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Valor de la administración = " +valorAdministración); 
        System.out.println("Tiene piscina? = " + tienePiscina);
        System.out.println("Tiene campos deportivos? = " + tieneCamposDeportivos);
        System.out.println();
        }
    }
