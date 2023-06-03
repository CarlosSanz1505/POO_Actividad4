package Ejercicio4

import test.input
import test.output

class Equipo(private val nombre: String, private val pais: String) {
    companion object {
        @JvmStatic
        private var totalTiempo: Double = 0.0
    }
    private val listaCiclista = mutableListOf<Ciclista>()

    fun anadirCiclista(vararg ciclista: Ciclista) {
        listaCiclista += ciclista
    }

    fun listarEquipo() {
        for (ciclista in listaCiclista) {
            output(ciclista.nombre)
        }
    }

    fun buscarCiclista() {
        val nombreCiclista = input()
        for (ciclista in listaCiclista) {
            if (ciclista.nombre == nombreCiclista) output(ciclista.nombre)
        }
    }

    fun calcularTotalTiempo() {
        for (ciclista in listaCiclista) {
            totalTiempo += ciclista.tiempoAcumulado
        }
    }

    fun imprimir() {
        output("Nombre del equipo = $nombre")
        output("Pais = $pais")
        output("Total tiempo del equipo = $totalTiempo")
    }
}