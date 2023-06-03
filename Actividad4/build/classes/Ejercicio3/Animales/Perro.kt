package Ejercicio3.Animales

import Ejercicio3.Canido

class Perro: Canido() {
    override val nombreCientifico: String
        get() = "Canis lupus familiaris"
    override val alimentos: String
        get() = "Carnívoro"
    override val habitat: String
        get() = "Doméstico"
    override val sonido: String
        get() = "Ladrido"
}