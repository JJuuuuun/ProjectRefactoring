package InitialMenuBar;

import Interfaces.AbstractController;
import javafx.fxml.Initializable;
import javafx.scene.Parent;

import java.net.URL;
import java.util.ResourceBundle;

public class InitialMenuBarController extends AbstractController implements Initializable {
    Parent thisForm;

    @Override
    protected void setParent(Parent root) {
        thisForm = root;
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
