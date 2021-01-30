package dam.edusoft.controller;
import dam.edusoft.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


public class LoginController implements IController{

    @FXML
    private Button btnButton;

    @Override
    public void init() {
        btnButton.requestFocus();

    }

    @FXML
    void enter(ActionEvent event) {
        App.changeScene("sceneOrder");
    }



}
