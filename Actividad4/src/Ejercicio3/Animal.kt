package Ejercicio3

abstract class Animal {
    // En kotlin cuando se crea una variable, internamente existen getters y setters
    // Además existe la posibilidad de crear campos abstractos
    abstract val nombreCientifico: String
    abstract val sonido: String
    abstract val alimentos: String
    abstract val habitat: String
}