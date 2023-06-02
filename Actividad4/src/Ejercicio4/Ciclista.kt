package Ejercicio4

import test.output

abstract class Ciclista() {
    protected abstract var identificador: Int
    // Defaulteado a público para hacer el test fuera de la clase y subclases
    abstract val nombre: String
    abstract var tiempoAcumulado: Double

    protected abstract fun imprimirTipo(): String

    protected open fun imprimir() {
        output("Identificador = $identificador")
        output("Nombre = $nombre")
        output("Tiempo Acumulado = $tiempoAcumulado")
    }
}