import java.util.ArrayList

class Municipio {
    var id: Int = 0
    var nombre: String? = null
    var departamento: Departamento? = null
    var ciudadanos: ArrayList<Persona> = ArrayList()

    constructor()

    constructor(id: Int, nombre: String?, dpto: Departamento?) {
        this.id = id
        this.nombre = nombre
        this.departamento = dpto
        this.ciudadanos = ArrayList()
    }

    fun agregarPersona(cedula: Int, nombre: String?): Boolean {
        val persona = Persona(cedula, nombre)
        return if (!ciudadanos.contains(persona)) {
            ciudadanos.add(persona)
            true
        } else {
            false
        }
    }

    fun existeCiudadano(persona: Persona): Boolean {
        return ciudadanos.contains(persona)
    }

    fun eliminarPersona(persona: Persona): Boolean {
        return if (ciudadanos.contains(persona)) {
            ciudadanos.remove(persona)
            true
        } else {
            false
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Municipio) return false
        return id == other.id || nombre == other.nombre
    }

    override fun toString(): String {
        return "$id - $nombre"
    }
}

