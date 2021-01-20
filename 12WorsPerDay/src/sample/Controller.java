package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;


public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label L1;

    @FXML
    private Label L2;


    @FXML
    private Button StartButton;

    @FXML
    private Button BTest1;

    @FXML
    void MPressed(MouseEvent event) {
        StartButton.setStyle("-fx-background-color: #091533;");
    }

    @FXML
    void MReleased(MouseEvent event) {
        StartButton.setStyle("-fx-background-color: #2E3348;");
    }

    @FXML
    void MEntered(MouseEvent event) {
        StartButton.setStyle("-fx-background-color: #091533;");
    }

    @FXML
    void MExited(MouseEvent event) {
        StartButton.setStyle("-fx-background-color: #2E3348;");
    }

    @FXML
    void initialize() {
        //StartButton.setOnAction(event -> OpenThatWords());

    }
    
    public void OpenThatWords(){
        BTest1.setVisible(!BTest1.isVisible());
        //StartButton.setStyle("-fx-background-color: #2E3348;");
    }

}