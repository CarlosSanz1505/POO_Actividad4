package Ejercicio3.Animales

import Ejercicio3.Felino

class Gato: Felino() {
    override val nombreCientifico: String
        get() = "Felis silvestris catus"
    override val alimentos: String
        get() = "Ratones"
    override val habitat: String
        get() = "Doméstico"
    override val sonido: String
        get() = "Maullido"
}