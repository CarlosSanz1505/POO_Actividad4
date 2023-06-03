package Ejercicio4.Ciclistas

import Ejercicio4.Ciclista
import test.output

class ContraRelojista(
    override var identificador: Int,
    override val nombre: String,
    private var velocidadMaxima: Double
): Ciclista() {

    override var tiempoAcumulado: Double = 0.0

    override fun imprimir() {
        super.imprimir()
        output("Aceleracion promedio = $velocidadMaxima")
    }

    override fun imprimirTipo(): String {
        return "Es un contrarrelojista"
    }
}