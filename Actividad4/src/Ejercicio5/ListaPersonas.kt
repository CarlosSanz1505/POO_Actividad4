package Ejercicio5

class ListaPersonas {
    val listaPersonas = mutableListOf<Persona>()

    fun anadirPersona(persona: Persona) = listaPersonas.add(persona)
    fun eliminarPersona(i: Int) = listaPersonas.removeAt(i)
    fun borrarLista() = listaPersonas.clear()
}