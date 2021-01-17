package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
    void MPressed(MouseEvent event) {
        StartButton.setStyle("-fx-background-color: #00FF00;");
    }

    @FXML
    void MReleased(MouseEvent event) {
        StartButton.setStyle("-fx-background-color: #2E3348;");
    }

    @FXML
    void MEntered(MouseEvent event) {
        StartButton.setStyle("-fx-background-color: #FF0000;");
    }

    @FXML
    void MExited(MouseEvent event) {
        StartButton.setStyle("-fx-background-color: #2E3348;");
    }

    @FXML
    void initialize() {
        StartButton.setOnAction(event ->{
            System.out.println("test");
            L2.setText("ke");
            //StartButton.setStyle("-fx-background-color: #2E3348;");
        }
        );
    }

}