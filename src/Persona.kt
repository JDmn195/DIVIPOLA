class Persona {
    var cedula: Int = 0
    var nombre: String? = null

    constructor()

    constructor(cedula: Int, nombre: String?) {
        this.cedula = cedula
        this.nombre = nombre
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Persona) return false
        return cedula == other.cedula || nombre == other.nombre
    }

    override fun toString(): String {
        return "$cedula - $nombre"
    }
}
