import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.*
import javafx.scene.control.cell.PropertyValueFactory
import java.net.URL
import java.util.*


class ControllerDivipola {

    @FXML
    private lateinit var resources: ResourceBundle

    @FXML
    private lateinit var location: URL

    @FXML
    private lateinit var cboDepartamentoM: ComboBox<Departamento>

    @FXML
    private lateinit var cboDepartamentoP: ComboBox<Departamento>

    @FXML
    private lateinit var cboPaisD: ComboBox<Pais>

    @FXML
    private lateinit var cboPaisM: ComboBox<Pais>

    @FXML
    private lateinit var cboPaisP: ComboBox<Pais>

    @FXML
    private lateinit var cmbMunicipioP: ComboBox<Municipio>

    @FXML
    private lateinit var cmdAgregarD: Button

    @FXML
    private lateinit var cmdAgregarM: Button

    @FXML
    private lateinit var cmdAgregarP: Button

    @FXML
    private lateinit var cmdEliminarD: Button

    @FXML
    private lateinit var cmdEliminarM: Button

    @FXML
    private lateinit var cmdEliminarP: Button

    @FXML
    private lateinit var lblCedula: Label

    @FXML
    private lateinit var lblDepartamento: Label

    @FXML
    private lateinit var lblDepartamentoM: Label

    @FXML
    private lateinit var lblIDD: Label

    @FXML
    private lateinit var lblIDM: Label

    @FXML
    private lateinit var lblIDP: Label

    @FXML
    private lateinit var lblMunicipio: Label

    @FXML
    private lateinit var lblNombre: Label

    @FXML
    private lateinit var lblNombreD: Label

    @FXML
    private lateinit var lblNombreM: Label

    @FXML
    private lateinit var lblNombreP: Label

    @FXML
    private lateinit var lblPais: Label

    @FXML
    private lateinit var lblPaisD: Label

    @FXML
    private lateinit var lblPaisM: Label

    @FXML
    private lateinit var tabDepartamentos: Tab

    @FXML
    private lateinit var tabMunicipios: Tab

    @FXML
    private lateinit var tabPais: Tab

    @FXML
    private lateinit var tabPersona: Tab

    @FXML
    private lateinit var tableDepartamentos: TableView<Departamento>

    @FXML
    private lateinit var tableMunicipio: TableView<Municipio>

    @FXML
    private lateinit var tablePaises: TableView<Pais>

    @FXML
    private lateinit var tablePersonas: TableView<Persona>
    @FXML
    private lateinit var txtCedula: TextField

    @FXML
    private lateinit var txtIDD: TextField

    @FXML
    private lateinit var txtIDM: TextField

    @FXML
    private lateinit var txtIDP: TextField

    @FXML
    private lateinit var txtNombre: TextField

    @FXML
    private lateinit var txtNombreD: TextField

    @FXML
    private lateinit var txtNombreM: TextField

    @FXML
    private lateinit var txtNombreP: TextField


    private val paises: ObservableList<Pais> = FXCollections.observableArrayList()
    private val departamentos: ObservableList<Departamento> = FXCollections.observableArrayList()
    private val municipios: ObservableList<Municipio> = FXCollections.observableArrayList()
    private val personas: ObservableList<Persona> = FXCollections.observableArrayList()
    lateinit var divipola:Divipola


