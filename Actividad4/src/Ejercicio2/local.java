package Ejercicio2;

public class local extends inmuebles {
    enum tipo {INTERNO,CALLE}; /* Tipo de inmueble especificado como un valor enumerado */
    protected tipo tipoLocal; /* Atributo que identifica el tipo de inmueble */
    
    public local(int identificadorInmobiliario, int área, String dirección, tipo tipoLocal) {
        // Invoca al constructor de la clase padre
        super(identificadorInmobiliario, área, dirección);
        this.tipoLocal = tipoLocal;
    }
    /**
    * Método que muestra en pantalla los datos de un local
    */
    void imprimir() {
        super.imprimir(); // Invoca al método imprimir de la clase padre
        System.out.println("Tipo de local = " + tipoLocal);
    }
}
