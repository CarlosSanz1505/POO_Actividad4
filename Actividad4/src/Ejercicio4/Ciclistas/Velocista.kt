package Ejercicio4.Ciclistas

import Ejercicio4.Ciclista
import test.output

class Velocista(
    override var identificador: Int,
    override val nombre: String,
    private var potenciaPromedio: Double,
    private var velocidadPromedio: Double
    ): Ciclista() {

    override var tiempoAcumulado: Double = 0.0

    override fun imprimir() {
        super.imprimir()
        output("Potencia promedio = $potenciaPromedio")
        output("Velocidad promedio = $velocidadPromedio")
    }

    override fun imprimirTipo(): String {
        return "Es un velocista"
    }
}