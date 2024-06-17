class Pais {
    var id: Int = 0
    var nombre: String? = null
    protected var departamentos: Array<Departamento?> = arrayOfNulls(MAX)
    protected var totalDepartamentos: Int = 0

    constructor()

    constructor(id: Int, nombre: String?) {
        this.id = id
        this.nombre = nombre
        departamentos = arrayOfNulls(MAX)
    }

    fun agregarDepartamento(id: Int, nombre: String?): Boolean {
        val departamento = Departamento(id, nombre, this)
        val isFull = totalDepartamentos == departamentos.size
        val duplicate = existeDepartamento(departamento)

        if (!duplicate) {
            if (isFull) {
                val tmp = arrayOfNulls<Departamento>(departamentos.size + departamentos.size / 2)
                for (i in departamentos.indices) {
                    tmp[i] = departamentos[i]
                }
                departamentos = tmp
            }
            departamentos[totalDepartamentos] = departamento
            totalDepartamentos++
        }
        return !duplicate
    }

    fun existeDepartamento(departamento: Departamento): Boolean {
        for (i in 0 until totalDepartamentos) {
            if (departamentos[i] == departamento) {
                return true
            }
        }
        return false
    }

    fun posicionDepartamento(departamento: Departamento): Int {
        for (i in 0 until totalDepartamentos) {
            if (departamentos[i] == departamento) {
                return i
            }
        }
        return -1
    }

    fun eliminarDepartamento(departamento: Departamento): Boolean {
        val p = posicionDepartamento(departamento)
        if (p != -1) {
            departamentos[p] = null
            for (i in p + 1 until totalDepartamentos) {
                departamentos[i - 1] = departamentos[i]
                departamentos[i] = null
            }
            totalDepartamentos--
            return true
        }
        return false
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Pais) return false
        return id == other.id || nombre == other.nombre
    }

    override fun toString(): String {
        return "$id - $nombre"
    }

    companion object {
        const val MAX = 10
    }
    fun obtenerDepartamentos(): Array<Departamento?> {
        return departamentos
    }

}
