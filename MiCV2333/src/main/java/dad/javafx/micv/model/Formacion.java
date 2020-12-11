package dad.javafx.micv.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class Formacion {

	
	@FXML
    private AnchorPane root;

    @FXML
    private Button anadirButton;

    @FXML
    private Button quitarButton;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TableColumn<?, ?> desdeColumn;

    @FXML
    private TableColumn<?, ?> hastaColumn;

    @FXML
    private TableColumn<?, ?> denomColumn;

    @FXML
    private TableColumn<?, ?> orgColumn;

    @FXML
    void onAnadirAction(ActionEvent event) {

    }

    @FXML
    void onQuitarAction(ActionEvent event) {

    }

}

}
