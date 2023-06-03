package Ejercicio5

import java.awt.Rectangle
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.DefaultListModel
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JList
import javax.swing.JOptionPane
import javax.swing.JScrollPane
import javax.swing.JTextField
import javax.swing.ListSelectionModel

class Ventana: JFrame(), ActionListener {
    private val contenedor = contentPane
    private val nombre = JLabel("Nombre:")
    private val campoNombre = JTextField()
    private val apellidos = JLabel("Apellidos:")
    private val campoApellidos = JTextField()
    private val teléfono = JLabel("Teléfono:")
    private val campoTelefono = JTextField()
    private val direccion = JLabel("Direccion:")
    private val campoDireccion = JTextField()
    private val anadir = JButton()
    private val eliminar = JButton("Eliminar")
    private val borrarLista = JButton()
    private val listaNombres = JList<String>()
    private val modelo = DefaultListModel<String>()
    private val scrollLista = JScrollPane()

    private val lista = ListaPersonas()

    init {
        inicio()
        title = "Personas"
        setSize(270, 350)
        setLocationRelativeTo(null)
        defaultCloseOperation = EXIT_ON_CLOSE
        isResizable = false
    }

    private fun inicio() {
        contenedor.layout = null
        nombre.bounds = Rectangle(20, 20, 135, 23)
        campoNombre.bounds = Rectangle(105, 20, 135, 23)
        apellidos.bounds = Rectangle(20, 50, 135, 23)
        campoApellidos.bounds = Rectangle(105, 50, 135, 23)
        teléfono.bounds = Rectangle(20, 80, 135, 23)
        campoTelefono.bounds = Rectangle(105, 80, 135, 23)
        direccion.bounds = Rectangle(20, 110, 135, 23)
        campoDireccion.bounds = Rectangle(105, 110, 135, 23)
        anadir.text = "Añadir"
        anadir.bounds = Rectangle(105, 150, 80, 23)
        anadir.addActionListener(this)
        eliminar.bounds = Rectangle(20, 280, 80, 23)
        eliminar.addActionListener(this)
        borrarLista.text = "Borrar Lista"
        borrarLista.bounds = Rectangle(120, 280, 120, 23)
        borrarLista.addActionListener(this)
        listaNombres.selectionMode = ListSelectionModel.SINGLE_SELECTION
        scrollLista.bounds = Rectangle(20, 190 ,220, 80)
        scrollLista.setViewportView(listaNombres)

        contenedor.add(nombre)
        contenedor.add(campoNombre)
        contenedor.add(apellidos)
        contenedor.add(campoApellidos)
        contenedor.add(teléfono)
        contenedor.add(campoTelefono)
        contenedor.add(direccion)
        contenedor.add(campoDireccion)
        contenedor.add(anadir)
        contenedor.add(eliminar)
        contenedor.add(borrarLista)
        contenedor.add(scrollLista)
    }

    override fun actionPerformed(evento: ActionEvent?) {
        when(evento!!.source) {
            anadir -> anadirPersona()
            eliminar -> eliminarNombre(listaNombres.selectedIndex)
            borrarLista -> borrarLista()
        }
    }

    private fun anadirPersona() {
        val p = Persona(
            campoNombre.text,
            campoApellidos.text,
            campoTelefono.text,
            campoDireccion.text
        )
        lista.anadirPersona(p)
        val elemento = campoNombre.text + "-" + campoApellidos.text + "-" + campoTelefono.text + "-" + campoDireccion.text
        modelo.addElement(elemento)
        listaNombres.setModel(modelo)

        campoNombre.text = ""
        campoApellidos.text = ""
        campoTelefono.text = ""
        campoDireccion.text = ""
    }

    private fun eliminarNombre(indice: Int) {
        if (indice >= 0) {
            modelo.removeElementAt(indice)
            lista.eliminarPersona(indice)
        } else {
            JOptionPane.showMessageDialog(
                null,
                "Debe seleccionar un elemento",
                "Error",
                JOptionPane.ERROR_MESSAGE
            )
        }
    }

    private fun borrarLista() {
        lista.borrarLista()
        modelo.clear()
    }
}