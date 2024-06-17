import javafx.application.Application
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.stage.Stage

class ViewDivipola : Application() {
    override fun start(primaryStage: Stage) {
        try {
            // Utiliza la ruta relativa correcta desde el classpath
            val fxmlLoader = FXMLLoader(javaClass.getResource("/VistaDivipola.fxml"))
            val root: Parent = fxmlLoader.load()
            primaryStage.title = "Vista Divipola"
            primaryStage.scene = Scene(root)
            primaryStage.show()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}

fun main() {
    Application.launch(ViewDivipola::class.java)
}
