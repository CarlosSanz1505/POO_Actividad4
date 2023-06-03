package Ejercicio4.Ciclistas

import Ejercicio4.Ciclista
import test.output

class Escalador(
    override var identificador: Int,
    override val nombre: String,
    private var aceleracionPromedioEnSubida: Float,
    private var gradoDeRampaSoportado: Float
): Ciclista() {

    override var tiempoAcumulado: Double = 0.0

    override fun imprimir() {
        super.imprimir()
        output("Aceleracion promedio = $aceleracionPromedioEnSubida")
        output("Grado de rampa = $gradoDeRampaSoportado")
    }

    override fun imprimirTipo(): String {
        return "Es un escalador"
    }
}