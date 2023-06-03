package Ejercicio3.Animales

import Ejercicio3.Felino

class Leon: Felino() {
    override val alimentos: String
        get() = "Carnívoro"
    override val sonido: String
        get() = "Rugido"
    override val habitat: String
        get() = "Praderas"
    override val nombreCientifico: String
        get() = "Panthera leo"
}