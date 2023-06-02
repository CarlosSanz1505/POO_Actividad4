package test

import Ejercicio4.Ciclistas.ContraRelojista
import Ejercicio4.Ciclistas.Escalador
import Ejercicio4.Ciclistas.Velocista
import Ejercicio4.Equipo

object Ejercicio4Test {
    @JvmStatic
    fun run() {
        val equipo1 = Equipo("Sky", "Estados Unidos")
        val velocista1 = Velocista(123979, "Geraint Thomas", 320.0, 25.0)
        val escalador1 = Escalador(123980, "Egan Bernal", 25f, 10f)
        val contrarelojista1 = ContraRelojista(123981, "Jonathan Castroviejo", 120.0)

        equipo1.anadirCiclista(velocista1, escalador1, contrarelojista1)

        velocista1.tiempoAcumulado = 365.0
        escalador1.tiempoAcumulado = 385.0
        contrarelojista1.tiempoAcumulado = 370.0

        equipo1.calcularTotalTiempo()
        equipo1.imprimir()
        equipo1.listarEquipo()
    }
}