    @FXML
    fun initialize() {
        assert(cboDepartamentoM != null) { "fx:id=\"cboDepartamentoM\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(cboDepartamentoP != null) { "fx:id=\"cboDepartamentoP\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(cboPaisD != null) { "fx:id=\"cboPaisD\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(cboPaisM != null) { "fx:id=\"cboPaisM\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(cboPaisP != null) { "fx:id=\"cboPaisP\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(cmbMunicipioP != null) { "fx:id=\"cmbMunicipioP\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(cmdAgregarD != null) { "fx:id=\"cmdAgregarD\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(cmdAgregarM != null) { "fx:id=\"cmdAgregarM\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(cmdAgregarP != null) { "fx:id=\"cmdAgregarP\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(cmdEliminarD != null) { "fx:id=\"cmdEliminarD\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(cmdEliminarM != null) { "fx:id=\"cmdEliminarM\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(cmdEliminarP != null) { "fx:id=\"cmdEliminarP\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(lblCedula != null) { "fx:id=\"lblCedula\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(lblDepartamento != null) { "fx:id=\"lblDepartamento\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(lblDepartamentoM != null) { "fx:id=\"lblDepartamentoM\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(lblIDD != null) { "fx:id=\"lblIDD\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(lblIDM != null) { "fx:id=\"lblIDM\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(lblIDP != null) { "fx:id=\"lblIDP\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(lblMunicipio != null) { "fx:id=\"lblMunicipio\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(lblNombre != null) { "fx:id=\"lblNombre\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(lblNombreD != null) { "fx:id=\"lblNombreD\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(lblNombreM != null) { "fx:id=\"lblNombreM\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(lblNombreP != null) { "fx:id=\"lblNombreP\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(lblPais != null) { "fx:id=\"lblPais\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(lblPaisD != null) { "fx:id=\"lblPaisD\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(lblPaisM != null) { "fx:id=\"lblPaisM\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(tabDepartamentos != null) { "fx:id=\"tabDepartamentos\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(tabMunicipios != null) { "fx:id=\"tabMunicipios\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(tabPais != null) { "fx:id=\"tabPais\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(tabPersona != null) { "fx:id=\"tabPersona\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(tableDepartamentos != null) { "fx:id=\"tableDepartamentos\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(tableMunicipio != null) { "fx:id=\"tableMunicipio\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(tablePaises != null) { "fx:id=\"tablePaises\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }
        assert(tablePersonas != null) { "fx:id=\"tablePersonas\" was not injected: check your FXML file 'ControllerDivipola.fxml'." }

        divipola = Divipola()
        val colIDP = TableColumn<Pais, String>("ID")
        colIDP.minWidth = 75.0
        colIDP.setCellValueFactory(PropertyValueFactory("id"))

        val colNombreD = TableColumn<Pais, String>("NOMBRE")
        colNombreD.minWidth = 524.0
        colNombreD.setCellValueFactory(PropertyValueFactory("nombre"))

        tablePaises.columns.clear()
        tablePaises.columns.addAll(colIDP, colNombreD)
        tablePaises.items = paises

        cboPaisD.items = paises
        cboPaisM.items = paises
        cboPaisP.items = paises

        val colIDd = TableColumn<Departamento, String>("ID")
        colIDd.minWidth = 75.0
        colIDd.setCellValueFactory(PropertyValueFactory("id"))

        val colNombred = TableColumn<Departamento, String>("NOMBRE")
        colNombred.minWidth = 524.0
        colNombred.setCellValueFactory(PropertyValueFactory("nombre"))

        tableDepartamentos.columns.clear()
        tableDepartamentos.columns.addAll(colIDd, colNombred)
        tableDepartamentos.items = departamentos

        cboDepartamentoP.items = departamentos
        cboDepartamentoM.items = departamentos

        val colIDm = TableColumn<Municipio, String>("ID")
        colIDm.minWidth = 75.0
        colIDm.setCellValueFactory(PropertyValueFactory("id"))

        val colNombrem = TableColumn<Municipio, String>("NOMBRE")
        colNombrem.minWidth = 524.0
        colNombrem.setCellValueFactory(PropertyValueFactory("nombre"))

        tableMunicipio.columns.clear()
        tableMunicipio.columns.addAll(colIDm, colNombrem)
        tableMunicipio.items = municipios

        val colCedula = TableColumn<Persona, String>("Cédula")
        colCedula.minWidth = 75.0
        colCedula.setCellValueFactory(PropertyValueFactory("cedula"))

        val colNombreP = TableColumn<Persona, String>("Nombre")
        colNombreP.minWidth = 524.0
        colNombreP.setCellValueFactory(PropertyValueFactory("nombre"))

        tablePersonas.columns.clear()
        tablePersonas.columns.addAll(colCedula, colNombreP)
        tablePersonas.items = personas
    }

    @FXML
    fun AgregarDepartamento(event: ActionEvent) {
        var alert: Alert? = null
        var aviso: String? = null
        val d = Departamento()
        try {
            val id = txtIDD.text.toInt()
            val nombre = txtNombreD.text
            d.id = id
            d.nombre = nombre
            if (paises.size == 0) throw Exception("No existen ningún pais ;(")
            else if (departamentos.contains(d)) throw Exception("El departamento ya existe ;(")
            val i = cboPaisD.selectionModel.selectedIndex
            divipola.paises[i].agregarDepartamento(id, nombre)
            departamentos.add(d)
            tableDepartamentos.selectionModel.select(d)
        } catch (e: Exception) {
            aviso = "Error al agregar Departamento: " + e.message
            alert = Alert(Alert.AlertType.ERROR, aviso, ButtonType.OK)
            alert.showAndWait()
        }
    }

    @FXML
    fun EliminarPersona(event: ActionEvent) {
        val p = tablePersonas.selectionModel.selectedItem
        divipola.obtenerPaises()[cboPaisD.selectionModel.selectedIndex]
            .obtenerDepartamentos()[cboDepartamentoM.selectionModel.selectedIndex]
            ?.obtenerMunicipios()?.get(cmbMunicipioP.selectionModel.selectedIndex)
            ?.eliminarPersona(p)
        personas.remove(p)
    }
    @FXML
    fun AgregarMunicipio(event: ActionEvent) {
        var alert: Alert? = null
        var aviso: String? = null
        val m = Municipio()
        try {
            val m = Municipio(txtIDM.text.toInt(),txtNombreM.text,null)
            if (municipios.contains(m)) throw Exception("El pais ya existe ;(")
            val p = cboPaisM.selectionModel.selectedIndex
            val numDpto = cboDepartamentoM.selectionModel.selectedIndex
            divipola.obtenerPaises()[p].obtenerDepartamentos()[numDpto]?.agregarMunicipio(txtIDM.text.toInt(), txtNombreM.text)
            municipios.add(m)
            tableMunicipio.selectionModel.select(m)
        } catch (e: Exception) {
            aviso = "Error al agregar Municipio: " + e.message
            alert = Alert(Alert.AlertType.ERROR, aviso, ButtonType.OK)
            alert.showAndWait()
        }

    }
    @FXML
    fun AgregarPersona(event: ActionEvent?) {
        var alert: Alert? = null
        var aviso: String? = null
        val p = Persona()
        val numDpto = cboDepartamentoP.selectionModel.selectedIndex
        val numMuni = cmbMunicipioP.selectionModel.selectedIndex
        try {
            val cedula = txtCedula.text.toInt()
            val nombre = txtNombre.text
            p.cedula = cedula
            p.nombre = nombre
           // if (municipios.contains(p)) throw java.lang.Exception("La persona ya existe ;(")
            personas.add(p)
            divipola.obtenerPaises()[cboPaisM.selectionModel.selectedIndex].obtenerDepartamentos()[numDpto]!!.obtenerMunicipios()[numMuni]!!
                .agregarPersona(cedula, nombre)
            tablePersonas.selectionModel.select(p)
        } catch (e: java.lang.Exception) {
            aviso = "Error al agregar Persona: " + e.message //"Debe seleccionar un elemento para eliminar...";
            alert = Alert(Alert.AlertType.ERROR, aviso, ButtonType.OK)
            alert.showAndWait()
        }
    }
    @FXML
    fun EliminarDepartamento(event: ActionEvent) {
        val d: Departamento = tableDepartamentos.selectionModel.selectedItem
        divipola.paises[cboPaisD.selectionModel.selectedIndex].eliminarDepartamento(d)
        departamentos.remove(d)
    }
    @FXML
    fun EliminarMunicipio(event: ActionEvent?) {
        val m = tableMunicipio.selectionModel.selectedItem
        divipola.obtenerPaises()[cboPaisM.selectionModel.selectedIndex].obtenerDepartamentos()[cboDepartamentoM.selectionModel.selectedIndex]!!
            .eliminarMunicipio(m)
        municipios.remove(m)
    }
    @FXML
    fun EliminarPais(event: ActionEvent) {
        val p: Pais = tablePaises.selectionModel.selectedItem
        divipola.eliminarPais(p)
        paises.remove(p)
    }

    @FXML
    fun numeroDepartamentoPersona(event: ActionEvent?) {
        val d =
            divipola.obtenerPaises()[cboPaisP.selectionModel.selectedIndex].obtenerDepartamentos()[cboDepartamentoP.selectionModel.selectedIndex]!!
        cmbMunicipioP.items.clear()
        for (i in d.obtenerMunicipios().indices) {
            if (d.obtenerMunicipios()[i]!!.nombre !== "") {
                cmbMunicipioP.items.add(d.obtenerMunicipios()[i])
            }
        }
    }
    @FXML
    fun numeroMunicipioPersona(event: ActionEvent?) {
        personas.clear()
        tablePersonas.items.clear()
        val m =
            divipola.obtenerPaises()[cboPaisP.selectionModel.selectedIndex].obtenerDepartamentos()[cboDepartamentoP.selectionModel.selectedIndex]!!
                .obtenerMunicipios()[cmbMunicipioP.selectionModel.selectedIndex]!!
        for (i in m.ciudadanos.indices) {
            if (m.ciudadanos[i].nombre !== "") {
                personas.add(m.ciudadanos[i])
            }
        }
    }
    @FXML
    fun numeroPaisMunicipio(event: ActionEvent?) {
        val p = divipola.obtenerPaises()[cboPaisM.selectionModel.selectedIndex]
        cboDepartamentoM.items.clear()
        for (i in p.obtenerDepartamentos().indices) {
            if (p.obtenerDepartamentos()[i]!!.nombre !== "") {
                cboDepartamentoM.items.add(p.obtenerDepartamentos()[i])
            }
        }
    }

    @FXML
    fun numeroPaisPersona(event: ActionEvent?) {
        val pais = divipola.obtenerPaises()[cboPaisP.selectionModel.selectedIndex]
        cboDepartamentoP.items.clear()
        cmbMunicipioP.items.clear()
        for (i in pais.obtenerDepartamentos().indices) {
            if (pais.obtenerDepartamentos()[i]!!.nombre !== "") {
                cboDepartamentoP.items.add(pais.obtenerDepartamentos()[i])
            }
        }
    }

    @FXML
    fun numeroPaisesDepartamento(event: ActionEvent?) {
        departamentos.clear()
        tableDepartamentos.items.clear()
        val pais = divipola.obtenerPaises()[cboPaisD.selectionModel.selectedIndex]
        for (i in pais.obtenerDepartamentos().indices) {
            if (pais.obtenerDepartamentos()[i]!!.nombre != null) {
                departamentos.add(pais.obtenerDepartamentos()[i])
            }
        }
    }
@FXML
    fun AgregarPais(event: ActionEvent) {
        var alert: Alert? = null
        var aviso: String? = null
        val p = Pais()
        try {
            val p = Pais(txtIDP.text.toInt(),txtNombreP.text)

            if (paises.contains(p)) throw Exception("El pais ya existe ;(")
            paises.add(p)
            divipola.agregarPais(txtIDP.text.toInt(), txtNombreP.text)
            tablePaises.selectionModel.select(p)
        } catch (e: Exception) {
            aviso = "Error al agregar Pais: " + e.message
            alert = Alert(Alert.AlertType.ERROR, aviso, ButtonType.OK)
            alert!!.showAndWait()
        }
    }
@FXML
    fun numeroDepartamentoMunicipio(event: ActionEvent) {
        tableMunicipio.items.clear()
        val d =
            divipola.obtenerPaises()[cboPaisM.selectionModel.selectedIndex].obtenerDepartamentos()[cboDepartamentoM.selectionModel.selectedIndex]!!
        for (i in d.obtenerMunicipios().indices) {
            if (d.obtenerMunicipios()[i]!!.nombre !== "") {
                municipios.add(d.obtenerMunicipios()[i])
            }
        }

    }


}





