class Divipola {

    var paises: ArrayList<Pais> = ArrayList()

    constructor()

    fun agregarPais(id: Int, nombre: String): Boolean {
        val pais = Pais()
        pais.id = id
        pais.nombre = nombre
        val duplicate = existePais(pais)
        if (!duplicate) {
            paises.add(pais)
            return true
        }
        return false
    }

    fun existePais(pais: Pais): Boolean {
        return paises.contains(pais)
    }

    fun eliminarPais(pais: Pais): Boolean {
        val exists = existePais(pais)
        if (exists) {
            paises.remove(pais)
            return true
        }
        return false
    }
    fun obtenerPaises(): ArrayList<Pais> {
        return this.paises
    }

}
