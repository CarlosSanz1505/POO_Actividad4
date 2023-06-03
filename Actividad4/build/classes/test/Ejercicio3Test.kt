package test

import Ejercicio3.Animales.Gato
import Ejercicio3.Animales.Leon
import Ejercicio3.Animales.Lobo
import Ejercicio3.Animales.Perro

object Ejercicio3Test {
    @JvmStatic
    fun run() {
        val animales = arrayOf(
            Gato(),
            Perro(),
            Lobo(),
            Leon()
        )

        for (animal in animales) {
            output(animal.nombreCientifico)
            output("Sonido: ${animal.sonido}")
            output("Alimentos: ${animal.alimentos}")
            output("Habitat: ${animal.habitat}\n")
        }
    }
}