package dad.javafx.micv.model;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class Conocimientos {

    @FXML
    private AnchorPane root;

    @FXML
    private TableView<?> tableView;

    @FXML
    private TableColumn<?, ?> denomColumn;

    @FXML
    private TableColumn<?, ?> nivelColumn;

    @FXML
    private Button anadirconoButton;

    @FXML
    private Button anadiridiomButton;

    @FXML
    private Button eliminarButton;

    @FXML
    void onAnadirconoAction(ActionEvent event) {

    }

    @FXML
    void onAnadiridiomAction(ActionEvent event) {

    }

    @FXML
    void onEliminarAction(ActionEvent event) {

    }

}

}
