package dad.javafx.micv.model;

import java.awt.event.ActionEvent;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;


public class Contacto {
	 @FXML
	    private AnchorPane root;

	    @FXML
	    private TableView<?> tablaTelefonos;

	    @FXML
	    private TableColumn<?, ?> numeroColumn;

	    @FXML
	    private TableColumn<?, ?> tipoColumn;

	    @FXML
	    private Button anadirTelefono;

	    @FXML
	    private Button quitarTelefono;

	    @FXML
	    private TableView<?> tablaCorreo;

	    @FXML
	    private TableColumn<?, ?> correoColumn;

	    @FXML
	    private Button anadirCorreo;

	    @FXML
	    private Button quitarCorreo;

	    @FXML
	    private TableView<?> tablaWebs;

	    @FXML
	    private TableColumn<?, ?> urlColumn;

	    @FXML
	    private Button anadirWeb;

	    @FXML
	    private Button quitarWeb;

	    @FXML
	    void onAnadirCorreoAction(ActionEvent event) {

	    }

	    @FXML
	    void onAnadirTelefonoAction(ActionEvent event) {

	    }

	    @FXML
	    void onAnadirWebAction(ActionEvent event) {

	    }

	    @FXML
	    void onQuitarCorreoAction(ActionEvent event) {

	    }

	    @FXML
	    void onQuitarTelefonoAction(ActionEvent event) {

	    }

	    @FXML
	    void onQuitarWebAction(ActionEvent event) {

	    }

	}
}
