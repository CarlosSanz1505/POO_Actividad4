package test

import Ejercicio5.Ventana

object Ejercicio5Test {
    @JvmStatic
    fun run() {
        val miVentanaPrincipal = Ventana()
        miVentanaPrincipal.isVisible = true
    }
}