package Ejercicio3.Animales

import Ejercicio3.Canido

class Lobo: Canido() {
    override val alimentos: String
        get() = "Carnívoro"
    override val sonido: String
        get() = "Aullido"
    override val habitat: String
        get() = "Bosque"
    override val nombreCientifico: String
        get() = "Canis lupus"
}