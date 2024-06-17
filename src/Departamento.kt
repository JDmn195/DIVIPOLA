class Departamento {
    var id: Int = 0
    var nombre: String? = null
    var n: Int = 0
    var municipios: Array<Municipio?> = arrayOfNulls(10)
    var pais: Pais? = null

    constructor()

    constructor(id: Int, nombre: String?, pais: Pais?) {
        this.id = id
        this.nombre = nombre
        this.pais = pais
        municipios = arrayOfNulls(10)
    }

    fun agregarMunicipio(id: Int, nombre: String?): Boolean {
        val municipio = Municipio(id, nombre, this)

        val isFull = n == municipios.size
        val duplicate = existeMunicipio(municipio)

        if (!duplicate) {
            if (isFull) {
                val tmp = arrayOfNulls<Municipio>(municipios.size + municipios.size / 2)
                for (i in municipios.indices) {
                    tmp[i] = municipios[i]
                }
                municipios = tmp
            }
            municipios[n] = municipio
            n++
        }
        return !duplicate
    }

    fun existeMunicipio(municipio: Municipio): Boolean {
        return posicionMunicipio(municipio) != -1
    }

    fun posicionMunicipio(municipio: Municipio): Int {
        var p = -1
        for (i in 0 until n) {
            if (municipios[i] == municipio) {
                p = i
                break
            }
        }
        return p
    }

    fun eliminarMunicipio(municipio: Municipio): Boolean {
        val p = posicionMunicipio(municipio)
        val existe = existeMunicipio(municipio) && p != -1
        if (existe) {
            municipios[p] = null
            for (i in p + 1 until n) {
                municipios[i - 1] = municipios[i]
                municipios[i] = null
            }
            n--
        }
        return existe
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Departamento) return false
        return id == other.id || nombre == other.nombre
    }

    override fun toString(): String {
        return "$id - $nombre"
    }
    fun obtenerMunicipios(): Array<Municipio?> {
        return municipios
    }

}
